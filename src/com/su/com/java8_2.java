package com.su.com;

import java.io.File;
import java.io.FileFilter;
import java.util.List;

public class java8_2 {

    //filter hidden file
    File[] hiddenFIles = new File(".").listFiles(new FileFilter() {
        @Override
        public boolean accept(File file) {
            return file.isHidden();
        }
    });

    //java 8 sd  fsi hghgghskjk
    File[] hiddenFIle = new File(".").listFiles(File::isHidden);


}
