import java.util.Random;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args){
    String userName,select,select2,whoseTurn,attackWay1 , attackWay2;
    String turn = "";
    String errorMessage = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                 # 옳바른 숫자를 입력해 주세요 #\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    String notNowSkill  = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                # 지금 사용할 수 없는 스킬입니다 #\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    String noSkill      = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  # 존재하지 않는 스킬입니다 #\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    String giveUpGame   = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                     # 게임을 포기합니다 #\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n ";
    String noPosition   = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                 # 존재하지 않는 포지션입니다 #\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n ";
    String nocourt   = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                     # 존재하지 않는 코트입니다 #\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n ";
    int randNumber;
    int jordanClutchTime = 0;

    Scanner sc = new Scanner(System.in);
    Player pl = new Player();
    Jordan jd = new Jordan();
    Curry curry = new Curry();
    James james = new James();
    Oneal oneal = new Oneal();
    SkillAndStat sas = new SkillAndStat();
    DefenseSituation defenseSituation = new DefenseSituation();
    OffenseSituation offenseSituation = new OffenseSituation();
    PictureMyTurn pictureMyTurn = new PictureMyTurn();
    PictureNpcTurn pictureNpcTurn = new PictureNpcTurn();
    A_courtPlayer murray = new A_courtPlayer();
    B_courtPlayer young = new B_courtPlayer();
    C_courtPlayer siakam = new C_courtPlayer();
    SharedPlace sharedPlace = new SharedPlace();
    NpcDefense npcDefense = new NpcDefense(sharedPlace,jd,pl);
    MainWait mainWait = new MainWait();
    MyAttack myAttack = new MyAttack(sharedPlace,jd,mainWait,pl);

        pl.InitializeStat();
        pl.ShootingSkillKoreaen();
        pl.DribbleSkillKorean();
        pl.SkillPut();
        pl.SkillCommandPut();


        Mention mention = new Mention();
        Random rand = new Random();
        userName = pl.myName;


        pl.turn = jd.myName;
        Thread gameTimeThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    sharedPlace.stopGameTime();
                }
            });

//        gameTimeThread.start();
//        sharedPlace.setPlayer(pl);
//        sharedPlace.setNpc(jd);
//        while(pl.myScore < 14 || jd.myScore < 14){
//            if(pl.turn == jd.myName ){
//                if(sharedPlace.gameEnd == 1){ break;}
//                System.out.println("나 조던 공격한다.");
//                System.out.println("나 조던 공격 끝.");
//                pl.turn = "브랜든 리치";
//            }else if(pl.turn == pl.myName){
//                sharedPlace.reset();
//                pl.FailCountZero();
//                if(sharedPlace.gameEnd == 1){ break;}
//                Thread myAttackThread = new Thread(myAttack,"myAttackThread");
//                Thread npcDefenseThread = new Thread(npcDefense,"npcDefenseThread");
//                StateCheckThread stateCheck = new StateCheckThread(myAttackThread);
//                Thread stateCheckThread = new Thread(stateCheck,"stateCheckThread");
//                myAttackThread.start();
//                npcDefenseThread.start();
//                stateCheckThread.start();
//                mainWait.waitMain();
//                pl.turn = "마이클 조던";
//            }
//        }
//        System.out.println(" 게임 끝");
//        sharedPlace.gameEnd = 0 ;
        StringBuffer gaugeBar1 = new StringBuffer();
        GaugeBar :
        while(true){
            for(int i=1; i<11; i++) {
                gaugeBar1.append("▓▓▓▓▓▓▓▓▓▓");
                if(sharedPlace.npcNearBy == 1){
                    sharedPlace.openChance = "                                                 # NOT OPEN ";
                }
                for(int j=0; j<100000000; j++) {

                    if(StopGaugeBar.stopGaugeBar.equals("")){
                    sharedPlace.gauge = 10*i;
                    break GaugeBar;
                    }
                }
                if(sharedPlace.stopGaugeBar.equals("-1")){
                    System.out.printf("\r%s   %d %s",sharedPlace.openChance,10*i,gaugeBar1);
                }

                try{
                    Thread.sleep(200);

                }catch(Exception e){}

                for(int j=0; j<100000000; j++) {
                    if(StopGaugeBar.stopGaugeBar.equals("")){
                    sharedPlace.gauge = 10*i;
                    break GaugeBar;
                    }
                }

            }
            for(int i=1; i<11; i++) {
                gaugeBar1.delete(100-10*i,110-10*i);
                if(sharedPlace.npcNearBy == 1){
                    sharedPlace.openChance = "                                                 # NOT OPEN ";
                }
                for(int j=0; j<10000; j++) {
                    if(StopGaugeBar.stopGaugeBar.equals("")){
                    sharedPlace.gauge = 100 - 10*i;
                    break GaugeBar;
                    }
                }
                System.out.printf("\r%s   %d %s",sharedPlace.openChance,100 - 10*i,gaugeBar1);
                try{
                    Thread.sleep(200);
                }catch(Exception e){}
                for(int j=0; j<10000; j++) {
                    if(StopGaugeBar.stopGaugeBar.equals("")){
                    sharedPlace.gauge = 100 - 10*i;
                    break GaugeBar;
                    }
                }
            }

        }

    }


}
