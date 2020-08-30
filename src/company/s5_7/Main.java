package company.s5_7;

/**
 * @Author: sutianwei
 * @Date: 2019/5/16 9:19
 */
public class Main {
    public static double getFactor(int age) {
        if (age < 16)
            return 0.0;
else if (age < 25)
            return 2.8;
else if (age < 35)
            return 1.8;
else if (age < 45)
            return 1.0;
else if (age < 60)
            return 0.8;
else if (age < 100)
            return 1.5;
else
        return 0.0;
    }

    public static int getLimit(int age) {
        if (age < 16)
            return 0;
        else if (age < 25)
            return 1;
        else if (age < 35)
            return 3;
        else if (age < 45)
            return 5;
        else if (age < 60)
            return 7;
        else if (age < 100)
            return 5;
        else
            return 0;
    }

    public static int getCount(int age) {
        if (age < 16)
            return 0;
        else if (age < 25)
            return 50;
        else if (age < 35)
            return 50;
        else if (age < 45)
            return 100;
        else if (age < 60)
            return 150;
        else if (age < 100)
            return 200;
        else
            return 0;
    }

    public static double calculate(double baseSafeRate, int age, int safeLimit) {
        if (safeLimit < 0 || safeLimit >= 12)
            return 0;
        double factor = getFactor(age);
        double limit = getLimit(age);
        double count = getCount(age);
        double money = 0;
        if (safeLimit < limit) {
            money = baseSafeRate * factor;
            money -= count;
        }
        return money;
    }

}
