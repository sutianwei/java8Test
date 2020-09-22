package java编程思想;


class Tank {
    Integer level;
}

public class Assignment {

    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        Tank t3 = new Tank();
        t1.level = 9;
        t2.level = 47;
        t3.level = 45;

        System.out.println("t1 "+t1.level+"---t2"+t2.level);//9    47

        t1 = t2;
        System.out.println("t1 "+t1.level+"---t2"+t2.level);//47  47

        t3=t1;
        System.out.println("t1 "+t1.level+"---t2"+t2.level+"uuuuu"+t3.level);
        t1.level = 27;
        System.out.println("t1 "+t1.level+"---t2"+t2.level+"uuuuu"+t3.level);//27  27

    }
}
