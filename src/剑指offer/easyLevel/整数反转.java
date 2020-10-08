package 剑指offer.easyLevel;

public class 整数反转 {

    public int resver(int i){
        int res=0;
        while (i!=0){
            int temp=i%10;//取余数
            if (res>Integer.MAX_VALUE||res==Integer.MAX_VALUE&&temp>7){
                return  0;
            }
            if (res<Integer.MIN_VALUE|| res==Integer.MIN_VALUE&&temp<-8){
                return  0;
            }
            res =res*10+temp;
            i/=10;
        }
        return  res;
    }
}
