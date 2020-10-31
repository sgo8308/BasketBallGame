import java.util.Random;
import java.util.Scanner;

public class MyAttack implements Runnable {
    static int errorcheck = 0;
    String userName,select,select2,attackWay1 , attackWay2;
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
    Npc npc;
    Player player ;
    PictureMyTurn pictureMyTurn = new PictureMyTurn();
    PictureNpcTurn pictureNpcTurn = new PictureNpcTurn();


    Mention mention = new Mention();
    Random rand = new Random();

    SharedPlace sharedPlace;
    MainWait mainWait;
    StopGaugeBar stopGaugeBar = new StopGaugeBar();

    MyAttack(SharedPlace sharedPlace,Npc npc,MainWait mainWait,Player player){
        this.sharedPlace = sharedPlace;
        this.npc = npc;
        this.mainWait = mainWait;
        this.player = player;
        sharedPlace.setPlayer(player);
        sharedPlace.setNpc(npc);
    }

    @Override
    public void run() {
        NpcDefense npcDefense = new NpcDefense(sharedPlace,npc,player);
        Thread npcDefenseThread = new Thread(npcDefense,"npcDefenseThread");
        npcDefenseThread.setDaemon(true);
        npcDefenseThread.start();
        MyAttack :
        while(true) {
            sharedPlace.reset();
            SharedPlace.attackTime = 14;
            Thread attackTimeThread = new Thread(new Runnable(){
                @Override
                public void run() {
                    sharedPlace.attackTime();
                }
            });
            attackTimeThread.start();
            SharedPlace.attackTimeReset = 0;
            if(SharedPlace2.endCheck()){ break MyAttack;}

            sharedPlace.setAttackWay0();

            if(SharedPlace2.endCheck()){ break MyAttack;}
            if(sharedPlace.attackWay0.equals("elqTmfl")){
                Thread thread1 = new Thread(stopGaugeBar);
                thread1.start();
                sharedPlace.gaugeBar();
                sharedPlace.whoseTurn = sharedPlace.shooting("[딥쓰리]","deepThree",1,3,1);
                if(sharedPlace.whoseTurn.equals("End Turn")){
                   break MyAttack;
                }
            }else if(sharedPlace.attackWay0.equals("100")){
                System.out.println(giveUpGame);
                try{Thread.sleep(1000);
            }catch(Exception e){}
                sharedPlace.gameEnd = 1;
                break MyAttack;  // 게임포기 부분 어떻게 할지 생각필요
            }

            //endregion

            try{
            Thread.sleep(2000);
            }catch(Exception e){}

            if(SharedPlace2.endCheck()){ break MyAttack;}
            Still:
            while (true) {
                //region 3점라인 공격

                if(SharedPlace2.endCheck()){ break MyAttack;}
                sharedPlace.setAttackWay1();
                sharedPlace.notifyNpc();

                if(SharedPlace2.endCheck()){ break MyAttack;}
                sharedPlace.whoseTurn = "";
                int blockOrNot = -1;
                int followOrWaitOrSteal = -1;
                int blockOrSteal = -1;
                switch (sharedPlace.attackWay1) {
                    case "1":
                        Thread thread1 = new Thread(stopGaugeBar);
                        thread1.start();
                        sharedPlace.gaugeBar();
                        sharedPlace.whoseTurn = sharedPlace.shooting("3점슛", "point3", 1, 3, 1);

                        if (sharedPlace.whoseTurn.equals("Still")) {
                            continue Still;
                        } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                            player.turn = npc.myName;
                            break MyAttack;
                        }else if(sharedPlace.whoseTurn.equals("Foul")){
                            SharedPlace.attackTimeReset = 1;
                            continue MyAttack;
                        }
                        break;
                    case "2":
                        select = "2";
                        while (true) {
                            if (sharedPlace.whoseTurn == "Still") {
                                sharedPlace.npcBlock = rand.nextInt(2) + 1;
                                sharedPlace.npcNearBy = 1;
//                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                         　             　                                                             남은 경기 시간\n");
//                                System.out.println("                                                                                                          " + sharedPlace.stopGameTime + "\n\n\n");
                                mention.gameInfo(player.myScore,npc.myScore,player.foulCount,npc.foulCount);
                                pictureMyTurn.line3CloseOpponent(npc);
                                System.out.println("\n                                                                                                     어떻게 하시겠습니까?\n");
                                mention.SelectionMent2("line3AfterFake");
                                select = sc.nextLine();
                            }
                            if(SharedPlace2.endCheck()){ break MyAttack;}
                            if (select.equals("1")) {
                                Thread thread2 = new Thread(stopGaugeBar);
                                thread2.start();

                                sharedPlace.gaugeBar();
                                sharedPlace.whoseTurn = sharedPlace.shooting("3점슛", "point3", 1, 3, 1);
                            } else if (select.equals("2")) {
                                sharedPlace.whoseTurn = sharedPlace.shooting("3점슛", "point3", 2, 3, 1);
                            }
                            if (sharedPlace.whoseTurn.equals("Still")) {
                                continue;
                            } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                player.turn = npc.myName;
                                break MyAttack;
                            }else if(sharedPlace.whoseTurn.equals("Foul")){
                                SharedPlace.attackTimeReset = 1;
                                continue MyAttack;
                            }
                            break;
                        }
                        break;
                    case "3":
                        try{ Thread.sleep(100);
                        }catch(Exception e){}
                        sharedPlace.blockOrWait=rand.nextInt(2) + 1;
                        if(SharedPlace2.endCheck()){ break MyAttack;}
System.out.println("                                                                                                                    「 "+npc.myName+"이(가) 사이드 스텝으로 따라오기 시작합니다. 」");

                        try { Thread.sleep(500);
                        } catch (Exception e) {}
                        sharedPlace.whoseTurn = sharedPlace.penetration("돌파", "basicPenetration");


                        if (sharedPlace.whoseTurn.equals("Still")) {
                            continue Still;
                        } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                            player.turn = npc.myName;
                            break MyAttack;
                        }
                        else if(sharedPlace.whoseTurn.equals("Foul")){
                            SharedPlace.attackTimeReset = 1;
                            continue MyAttack;
                        }
                        break;
                    case "tmxpqqor3":
                        SharedPlace.npcNearBy = 0;
                        Thread thread2 = new Thread(stopGaugeBar);
                        thread2.start();

                        sharedPlace.gaugeBar();
                        sharedPlace.whoseTurn = sharedPlace.shooting("[스텝백 3점슛]", "stepBack3", 1, 3, 1);
                         if (sharedPlace.whoseTurn.equals("Still")) {
                            continue Still;
                        } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                             player.turn = npc.myName;
                            break MyAttack;
                        }
                         else if(sharedPlace.whoseTurn.equals("Foul")){
                             SharedPlace.attackTimeReset = 1;
                             continue MyAttack;
                         }
                        break;
                    case "zmfhtmdhqj":
                       try{ Thread.sleep(100);
                        }catch(Exception e){}
                        sharedPlace.blockOrWait=rand.nextInt(2) + 1;
                        if(SharedPlace2.endCheck()){ break MyAttack;}
System.out.println("                                                                                                                    「 "+npc.myName+"이(가) 사이드 스텝으로 따라오기 시작합니다. 」");
                        try {
                            Thread.sleep(500);
                        } catch (Exception e) {
                        }
                        sharedPlace.whoseTurn = sharedPlace.penetration("[크로스오버]", "crossOver");
                        sharedPlace.notifyNpc();
                        if (sharedPlace.whoseTurn.equals("Still")) {
                            continue Still;
                        } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                            player.turn = npc.myName;
                            break MyAttack;
                        }
                        break;
                    case "vhtmxmdjq":
                        try{ Thread.sleep(500);
                        }catch(Exception e){}
                        System.out.println("                                                                                                                    「 "+npc.myName+"이(가) 몸으로 버티기 시작합니다. 」");
                        try {
                            Thread.sleep(1500);
                        } catch (Exception e) {
                        }
                        sharedPlace.whoseTurn = sharedPlace.postUp();
                        sharedPlace.notifyNpc();

                        if (sharedPlace.whoseTurn.equals("Still")) {
                            continue Still;
                        } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                            player.turn = npc.myName;
                            break MyAttack;
                        }
                        else if(sharedPlace.whoseTurn.equals("Foul")){
                            SharedPlace.attackTimeReset = 1;
                            continue MyAttack;
                        }
                        break;
                }

                if(SharedPlace2.endCheck()){ break MyAttack;}
//endregion
                //region 자유투 라인 공격

                switch (sharedPlace.whoseTurn) {
                    //자유투 라인 공격 - 완전히 돌파했을 때



                    case "Fully Penetration":
                        mention.gameInfo(player.myScore,npc.myScore,player.foulCount,npc.foulCount);
                        pictureMyTurn.underRimwWithOutOpponent(npc);
                        sharedPlace.setAttackWay2_1();
                        if(SharedPlace2.endCheck()){ break MyAttack;}
switch (sharedPlace.attackWay2) {
                            case "1":

                                Thread thread2 = new Thread(stopGaugeBar);
                                thread2.start();

                                sharedPlace.gaugeBar();
                                sharedPlace.whoseTurn = sharedPlace.shooting("골밑슛", "underRim", 1, 2, 0);
                                if (sharedPlace.whoseTurn.equals("Still")) {
                                    continue Still;
                                } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                    player.turn = npc.myName;
                                    break MyAttack;
                                }
                                else if(sharedPlace.whoseTurn.equals("Foul")){
                                    SharedPlace.attackTimeReset = 1;
                                    continue MyAttack;
                                }
                                break;

                            case "fpdldjq":
                                sharedPlace.whoseTurn = sharedPlace.shooting("[레이업]", "layUp", 1, 2, 0);
                                player.turn = npc.myName;
                                break MyAttack;
                            case "ejqmfzmffjcl":
                                sharedPlace.whoseTurn = sharedPlace.shooting("[더블 클러치]", "doubleClutch", 2, 2, 0);
                                player.turn = npc.myName;
                                break MyAttack;
                            case "enpczm":
                                sharedPlace.whoseTurn = sharedPlace.shooting("[덩크]", "dunk", 1, 2, 0);
                                player.turn = npc.myName;
                                break MyAttack;
                        }
                        break;

                    //자유투 라인 공격 - 완전히 돌파하지 못했을 때
                    case "Half Penetration":
                        mention.gameInfo(player.myScore,npc.myScore,player.foulCount,npc.foulCount);
                        pictureMyTurn.freethrowWithOpponent(npc);
                        sharedPlace.setAttackWay2_2();

                        if(SharedPlace2.endCheck()){ break MyAttack;}
switch (sharedPlace.attackWay2) {
                            case "1":
                                Thread thread2 = new Thread(stopGaugeBar);
                                thread2.start();

                                sharedPlace.gaugeBar();
                                sharedPlace.whoseTurn = sharedPlace.shooting("2점슛", "point2", 1, 2, 1);
                                if (sharedPlace.whoseTurn.equals("Still")) {
                                    continue Still;
                                } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                    player.turn = npc.myName;
                                    break MyAttack;
                                }
                                else if(sharedPlace.whoseTurn.equals("Foul")){
                                    SharedPlace.attackTimeReset = 1;
                                    continue MyAttack;
                                }
                                break;

                            case "2":
                                select = "2";
                                while (true) {
                                    if (sharedPlace.whoseTurn == "Still") {
                                        sharedPlace.npcBlock = rand.nextInt(2) + 1;
                                        sharedPlace.npcNearBy = 1;
//                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                         　             　                                                             남은 경기 시간\n");
//                                        System.out.println("                                                                                                          " + sharedPlace.stopGameTime + "\n\n\n");
                                        mention.gameInfo(player.myScore,npc.myScore,player.foulCount,npc.foulCount);
                                        pictureMyTurn.line3CloseOpponent(npc);
                                        System.out.println("\n                                                                                                     어떻게 하시겠습니까?\n");
                                        mention.SelectionMent2("line3AfterFake");
                                        select = sc.nextLine();
                                    }

                                    if (select.equals("1")) {
                                        Thread thread1 = new Thread(stopGaugeBar);
                                        thread1.start();

                                        sharedPlace.whoseTurn = sharedPlace.shooting("2점슛", "point2", 1, 2, 1);
                                    } else if (select.equals("2")) {
                                        sharedPlace.whoseTurn = sharedPlace.shooting("2점슛", "point2", 2, 2, 1);
                                    }
                                    if (sharedPlace.whoseTurn.equals("Still")) {
                                        continue;
                                    } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                        player.turn = npc.myName;
                                        break MyAttack;
                                    }
                                    else if(sharedPlace.whoseTurn.equals("Foul")){
                                        SharedPlace.attackTimeReset = 1;
                                        continue MyAttack;
                                    }
                                    break;
                                }
                                break;
                            case "3":

                                try{ Thread.sleep(100);
                                }catch(Exception e){}
                                sharedPlace.blockOrWait=rand.nextInt(2) + 1;
                                if(SharedPlace2.endCheck()){ break MyAttack;}
System.out.println("                                                                                                                    「 "+npc.myName+"이(가) 사이드 스텝으로 계속 따라 붙습니다. 」");

                                try { Thread.sleep(500);
                                } catch (Exception e) {}
                                sharedPlace.whoseTurn = sharedPlace.penetration("돌파", "basicPenetration");


                                if (sharedPlace.whoseTurn.equals("Still")) {
                                    continue Still;
                                } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                    player.turn = npc.myName;
                                    break MyAttack;
                                }
                                else if(sharedPlace.whoseTurn.equals("Foul")){
                                    SharedPlace.attackTimeReset = 1;
                                    continue MyAttack;
                                }
                                break;
                            case "tmvlsanqm":

                                try{ Thread.sleep(100);
                                }catch(Exception e){}
                                sharedPlace.blockOrWait=rand.nextInt(2) + 1;
                                if(SharedPlace2.endCheck()){ break MyAttack;}
System.out.println("                                                                                                                    「 "+npc.myName+"이(가) 사이드 스텝으로 계속 따라 붙습니다. 」");
                                try {
                                    Thread.sleep(500);
                                } catch (Exception e) {
                                }
                                sharedPlace.whoseTurn = sharedPlace.penetration("[스핀 무브]", "spinMove");
                                sharedPlace.notifyNpc();
                                if (sharedPlace.whoseTurn.equals("Still")) {
                                    continue Still;
                                } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                    player.turn = npc.myName;
                                    break MyAttack;
                                }
                                else if(sharedPlace.whoseTurn.equals("Foul")){
                                    SharedPlace.attackTimeReset = 1;
                                    continue MyAttack;
                                }
                                break;
                            case "tmxpqqor2":
                                Thread thread1 = new Thread(stopGaugeBar);
                                thread1.start();
                                sharedPlace.npcNearBy = 0;
                                sharedPlace.gaugeBar();
                                sharedPlace.whoseTurn = sharedPlace.shooting("[스텝백 2점슛]", "stepBack2", 1, 2, 1);
                                 if (sharedPlace.whoseTurn.equals("Still")) {
                                    continue Still;
                                } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                     player.turn = npc.myName;
                                    break MyAttack;
                                }
                                 else if(sharedPlace.whoseTurn.equals("Foul")){
                                     SharedPlace.attackTimeReset = 1;
                                     continue MyAttack;
                                 }
                                break;
                            case "vnfdjqwjavj":
                                Thread thread0 = new Thread(stopGaugeBar);
                                thread0.start();

                                sharedPlace.gaugeBar();
                                sharedPlace.whoseTurn = sharedPlace.shooting("[풀업 점퍼]", "pullUpJumper", 1, 2, 1);
                                 if (sharedPlace.whoseTurn.equals("Still")) {
                                    continue Still;
                                } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                     player.turn = npc.myName;
                                    break MyAttack;
                                }
                                 else if(sharedPlace.whoseTurn.equals("Foul")){
                                     SharedPlace.attackTimeReset = 1;
                                     continue MyAttack;
                                 }
                                break;

                        }
                        break;
                        //자유투 라인 공격 - 포스트업으로 들어왔을 때
                    case "PostUp":
                        mention.gameInfo(player.myScore,npc.myScore,player.foulCount,npc.foulCount);
                        pictureMyTurn.freethrowPostUp(npc);
                        sharedPlace.setAttackWay2_3();
                        if(SharedPlace2.endCheck()){ break MyAttack;}
switch (sharedPlace.attackWay2) {
                            case "1":
                                Thread thread2 = new Thread(stopGaugeBar);
                                thread2.start();

                                sharedPlace.gaugeBar();
                                sharedPlace.whoseTurn = sharedPlace.shooting("2점슛", "point2", 1, 2, 1);
                                if (sharedPlace.whoseTurn.equals("Still")) {
                                    continue Still;
                                } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                    player.turn = npc.myName;
                                    break MyAttack;
                                }
                                else if(sharedPlace.whoseTurn.equals("Foul")){
                                    SharedPlace.attackTimeReset = 1;
                                    continue MyAttack;
                                }
                                break;
                            case "2":
                                select = "2";
                                while (true) {
                                    if (sharedPlace.whoseTurn == "Still") {
                                        sharedPlace.npcBlock = rand.nextInt(2) + 1;
                                        sharedPlace.npcNearBy = 1;
//                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                         　             　                                                             남은 경기 시간\n");
//                                        System.out.println("                                                                                                          " + sharedPlace.stopGameTime + "\n\n\n");
                                        mention.gameInfo(player.myScore,npc.myScore,player.foulCount,npc.foulCount);
                                        pictureMyTurn.line3CloseOpponent(npc);
                                        System.out.println("\n                                                                                                     어떻게 하시겠습니까?\n");
                                        mention.SelectionMent2("line3AfterFake");
                                        select = sc.nextLine();
                                    }

                                    if(SharedPlace2.endCheck()){ break MyAttack;}
if (select.equals("1")) {
                                        Thread thread1 = new Thread(stopGaugeBar);
                                        thread1.start();

                                        sharedPlace.whoseTurn = sharedPlace.shooting("2점슛", "point2", 1, 2, 1);
                                    } else if (select.equals("2")) {
                                        sharedPlace.whoseTurn = sharedPlace.shooting("2점슛", "point2", 2, 2, 1);
                                    }
                                    if (sharedPlace.whoseTurn.equals("Still")) {
                                        continue;
                                    } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                        player.turn = npc.myName;
                                        break MyAttack;
                                    }
                                    else if(sharedPlace.whoseTurn.equals("Foul")){
                                        SharedPlace.attackTimeReset = 1;
                                        continue MyAttack;
                                    }
                                    break;
                                }
                                break;
                            case "3":
                                try{ Thread.sleep(500);
                                }catch(Exception e){}
                                if(SharedPlace2.endCheck()){ break MyAttack;}
System.out.println("                                                                                                                    「 "+npc.myName+"이(가) 계속해서 몸으로 버팁니다. 」");
                                try {
                                    Thread.sleep(1500);
                                } catch (Exception e) {
                                }
                                sharedPlace.whoseTurn = sharedPlace.postUp();
                                sharedPlace.notifyNpc();

                                if (sharedPlace.whoseTurn.equals("Still")) {
                                    continue Still;
                                } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                    player.turn = npc.myName;
                                    break MyAttack;
                                }
                                else if(sharedPlace.whoseTurn.equals("Foul")){
                                    SharedPlace.attackTimeReset = 1;
                                    continue MyAttack;
                                }
                                break;
                            case "tmvlsanqm":
                                try{ Thread.sleep(100);
                                }catch(Exception e){}
                                sharedPlace.blockOrWait=rand.nextInt(2) + 1;
                                if(SharedPlace2.endCheck()){ break MyAttack;}
System.out.println("                                                                                                                    「 "+npc.myName+"이(가) 사이드 스텝으로 따라 붙습니다. 」");
                                try {
                                    Thread.sleep(500);
                                } catch (Exception e) {
                                }
                                sharedPlace.whoseTurn = sharedPlace.penetration("[스핀 무브]", "spinMove");
                                sharedPlace.notifyNpc();
                                if (sharedPlace.whoseTurn.equals("Still")) {
                                    continue Still;
                                } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                    player.turn = npc.myName;
                                    break MyAttack;
                                }
                                else if(sharedPlace.whoseTurn.equals("Foul")){
                                    SharedPlace.attackTimeReset = 1;
                                    continue MyAttack;
                                }
                                break;

                        }
                }
                //endregion
                //region 골 밑 공격

                switch (sharedPlace.whoseTurn) {
                    //골 밑 공격 - 완전히 뚫었을 때 , 스핀무브로 완전히 제꼈을 때
                    case "Fully Penetration":
                        mention.gameInfo(player.myScore,npc.myScore,player.foulCount,npc.foulCount);
                        pictureMyTurn.underRimwWithOutOpponent(npc);
                        sharedPlace.setAttackWay3_1();
                        if(SharedPlace2.endCheck()){ break MyAttack;}
switch (sharedPlace.attackWay3) {
                            case "1":
                                Thread thread2 = new Thread(stopGaugeBar);
                                thread2.start();

                                sharedPlace.gaugeBar();
                                sharedPlace.whoseTurn = sharedPlace.shooting("골밑슛", "underRim", 1, 2, 0);
                                if (sharedPlace.whoseTurn.equals("Still")) {
                                    continue Still;
                                } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                    player.turn = npc.myName;
                                    break MyAttack;
                                }
                                else if(sharedPlace.whoseTurn.equals("Foul")){
                                    SharedPlace.attackTimeReset = 1;
                                    continue MyAttack;
                                }
                                break;
                            case "fpdldjq":
                                sharedPlace.whoseTurn = sharedPlace.shooting("[레이업]", "layUp", 1, 2, 0);
                                player.turn = npc.myName;
                                break MyAttack;
                            case "ejqmfzmffjcl":
                                sharedPlace.whoseTurn = sharedPlace.shooting("[더블 클러치]", "doubleClutch", 2, 2, 0);
                                player.turn = npc.myName;
                                break MyAttack;
                            case "enpczm":
                                sharedPlace.whoseTurn = sharedPlace.shooting("[덩크]", "dunk", 1, 2, 0);
                                player.turn = npc.myName;
                                break MyAttack;
                        }
                        break;
                    //골 밑 공격 - 계속 따라붙을 때
                    case "Half Penetration":
                        mention.gameInfo(player.myScore,npc.myScore,player.foulCount,npc.foulCount);
                        pictureMyTurn.underRimwWithOpponent(npc);
                        sharedPlace.setAttackWay3_2();
                        if(SharedPlace2.endCheck()){ break MyAttack;}
switch (sharedPlace.attackWay3) {
                            case "1":
                                Thread thread2 = new Thread(stopGaugeBar);
                                thread2.start();

                                sharedPlace.gaugeBar();
                                sharedPlace.whoseTurn = sharedPlace.shooting("골밑슛", "underRim", 1, 2, 1);
                                if (sharedPlace.whoseTurn.equals("Still")) {
                                    continue Still;
                                } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                    player.turn = npc.myName;
                                    break MyAttack;
                                }
                                else if(sharedPlace.whoseTurn.equals("Foul")){
                                    SharedPlace.attackTimeReset = 1;
                                    continue MyAttack;
                                }
                                break;
                            case "2":
                                select = "2";
                                while (true) {
                                    if (sharedPlace.whoseTurn == "Still") {
                                        sharedPlace.npcBlock = rand.nextInt(2) + 1;
                                        sharedPlace.npcNearBy = 1;
//                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                         　             　                                                             남은 경기 시간\n");
//                                        System.out.println("                                                                                                          " + sharedPlace.stopGameTime + "\n\n\n");
                                        mention.gameInfo(player.myScore,npc.myScore,player.foulCount,npc.foulCount);
                                        pictureMyTurn.line3CloseOpponent(npc);
                                        System.out.println("\n                                                                                                     어떻게 하시겠습니까?\n");
                                        mention.SelectionMent2("line3AfterFake");
                                        select = sc.nextLine();
                                    }

                                    if(SharedPlace2.endCheck()){ break MyAttack;}
if (select.equals("1")) {
                                        Thread thread1 = new Thread(stopGaugeBar);
                                        thread1.start();

                                        sharedPlace.whoseTurn = sharedPlace.shooting("골밑슛", "underRim", 1, 2, 1);
                                    } else if (select.equals("2")) {
                                        sharedPlace.whoseTurn = sharedPlace.shooting("골밑슛", "underRim", 2, 2, 1);
                                    }
                                    if (sharedPlace.whoseTurn.equals("Still")) {
                                        continue;
                                    } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                        player.turn = npc.myName;
                                        break MyAttack;
                                    }
                                    else if(sharedPlace.whoseTurn.equals("Foul")){
                                        SharedPlace.attackTimeReset = 1;
                                        continue MyAttack;
                                    }
                                    break;
                                }
                                break;
                            case "fpdldjq":
                                sharedPlace.whoseTurn = sharedPlace.shooting("[레이업]", "layUp", 1, 2, 1);
                                player.turn = npc.myName;
                                break MyAttack;
                            case "ejqmfzmffjcl":
                                sharedPlace.whoseTurn = sharedPlace.shooting("[더블 클러치]", "doubleClutch", 2, 0, 1);
                                player.turn = npc.myName;
                                break MyAttack;
                        }
                        break;
                    //골 밑 공격 - 포스트업으로 들어갈 때
                    case "PostUp":
                        mention.gameInfo(player.myScore,npc.myScore,player.foulCount,npc.foulCount);
                        pictureMyTurn.underRimwWithOpponent(npc);
                        sharedPlace.setAttackWay3_3();
                        if(SharedPlace2.endCheck()){ break MyAttack;}
switch (sharedPlace.attackWay3) {
                            case "1":
                                Thread thread2 = new Thread(stopGaugeBar);
                                thread2.start();

                                sharedPlace.gaugeBar();
                                sharedPlace.whoseTurn = sharedPlace.shooting("골밑슛", "underRim", 1, 2, 1);
                                if (sharedPlace.whoseTurn.equals("Still")) {
                                    continue Still;
                                } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                    player.turn = npc.myName;
                                    break MyAttack;
                                }
                                else if(sharedPlace.whoseTurn.equals("Foul")){
                                    SharedPlace.attackTimeReset = 1;
                                    continue MyAttack;
                                }
                                
                                break;
                            case "2":
                                select = "2";
                                while (true) {
                                    if (sharedPlace.whoseTurn == "Still") {
                                        sharedPlace.npcBlock = rand.nextInt(2) + 1;
                                        sharedPlace.npcNearBy = 1;
//                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                         　             　                                                             남은 경기 시간\n");
//                                        System.out.println("                                                                                                          " + sharedPlace.stopGameTime + "\n\n\n");
                                        mention.gameInfo(player.myScore,npc.myScore,player.foulCount,npc.foulCount);
                                        pictureMyTurn.line3CloseOpponent(npc);
                                        System.out.println("\n                                                                                                     어떻게 하시겠습니까?\n");
                                        mention.SelectionMent2("line3AfterFake");
                                        select = sc.nextLine();
                                    }

                                    if(SharedPlace2.endCheck()){ break MyAttack;}
if (select.equals("1")) {
                                        Thread thread1 = new Thread(stopGaugeBar);
                                        thread1.start();

                                        sharedPlace.whoseTurn = sharedPlace.shooting("2점슛", "point2", 1, 2, 1);
                                    } else if (select.equals("2")) {
                                        sharedPlace.whoseTurn = sharedPlace.shooting("2점슛", "point2", 2, 2, 1);
                                    }
                                    if (sharedPlace.whoseTurn.equals("Still")) {
                                        continue;
                                    } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                        player.turn = npc.myName;
                                        break MyAttack;
                                    }
                                    else if(sharedPlace.whoseTurn.equals("Foul")){
                                        SharedPlace.attackTimeReset = 1;
                                        continue MyAttack;
                                    }
                                    break;
                                }
                                break;
                            case "gnrtit" :
                                Thread thread0 = new Thread(stopGaugeBar);
                                thread0.start();

                                sharedPlace.gaugeBar();
                                sharedPlace.whoseTurn = sharedPlace.shooting("[훅 샷]", "hookShot", 1, 2, 1);
                                if (sharedPlace.whoseTurn.equals("Still")) {
                                    continue Still;
                                } else if (sharedPlace.whoseTurn.equals("End Turn")) {
                                    player.turn = npc.myName;
                                    break MyAttack;
                                }
                                else if(sharedPlace.whoseTurn.equals("Foul")){
                                    SharedPlace.attackTimeReset = 1;
                                    continue MyAttack;
                                }
                                break;

                        }
                        break;
                }
                //endregion
                player.turn = npc.myName;
            }
        }

        mainWait.notifyMain();

    }
}


