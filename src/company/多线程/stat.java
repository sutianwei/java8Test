package company.多线程;
/*
* 1继承threa+run方法
* 2实现runnable
*
*
*
* */
public class stat {
    public   static   void   main(String  args[]){
        staticproxy  st=new staticproxy();//真实角色是
        Thread  thread=new Thread(st);//代理角色
        thread.start();
        for (int i=0;i<100;i++){
            System.out.println("一边吃一边阿达");
        }
    }


}
