import java.util.Scanner;

public class StopGaugeBar implements Runnable {
    static String stopGaugeBar = "-1";
    SharedPlace sharedPlace = new SharedPlace();
    Scanner sc = new Scanner(System.in);

    @Override
    public void run() {
        this.stopGaugeBar = sc.nextLine();
        try{ Thread.sleep(3000);
        }catch(Exception e){}
        stopGaugeBar = "-1";

    }
}
