package company.s5_7;

/**
 * @Author: sutianwei
 * @Date: 2019/5/16 9:21
 */
public class Calculator {
    private int Cost = 500;

    private double agelink[] = {2.8, 1.8, 1.0, 0.8, 1.5};

    private int limite[] = {1, 3, 5, 7, 5};

    private int discount[] = {50, 50, 100, 150, 200};

    private int age = 0;

    private int limi = 0;

    private double allcount = 0;

    public void Set(int age, int limi) {

        this.age = age;

        this.limi = limi;

    }

    public double getcost() {

        if (age >= 16 && age < 25) {

            if (limi > limite[0]) {

                allcount = agelink[0] * Cost;

            } else {

                allcount = agelink[0] * Cost - discount[0];

            }

        } else if (age >= 25 && age < 35) {

            if (limi > limite[1]) {

                allcount = agelink[1] * Cost;

            } else {

                allcount = agelink[1] * Cost - discount[1];

            }

        } else if (age >= 35 && age < 45) {

            if (limi > limite[2]) {

                allcount = agelink[2] * Cost;

            } else {

                allcount = agelink[2] * Cost - discount[2];

            }

        } else if (age >= 45 && age < 60) {

            if (limi > limite[3]) {

                allcount = agelink[3] * Cost;

            } else {

                allcount = agelink[3] * Cost - discount[3];

            }

        } else if (age >= 60 && age < 100) {

            if (limi > limite[4]) {

                allcount = agelink[4] * Cost;

            } else {

                allcount = agelink[4] * Cost;
            }
        }
        return   allcount;
    }
}
