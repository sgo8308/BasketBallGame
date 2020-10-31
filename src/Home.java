public class Home implements Runnable {
    Player player;
    public static boolean getOut = false;
    Home(Player player){
        this.player = player;
    }

    @Override
    public void run() {
        Home :
        while(true){
            if(player.stamina > player.staminaFixed - 1){
                System.out.println("\n                                                                                                   체력이 모두 회복되었습니다.");
                break;
            }
            try{ Thread.sleep(2000);
            }catch(Exception e){}

            for(int i=0; i<10000; i++) {
                if(getOut){
                    break Home;
                }
            }

            player.getStamina();

            System.out.println("                                                                                                      체력을 5 회복합니다");
            System.out.println("                                                                                                       현재 체력 : " + player.stamina);
        }


    }
}
