import java.util.Random;
import java.util.Scanner;

public class SharedPlace {
    public static int stopMusic = 0;
    String notNowSkill  = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                # 지금 사용할 수 없는 스킬입니다 #\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    String noSkill      = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  # 존재하지 않는 스킬입니다 #\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";

    public static String attackWay0 = "-1";
    public static String attackWay1 = "-1";
    public static String attackWay2 = "-1";
    public static String attackWay3 = "-1";
    public static String stopGaugeBar = "-1";
    public static String openChance = "                                                 # WIDE OPEN";
    public static String stopGameTime = "7 : 00" ;
    public static String isStealSuccess = "0" ;
    public static String whoseTurn = "no" ;
    public static String playerDefenseWay = "0" ;
    public static int stopGameTimeSecond = 0 ;
    public static int npcBlock = 2 ;
    public static int npcNearBy = 0 ;
    public static int blockOrWait = -1 ;
    public static int attackState = -1 ;
    public static int gameEnd = 0 ;
    public static int attackEnd = 0 ;
    public static int islegthrow = 0 ;
    public static int attackTimeReset = 0 ;
    public static int attackTime = 14 ;

    public static String doLegThrow,select;
    public static int defenseWay,gauge,gameTime,doSteal;
    static Random rand = new Random();
     Npc npc ;
     Player player;
    static Scanner sc = new Scanner(System.in);
    Mention mention = new Mention();
    PictureMyTurn pictureMyTurn = new PictureMyTurn();
    OffenseSituation offenseSituation = new OffenseSituation();


    public void setNpc(Npc npc) {
        this.npc = npc;
    }

    public void setPlayer(Player player) {

        this.player = player;
    }

    public synchronized void setDefenseWay() {
        if(attackWay0.equals("-1")){
            try{
                wait(15000);
            }catch(Exception e){}
        }
        SharedPlace.defenseWay = rand.nextInt(2) + 1;
    }

    public synchronized void setAttackWay0(){
        while(true){
            mention.gameInfo(player.myScore,npc.myScore,player.foulCount,npc.foulCount);
            pictureMyTurn.Start(npc);
            mention.SelectionMent2("gameStart");

            attackWay0 = sc.nextLine();

            if(gameEnd == 1 || attackEnd == 1){ return;}

            if(attackWay0.equals("7777")){
                player.myScore = 15;
                this.gameEnd = 1;
                this.attackEnd = 1;
                notifyAll();
                return;
            }

            if(attackWay0.equals("1")||attackWay0.equals("100")|| attackWay0.equals("elqTmfl")){
               break;
            }else if(attackWay0.equals("fpdldjq") || attackWay0.equals("ejqmfzmffjcl")|| attackWay0.equals("vnfdjqwjavj")|| attackWay0.equals("tmxpqqorwjavj2")||
                attackWay0.equals("tmxpqqorwjavj3")|| attackWay0.equals("gnrtit")|| attackWay0.equals("enpczm")||
                attackWay0.equals("fprmtmfn")||attackWay0.equals("zmfhtmdhqj")||attackWay0.equals("tmvlsanqm")||attackWay0.equals("vhtmxmdjq")||
                attackWay0.equals("qlgkdlsemqor")||attackWay0.equals("tyfejgnpdlzm"))
            {
                System.out.println(notNowSkill);
                try{Thread.sleep(1000);
            }catch(Exception e){}
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                continue ;
            }else {
                System.out.println(noSkill);
                try{Thread.sleep(1000);
            }catch(Exception e){}
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                continue ;
            }
        }

        if(attackWay0.equals("1")){
             System.out.println("                                                                               「 드리블을 시작했습니다. 」");
        }else if( attackWay0.equals("elqTmfl")){
            System.out.println("                                                                                「 [딥쓰리]를 시도합니다. 」");
        }
        notifyAll();
    }

    public synchronized void setAttackWay1(){

        while(true){
            mention.gameInfo(player.myScore,npc.myScore,player.foulCount,npc.foulCount);
            if (defenseWay == 1) {
                pictureMyTurn.line3CloseOpponent(npc);
            } else {
                pictureMyTurn.line3FarOpponent(npc);
            }
            mention.SelectionMent2("line3");
            attackWay1 = sc.nextLine();

            if(gameEnd == 1 || attackEnd == 1){ return;}

            if(attackWay1.equals("1") ||attackWay1.equals("2")||attackWay1.equals("3")||attackWay1.equals("tmxpqqor3")||attackWay1.equals("zmfhtmdhqj")||attackWay1.equals("vhtmxmdjq")){
               break;
            }else if(attackWay1.equals("fpdldjq") || attackWay1.equals("ejqmfzmffjcl")|| attackWay1.equals("vnfdjqwjavj")|| attackWay1.equals("tmxpqqorwjavj2")||
                    attackWay1.equals("gnrtit")|| attackWay1.equals("enpczm")||attackWay1.equals("elqTmfl")||
                attackWay1.equals("fprmtmfn")||attackWay1.equals("tmvlsanqm")||
                attackWay1.equals("qlgkdlsemqor")||attackWay1.equals("tyfejgnpdlzm"))
            {
                System.out.println(notNowSkill);
                try{Thread.sleep(1000);
            }catch(Exception e){}
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                continue ;
            }else {
                System.out.println(noSkill);
                try{Thread.sleep(1000);
            }catch(Exception e){}
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                continue;
            }
        }

        if(attackWay1.equals("1")){
            System.out.println("                                                                                  「 3점슛을 시도합니다. 」");
        }else if( attackWay1.equals("2")) {
            System.out.println("                                                                              「 슛 훼이크를 시도합니다. 」");
        }else if(attackWay1.equals("3")){
            System.out.println("                                                                                  「 돌파를 시도합니다. 」");
        }else if(attackWay1.equals("tmxpqqor3")){
            System.out.println("                                                                         「 [스텝백 3점슛]을 시도합니다. 」");
        }else if(attackWay1.equals("zmfhtmdhqj")){
            System.out.println("                                                                           「 [크로스오버]를 시도합니다. 」");
        }else if(attackWay1.equals("vhtmxmdjq")){
            System.out.println("                                                                             「 [포스트업]을 시도합니다. 」");
        }
        notify();
    }
    public synchronized void setAttackWay2_1(){
        while(true){
            mention.SelectionMent2("fullyPenetration");
            attackWay2 = sc.nextLine();
            if(gameEnd == 1 || attackEnd == 1){ return;}
            if(attackWay2.equals("1")||attackWay2.equals("fpdldjq")||attackWay2.equals("ejqmfzmffjcl")||attackWay2.equals("enpczm")){
               break;
            }else if(attackWay2.equals("vnfdjqwjavj")|| attackWay2.equals("tmxpqqorwjavj2")||
                    attackWay2.equals("gnrtit")||attackWay2.equals("elqTmfl")||attackWay2.equals("tmxpqqorwjavj3")||
                attackWay2.equals("fprmtmfn")||attackWay2.equals("tmvlsanqm")||attackWay2.equals("zmfhtmdhqj")||attackWay2.equals("vhtmxmdjq")||
                attackWay2.equals("qlgkdlsemqor")||attackWay2.equals("tyfejgnpdlzm"))
            {
                System.out.println(notNowSkill);
                try{Thread.sleep(1000);
            }catch(Exception e){}
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                continue ;
            }else {
                System.out.println(noSkill);
                try{Thread.sleep(1000);
            }catch(Exception e){}
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                continue;
            }
        }

        if(attackWay2.equals("1")){
            System.out.println("                                                                                  「 골밑슛을 시도합니다. 」");
        }else if( attackWay2.equals("fpdldjq")) {
            System.out.println("                                                                                  「 레이업을 시도합니다. 」");
        }else if(attackWay2.equals("ejqmfzmffjcl")){
            System.out.println("                                                                           「 [더블 클러치]를 시도합니다. 」");
        }else if(attackWay2.equals("enpczm")){
            System.out.println("                                                                                 「 [덩크]를 시도합니다. 」");
        }
        notify();
    }
    public synchronized void setAttackWay2_2(){
        System.out.println("\n                                                                                                     어떻게 하시겠습니까?\n");
            while(true){
                mention.SelectionMent2("line2WithPenetration");
                attackWay2 = sc.nextLine();
                if(gameEnd == 1 || attackEnd == 1){ return;}
                if(attackWay2.equals("1")||attackWay2.equals("2")||attackWay2.equals("3")||attackWay2.equals("tmvlsanqm")||attackWay2.equals("tmxpqqor2")||attackWay2.equals("vnfdjqwjavj")){
                   break;
                }else if(attackWay2.equals("fpdldjq")||attackWay2.equals("ejqmfzmffjcl")||attackWay2.equals("enpczm")||
                        attackWay2.equals("gnrtit")||attackWay2.equals("elqTmfl")||attackWay2.equals("tmxpqqorwjavj3")||
                    attackWay2.equals("fprmtmfn")||attackWay2.equals("zmfhtmdhqj")||attackWay2.equals("vhtmxmdjq")||
                    attackWay2.equals("qlgkdlsemqor")||attackWay2.equals("tyfejgnpdlzm"))
                {
                    System.out.println(notNowSkill);
                    try{Thread.sleep(1000);
            }catch(Exception e){}
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                    continue ;
                }else {
                    System.out.println(noSkill);
                    try{Thread.sleep(1000);
            }catch(Exception e){}
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                    continue;
                }
            }

        if(attackWay2.equals("1")){
            System.out.println("                                                                                  「 2점슛을 시도합니다. 」");
        }else if( attackWay2.equals("2")) {
            System.out.println("                                                                              「 슛 훼이크를 시도합니다. 」");
        }else if( attackWay2.equals("3")) {
            System.out.println("                                                                                    「 계속 돌파합니다. 」");
        }else if( attackWay2.equals("tmvlsanqm")) {
            System.out.println("                                                                            「 [스핀 무브]를 시도합니다. 」");
        }else if(attackWay2.equals("tmxpqqor2")){
            System.out.println("                                                                         「 [스텝백 2점슛]을 시도합니다. 」");
        }else if(attackWay2.equals("vnfdjqwjavj")){
            System.out.println("                                                                           「 [풀업 점퍼]를 시도합니다. 」");
        }
        notify();
    }
    public synchronized void setAttackWay2_3(){
        System.out.println("\n                                                                                                     어떻게 하시겠습니까?\n");
        while(true){
            mention.SelectionMent2("line2WithPostUp");
            attackWay2 = sc.nextLine();
            if(gameEnd == 1 || attackEnd == 1){ return;}
            if(attackWay2.equals("1")||attackWay2.equals("2")||attackWay2.equals("3")||attackWay2.equals("tmvlsanqm")){
               break;
            }else if( attackWay2.equals("tmxpqqorwjavj2")||attackWay2.equals("vnfdjqwjavj")||attackWay2.equals("fpdldjq")||attackWay2.equals("ejqmfzmffjcl")||
                    attackWay2.equals("enpczm") || attackWay2.equals("gnrtit")||attackWay2.equals("elqTmfl")||attackWay2.equals("tmxpqqorwjavj3")||
                attackWay2.equals("fprmtmfn")||attackWay2.equals("zmfhtmdhqj")||attackWay2.equals("vhtmxmdjq")||
                attackWay2.equals("qlgkdlsemqor")||attackWay2.equals("tyfejgnpdlzm"))
            {
                System.out.println(notNowSkill);
                try{Thread.sleep(1000);
            }catch(Exception e){}
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                continue ;
            }else {
                System.out.println(noSkill);
                try{Thread.sleep(1000);
            }catch(Exception e){}
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                continue;
            }
        }

        if(attackWay2.equals("1")){
            System.out.println("                                                                                  「 2점슛을 시도합니다. 」");
        }else if( attackWay2.equals("2")) {
            System.out.println("                                                                              「 슛 훼이크를 시도합니다. 」");
        }else if(attackWay2.equals("3")){
            System.out.println("                                                                              「 계속 포스트업을 합니다. 」");
        }else if(attackWay2.equals("tmvlsanqm")){
            System.out.println("                                                                           「 [스핀 무브]를 시도합니다. 」");
        }
        notify();
    }
    public synchronized void setAttackWay3_1(){
         while(true){
            mention.SelectionMent2("fullyPenetration");
            attackWay3 = sc.nextLine();
            if(gameEnd == 1 || attackEnd == 1){ return;}
            if(attackWay3.equals("1")||attackWay3.equals("fpdldjq")||attackWay3.equals("ejqmfzmffjcl")||attackWay3.equals("enpczm")){
               break;
            }else if(attackWay3.equals("vnfdjqwjavj")|| attackWay3.equals("tmxpqqorwjavj2")||
                    attackWay3.equals("gnrtit")||attackWay3.equals("elqTmfl")||attackWay3.equals("tmxpqqorwjavj3")||
                attackWay3.equals("fprmtmfn")||attackWay3.equals("tmvlsanqm")||attackWay3.equals("zmfhtmdhqj")||attackWay3.equals("vhtmxmdjq")||
                attackWay3.equals("qlgkdlsemqor")||attackWay3.equals("tyfejgnpdlzm"))
            {
                System.out.println(notNowSkill);
                try{Thread.sleep(1000);
            }catch(Exception e){}
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                continue ;
            }else {
                System.out.println(noSkill);
                try{Thread.sleep(1000);
            }catch(Exception e){}
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                continue;
            }
        }

        if(attackWay3.equals("1")){
            System.out.println("                                                                                 「 골밑슛을 시도합니다. 」");
        }else if( attackWay3.equals("fpdldjq")) {
            System.out.println("                                                                               「 [레이업]을 시도합니다. 」");
        }else if(attackWay3.equals("ejqmfzmffjcl")){
            System.out.println("                                                                          「 [더블 클러치]를 시도합니다. 」");
        }else if(attackWay3.equals("enpczm")){
            System.out.println("                                                                                「 [덩크]를 시도합니다. 」");
        }
        notify();
    }
    public synchronized void setAttackWay3_2(){
        while(true){
            mention.SelectionMent2("underRimPostUp");
            attackWay3 = sc.nextLine();
            if(gameEnd == 1 || attackEnd == 1){ return;}
            if(attackWay3.equals("1")||attackWay3.equals("2")||attackWay3.equals("fpdldjq")||attackWay3.equals("ejqmfzmffjcl")){
               break;
            }else if(attackWay3.equals("vnfdjqwjavj")|| attackWay3.equals("tmxpqqorwjavj2")||attackWay3.equals("enpczm")||
                    attackWay3.equals("gnrtit")||attackWay3.equals("elqTmfl")||attackWay3.equals("tmxpqqorwjavj3")||
                attackWay3.equals("fprmtmfn")||attackWay3.equals("tmvlsanqm")||attackWay3.equals("zmfhtmdhqj")||attackWay3.equals("vhtmxmdjq")||
                attackWay3.equals("qlgkdlsemqor")||attackWay3.equals("tyfejgnpdlzm"))
            {
                System.out.println(notNowSkill);
                try{Thread.sleep(1000);
            }catch(Exception e){}
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                continue ;
            }else {
                System.out.println(noSkill);
                try{Thread.sleep(1000);
            }catch(Exception e){}
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                continue;
            }
        }

        if(attackWay3.equals("1")){
            System.out.println("                                                                                 「 골밑슛을 시도합니다. 」");
        }else if( attackWay3.equals("2")) {
            System.out.println("                                                                              「 슛 훼이크를 시도합니다. 」");
        }else if(attackWay3.equals("fpdldjq")){
            System.out.println("                                                                               「 [레이업]을 시도합니다. 」");
        }else if(attackWay3.equals("ejqmfzmffjcl")){
            System.out.println("                                                                          「 [더블 클러치]를 시도합니다. 」");
        }
        notify();
    }
    public synchronized void setAttackWay3_3(){
        System.out.println("\n                                                                                                     어떻게 하시겠습니까?\n");
        while(true){
            mention.SelectionMent2("underRimPostUp");
            attackWay3 = sc.nextLine();
            if(gameEnd == 1 || attackEnd == 1){ return;}
            if(attackWay3.equals("1")||attackWay3.equals("2")||attackWay3.equals("gnrtit")){
               break;
            }else if(attackWay3.equals("fpdldjq")||attackWay3.equals("ejqmfzmffjcl")||attackWay3.equals("vnfdjqwjavj")|| attackWay3.equals("tmxpqqorwjavj2")||attackWay3.equals("enpczm")||
                    attackWay3.equals("elqTmfl")||attackWay3.equals("tmxpqqorwjavj3")||
                attackWay3.equals("fprmtmfn")||attackWay3.equals("tmvlsanqm")||attackWay3.equals("zmfhtmdhqj")||attackWay3.equals("vhtmxmdjq")||
                attackWay3.equals("qlgkdlsemqor")||attackWay3.equals("tyfejgnpdlzm"))
            {
                System.out.println(notNowSkill);
                try{Thread.sleep(1000);
            }catch(Exception e){}
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                continue ;
            }else {
                System.out.println(noSkill);
                try{Thread.sleep(1000);
            }catch(Exception e){}
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                continue;
            }
        }

        if(attackWay3.equals("1")){
            System.out.println("                                                                                 「 골밑슛을 시도합니다. 」");
        }else if( attackWay3.equals("2")) {
            System.out.println("                                                                              「 슛 훼이크를 시도합니다. 」");
        }else if(attackWay3.equals("gnrtit")){
            System.out.println("                                                                                「 [훅 샷]을 시도합니다. 」");
        }
        notify();
    }

    public String NpcStealSuccess(){
        return npc.Steal(player.ballHandling, player.legThrewAbility);
    }


    public synchronized void notifyNpc(){
        notifyAll();
    }
    public void gaugeBar(){
        StringBuffer gaugeBar1 = new StringBuffer();

        System.out.println("\n\n                                                                                             골밑슛(30)                     2점슛(60)                      3점슛(90)        ");
        System.out.println("                                                                                               ↓                             ↓                             ↓        ");
        GaugeBar :
        while(true){
            for(int i=1; i<11; i++) {
                synchronized (this) {
                    if (SharedPlace.gameEnd == 1 || SharedPlace.attackEnd == 1) {
                        break GaugeBar;
                    }
                }

                gaugeBar1.append("▓▓▓▓▓▓▓▓▓▓");
                if(npcNearBy == 1){
                    openChance = "                                                 # NOT OPEN ";
                }

                if(StopGaugeBar.stopGaugeBar.equals("")){
                gauge = 10*i;
                break GaugeBar;
                }

                if(stopGaugeBar.equals("-1")){
                    System.out.printf("\r%s   %d %s",openChance,10*i,gaugeBar1);
                }

                try{
                    Thread.sleep(200);
                }catch(Exception e){}


                if(StopGaugeBar.stopGaugeBar.equals("")){
                gauge = 10*i;
                break GaugeBar;
                }


            }
            for(int i=1; i<11; i++) {
                synchronized (this) {
                    if (SharedPlace.gameEnd == 1 || SharedPlace.attackEnd == 1) {
                        break GaugeBar;
                    }
                }

                gaugeBar1.delete(100-10*i,110-10*i);
                if(npcNearBy == 1){
                    openChance = "                                                 # NOT OPEN ";
                }

                    if(StopGaugeBar.stopGaugeBar.equals("")){
                    gauge = 100 - 10*i;
                    break GaugeBar;
                    }

                System.out.printf("\r%s   %d %s",openChance,100 - 10*i,gaugeBar1);
                try{
                    Thread.sleep(200);
                }catch(Exception e){}


                    if(StopGaugeBar.stopGaugeBar.equals("")){
                    gauge = 100 - 10*i;
                    break GaugeBar;
                    }


            }

        }
    }

    public void attackEnd(){
        attackEnd = 1 ;
    }
    public void gameEnd(){
        gameEnd = 1 ;
    }

    public synchronized void attackTimeReset(){
        attackTimeReset = 1 ;
    }

    public boolean endCheck(){
        if(attackEnd == 1 || gameEnd == 1){
            return true;
        }
        return false;
    }

    public synchronized void  npcWait(){
        try{
            wait();
        }catch(Exception e){}
    }

    public void gameTime(){
        gameTime = 7;
        for(int i=0; i<420; i++) {
            if(i % 60 == 0){
                System.out.printf("\r남은 경기 시간 : %d : %s",gameTime,"00");
                gameTime = gameTime - 1;
            }else if(i%60 > 50){
                System.out.printf("\r남은 경기 시간 : %d : %s%d",gameTime,"0",60 -i%60);
            }else {
                System.out.printf("\r남은 경기 시간 : %d : %d",gameTime,60 - i%60);
                if(i == 60){
                }
            }
            try{
            Thread.sleep(1000);
            }catch(Exception e){
              e.printStackTrace();
            }

        }
    }
    public void stopGameTime(){
        for(int i=0; i<420; i++) {
            stopGameTime = (420-i)/60 + " : " + (420-i - ((420-i)/60)*60);
            stopGameTimeSecond = 420 - i;
            try{
            Thread.sleep(1000);
            }catch(Exception e){
              e.printStackTrace();
            }
            if(gameEnd == 1){
                return;
            }

        }
        gameEnd = 1;

    }
    public void attackTime(){
        for(int i=0; i<14; i++) {

            attackTime = 14 - i;

            if (SharedPlace2.attackTimeResetCheck() || SharedPlace2.endCheck()){
                return;
            }

            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }

            if (SharedPlace2.attackTimeResetCheck() || SharedPlace2.endCheck()){
                return;
            }
        }
        SharedPlace2.attackEnd1();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                공격 제한 시간이 모두 지났습니다.\n");
        System.out.println("                                                                                               공격권이 "+npc.myName+"에게로 넘어갑니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public void attackTime2(){
        for(int i=0; i<14; i++) {

            attackTime = 14 - i;

            if (SharedPlace2.attackTimeResetCheck() || SharedPlace2.endCheck()){
                return;
            }

            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }

            if (SharedPlace2.attackTimeResetCheck() || SharedPlace2.endCheck()){
                return;
            }
        }
        SharedPlace2.attackEnd1();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                공격 제한 시간이 모두 지났습니다.\n");
        System.out.println("                                                                                               공격권이 "+player.myName+"에게로 넘어갑니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

    }


    public String shooting(String shootNameKor,String shootNameEng,int shootOrFake,int point2Or3,int canFoul){
        String result = offenseSituation.shooting(player,npc,mention,sc,shootNameKor,shootNameEng,shootOrFake,npcBlock,npcNearBy,point2Or3,canFoul);
        npcBlock = 2;
        npcNearBy = 0;
        return result;
    }

    public String penetration(String skillNameKor,String skillNameEng){
        String result = offenseSituation.penetration(player,npc,mention,sc,rand,skillNameKor,skillNameEng,blockOrWait,npcBlock,defenseWay);
        npcBlock = 2;
        return result;
    }

    public String postUp(){
        String result = offenseSituation.postUp(player,npc,mention,sc);
        return result;
    }

    public synchronized void doSteal(){
        doSteal = 1;
        notify();
    }
    public void reset(){
        this.attackWay0 = "-1";
        this.attackWay1 = "-1";
        this.attackWay2 = "-1";
        this.attackWay3 = "-1";
        this.stopGaugeBar = "-1";
        this.attackEnd = 0;
        this.npcNearBy = 0;
        this.npcBlock = 2;
        this.playerDefenseWay = "0";
        this.openChance = "                                                 # WIDE OPEN";
        this.defenseWay = -1;
    }
    public static synchronized void scanner(){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }
}
