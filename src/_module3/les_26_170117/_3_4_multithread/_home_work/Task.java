package _module3.les_26_170117._3_4_multithread._home_work;

import java.util.Random;

/*подсказка для задания по многопоточности
        1 SquareThread
        run(){
            for (3..18){ sout...square area =..;  sleep(1000)}
        }

        2 CircleThread ... {     circle area=...; sleep(1000)

            3 Main ( new thread.... t.start.... )*/
public class Task {
    public static void main(String[] args) {
        Runnable SquareThread = new Runnable() {
            @Override
            public void run() {
                    for (int a = new Random().nextInt(100)+20; a > 0 ; a--) {
                        System.out.println("square area"+"(a = "+a+") = "+a*a);
                        try {
                            Thread.currentThread().sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            }
        };
        Runnable CircleThread = new Runnable() {
            @Override
            public void run() {
                    for (int r = new Random().nextInt(100)+20; r > 0 ; r--) {
                        System.out.println("circle area"+"(r = "+r+") = "+r*r*Math.PI);
                        try {
                            Thread.currentThread().sleep(200);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            }
        };
        Thread square = new Thread(SquareThread);
        Thread circle = new Thread(CircleThread);
        square.start();
        circle.start();
    }
}
