package 狂神说.线程基础;

/**
 * LAMDAtHREAD
 */
public class lamda {


   static   class Like2 implements ILike{

        @Override
        public void lamda() {
            System.out.println("i like lamda2");
        }
    }
    //静态内部类
    public static void main(String[] args) {
        ILike like = new Like();
        like.lamda();

        like = new Like2();
        like.lamda();

        class Like3 implements ILike{

            @Override
            public void lamda() {
                System.out.println("i like lamda3");
            }
        }
        like = new Like3();
        like.lamda();



        //匿名内部类，没有类名，必须借助接口
        like = new Like(){
            @Override
            public void lamda() {
                System.out.println("i like 匿名");
            }
        };
        like.lamda();
        //LAMDA
        like=()->{
            System.out.println(" like lamda");
        };
    }
}

//定义一个函数式接口
interface ILike{
    void lamda();
}

class Like implements ILike{

    @Override
    public void lamda() {
        System.out.println("i like lamda");
    }
}