package com.su.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Transaction {

    public final Trader trader;
    public final int year;
    public final int value;


    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }


    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        //选出2011年的所有交易，并按照交易额升序
        List<Transaction> tr2011 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println("选出2011年的所有交易，并按照交易额升序----" + tr2011);//[Transaction{trader=Trader{name='Brian', city='cambridge'}, year=2011, value=300}, Transaction{trader=Trader{name='Raoul', city='Cambridge'}, year=2011, value=400}]

        //交易员都在哪些城市工作过
        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("交易员都在哪些城市工作过-------" + cities);//交易员都在哪些城市工作过-------[Cambridge, Milan]

        //查询所有在剑桥的交易员，按照姓名排序
        List<Trader> traders = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader1 -> trader1.getCity().equals("Cambridge"))
                .collect(Collectors.toList());
        System.out.println("查询所有在剑桥的交易员，按照姓名排序" + traders);//查询所有在剑桥的交易员，按照姓名排序[Trader{name='Brian', city='Cambridge'}, Trader{name='Raoul', city='Cambridge'}, Trader{name='Raoul', city='Cambridge'}, Trader{name='Alan', city='Cambridge'}]


        //返回所有交易员姓名，按照字母顺序排序
        String traderStr = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (n1, n2) -> n1 + n2);
        System.out.println("返回所有交易员姓名，按照字母顺序排序------" + traderStr);//返回所有交易员姓名，按照字母顺序排序------AlanBrianMarioRaoul


        //有没有交易员在米兰工作
        boolean milanBased = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);//true

        //打印在剑桥的交易员的所有哦交易额
        transactions.stream()
                .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::println);//300 1000 400 950

        //最高的交易额
        Optional<Integer> highestValue =
                transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(Integer::max);
        System.out.println("     //最高的交易额----" + highestValue);//   //最高的交易额----Optional[1000]

        //最小的交易

        Optional<Transaction> smallest =
                transactions.stream()
                        .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        System.out.println(smallest);//Optional[Transaction{trader=Trader{name='Brian', city='Cambridge'}, year=2011, value=300}]
    }


}

