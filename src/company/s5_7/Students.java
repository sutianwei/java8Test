package company.s5_7;


public  class  Students extends Person{
    static{
        System.out.println("S1");
    }
    {
        System.out.println("S2");
    }
    public Students(){
        System.out.println("S3");
    }
    public static void  main(String[] args){
        new Students();
    }
}