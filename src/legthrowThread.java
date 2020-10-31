import java.util.Scanner;

public class legthrowThread implements Runnable {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        if (SharedPlace.doSteal == 1){
            System.out.println("                             [레그스루] 스킬을 쓰려면 커맨드를 눌러주세요.");
            String select = sc.nextLine();
            if (select.equals("fprmtmfn")){
                System.out.println("[레그스루]를 사용했습니다.");
            }
        }
    }
}
