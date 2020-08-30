package company.company;

import java.io.File;

/**
 * 遍历文件夹
 */
public class IO {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\SuTianWei\\Desktop\\flutter");
        listFile(file);
    }

    public static void listFile(File file) {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                System.out.println(file2.getName() + "是一个文件夹");
                listFile(file2);
            }
            if (file2.isFile()) {
                System.out.println(file2.getName() + "是一个文件");
            }
        }
    }


}


