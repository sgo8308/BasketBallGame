import java.util.Random;
import java.util.Scanner;

public class test222{
    public static void main(String[] args) {
        String userName,select,select2,whoseTurn,attackWay1 , attackWay2;
        String errorMessage = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                 # 옳바른 숫자를 입력해 주세요 #\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
        int jordanClutchTime = 0;
        SharedPlace sharedPlace  = new SharedPlace();
        Player pl = new Player();
        userName = pl.myName;
        Jordan jd = new Jordan();
        MainWait mainWait = new MainWait();

        Thread gameTimeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                sharedPlace.stopGameTime();
            }
        });
        Scanner sc = new Scanner(System.in);

        DefenseSituation defenseSituation = new DefenseSituation();

        PictureNpcTurn pictureNpcTurn = new PictureNpcTurn();



        pl.InitializeStat();
        pl.ShootingSkillKoreaen();
        pl.DribbleSkillKorean();
        pl.SkillPut();
        pl.SkillCommandPut();


        Mention mention = new Mention();
        Random rand = new Random();


        MyAttack myAttack = new MyAttack(sharedPlace,jd,mainWait,pl);


        sharedPlace.setNpc(jd);
        sharedPlace.setPlayer(pl);
        defenseSituation.setPlayerNpc(pl,jd);

        jd.InitializeStat();
        gameTimeThread.start();
        pl.turn ="player";
        GameStart :
        while(jd.myScore<15 && pl.myScore<15){
            switch (pl.turn){
                //마이클 조던 공격권
                case "마이클 조던" :
                    try{Thread.sleep(1500);
                    }catch(Exception e){}
                    sharedPlace.reset();
                    if(sharedPlace.gameEnd == 1){ break GameStart;}
                    SharedPlace.attackTime = 14;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                    System.out.println("                                                                                                "+pl.myName + "         " + jd.myName
                            +"\n");
                    System.out.println("                                                                                                    "+pl.stamina + "               " + jd.stamina+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                    try{Thread.sleep(1000);
                    }catch(Exception e){}
                    mention.gameInfo2(pl.myScore,jd.myScore,pl.foulCount,jd.foulCount);

                    try{Thread.sleep(1000);
                    }catch(Exception e){}

                    if(sharedPlace.gameEnd == 1){ break GameStart;}

                    //region 체력 및 파울 표시
                    pl.StaminaEffect();
                    jd.StaminaEffect();
                    if(pl.staminaEffectCount == 1 || pl.staminaEffectCount == 2 || pl.staminaEffectCount == 3 ||jd.staminaEffectCount == 1 || jd.staminaEffectCount == 2 || jd.staminaEffectCount == 3){
                        try{Thread.sleep(1000);
                        }catch(Exception e){}
                    }
                    jd.FailCountZero();
                    if((pl.myScore >11 || jd.myScore>11 || SharedPlace.stopGameTimeSecond < 60) && jordanClutchTime == 0 ){
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                               클러치 타임이 되었습니다. 마이클 조던의 모든 능력치가 20만큼 상승합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        jd.ClutchTime();
                        jordanClutchTime = 1;
                        try{Thread.sleep(1000);
                        }catch(Exception e){}
                    }
                    //endregion
                    JordanAttack :
                    while(true) {
                        sharedPlace.attackEnd = 0;
                        SharedPlace.attackTime = 14;
                        Thread attackTimeThread = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                sharedPlace.attackTime2();
                            }
                        });
                        SharedPlace.attackTimeReset = 0;
                        attackTimeThread.start();
                        if(SharedPlace2.endCheck()){ break JordanAttack;}

                        mention.gameInfo(pl.myScore,jd.myScore,pl.foulCount,jd.foulCount);

                        pictureNpcTurn.line3CloseOpponent(jd);
                        System.out.println("\n                                                                                                "+jd.myName+"이 드리블을 시작했습니다.");
                        System.out.println("\n                                                                                              "+jd.myName+"이 3점 라인 근처까지 왔습니다.\n");
                        attackWay1 = "";
                        attackWay2 = "";
                        whoseTurn = "";
                        int defenseWay =-1;

                        Still :
                        while (true) {
                            if(SharedPlace2.endCheck()){ break JordanAttack;}

                            //region 공격 시작
                            if(attackWay1.equals("Still") || attackWay2.equals("Still") || whoseTurn.equals("Still") ){
                                mention.gameInfo(pl.myScore,jd.myScore,pl.foulCount,jd.foulCount);
                                pictureNpcTurn.line3CloseOpponent(jd);
                            }

                            while(true){
                                try{
                                    sharedPlace.playerDefenseWay = "0";
                                    mention.SelectionMent("gameStart");

                                    Thread jdLine3Thread = new Thread(new Runnable(){

                                        @Override
                                        public void run() {
                                            try{Thread.sleep(3000);
                                            }catch(Exception e){}
                                            if(sharedPlace.playerDefenseWay.equals("0")){

                                                int randNumber = rand.nextInt(3) + 1;
                                                if(SharedPlace2.endCheck()){return;}
                                                SharedPlace2.attackTimeReset1();
                                                if(randNumber == 1){
                                                    String result = defenseSituation.shooting(pl,jd,mention,sc,"3점슛","point3",1,"2",0,3,0);
                                                }else if(randNumber == 2){
                                                    String result = defenseSituation.shooting(pl,jd,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                }else {
                                                    String result = defenseSituation.shooting(pl,jd,mention,sc,"[덩크]","dunk",1,"2",0,2,0);
                                                }
                                            }
                                        }
                                    });
                                    jdLine3Thread.start();

                                    sharedPlace.playerDefenseWay = sc.nextLine();

                                    try{ jdLine3Thread.join();
                                    }catch(Exception e){}

                                    if(SharedPlace2.endCheck()){ break JordanAttack;}


                                    if(!(sharedPlace.playerDefenseWay.equals("1") || sharedPlace.playerDefenseWay.equals("2"))){
                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                            break JordanAttack;
                                        }
                                        System.out.println(errorMessage);
                                        try{Thread.sleep(500);
                                        }catch(Exception e){}
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                            break JordanAttack;
                                        }
                                        continue ;
                                    }

                                    break;
                                }catch(Exception e){
                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                        break JordanAttack;
                                    }
                                    System.out.println(errorMessage);
                                    try{Thread.sleep(500);
                                    }catch(Exception k){}
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                        break JordanAttack;
                                    }
                                    continue;
                                }
                            }

                            if(SharedPlace2.endCheck()){ break JordanAttack;}

                            mention.gameInfo(pl.myScore,jd.myScore,pl.foulCount,jd.foulCount);
                            if(sharedPlace.playerDefenseWay.equals("1")){
                                pictureNpcTurn.line3CloseOpponent(jd);
                            }else {
                                pictureNpcTurn.line3FarOpponent(jd);
                            }
                            //endregion
                            //조던 3점라인 공격
                            int attackNumber = jd.AttackPhase1();
                            switch (attackNumber) {
                                //region 돌파 or 크로스오버
                                case 0:

                                    System.out.println("\n                                                                                               "+jd.myName+"이 돌파를 시도합니다.\n");

                                    while(true){

                                        sharedPlace.playerDefenseWay = "0";
                                        mention.SelectionMent("penetration");

                                        Thread jdLine3_1Thread = new Thread(new Runnable(){
                                            @Override
                                            public void run() {
                                                try{Thread.sleep(3000);
                                                }catch(Exception e){}
                                                if(sharedPlace.playerDefenseWay.equals("0")){

                                                    if(SharedPlace2.endCheck()){return;}
                                                    SharedPlace2.attackTimeReset1();
                                                    int randNumber = rand.nextInt(2) + 1;
                                                    if(randNumber == 1){
                                                        String result = defenseSituation.shooting(pl,jd,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                    }else {
                                                        String result = defenseSituation.shooting(pl,jd,mention,sc,"[덩크]","dunk",1,"2",0,2,0);
                                                    }
                                                }
                                            }
                                        });
                                        jdLine3_1Thread.start();

                                        sharedPlace.playerDefenseWay = sc.nextLine();

                                        try{ jdLine3_1Thread.join();
                                        }catch(Exception e){}

                                        if(SharedPlace2.endCheck()){ break JordanAttack;}

                                        if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2") ||sharedPlace.playerDefenseWay.equals("3")){
                                            break;
                                        }else {
                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                break JordanAttack;
                                            }
                                            System.out.println(errorMessage);
                                            try{Thread.sleep(500);
                                            }catch(Exception e){}
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                break JordanAttack;
                                            }
                                            continue ;
                                        }
                                    }

                                    int peneOrCross = jd.PenetrationOrCrossOver();

                                    if (peneOrCross == 1) {
                                        if (sharedPlace.playerDefenseWay.equals("1")) {
                                            attackWay1 = defenseSituation.penetration(pl, jd, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 1, defenseWay);
                                        } else {
                                            attackWay1 = defenseSituation.penetration(pl, jd, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 0, defenseWay);
                                        }
                                    } else if (peneOrCross == 2) {
                                        if (sharedPlace.playerDefenseWay.equals("2")) {
                                            attackWay1 = defenseSituation.penetration(pl, jd, mention, sc, "[크로스오버]", "crossOver", sharedPlace.playerDefenseWay, 1, defenseWay);
                                        } else {
                                            attackWay1 = defenseSituation.penetration(pl, jd, mention, sc, "[크로스오버]", "crossOver", sharedPlace.playerDefenseWay, 0, defenseWay);
                                        }
                                    }
                                    if (attackWay1.equals("Still")) {
                                        continue Still;
                                    }else if (attackWay1.equals("End Turn")) {
                                        break JordanAttack;
                                    }else if(attackWay1.equals("Restart")){
                                        SharedPlace2.attackTimeReset1();
                                        continue JordanAttack;
                                    }
                                    break;
                                //endregion
                                //region 3점 슈팅 or 훼이크
                                case 1:
                                    whoseTurn = "";
                                    while (true) {
                                        if(SharedPlace2.endCheck()){ break JordanAttack;}

                                        int shootOrFake = jd.ShootOrFake();
                                        if(whoseTurn.equals("Still")){
                                            mention.gameInfo(pl.myScore,jd.myScore,pl.foulCount,jd.foulCount);
                                            pictureNpcTurn.line3CloseOpponent(jd);
                                        }

                                        System.out.println("\n                                                                                               "+jd.myName+"이 슛 모션을 취합니다.\n");

                                        while(true){
                                            sharedPlace.playerDefenseWay = "0";
                                            mention.SelectionMent("shooting");

                                            Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                @Override
                                                public void run() {
                                                    try{Thread.sleep(3000);
                                                    }catch(Exception e){}
                                                    if(sharedPlace.playerDefenseWay.equals("0")){

                                                        if(SharedPlace2.endCheck()){ return ;}
                                                        SharedPlace2.attackTimeReset1();
                                                        int randNumber = rand.nextInt(2) + 1;

                                                        String result = defenseSituation.shooting(pl,jd,mention,sc,"3점슛","point3",1,"2",0,3,0);

                                                    }
                                                }
                                            });
                                            jdLine3_2Thread.setName("jdLine3_2Thread");
                                            jdLine3_2Thread.start();


                                            sharedPlace.playerDefenseWay = sc.nextLine();

                                            try{jdLine3_2Thread.join();
                                            }catch(Exception e){}

                                            if(SharedPlace2.endCheck()){ break JordanAttack;}

                                            if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                break;
                                            }else {
                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                    break JordanAttack;
                                                }
                                                System.out.println(errorMessage);
                                                try{Thread.sleep(500);
                                                }catch(Exception e){}
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                    break JordanAttack;
                                                }
                                                continue ;
                                            }
                                        }

                                        whoseTurn = defenseSituation.shooting(pl, jd, mention, sc, "3점슛", "point3", shootOrFake, sharedPlace.playerDefenseWay, 1, 3,1);

                                        if (whoseTurn.equals("Still")) {
                                            continue;
                                        } else if (whoseTurn.equals("End Turn")) {
                                            break JordanAttack;
                                        }else if(whoseTurn.equals("Restart")){
                                            SharedPlace2.attackTimeReset1();
                                            continue JordanAttack;
                                        }else if(whoseTurn.equals("GameEnd")){
                                            break GameStart;
                                        }
                                    }
                                    //endregion
                                    // region 포스트업
                                case 2:
                                    System.out.println("\n                                                                                         "+jd.myName+"이 45도 각도에서 [포스트업]을 시작했습니다.\n");

                                    while(true){
                                        sharedPlace.playerDefenseWay = "0";
                                        mention.SelectionMent("postUp");

                                        Thread jdLine3_3Thread = new Thread(new Runnable(){
                                            @Override
                                            public void run() {
                                                try{Thread.sleep(3000);
                                                }catch(Exception e){}
                                                if(sharedPlace.playerDefenseWay.equals("0")){

                                                    if(SharedPlace2.endCheck()){return;}
                                                    SharedPlace2.attackTimeReset1();
                                                    String result = defenseSituation.shooting(pl,jd,mention,sc,"2점슛","point2",1,"2",0,2,0);
                                                }
                                            }
                                        });
                                        jdLine3_3Thread.start();

                                        sharedPlace.playerDefenseWay = sc.nextLine();

                                        try{ jdLine3_3Thread.join();
                                        }catch(Exception e){}

                                        if(SharedPlace2.endCheck()){ break JordanAttack;}

                                        if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")||sharedPlace.playerDefenseWay.equals("3")){
                                            break;
                                        }else {
                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                break JordanAttack;
                                            }
                                            System.out.println(errorMessage);
                                            try{Thread.sleep(500);
                                            }catch(Exception e){}
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                break JordanAttack;
                                            }
                                            continue ;
                                        }
                                    }

                                    attackWay1 = defenseSituation.postUp(pl, jd, mention, sc, sharedPlace.playerDefenseWay);

                                    if (attackWay1.equals("Still")) {
                                        continue Still;
                                    } else if (attackWay1.equals("End Turn")) {
                                        break JordanAttack;
                                    }else if(attackWay1.equals("Restart")){
                                        SharedPlace2.attackTimeReset1();
                                        continue JordanAttack;
                                    }
                                    break;
                                //endregion
                            }

                            //조던 자유투 라인 공격
                            //region 자유투 라인 공격 - 조던이 완전히 돌파했을 때
                            if (attackWay1.equals("Fully Penetration")) {
                                int layUpOrDunk = jd.LayUpOrDunk(pl.myScore);

                                if (layUpOrDunk == 1) {
                                    whoseTurn = defenseSituation.shooting(pl, jd, mention, sc, "[레이업]", "layUp", 1, "2", 0, 2,0);
                                } else {
                                    int oneHandOrTwoHand = rand.nextInt(2);
                                    if (oneHandOrTwoHand == 1) {
                                        whoseTurn = defenseSituation.shooting(pl, jd, mention, sc, "[원핸드 슬램덩크]", "dunk", 1, "2", 0, 2,0);
                                    } else {
                                        whoseTurn = defenseSituation.shooting(pl, jd, mention, sc, "[투핸드 슬램덩크]", "dunk", 1, "2", 0, 2,0);
                                    }
                                }
                                if(whoseTurn.equals("GameEnd")){
                                    break GameStart;
                                }
                                break JordanAttack;


                            }
                            //endregion
                            //region 자유투라인 공격 - 조던이 완전히 돌파하지 못했을 때(내가 쫓아갈 때)
                            if (attackWay1.equals("Half Penetration")) {
                                //덩크할 때
                                int DunkOrPullUpOrPene = jd.DunkOrPullUpOrPene(pl.myScore);
                                if (DunkOrPullUpOrPene == 1) {
                                    jd.FreeThrowLineDunk();
                                    SharedPlace2.attackTimeReset1();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                     "+jd.myName+"이 갑자기 뛰어 올라 [프리드로우 라인 덩크]를 성공시킵니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    try{Thread.sleep(1000);
                                    }catch(Exception e){}
                                    if(jd.myScore > 14){
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기종료" +
                                                "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        break GameStart;
                                    }
                                    mention.ChangeAttackMent(pl.myName);
                                    jd.FailCountZero();
                                    break JordanAttack;
                                }
                                //풀업 점퍼 or 2점 슛
                                else if (DunkOrPullUpOrPene == 2) {
                                    whoseTurn = "";
                                    while (true) {
                                        if(SharedPlace2.endCheck()){ break JordanAttack;}

                                        int shootOrFake = jd.ShootOrFake();
                                        mention.gameInfo(pl.myScore,jd.myScore,pl.foulCount,jd.foulCount);
                                        pictureNpcTurn.freethrowWithOpponent(jd);
                                        if (whoseTurn == "Still") {
                                            System.out.println("\n                                                                                              "+jd.myName+"이 다시 슛 모션을 취합니다.\n");
                                        } else {
                                            System.out.println("\n                                                                                          "+jd.myName+"이 자유투 라인 부근에서 슛 모션을 취합니다.\n");
                                        }
                                        while(true){
                                            sharedPlace.playerDefenseWay = "0";
                                            mention.SelectionMent("shooting");

                                            Thread jdLine2_1Thread = new Thread(new Runnable(){
                                                @Override
                                                public void run() {
                                                    try{Thread.sleep(3000);
                                                    }catch(Exception e){}
                                                    if(sharedPlace.playerDefenseWay.equals("0")){

                                                        if(SharedPlace2.endCheck()){return;}
                                                        SharedPlace2.attackTimeReset1();
                                                        String result = defenseSituation.shooting(pl,jd,mention,sc,"2점슛","point2",1,"2",0,2,0);
                                                    }
                                                }
                                            });
                                            jdLine2_1Thread.start();


                                            sharedPlace.playerDefenseWay = sc.nextLine();

                                            try{ jdLine2_1Thread.join();
                                            }catch(Exception e){}

                                            if(SharedPlace2.endCheck()){ break JordanAttack;}

                                            if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                break;
                                            }else {
                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                    break JordanAttack;
                                                }
                                                System.out.println(errorMessage);
                                                try{Thread.sleep(500);
                                                }catch(Exception e){}
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                    break JordanAttack;
                                                }
                                                continue ;
                                            }
                                        }

                                        if (whoseTurn == "Still") {
                                            whoseTurn = defenseSituation.shooting(pl, jd, mention, sc, "2점슛", "point2", shootOrFake, sharedPlace.playerDefenseWay, 1, 2,1);
                                        } else {
                                            whoseTurn = defenseSituation.shooting(pl, jd, mention, sc, "[풀업 점퍼]", "pullUpJumper", shootOrFake, sharedPlace.playerDefenseWay, 1, 2,1);
                                        }

                                        if (whoseTurn.equals("Still")) {
                                            continue ;
                                        } else if (whoseTurn.equals("End Turn")) {
                                            break JordanAttack;
                                        }else if(whoseTurn.equals("Restart")){
                                            SharedPlace2.attackTimeReset1();
                                            continue JordanAttack;
                                        }else if(whoseTurn.equals("GameEnd")){
                                            break GameStart;
                                        }

                                    }

                                    //계속 돌파할 때
                                } else if (DunkOrPullUpOrPene == 3) {

                                    if(SharedPlace2.endCheck()){ break JordanAttack;}

                                    mention.gameInfo(pl.myScore,jd.myScore,pl.foulCount,jd.foulCount);
                                    pictureNpcTurn.freethrowWithOpponent(jd);
                                    System.out.println("\n                                                                                          "+jd.myName+"이 자유투 라인 부근을 지나 계속 돌파합니다.\n");

                                    while(true){
                                        sharedPlace.playerDefenseWay = "0";
                                        mention.SelectionMent("penetration");

                                        Thread jdLine2_2Thread = new Thread(new Runnable(){
                                            @Override
                                            public void run() {
                                                try{Thread.sleep(3000);
                                                }catch(Exception e){}
                                                if(sharedPlace.playerDefenseWay.equals("0")){

                                                    if(SharedPlace2.endCheck()){return;}
                                                    SharedPlace2.attackTimeReset1();
                                                    int randNumber = rand.nextInt(2) + 1;
                                                    if(randNumber == 1){
                                                        String result = defenseSituation.shooting(pl,jd,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                    }else {
                                                        String result = defenseSituation.shooting(pl,jd,mention,sc,"[덩크]","dunk",1,"2",0,2,0);
                                                    }
                                                }
                                            }
                                        });
                                        jdLine2_2Thread.start();

                                        sharedPlace.playerDefenseWay = sc.nextLine();

                                        try{ jdLine2_2Thread.join();
                                        }catch(Exception e){}

                                        if(SharedPlace2.endCheck()){ break JordanAttack;}

                                        if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")||sharedPlace.playerDefenseWay.equals("3")){
                                            break;
                                        }else {
                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                break JordanAttack;
                                            }
                                            System.out.println(errorMessage);
                                            try{Thread.sleep(500);
                                            }catch(Exception e){}
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                break JordanAttack;
                                            }
                                            continue ;
                                        }
                                    }


                                    if (sharedPlace.playerDefenseWay.equals("4")) {

                                        int layUpOrDunk = jd.LayUpOrDunk(pl.myScore);
                                        if (layUpOrDunk == 1) {
                                            whoseTurn = defenseSituation.shooting(pl, jd, mention, sc, "[레이업]", "layUp", 1, "2", 0, 2,0);
                                        } else {
                                            int oneHandOrTwoHand = rand.nextInt(2);
                                            if (oneHandOrTwoHand == 1) {
                                                whoseTurn = defenseSituation.shooting(pl, jd, mention, sc, "[원핸드 슬램덩크]", "dunk", 1, "2", 0, 2,0);
                                            } else {
                                                whoseTurn = defenseSituation.shooting(pl, jd, mention, sc, "[투핸드 슬램덩크]", "dunk", 1, "2", 0, 2,0);
                                            }
                                        }
                                        if(whoseTurn.equals("GameEnd")){
                                            break GameStart;
                                        }
                                        break JordanAttack;

                                    } else {
                                        int peneOrSpin = rand.nextInt(2) + 1;

                                        if (peneOrSpin == 1) {
                                            if (sharedPlace.playerDefenseWay.equals("1")) {
                                                attackWay2 = defenseSituation.penetration(pl, jd, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 1, 0);
                                            } else {
                                                attackWay2 = defenseSituation.penetration(pl, jd, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 0, 0);
                                            }
                                        } else if (peneOrSpin == 2) {
                                            if (sharedPlace.playerDefenseWay.equals("2")) {
                                                attackWay2 = defenseSituation.penetration(pl, jd, mention, sc, "[스핀무브]", "spinMove", sharedPlace.playerDefenseWay, 1, 0);
                                            } else {
                                                attackWay2 = defenseSituation.penetration(pl, jd, mention, sc, "[스핀무브]", "spinMove", sharedPlace.playerDefenseWay, 0, 0);
                                            }
                                        }
                                        if (attackWay2.equals("Still")) {
                                            continue Still;
                                        } else if (attackWay2.equals("End Turn")) {
                                            break JordanAttack;
                                        }else if(attackWay2.equals("Restart")){
                                            SharedPlace2.attackTimeReset1();
                                            continue JordanAttack;
                                        }
                                    }
                                }
                            }
                            //endregion
                            //region 자유투 라인 공격 - 조던이 포스트업으로 들어왔을 때
                            if (attackWay1.equals("PostUp")) {
                                if(SharedPlace2.endCheck()){ break JordanAttack;}

                                mention.gameInfo(pl.myScore,jd.myScore,pl.foulCount,jd.foulCount);
                                pictureNpcTurn.freethrowPostUp(jd);
                                System.out.println("\n                                                                                          "+jd.myName+"이 자유투 라인 근처까지 들어오고 있습니다.\n");

                                while(true){
                                    sharedPlace.playerDefenseWay = "0";
                                    mention.SelectionMent("postUp");

                                    Thread jdLine2_3Thread = new Thread(new Runnable(){
                                        @Override
                                        public void run() {
                                            try{Thread.sleep(3000);
                                            }catch(Exception e){}
                                            if(sharedPlace.playerDefenseWay.equals("0")){

                                                if(SharedPlace2.endCheck()){return;}
                                                SharedPlace2.attackTimeReset1();
                                                String result = defenseSituation.shooting(pl,jd,mention,sc,"2점슛","point2",1,"2",0,2,0);
                                            }
                                        }
                                    });
                                    jdLine2_3Thread.start();

                                    sharedPlace.playerDefenseWay = sc.nextLine();

                                    try{ jdLine2_3Thread.join();
                                    }catch(Exception e){}

                                    if(SharedPlace2.endCheck()){ break JordanAttack;}

                                    if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")||sharedPlace.playerDefenseWay.equals("3")){
                                        break;
                                    }else {
                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                            break JordanAttack;
                                        }
                                        System.out.println(errorMessage);
                                        try{Thread.sleep(500);
                                        }catch(Exception e){}
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                            break JordanAttack;
                                        }
                                        continue ;
                                    }
                                }

                                int PostUpOrFadeAway = jd.PostUpOrFadeAway();
                                if (PostUpOrFadeAway == 1 || sharedPlace.playerDefenseWay.equals("3")) {
                                    attackWay2 = defenseSituation.postUp(pl, jd, mention, sc, sharedPlace.playerDefenseWay);
                                    if (attackWay2.equals("Still")) {
                                        continue ;
                                    } else if (attackWay2.equals("End Turn")) {
                                        break JordanAttack;
                                    }else if(attackWay2.equals("Restart")){
                                        SharedPlace2.attackTimeReset1();
                                        continue JordanAttack;
                                    }else if(attackWay2.equals("GameEnd")){
                                        break GameStart;
                                    }

                                } else if (PostUpOrFadeAway == 2) {
                                    attackWay2 = "";

                                    while (true) {
                                        int shootOrFake = jd.ShootOrFake();

                                        if(SharedPlace2.endCheck()){ break JordanAttack;}
                                        mention.gameInfo(pl.myScore,jd.myScore,pl.foulCount,jd.foulCount);
                                        pictureNpcTurn.freethrowPostUp(jd);
                                        if (attackWay2 == "Still") {
                                            System.out.println("\n                                                                                              "+jd.myName+"이 다시 슛 모션을 취합니다.\n");
                                        } else {
                                            System.out.println("\n                                                                                          "+jd.myName+"이 [턴어라운드 페이더웨이]를 시도합니다.\n");
                                        }

                                        while(true){
                                            sharedPlace.playerDefenseWay = "0";
                                            mention.SelectionMent("shooting");

                                            Thread jdLine2_3Thread = new Thread(new Runnable(){
                                                @Override
                                                public void run() {
                                                    try{Thread.sleep(1500);
                                                    }catch(Exception e){}
                                                    if(sharedPlace.playerDefenseWay.equals("0")){

                                                        if(SharedPlace2.endCheck()){return;}
                                                        SharedPlace2.attackTimeReset1();
                                                        String result = defenseSituation.shooting(pl,jd,mention,sc,"2점슛","point2",1,"2",0,2,0);
                                                    }
                                                }
                                            });
                                            jdLine2_3Thread.start();

                                            sharedPlace.playerDefenseWay = sc.nextLine();

                                            try{ jdLine2_3Thread.join();
                                            }catch(Exception e){}

                                            if(SharedPlace2.endCheck()){ break JordanAttack;}

                                            if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                break;
                                            }else {
                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                    break JordanAttack;
                                                }
                                                try{Thread.sleep(500);
                                                }catch(Exception e){}
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                    break JordanAttack;
                                                }
                                                continue ;
                                            }
                                        }

                                        if (attackWay2 == "Still") {
                                            attackWay2 = defenseSituation.shooting(pl, jd, mention, sc, "2점슛", "point2", shootOrFake, sharedPlace.playerDefenseWay, 1, 2,1);
                                        } else {
                                            attackWay2 = defenseSituation.shooting(pl, jd, mention, sc, "[턴어라운드 페이더웨이]", "fadeAway", shootOrFake, sharedPlace.playerDefenseWay, 1, 2,1);
                                        }
                                        if (attackWay2.equals("Still")) {
                                            continue ;
                                        } else if (attackWay2.equals("End Turn")) {
                                            break JordanAttack;
                                        }else if(attackWay2.equals("Restart")){
                                            SharedPlace2.attackTimeReset1();
                                            continue JordanAttack;
                                        }else if(attackWay2.equals("GameEnd")){
                                            break GameStart;
                                        }
                                    }
                                }


                            }
                            //endregion

                            //조던 골 밑 공격
                            //region 레이업 or 더블 클러치
                            if (attackWay2.equals("Half Penetration") || attackWay2.equals("Fully Penetration")) {
                                int layUpOrDoubleClutch = jd.LayUpOrDoubleClutch();
                                whoseTurn = "";
                                int shootOrFake = jd.ShootOrFake();
                                if(SharedPlace2.endCheck()){ break JordanAttack;}

                                mention.gameInfo(pl.myScore,jd.myScore,pl.foulCount,jd.foulCount);

                                pictureNpcTurn.underRimwWithOpponent(jd);
                                System.out.println("\n                                                                                            "+jd.myName+"이 스텝을 밟고 [레이업]을 올라갔습니다.\n");

                                while(true){
                                    sharedPlace.playerDefenseWay = "0";
                                    mention.SelectionMent("shooting");

                                    Thread jdLine2_3Thread = new Thread(new Runnable(){
                                        @Override
                                        public void run() {
                                            try{Thread.sleep(3000);
                                            }catch(Exception e){}
                                            if(sharedPlace.playerDefenseWay.equals("0")){

                                                if(SharedPlace2.endCheck()){return;}
                                                SharedPlace2.attackTimeReset1();
                                                String result = defenseSituation.shooting(pl,jd,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                            }
                                        }
                                    });
                                    jdLine2_3Thread.start();

                                    sharedPlace.playerDefenseWay = sc.nextLine();

                                    try{ jdLine2_3Thread.join();
                                    }catch(Exception e){}

                                    if(SharedPlace2.endCheck()){ break JordanAttack;}

                                    if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                        break;
                                    }else {
                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                            break JordanAttack;
                                        }
                                        try{Thread.sleep(500);
                                        }catch(Exception e){}
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                            break JordanAttack;
                                        }
                                        continue ;
                                    }
                                }

                                if (layUpOrDoubleClutch == 1) {
                                    whoseTurn = defenseSituation.shooting(pl, jd, mention, sc, "[레이업]", "layUp", 1, sharedPlace.playerDefenseWay, 1, 2,1);
                                } else {
                                    whoseTurn = defenseSituation.shooting(pl, jd, mention, sc, "[더블 클러치]", "doubleClutch", 0, sharedPlace.playerDefenseWay, 1, 2,0);
                                }
                                if(whoseTurn.equals("GameEnd")){
                                    break GameStart;
                                }
                                break JordanAttack;
                            }
                            //endregion
                            //region 턴어라운드 페이더웨이
                            if (attackWay2.equals("PostUp")) {
                                int fadeAwayOrDunk = rand.nextInt(2) + 1;
                                if (fadeAwayOrDunk == 1) {
                                    whoseTurn = "";
                                    while (true) {
                                        int shootOrFake = jd.ShootOrFake();

                                        if(SharedPlace2.endCheck()){ break JordanAttack;}

                                        mention.gameInfo(pl.myScore,jd.myScore,pl.foulCount,jd.foulCount);

                                        pictureNpcTurn.underRimPostUp(jd);
                                        if (whoseTurn == "Still") {
                                            System.out.println("\n                                                                                              "+jd.myName+"이 다시 슛 모션을 취합니다.\n");
                                        } else {
                                            System.out.println("\n                                                                                        "+jd.myName+"이 골밑에서 [턴어라운드 페이더웨이]를 시도합니다.\n");
                                        }

                                        while(true){
                                            sharedPlace.playerDefenseWay = "0";
                                            mention.SelectionMent("shooting");

                                            Thread jdLine2_3Thread = new Thread(new Runnable(){
                                                @Override
                                                public void run() {
                                                    try{Thread.sleep(1500);
                                                    }catch(Exception e){}
                                                    if(sharedPlace.playerDefenseWay.equals("0")){

                                                        if(SharedPlace2.endCheck()){return;}
                                                        SharedPlace2.attackTimeReset1();
                                                        String result = defenseSituation.shooting(pl,jd,mention,sc,"2점슛","point2",1,"2",0,2,0);
                                                    }
                                                }
                                            });
                                            jdLine2_3Thread.start();

                                            sharedPlace.playerDefenseWay = sc.nextLine();

                                            try{ jdLine2_3Thread.join();
                                            }catch(Exception e){}

                                            if(SharedPlace2.endCheck()){ break JordanAttack;}

                                            if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                break;
                                            }else {
                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                    break JordanAttack;
                                                }
                                                System.out.println(errorMessage);
                                                try{Thread.sleep(500);
                                                }catch(Exception e){}
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                    break JordanAttack;
                                                }
                                                continue ;
                                            }
                                        }


                                        if (whoseTurn == "Still") {
                                            whoseTurn = defenseSituation.shooting(pl, jd, mention, sc, "골밑슛", "underRim", shootOrFake, sharedPlace.playerDefenseWay, 1, 2,1);
                                        } else {
                                            whoseTurn = defenseSituation.shooting(pl, jd, mention, sc, "[턴어라운드 페이더웨이]", "fadeAwayUnderRim", shootOrFake, sharedPlace.playerDefenseWay, 1, 2,0);
                                        }
                                        if (whoseTurn.equals("Still")) {
                                            continue;
                                        } else if (whoseTurn.equals("End Turn")) {
                                            break JordanAttack;
                                        }else if(whoseTurn.equals("Restart")){
                                            SharedPlace2.attackTimeReset1();
                                            continue JordanAttack;
                                        }else if(whoseTurn.equals("GameEnd")){
                                            break GameStart;
                                        }

                                    }
                                } else {

                                    if(SharedPlace2.endCheck()){ break JordanAttack;}

                                    mention.gameInfo(pl.myScore,jd.myScore,pl.foulCount,jd.foulCount);

                                    pictureNpcTurn.baseLine(jd);
                                    System.out.println("\n                                                                                 마이클 조던이 베이스라인 쪽으로 돌파하여 [리버스 덩크]를 시도합니다.\n");

                                    while(true){
                                        sharedPlace.playerDefenseWay = "0";

                                        mention.SelectionMent("shooting");

                                        Thread jdLine2_3Thread = new Thread(new Runnable(){
                                            @Override
                                            public void run() {
                                                try{Thread.sleep(1500);
                                                }catch(Exception e){}
                                                if(sharedPlace.playerDefenseWay.equals("0")){

                                                    if(SharedPlace2.endCheck()){return;}
                                                    SharedPlace2.attackTimeReset1();
                                                    String result = defenseSituation.shooting(pl,jd,mention,sc,"[리버스 덩크]","dunk",1,"2",0,2,0);
                                                }
                                            }
                                        });
                                        jdLine2_3Thread.start();

                                        sharedPlace.playerDefenseWay = sc.nextLine();

                                        try{ jdLine2_3Thread.join();
                                        }catch(Exception e){}

                                        if(SharedPlace2.endCheck()){ break JordanAttack;}

                                        if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                            break;
                                        }else {
                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                break JordanAttack;
                                            }
                                            System.out.println(errorMessage);
                                            try{Thread.sleep(500);
                                            }catch(Exception e){}
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                break JordanAttack;
                                            }
                                            continue ;
                                        }
                                    }

                                    whoseTurn = defenseSituation.shooting(pl, jd, mention, sc, "[리버스 덩크]", "dunk", 1, sharedPlace.playerDefenseWay, 1, 2,1);
                                }
                                if (whoseTurn.equals("Still")) {
                                    continue Still;
                                } else if (whoseTurn.equals("End Turn")) {
                                    break JordanAttack;
                                }else if(whoseTurn.equals("Restart")){
                                    SharedPlace2.attackTimeReset1();
                                    continue JordanAttack;
                                }else if(whoseTurn.equals("GameEnd")){
                                    break GameStart;
                                }

                            }
                            //endregion
                        }
                    }
                    pl.turn = "player";
                    break;

                //플레이어 공격권
                case "player" :

                    try{Thread.sleep(1000);
                    }catch(Exception e){}
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                    System.out.println("                                                                                                "+pl.myName + "         " + jd.myName
                            +"\n");
                    System.out.println("                                                                                                    "+pl.stamina + "               " + jd.stamina+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    sharedPlace.reset();
                    pl.FailCountZero();
                    if(sharedPlace.gameEnd == 1){ break GameStart;}
                    //region 체력 및 파울 표시

                    if((pl.myScore >11 || jd.myScore>11) && jordanClutchTime == 0 ){
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                               클러치 타임이 되었습니다. 마이클 조던의 모든 능력치가 20만큼 상승합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        jd.ClutchTime();
                        jordanClutchTime = 1;
                        sc.nextLine();
                    }
                    //endregion
                    //하프라인 시작
                    Thread myAttackThread = new Thread(myAttack,"myAttackThread");
                    StateCheckThread stateCheck = new StateCheckThread(myAttackThread);
                    Thread stateCheckThread = new Thread(stateCheck,"stateCheckThread");
                    myAttackThread.start();
                    stateCheckThread.start();
                    mainWait.waitMain();
                    pl.turn = "마이클 조던";

            }
        }
        sharedPlace.notifyNpc();
        System.out.println("게임끝");


    }
}
