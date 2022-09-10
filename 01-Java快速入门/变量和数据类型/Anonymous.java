import java.util.HashMap;

public class Anonymous {
    public static void main(String[] args) {

    }
}


//
//class Outer {
//    private String name;
//
//    Outer(String name) {
//        this.name = name;
//    }
//
//    void asyncHello() {
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("hello" + Outer.this.name);
//            }
//        };
//        new Thread(r).start();
//    }


//}