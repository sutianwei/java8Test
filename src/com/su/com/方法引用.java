package com.su.com;

import java.io.File;
import java.io.FileFilter;

public class 方法引用 {
    /**
     * 筛选一个目录中隐藏的文件
     */
    File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
        @Override
        public boolean accept(File file) {
            return file.isHidden();//筛选逻辑
        }
    });
    //简易写法  重读了
    File[] hiddenFile = new File(".").listFiles(File::isHidden);
    //next
}
