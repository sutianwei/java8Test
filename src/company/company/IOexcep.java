package company.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: sutianwei
 * @Date: 2019/5/21 17:47
 */
public class IOexcep {
    public static void main(String args) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("D:text.txt");
            br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
