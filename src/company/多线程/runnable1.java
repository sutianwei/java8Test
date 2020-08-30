package company.多线程;



/*
* 模拟龟兔赛跑
* */
public class runnable1   extends  Thread   {

        public void   run(){//重写run方法
           for (int i=0;i<100;i++){
               System.out.println("兔子跑了"+i);
           }
        }
}

class wugui   extends  Thread   {

   public void   run(){//重写run方法
       for (int i=0;i<100;i++){
           System.out.println("乌龟"+i);
       }
   }
}
