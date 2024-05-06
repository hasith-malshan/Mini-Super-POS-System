package model;

public class A {

    // public static int x = 10;
    public static void main(String[] args) {
        // Runnable r = new Runnable();

        int x = 10;

//        class RunnablePatiya implements Runnable {
//
//            int k;
//
//            RunnablePatiya(int i) {
//                //System.out.println(i);
//                this.k = i;
//            }
//
//            @Override
//            public void run() {
//                System.out.println("Niyamay");
//                //System.out.println(A.x);
//                System.out.println(this.k);
//            }
//
//        }
        Runnable rp = () -> {
            System.out.println("Niyamay");
            System.out.println(x);
        };

        Thread t = new Thread(rp);
        t.start();

    }
}
