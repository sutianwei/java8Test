package java编程思想;

public class StringMethod {
    public static void main(String args[]) {
        String str = "自己菜就要知道，“好好加油";
        String str1 = "to be Best";
        //length()获取字符串的长度
        System.out.println(str.length());//13
        //charAt()获取指定位置的字符0 1 2 3 4 5..
        System.out.println(str.charAt(3));//就
        //获取某个字符在字符串中第一次出现的位置
        System.out.println(str.indexOf('菜'));//2
        //从指定的位置截取字符串
        System.out.println(str.substring(5));//知道，“好好加油
        //从指定的位置截取字符串
        System.out.println(str.substring(5, 8));//知道，

        //判断是否与字符串是否相同。忽略大小写
        System.out.println(str.equalsIgnoreCase("自己菜就要知道，“好好加油"));//true
        System.out.println(str1.equalsIgnoreCase("to be best"));//true
        System.out.println(str1.equalsIgnoreCase("to bebest"));//false

        //判断起始字符
        System.out.println(str1.startsWith("t"));//true
        System.out.println(str1.startsWith("a"));//false

        //判断字符串对象是否以指定的字符开头，参数toffset为指定从哪个下标开始
        System.out.println(str1.startsWith("o", 1));//true
        System.out.println(str1.startsWith("o", 2));//false

        System.out.println(str1.endsWith("t"));//true

        //判断是否为空
        System.out.println(str1.isEmpty());//fasle

        //去除两端空格
        String str2 = "    string test to be better";
        System.out.println(str2); //      string test to be better
        System.out.println(str2.trim());//string test to be better

        String array[] = str2.split("t");
        printString(array);

        //字符串装换为字符数组
        System.out.println(str2.toCharArray());
        //将指定的字符替换
        System.out.println(str2.replace('t','P'));

        //查看字符串中是否含有指定字符
        System.out.println(str2.contains("o"));
        //添加字符
        System.out.println(str2.concat("susu"));




        String[] hellos="hello hello".split(" ");
        System.out.println(hellos[0].hashCode()+"hashcode-----------------------------");
        System.out.println(hellos[1].hashCode());
    }

    public static void printString(String a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }}
