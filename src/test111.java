import java.util.Scanner;

public class test111 {
    public static void main(String[] args) {
        Thread thread = new Thread();
        int i=2;
        if(i== 2){
            thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0; i<10; i++) {
                        try{Thread.sleep(1000);
                        }catch(Exception e){}
                    }
                }
            });
        }


        try{Thread.sleep(3000);
        }catch(Exception e){}

        thread.interrupt();
        System.out.println(thread.isInterrupted());






    }
}
