package 狂神说.线程基础;

public class TestLamda {

    public static void main(String[] args) {
        Ilove lo = new Love();
        lo.love(3);

        lo = (a) -> {
            System.out.println("love " + a);
        };
        lo.love(5);
        lo = a -> {
            System.out.println("love"+a);
        };
        lo.love(78);
    }
}

interface Ilove {
    void love(int a);
}

class Love implements Ilove {

    @Override
    public void love(int a) {
        System.out.println("love--" + a);
    }
}