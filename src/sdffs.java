import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class sdffs {
    public static void main(String[] args) throws ParseException {
        DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date11 = df1.parse("2016-06-12 12:00:00");
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date11);
        long tim1 = cal1 .getTimeInMillis();
        System.out.println("111------"+tim1);




        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1= "2016-06-12";
        String da="12:00:00";
        Date date = df.parse(String.format("%s %s",date1,da));
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        long tim = cal .getTimeInMillis();

        System.out.println("13----"+tim);


        System.out.println(get2("2016-06-12"));


        System.out.println(get("2016-06-12"));
    }

    public static long get2(String date) throws ParseException {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1= date;
        String da="12:00:00";
        Date date2 = df.parse(String.format("%s %s",date1,da));
        Calendar cal = Calendar.getInstance();
        cal.setTime(date2);
        long tim = cal .getTimeInMillis();
        return tim;
    }


    public static void getYesterDayDate(String date) throws ParseException {

        //解析指定Date
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        Date parseDate = simpleDateFormat.parse(date);

        //设置Calendar
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(parseDate);

        /*
         * 核心代码，回滚到前一天。
         */
        //backOne(calendar);//错误
        backTwo(calendar);//正确

        //转换格式
        String format = simpleDateFormat.format(calendar.getTime());

        System.out.println(format);
    }

    //使用roll()方法回滚
    private static void backOne(Calendar calendar) {
        calendar.roll(Calendar.DAY_OF_YEAR, -1);
    }

    //使用set()方法回滚
    private static void backTwo(Calendar calendar) {
        int day = calendar.get(Calendar.DATE);
        calendar.set(Calendar.DATE, day - 1);
    }

public static  String get(String date) throws ParseException {
    //解析指定Date
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
    Date parseDate = simpleDateFormat.parse(date);

    //设置Calendar
    Calendar calendar = GregorianCalendar.getInstance();
    calendar.setTime(parseDate);

    int day = calendar.get(Calendar.DATE);
    calendar.set(Calendar.DATE, day - 1);

    String format = simpleDateFormat.format(calendar.getTime());


    return  format;


}


























//    public static void main(String[] args) {
//        com com = new com();
//        com com1 = new com();
//        com com2 = new com();
//        com com3 = new com();
//        com com4 = new com();
//        com.setName("与附加富滇富达基金");
//        com1.setName("与附加基金");
//        com2.setName("一方富达基金");
//        com3.setName("与基金");
//        com4.setName("撒旦撒旦一方富达基金");
//        List<com> li = new ArrayList<>();
//        li.add(com);
//        li.add(com1);
//        li.add(com2);
//        li.add(com3);
//        li.add(com4);
//
//        List<com> sda = li.stream().filter(
//                p -> p.getName().contains("基")
//        ).collect(Collectors.toList());
//        sda.forEach(h->
//                System.out.println(h.getName()));
//    }
}
