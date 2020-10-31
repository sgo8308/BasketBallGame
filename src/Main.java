import javax.swing.plaf.nimbus.State;
import java.util.Random;
import java.util.Scanner;

public class Main {
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
        MainWait mainWait = new MainWait();


        pl.InitializeStat();
        pl.ShootingSkillKoreaen();
        pl.DribbleSkillKorean();
        pl.SkillPut();
        pl.SkillCommandPut();


        Mention mention = new Mention();
        Random rand = new Random();
        userName = pl.myName;

        Thread mainthread = Thread.currentThread();
        mainthread.setPriority(10);


//        Music introMusic = new Music("C:\\Users\\손지우\\IdeaProjects\\TeamNova\\농구게임 실험공간\\audio\\introMusic1.wav",false);
//        introMusic.start();

        System.out.println("\n                                                                                           M I C H A E L  J O R D A N  P R I Z E \n");
        System.out.print("                                                                                          ");
        for(int i=0; i<22; i++) {
            System.out.print("￣");
            try{ Thread.sleep(200);
            }catch(Exception e){}
        }
        System.out.println();

        System.out.println("\n                                                                                             2020년 마이클 조던은 조던상을 만든다.\n");
        try{ Thread.sleep(850);
        }catch(Exception e){}

        System.out.println("                                                                                      자신을 1 대 1로 이긴 사람에게 다이아몬드로 된 조던상과\n");
        try{ Thread.sleep(850);

        }catch(Exception e){}

        System.out.println("                                                                                  150억원 상당의 대저택, 그리고 100억원의 상금을 지급하기로 한다.\n");
        try{ Thread.sleep(850);
        }catch(Exception e){}
        System.out.println("\n                                                                              *  당신은 일반인 브랜든 리치가 되어 조던을 이기고 부자가 되어야 합니다.  *");
        try{ Thread.sleep(2000);
        }catch(Exception e){}
        sc.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                            ..." +
                "\n                                                                                                            ...\n                                                                                                            ..." +
                "\n\n\n\n\n\n\n\n\n\n                                                                                                         S T A R T\n\n\n\n\n\n\n\n\n\n");
        try{ Thread.sleep(1000);
        }catch(Exception e){}

        Music.runningIntroMusic = false;


        MainMenu :
        while(true){
            mention.MainMenu();
            select = sc.nextLine();
            if(select.equals("1")){
                Location :
                while(true){
                    mention.Location();
                    select = sc.nextLine();
                    switch (select){
                        case "0":
                            continue MainMenu;
                        case "1":
                            System.out.println("                                                                                                스킬 트레이닝 센터로 가는 중입니다.");
                            System.out.print("                                                                                                   ");
                            for(int i=0; i<14; i++) {
                                System.out.print("￣");
                                try{ Thread.sleep(200);
                                }catch(Exception e){}
                            }
                            SkillTrainingCenter :
                            while(true){
                                mention.SkillTrainingCenter();
                                String training = sc.nextLine();
                                if(training.equals("0")){
                                    continue MainMenu;
                                }
                                if(training.equals("1")){
                                    shootingSkill :
                                    while(true){
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                어떤 슈팅 스킬을 익히시겠습니까?\n");
                                        System.out.println("\n                                                                                  1. [레이업]   2. [더블 클러치]   100. 이전으로 되돌아가기\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        String shooting = sc.nextLine();
                                        if (shooting.equals("1") && pl.basketBallLevel <20) {
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                           [레이업]은 농구 경험치가 20이상 필요합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            sc.nextLine();
                                            continue shootingSkill;
                                        }
                                        if (shooting.equals("2")&&pl.basketBallLevel<40){
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                          [더블 클러치]는 농구 경험치 40이상 필요합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            sc.nextLine();
                                            continue shootingSkill;
                                        }
                                        if(shooting.equals("100")){
                                            continue SkillTrainingCenter;
                                        }else if(shooting.equals("1")){
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                [레이업]을 익히시겠습니까?\n");
                                            System.out.println("\n                                                                                                  1. 예   2. 아니오\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            select = sc.nextLine();

                                            if(select.equals("1")){
                                                while(true){
                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                      [레이업]을 익히려면 다음을 띄어쓰기 없이 입력해주세요.\n");
                                                    System.out.println("\n                                                                                                        f p d l d j q\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                    select = sc.nextLine();
                                                    if(select.equals(sas.LayUpCommand())){
                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                   [레이업]을 익혔습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                        pl.isLayUp = 1;
                                                        pl.SkillPut();
                                                        sc.nextLine();
                                                        continue shootingSkill;
                                                    }else{
                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                잘못 입력했습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                        sc.nextLine();
                                                        continue ;
                                                    }
                                                }
                                            }else if(select.equals("2")){
                                                continue shootingSkill;
                                            }

                                        }else if(shooting.equals("2")){


                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                              [더블 클러치]를 익히시겠습니까?\n");
                                            System.out.println("\n                                                                                                  1. 예   2. 아니오\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            select = sc.nextLine();

                                            if(select.equals("1")){

                                                while(true){
                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                    [더블 클러치]을 익히려면 다음을 띄어쓰기 없이 입력해주세요.\n");
                                                    System.out.println("\n                                                                                                   e j q m f z m f f j c l\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                    select = sc.nextLine();
                                                    if(select.equals(sas.DoubleClutchCommand())){
                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                               [더블 클러치]를 익혔습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                        pl.isDoubleClutch = 1;
                                                        pl.SkillPut();
                                                        sc.nextLine();
                                                        continue shootingSkill;
                                                    }else{
                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                잘못 입력했습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                        sc.nextLine();
                                                        continue ;
                                                    }
                                                }
                                            }else if(select.equals("2")){
                                                continue shootingSkill;
                                            }

                                        }else {
                                            System.out.println(errorMessage);
                                            continue ;
                                        }

                                        break;
                                    }
                                    break;

                                }else if(training.equals("2")){
                                    DribbleSkill :
                                    while(true){
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                              어떤 드리블 스킬을 익히시겠습니까?\n");
                                        System.out.println("\n                                                                                  1. [레그 스루]   2. [크로스오버]   100. 이전으로 되돌아가기\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        String shooting = sc.nextLine();
                                        if (shooting.equals("1") && pl.basketBallLevel <20) {
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                         [레그 스루]는 농구 경험치가 20이상 필요합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            continue DribbleSkill;
                                        }
                                        if (shooting.equals("2")&&pl.basketBallLevel<40){
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                         [크로스오버]는 농구 경험치 40이상 필요합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            continue DribbleSkill;
                                        }

                                        if(shooting.equals("100")){
                                            continue SkillTrainingCenter;
                                        }else if(shooting.equals("1")){
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                               [레그 스루]를 익히시겠습니까?\n");
                                            System.out.println("\n                                                                                                  1. 예   2. 아니오\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            select = sc.nextLine();

                                            if(select.equals("1")){
                                                while(true){
                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                      [레그 스루]를 익히려면 다음을 띄어쓰기 없이 입력해주세요.\n");
                                                    System.out.println("\n                                                                                                        f p r m t m f n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                    select = sc.nextLine();
                                                    if(select.equals(sas.LegThrowCommand())){
                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  [레그 스루]를 익혔습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                        SharedPlace.islegthrow = 1;
                                                        pl.isLegThrow = 1;
                                                        pl.SkillPut();
                                                        sc.nextLine();
                                                        continue DribbleSkill;
                                                    }else{
                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                잘못 입력했습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                        sc.nextLine();
                                                        continue ;
                                                    }
                                                }
                                            }else if(select.equals("2")){
                                                continue DribbleSkill;
                                            }

                                        }else if(shooting.equals("2")){


                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                              [크로스오버]를 익히시겠습니까?\n");
                                            System.out.println("\n                                                                                                  1. 예   2. 아니오\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            select = sc.nextLine();

                                            if(select.equals("1")){

                                                while(true){
                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                    [크로스오버]를 익히려면 다음을 띄어쓰기 없이 입력해주세요.\n");
                                                    System.out.println("\n                                                                                                   z m f h t m d h q j\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                    select = sc.nextLine();
                                                    if(select.equals(sas.CrossOverCommand())){
                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                               [크로스오버]를 익혔습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                        pl.isCrossOver = 1;
                                                        pl.SkillPut();
                                                        sc.nextLine();
                                                        continue DribbleSkill;
                                                    }else{
                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                잘못 입력했습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                        sc.nextLine();
                                                        continue ;
                                                    }
                                                }
                                            }else if(select.equals("2")){
                                                continue DribbleSkill;
                                            }

                                        }else {
                                            System.out.println(errorMessage);
                                            continue ;
                                        }

                                        break;
                                    }
                                }else {
                                    System.out.println(errorMessage);
                                    continue ;
                                }
                            }

                            break;
                        case "2":
                            System.out.println("                                                                                               피지컬 트레이닝 센터로 가는 중입니다.");
                            System.out.print("                                                                                                   ");
                            for(int i=0; i<14; i++) {
                                System.out.print("￣");
                                try{ Thread.sleep(200);
                                }catch(Exception e){}
                            }
                            PhysicalTrainingCenter :
                            while(true){
                                mention.PhysicalTrainingCenter();
                                select = sc.nextLine();
                                if(select.equals("0")){
                                    continue MainMenu;
                                }else if(select.equals("1")){
                                    if(pl.stamina < 10){
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                          체력이 부족해서 트레이닝을 진행할 수 없습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        continue PhysicalTrainingCenter;
                                    }
                                    pictureMyTurn.staminaTraining(pl);
                                    continue PhysicalTrainingCenter ;
                                }else if(select.equals("2")){
                                    if(pl.stamina < 10){
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                          체력이 부족해서 트레이닝을 진행할 수 없습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        continue PhysicalTrainingCenter;
                                    }
                                    pictureMyTurn.jumpTraining(pl);
                                    continue PhysicalTrainingCenter ;
                                }else if(select.equals("3")){
                                    if(pl.stamina < 10){
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                          체력이 부족해서 트레이닝을 진행할 수 없습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        continue PhysicalTrainingCenter;
                                    }
                                    pictureMyTurn.muscleTraining(pl);
                                    continue PhysicalTrainingCenter ;
                                }else {
                                    if(pl.stamina < 10){
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                          체력이 부족해서 트레이닝을 진행할 수 없습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        continue PhysicalTrainingCenter;
                                    }
                                    System.out.println(errorMessage);
                                    sc.nextLine();
                                    continue;
                                }
                            }
                        case "3":
                            System.out.println("                                                                                                   포지션 센터로 가는 중입니다.");
                            System.out.print("                                                                                                   ");
                            for(int i=0; i<14; i++) {
                                System.out.print("￣");
                                try{ Thread.sleep(200);
                                }catch(Exception e){}
                            }
                            PositionCenter :
                            while(true){
                                mention.PositionCenter();
                                select = sc.nextLine();
                                if(select.equals("경험치60")){
                                    System.out.println("경험치가 60이 되었습니다");
                                    pl.basketBallLevel = 60;
                                }
                                mention.PositionCenter();
                                select = sc.nextLine();
                                if (pl.basketBallLevel<60){
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                      포지션을 갖기 위해서는 60이상의 경험치가 필요합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    sc.nextLine();
                                    continue Location;
                                }
                                if(select.equals("가드")){
                                     //region 자유투로 순서 정하기 - 스테판 커리
                                    curry.InitializeStat();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                          - 경기에서 이기면 가드 포지션을 갖게 됩니다. -\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    sc.nextLine();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                        ENTER키를 누르면 스테판 커리와의 경기가 시작됩니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    String stadium = sc.nextLine();
                                    mention.IntroductionMent(pl,curry);
                                    sc.nextLine();
                                    mention.RuleMent();
                                    sc.nextLine();
                                    sc.nextLine();
                                    sharedPlace.setPlayer(pl);
                                    sharedPlace.setNpc(curry);
                                    while(true){
                                            String freethrowCurry = curry.FreeThrow();
                                            String freethrowMine = pl.FreeThrow();
                                            if(freethrowCurry.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  "+curry.myName+"가 자유투를 시도합니다.\n");
                                                System.out.println("\n                                                                                                 "+curry.myName+"의 자유투는 성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }else {
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  "+curry.myName+"가 자유투를 시도합니다.\n");
                                                System.out.println("\n                                                                                                 "+curry.myName+"의 자유투는 실패하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }
                                            sc.nextLine();
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                       "+pl.myName+"의 차례입니다.\n");
                                                System.out.println("\n                                                                                                 자유투를 던지려면 ENTER키를 눌러주세요\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            sc.nextLine();
                                            if(freethrowMine.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          자유투를 던집니다.\n");
                                                System.out.println("\n                                                                                                 "+pl.myName+"의 자유투는 성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }else {
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          자유투를 던집니다.\n");
                                                System.out.println("\n                                                                                                 "+pl.myName+"의 자유투는 실패하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                                            }
                                            sc.nextLine();
                                            curry.InitializeScore();
                                            pl.InitializeScore();

                                            if(freethrowCurry.equals("1")&&freethrowMine.equals("0")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                    "+curry.myName+"의 선공으로 시작합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+
                                                                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기시작" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                pl.turn = curry.myName;
                                                sc.nextLine();
                                                break;
                                            }else if(freethrowCurry.equals("0")&&freethrowMine.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                   " +userName + "의 선공으로 시작합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                sc.nextLine();
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기시작" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                pl.turn = "player";
                                                sc.nextLine();
                                                break;
                                            }
                                        }

                                    //endregion
                                    sharedPlace.gameEnd = 0 ;
                                    sharedPlace.setNpc(curry);
                                    sharedPlace.setPlayer(pl);
                                    defenseSituation.setPlayerNpc(pl,curry);
                                    MyAttack myAttack = new MyAttack(sharedPlace,curry,mainWait,pl);
                                    Thread gameTimeThread = new Thread(new Runnable() {
                                            @Override
                                            public void run() {
                                                sharedPlace.stopGameTime();
                                            }
                                        });
                                    gameTimeThread.start();
                                    GameStart :
                                    while(curry.myScore<15 && pl.myScore<15){

                                        switch (pl.turn){
                                            //스테판 커리 공격권
                                            case "스테판 커리" :
                                                try{Thread.sleep(1500);
                                                }catch(Exception e){}
                                                sharedPlace.reset();
                                                if(sharedPlace.gameEnd == 1){ break GameStart;}
                                                SharedPlace.attackTime = 14;
                                                //region 체력 및 파울 표시
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("                                                                                                "+pl.myName + "         " + curry.myName+"\n");
                                                System.out.println("                                                                                                    "+pl.stamina + "                 " + curry.stamina+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}
                                                mention.gameInfo2(pl.myScore,curry.myScore,pl.foulCount,curry.foulCount);

                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}

                                                if(sharedPlace.gameEnd == 1){ break GameStart;}
                                                
                                                pl.StaminaEffect();
                                                curry.StaminaEffect();
                                                curry.FailCountZero();
                                                if(pl.staminaEffectCount == 1 || pl.staminaEffectCount == 2 || pl.staminaEffectCount == 3 ||curry.staminaEffectCount == 1 || curry.staminaEffectCount == 2 || curry.staminaEffectCount == 3){
                                                    try{Thread.sleep(1000);
                                                    }catch(Exception e){}
                                                }
                                                //endregion
                                                CurryAttack :
                                                while(true) {
                                                    sharedPlace.attackEnd = 0;
                                                    SharedPlace.attackTime = 14;
                                                    Thread attackTimeThread = new Thread(new Runnable() {
                                                        @Override
                                                        public void run() {
                                                            sharedPlace.attackTime();
                                                        }
                                                    });
                                                    SharedPlace.attackTimeReset = 0;
                                                    attackTimeThread.start();

                                                    int attackNumber = curry.AttackPhase0();
                                                    if(attackNumber == 1){
                                                        while(true){
                                                            mention.gameInfo(pl.myScore,curry.myScore,pl.foulCount,curry.foulCount);
                                                            pictureNpcTurn.Start(curry);
                                                            System.out.println("\n                                                                                         스테판 커리가 하프라인에서 [딥쓰리]를 시도합니다.\n");
                                                            mention.SelectionMent("shooting");
                                                            select = sc.nextLine();
                                                            if (select.equals("1") || select.equals("2")) {
                                                                break;
                                                            } else {

                                                                System.out.println(errorMessage);
                                                                try{Thread.sleep(1000);
                                                                }catch(Exception e){}
                                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                continue;
                                                            }
                                                        }
                                                        whoseTurn = defenseSituation.shooting(pl,curry,mention,sc,"[딥쓰리]","deepThree",1,"2",0,3,0);

                                                        if (whoseTurn.equals("Still")) {
                                                            continue;
                                                        } else if (whoseTurn.equals("End Turn")) {
                                                            break CurryAttack;
                                                        }else if(whoseTurn.equals("Restart")){
                                                            continue CurryAttack;
                                                        }else if(whoseTurn.equals("GameEnd")){
                                                            break GameStart;
                                                        }
                                                    }

                                                    if(SharedPlace2.endCheck()){ break CurryAttack;}

                                                    mention.gameInfo(pl.myScore,curry.myScore,pl.foulCount,curry.foulCount);

                                                    pictureNpcTurn.line3CloseOpponent(curry);
                                                    System.out.println("\n                                                                                                "+curry.myName+"가 드리블을 시작했습니다.");
                                                    System.out.println("\n                                                                                              "+curry.myName+"가 3점 라인 근처까지 왔습니다.\n");
                                                    attackWay1 = "";
                                                    attackWay2 = "";
                                                    whoseTurn = "";
                                                    int defenseWay =-1;
                                                    
                                                    
                                                    Still :
                                                    while (true) {

                                                        //region 공격 시작
                                                        if(attackWay1.equals("Still") || attackWay2.equals("Still") || whoseTurn.equals("Still") ){
                                                            mention.gameInfo(pl.myScore,curry.myScore,pl.foulCount,curry.foulCount);
                                                            pictureNpcTurn.line3CloseOpponent(curry);
                                                        }

                                                        while(true){
                                                            try{
                                                                sharedPlace.playerDefenseWay = "0";
                                                                mention.SelectionMent("gameStart");
                            
                                                                Thread jdLine3Thread = new Thread(new Runnable(){
                            
                                                                    @Override
                                                                    public void run() {
                                                                        try{Thread.sleep(2000);
                                                                        }catch(Exception e){}
                                                                        if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                            int randNumber = rand.nextInt(3) + 1;
                                                                            if(SharedPlace2.endCheck()){return;}
                                                                            SharedPlace2.attackTimeReset1();
                                                                            if(randNumber == 1){
                                                                                String result = defenseSituation.shooting(pl,curry,mention,sc,"3점슛","point3",1,"2",0,3,0);
                                                                            }else if(randNumber == 2){
                                                                                String result = defenseSituation.shooting(pl,curry,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                            }
                                                                        }
                                                                    }
                                                                });
                                                                jdLine3Thread.start();
                            
                                                                sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                try{ jdLine3Thread.join();
                                                                }catch(Exception e){}
                            
                                                                if(SharedPlace2.endCheck()){ break CurryAttack;}
                            
                            
                                                                if(!(sharedPlace.playerDefenseWay.equals("1") || sharedPlace.playerDefenseWay.equals("2"))){
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break CurryAttack;
                                                                    }
                                                                    System.out.println(errorMessage);
                                                                    try{Thread.sleep(500);
                                                                    }catch(Exception e){}
                                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break CurryAttack;
                                                                    }
                                                                    continue ;
                                                                }
                            
                                                                break;
                                                            }catch(Exception e){
                                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                    break CurryAttack;
                                                                }
                                                                System.out.println(errorMessage);
                                                                try{Thread.sleep(500);
                                                                }catch(Exception k){}
                                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                    break CurryAttack;
                                                                }
                                                                continue;
                                                            }
                                                        }
                            
                                                        if(SharedPlace2.endCheck()){ break CurryAttack;}
                                                        
                                                        mention.gameInfo(pl.myScore,curry.myScore,pl.foulCount,curry.foulCount);

                                                        if(defenseWay == 1){
                                                            pictureNpcTurn.line3CloseOpponent(curry);
                                                        }else {
                                                            pictureNpcTurn.line3FarOpponent(curry);
                                                        }
                                                        //endregion
                                                        //커리 3점라인 공격
                                                        attackNumber = curry.AttackPhase1();
                                                        switch (attackNumber) {
                                                            //region 돌파 or 크로스오버
                                                            case 0:
                                                                System.out.println("\n                                                                                               "+curry.myName+"가 돌파를 시도합니다.\n");

                                                                while(true){

                                                                    sharedPlace.playerDefenseWay = "0";
                                                                    mention.SelectionMent("penetration");
                            
                                                                    Thread jdLine3_1Thread = new Thread(new Runnable(){
                                                                        @Override
                                                                        public void run() {
                                                                            try{Thread.sleep(2000);
                                                                            }catch(Exception e){}
                                                                            if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                                if(SharedPlace2.endCheck()){return;}
                                                                                SharedPlace2.attackTimeReset1();
                                                                                int randNumber = rand.nextInt(2) + 1;
                                                                                if(randNumber == 1){
                                                                                    String result = defenseSituation.shooting(pl,curry,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                                }
                                                                            }
                                                                        }
                                                                    });
                                                                    jdLine3_1Thread.start();
                            
                                                                    sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                    try{ jdLine3_1Thread.join();
                                                                    }catch(Exception e){}
                            
                                                                    if(SharedPlace2.endCheck()){ break CurryAttack;}
                            
                                                                    if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2") ||sharedPlace.playerDefenseWay.equals("3")){
                                                                        break;
                                                                    }else {
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break CurryAttack;
                                                                        }
                                                                        System.out.println(errorMessage);
                                                                        try{Thread.sleep(500);
                                                                        }catch(Exception e){}
                                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break CurryAttack;
                                                                        }
                                                                        continue ;
                                                                    }
                                                                }

                                                                int peneOrCross = curry.PenetrationOrCrossOver();

                                                                if (peneOrCross == 1) {
                                                                    if (sharedPlace.playerDefenseWay.equals("1")) {
                                                                        attackWay1 = defenseSituation.penetration(pl, curry, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 1, defenseWay);
                                                                    } else {
                                                                        attackWay1 = defenseSituation.penetration(pl, curry, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 0, defenseWay);
                                                                    }
                                                                } else if (peneOrCross == 2) {
                                                                    if (sharedPlace.playerDefenseWay.equals("2")) {
                                                                        attackWay1 = defenseSituation.penetration(pl, curry, mention, sc, "[크로스오버]", "crossOver", sharedPlace.playerDefenseWay, 1, defenseWay);
                                                                    } else {
                                                                        attackWay1 = defenseSituation.penetration(pl, curry, mention, sc, "[크로스오버]", "crossOver", sharedPlace.playerDefenseWay, 0, defenseWay);
                                                                    }
                                                                }
                                                                if (attackWay1.equals("Still")) {
                                                                    continue Still;
                                                                }else if (attackWay1.equals("End Turn")) {
                                                                    break CurryAttack;
                                                                }else if(attackWay1.equals("Restart")){
                                                                    continue CurryAttack;
                                                                }
                                                                break;
                                                            //endregion
                                                            //region 3점 슈팅 or 훼이크 or 스텝백 3점
                                                            case 1:
                                                                whoseTurn = "";
                                                                while (true) {
                                                                    int shootOrFake = curry.ShootOrFake();
                                                                    if(whoseTurn.equals("Still")){
                                                                        mention.gameInfo(pl.myScore,curry.myScore,pl.foulCount,curry.foulCount);
                                                                        pictureNpcTurn.line3CloseOpponent(curry);
                                                                    }

                                                                    System.out.println("\n                                                                                               "+curry.myName+"가 슛 모션을 취합니다.\n");
                                                                   
                                                                   
                                                                    while(true){
                                                                        sharedPlace.playerDefenseWay = "0";
                                                                        mention.SelectionMent("shooting");

                                                                        Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                            @Override
                                                                            public void run() {
                                                                                try{Thread.sleep(2000);
                                                                                }catch(Exception e){}
                                                                                if(sharedPlace.playerDefenseWay.equals("0")){

                                                                                    if(SharedPlace2.endCheck()){ return ;}
                                                                                    SharedPlace2.attackTimeReset1();
                                                                                    int randNumber = rand.nextInt(2) + 1;

                                                                                    String result = defenseSituation.shooting(pl,curry,mention,sc,"3점슛","point3",1,"2",0,3,0);

                                                                                }
                                                                            }
                                                                        });
                                                                        jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                        jdLine3_2Thread.start();


                                                                        sharedPlace.playerDefenseWay = sc.nextLine();

                                                                        try{jdLine3_2Thread.join();
                                                                        }catch(Exception e){}

                                                                        if(SharedPlace2.endCheck()){ break CurryAttack;}

                                                                        if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                            break;
                                                                        }else {
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break CurryAttack;
                                                                            }
                                                                            System.out.println(errorMessage);
                                                                            try{Thread.sleep(500);
                                                                            }catch(Exception e){}
                                                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break CurryAttack;
                                                                            }
                                                                            continue ;
                                                                        }
                                                                    }

                                                                    whoseTurn = defenseSituation.shooting(pl, curry, mention, sc, "3점슛", "point3", shootOrFake, sharedPlace.playerDefenseWay, 1, 3,1);

                                                                    if (whoseTurn.equals("Still")) {
                                                                        continue;
                                                                    } else if (whoseTurn.equals("End Turn")) {
                                                                        break CurryAttack;
                                                                    }else if(whoseTurn.equals("Restart")){
                                                                        continue CurryAttack;
                                                                    }else if(whoseTurn.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }
                                                                }
                                                            case 2 :
                                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                           스테판 커리가 [스텝백 3점슛]을 시도합니다.\n");

                                                                while(true){
                                                                    sharedPlace.playerDefenseWay = "0";
                                                                    mention.SelectionMent("shooting");

                                                                    Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                        @Override
                                                                        public void run() {
                                                                            try{Thread.sleep(2000);
                                                                            }catch(Exception e){}
                                                                            if(sharedPlace.playerDefenseWay.equals("0")){

                                                                                if(SharedPlace2.endCheck()){ return ;}
                                                                                SharedPlace2.attackTimeReset1();
                                                                                int randNumber = rand.nextInt(2) + 1;

                                                                                String result = defenseSituation.shooting(pl,jd,mention,sc,"[스텝백 3점슛]","stepBack3",1,"2",0,3,0);

                                                                            }
                                                                        }
                                                                    });
                                                                    jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                    jdLine3_2Thread.start();


                                                                    sharedPlace.playerDefenseWay = sc.nextLine();

                                                                    try{jdLine3_2Thread.join();
                                                                    }catch(Exception e){}

                                                                    if(SharedPlace2.endCheck()){ break CurryAttack;}

                                                                    if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                        break;
                                                                    }else {
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break CurryAttack;
                                                                        }
                                                                        System.out.println(errorMessage);
                                                                        try{Thread.sleep(500);
                                                                        }catch(Exception e){}
                                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break CurryAttack;
                                                                        }
                                                                        continue ;
                                                                    }
                                                                }

                                                                whoseTurn = defenseSituation.shooting(pl, jd, mention, sc, "[스텝백 3점슛]", "stepBack3", 1, sharedPlace.playerDefenseWay, 1, 3,1);

                                                                if (whoseTurn.equals("Still")) {
                                                                    continue;
                                                                } else if (whoseTurn.equals("End Turn")) {
                                                                    break CurryAttack;
                                                                }else if(whoseTurn.equals("Restart")){
                                                                    SharedPlace2.attackTimeReset1();
                                                                    continue CurryAttack;
                                                                }else if(whoseTurn.equals("GameEnd")){
                                                                    break GameStart;
                                                                }

                                                                break;
                                                                //endregion
                                                        }

                                                        //커리 자유투 라인 공격
                                                        //region 자유투 라인 공격 - 커리가 완전히 돌파했을 때
                                                        if (attackWay1.equals("Fully Penetration")) {

                                                                whoseTurn = defenseSituation.shooting(pl, curry, mention, sc, "[레이업]", "layUp", 1, "2", 0, 2,0);

                                                            if(whoseTurn.equals("GameEnd")){
                                                                break GameStart;
                                                            }
                                                            break CurryAttack;
                                                        }
                                                        //endregion
                                                        //region 자유투라인 공격 - 커리가 완전히 돌파하지 못했을 때(내가 쫓아갈 때)
                                                        if (attackWay1.equals("Half Penetration")) {
                                                            //stepBackOrPene
                                                            int stepBackOrPene = rand.nextInt(2) + 1;

                                                            //스텝백 점퍼 or 2점 슛
                                                            if (stepBackOrPene == 1) {
                                                                whoseTurn = "";
                                                                while (true) {
                                                                    int shootOrFake = curry.ShootOrFake();
                                                                    mention.gameInfo(pl.myScore,curry.myScore,pl.foulCount,curry.foulCount);

                                                                    pictureNpcTurn.freethrowWithOpponent(curry);
                                                                    if (whoseTurn == "Still") {
                                                                        System.out.println("\n                                                                                              "+curry.myName+"가 다시 슛 모션을 취합니다.\n");
                                                                    } else {
                                                                        System.out.println("\n                                                                                          "+curry.myName+"가 자유투 라인 부근에서 슛 모션을 취합니다.\n");
                                                                    }
                                                                    while(true){
                                                                        sharedPlace.playerDefenseWay = "0";
                                                                        mention.SelectionMent("shooting");

                                                                        Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                            @Override
                                                                            public void run() {
                                                                                try{Thread.sleep(2000);
                                                                                }catch(Exception e){}
                                                                                if(sharedPlace.playerDefenseWay.equals("0")){

                                                                                    if(SharedPlace2.endCheck()){ return ;}
                                                                                    SharedPlace2.attackTimeReset1();
                                                                                    int randNumber = rand.nextInt(2) + 1;

                                                                                    String result = defenseSituation.shooting(pl,curry,mention,sc,"2점슛","point2",1,"2",0,2,0);

                                                                                }
                                                                            }
                                                                        });
                                                                        jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                        jdLine3_2Thread.start();


                                                                        sharedPlace.playerDefenseWay = sc.nextLine();

                                                                        try{jdLine3_2Thread.join();
                                                                        }catch(Exception e){}

                                                                        if(SharedPlace2.endCheck()){ break CurryAttack;}

                                                                        if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                            break;
                                                                        }else {
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break CurryAttack;
                                                                            }
                                                                            System.out.println(errorMessage);
                                                                            try{Thread.sleep(500);
                                                                            }catch(Exception e){}
                                                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break CurryAttack;
                                                                            }
                                                                            continue ;
                                                                        }
                                                                    }

                                                                    if (whoseTurn == "Still") {
                                                                        whoseTurn = defenseSituation.shooting(pl, curry, mention, sc, "2점슛", "point2", shootOrFake, sharedPlace.playerDefenseWay, 1, 2,1);
                                                                    } else {
                                                                        whoseTurn = defenseSituation.shooting(pl, curry, mention, sc, "[스텝백 2점슛]", "stepBack2", shootOrFake, sharedPlace.playerDefenseWay, 1, 2,1);
                                                                    }
                                                                    if (whoseTurn.equals("Still")) {
                                                                        continue ;
                                                                    } else if (whoseTurn.equals("End Turn")) {
                                                                        break CurryAttack;
                                                                    }else if(whoseTurn.equals("Restart")){
                                                                        continue CurryAttack;
                                                                    }else if(whoseTurn.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }

                                                                }

                                                                //계속 돌파할 때
                                                            } else if (stepBackOrPene == 2) {
                                                                mention.gameInfo(pl.myScore,curry.myScore,pl.foulCount,curry.foulCount);

                                                                pictureNpcTurn.freethrowWithOpponent(curry);
                                                                System.out.println("\n                                                                                          "+curry.myName+"가 자유투 라인 부근을 지나 계속 돌파합니다.\n");
                                                                
                                                                
                                                                 while(true){
                                                                    sharedPlace.playerDefenseWay = "0";
                                                                    mention.SelectionMent("penetration");
                            
                                                                    Thread jdLine2_2Thread = new Thread(new Runnable(){
                                                                        @Override
                                                                        public void run() {
                                                                            try{Thread.sleep(2000);
                                                                            }catch(Exception e){}
                                                                            if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                                if(SharedPlace2.endCheck()){return;}
                                                                                SharedPlace2.attackTimeReset1();
                                                                                int randNumber = rand.nextInt(2) + 1;
                                                                                if(randNumber == 1){
                                                                                    String result = defenseSituation.shooting(pl,curry,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                                }
                                                                            }
                                                                        }
                                                                    });
                                                                    jdLine2_2Thread.start();
                            
                                                                    sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                    try{ jdLine2_2Thread.join();
                                                                    }catch(Exception e){}
                            
                                                                    if(SharedPlace2.endCheck()){ break CurryAttack;}
                            
                                                                    if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")||sharedPlace.playerDefenseWay.equals("3")){
                                                                        break;
                                                                    }else {
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break CurryAttack;
                                                                        }
                                                                        System.out.println(errorMessage);
                                                                        try{Thread.sleep(500);
                                                                        }catch(Exception e){}
                                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break CurryAttack;
                                                                        }
                                                                        continue ;
                                                                    }
                                                                }

                                                                if (sharedPlace.playerDefenseWay.equals("4")) {

                                                                        whoseTurn = defenseSituation.shooting(pl, curry, mention, sc, "[레이업]", "layUp", 1, "2", 0, 2,0);

                                                                    if(whoseTurn.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }
                                                                    break CurryAttack;

                                                                } else {

                                                                    if (sharedPlace.playerDefenseWay.equals("1")) {
                                                                        attackWay2 = defenseSituation.penetration(pl, curry, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 1, 0);
                                                                    } else {
                                                                        attackWay2 = defenseSituation.penetration(pl, curry, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 0, 0);
                                                                    }

                                                                    if (attackWay2.equals("Still")) {
                                                                        continue Still;
                                                                    } else if (attackWay2.equals("End Turn")) {
                                                                        break CurryAttack;
                                                                    }else if(attackWay2.equals("Restart")){
                                                                        continue CurryAttack;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        //endregion

                                                        //커리 골 밑 공격
                                                        //region 레이업 or 더블 클러치
                                                        if (attackWay2.equals("Half Penetration")) {
                                                            int layUpOrDoubleClutch = curry.LayUpOrDoubleClutch();
                                                            whoseTurn = "";
                                                            int shootOrFake = curry.ShootOrFake();
                                                            mention.gameInfo(pl.myScore,curry.myScore,pl.foulCount,curry.foulCount);

                                                            pictureNpcTurn.underRimwWithOpponent(curry);
                                                            System.out.println("\n                                                                                            "+curry.myName+"가 스텝을 밟고 [레이업]을 올라갔습니다.\n");

                                                             while(true){
                                                                sharedPlace.playerDefenseWay = "0";
                                                                mention.SelectionMent("shooting");

                                                                Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                    @Override
                                                                    public void run() {
                                                                        try{Thread.sleep(2000);
                                                                        }catch(Exception e){}
                                                                        if(sharedPlace.playerDefenseWay.equals("0")){

                                                                            if(SharedPlace2.endCheck()){ return ;}
                                                                            SharedPlace2.attackTimeReset1();
                                                                            int randNumber = rand.nextInt(2) + 1;

                                                                            String result = defenseSituation.shooting(pl,jd,mention,sc,"[레이업]","layUp",1,"2",0,2,0);

                                                                        }
                                                                    }
                                                                });
                                                                jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                jdLine3_2Thread.start();


                                                                sharedPlace.playerDefenseWay = sc.nextLine();

                                                                try{jdLine3_2Thread.join();
                                                                }catch(Exception e){}

                                                                if(SharedPlace2.endCheck()){ break CurryAttack;}

                                                                if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                    break;
                                                                }else {
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break CurryAttack;
                                                                    }
                                                                    System.out.println(errorMessage);
                                                                    try{Thread.sleep(500);
                                                                    }catch(Exception e){}
                                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break CurryAttack;
                                                                    }
                                                                    continue ;
                                                                }
                                                            }
                                                            if (layUpOrDoubleClutch == 1) {
                                                                whoseTurn = defenseSituation.shooting(pl, curry, mention, sc, "[레이업]", "layUp", 1, sharedPlace.playerDefenseWay, 1, 2,1);
                                                            } else {
                                                                whoseTurn = defenseSituation.shooting(pl, curry, mention, sc, "[더블 클러치]", "doubleClutch", 0, sharedPlace.playerDefenseWay, 1, 2,0);
                                                            }
                                                            if(whoseTurn.equals("GameEnd")){
                                                                break GameStart;
                                                            }
                                                            break CurryAttack;
                                                        }
                                                        //endregion
                                                    }
                                                }
                                            //플레이어 공격권
                                            case "player" :
                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("                                                                                                "+pl.myName + "         " + curry.myName
                                                        +"\n");
                                                System.out.println("                                                                                                    "+pl.stamina + "               " + curry.stamina+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                sharedPlace.reset();
                                                pl.FailCountZero();
                                                if(sharedPlace.gameEnd == 1){ break GameStart;}

                                                //하프라인 시작
                                                Thread attackTimeThread = new Thread(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        sharedPlace.attackTime();
                                                    }
                                                });
                                                Thread myAttackThread = new Thread(myAttack,"myAttackThread");
                                                StateCheckThread stateCheck = new StateCheckThread(myAttackThread);
                                                Thread stateCheckThread = new Thread(stateCheck,"stateCheckThread");
                                                attackTimeThread.start();
                                                myAttackThread.start();
                                                stateCheckThread.start();
                                                mainWait.waitMain();
                                                pl.turn = curry.myName;

                                        }
                                    }
                                    SharedPlace.gameEnd = 1;
                                    mainWait.notifyMain();
                                    sharedPlace.notifyNpc();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          최종 점수\n");
                                    System.out.println("                                                                                               "+pl.myName + "  "+pl.myScore+ " : "+curry.myScore+"  "+curry.myName+"\n");
                                    if(pl.myScore > 14){
                                        System.out.println("                                                                                                【 승리 】             【 패배 】\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                        축하합니다.");
                                        System.out.println("\n                                                                                               가드 포지션을 갖게 되었습니다. \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        pl.position = "가드";
                                        sc.nextLine();
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                               [딥쓰리]를 익혔습니다. \n");
                                        System.out.println("\n                                                                                               [비하인드 백 드리블]을 익혔습니다. \n");
                                        System.out.println("\n                                                                                               [스텝백 3점슛]을 익혔습니다. \n");
                                        System.out.println("\n                                                                                               [스텝백 2점슛]을 익혔습니다. \n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        pl.isBehindBack = 1;
                                        pl.isStepBack2 = 1;
                                        pl.isStepBack3 = 1;
                                        pl.isDeepThree = 1;
                                        pl.SkillPut();
                                    }else if(curry.myScore > 14) {
                                        System.out.println("                                                                                                【 패배 】             【 승리 】\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                    }

                                    pl.AfterGameInitialize();
                                    curry.AfterGameInitialize();
                                    curry.StaminaInitialize();

                                    break;

                                }
                                else if(select.equals("포워드")){
                                    james.InitializeStat();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                         - 경기에서 이기면 포워드 포지션을 갖게 됩니다. -\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    sc.nextLine();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                       ENTER키를 누르면 르브론 제임스와의 경기가 시작됩니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    sc.nextLine();
                                    mention.IntroductionMent(pl,james);
                                    sc.nextLine();
                                    mention.RuleMent();
                                    sc.nextLine();
                                    sc.nextLine();
                                    sharedPlace.setPlayer(pl);
                                    sharedPlace.setNpc(james);

                                    //region 자유투로 순서 정하기 - 르브론 제임스
                                        while(true){
                                            String freethrowJames = james.FreeThrow();
                                            String freethrowMine = pl.FreeThrow();
                                            if(freethrowJames.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  "+james.myName+"이 자유투를 시도합니다.\n");
                                                System.out.println("\n                                                                                                 "+james.myName+"의 자유투는 성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }else {
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  "+james.myName+"이 자유투를 시도합니다.\n");
                                                System.out.println("\n                                                                                                 "+james.myName+"의 자유투는 실패하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }
                                            sc.nextLine();
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                       "+pl.myName+"의 차례입니다.\n");
                                                System.out.println("\n                                                                                                 자유투를 던지려면 ENTER키를 눌러주세요\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            sc.nextLine();
                                            if(freethrowMine.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          자유투를 던집니다.\n");
                                                System.out.println("\n                                                                                                 "+pl.myName+"의 자유투는 성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }else {
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          자유투를 던집니다.\n");
                                                System.out.println("\n                                                                                                 "+pl.myName+"의 자유투는 실패하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                                            }
                                            sc.nextLine();
                                            james.InitializeScore();
                                            pl.InitializeScore();

                                            if(freethrowJames.equals("1")&&freethrowMine.equals("0")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                    "+james.myName+"의 선공으로 시작합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+
                                                                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기시작" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                pl.turn = james.myName;
                                                sc.nextLine();
                                                break;
                                            }else if(freethrowJames.equals("0")&&freethrowMine.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                   " +userName + "의 선공으로 시작합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                sc.nextLine();
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기시작" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                pl.turn = "player";
                                                sc.nextLine();
                                                break;
                                            }
                                        }

                                    //endregion
                                    sharedPlace.gameEnd = 0 ;
                                    sharedPlace.setNpc(james);
                                    sharedPlace.setPlayer(pl);
                                    defenseSituation.setPlayerNpc(pl,james);
                                    MyAttack myAttack = new MyAttack(sharedPlace,james,mainWait,pl);
                                    Thread gameTimeThread = new Thread(new Runnable() {
                                            @Override
                                            public void run() {
                                                sharedPlace.stopGameTime();
                                            }
                                        });
                                    gameTimeThread.start();
                                    GameStart :
                                    while(james.myScore<15 && pl.myScore<15){

                                        switch (pl.turn){
                                            //르브론 제임스 공격권
                                            case "르브론 제임스" :
                                                //region 체력 및 파울 표시
                                                try{Thread.sleep(1500);
                                                }catch(Exception e){}
                                                sharedPlace.reset();
                                                if(sharedPlace.gameEnd == 1){ break GameStart;}
                                                SharedPlace.attackTime = 14;
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("                                                                                                "+pl.myName + "         " + james.myName+"\n");
                                                System.out.println("                                                                                                    "+pl.stamina + "                 " + james.stamina+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}
                                                mention.gameInfo2(pl.myScore,james.myScore,pl.foulCount,james.foulCount);

                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}

                                                if(sharedPlace.gameEnd == 1){ break GameStart;}

                                                //region 체력 및 파울 표시
                                                pl.StaminaEffect();
                                                james.StaminaEffect();
                                                if(pl.staminaEffectCount == 1 || pl.staminaEffectCount == 2 || pl.staminaEffectCount == 3 ||james.staminaEffectCount == 1 || james.staminaEffectCount == 2 || james.staminaEffectCount == 3){
                                                    try{Thread.sleep(1000);
                                                    }catch(Exception e){}
                                                }

                                                //endregion
                                                JamesAttack :
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
                                                    if(SharedPlace2.endCheck()){ break JamesAttack;}
                                                    mention.gameInfo(pl.myScore,james.myScore,pl.foulCount,james.foulCount);
                                                    pictureNpcTurn.line3CloseOpponent(james);
                                                    System.out.println("\n                                                                                                "+james.myName+"이 드리블을 시작했습니다.");
                                                    System.out.println("\n                                                                                              "+james.myName+"이 3점 라인 근처까지 왔습니다.\n");
                                                    attackWay1 = "";
                                                    attackWay2 = "";
                                                    whoseTurn = "";
                                                    int defenseWay =-1;

                                                    Still :
                                                    while (true) {

                                                        //region 공격 시작
                                                        if(attackWay1.equals("Still") || attackWay2.equals("Still") || whoseTurn.equals("Still") ){
                                                            mention.gameInfo(pl.myScore,james.myScore,pl.foulCount,james.foulCount);
                                                            pictureNpcTurn.line3CloseOpponent(james);
                                                        }

                                                        while(true){
                                                            try{
                                                                sharedPlace.playerDefenseWay = "0";
                                                                mention.SelectionMent("gameStart");
                            
                                                                Thread jdLine3Thread = new Thread(new Runnable(){
                            
                                                                    @Override
                                                                    public void run() {
                                                                        try{Thread.sleep(2000);
                                                                        }catch(Exception e){}
                                                                        if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                            int randNumber = rand.nextInt(3) + 1;
                                                                            if(SharedPlace2.endCheck()){return;}
                                                                            SharedPlace2.attackTimeReset1();
                                                                            if(randNumber == 1){
                                                                                String result = defenseSituation.shooting(pl,james,mention,sc,"3점슛","point3",1,"2",0,3,0);
                                                                            }else if(randNumber == 2){
                                                                                String result = defenseSituation.shooting(pl,james,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                            }else {
                                                                                String result = defenseSituation.shooting(pl,james,mention,sc,"[덩크]","dunk",1,"2",0,2,0);
                                                                            }
                                                                        }
                                                                    }
                                                                });
                                                                jdLine3Thread.start();
                            
                                                                sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                try{ jdLine3Thread.join();
                                                                }catch(Exception e){}
                            
                                                                if(SharedPlace2.endCheck()){ break JamesAttack;}
                            
                            
                                                                if(!(sharedPlace.playerDefenseWay.equals("1") || sharedPlace.playerDefenseWay.equals("2"))){
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break JamesAttack;
                                                                    }
                                                                    System.out.println(errorMessage);
                                                                    try{Thread.sleep(500);
                                                                    }catch(Exception e){}
                                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break JamesAttack;
                                                                    }
                                                                    continue ;
                                                                }
                            
                                                                break;
                                                            }catch(Exception e){
                                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                    break JamesAttack;
                                                                }
                                                                System.out.println(errorMessage);
                                                                try{Thread.sleep(500);
                                                                }catch(Exception k){}
                                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                    break JamesAttack;
                                                                }
                                                                continue;
                                                            }
                                                        }
                            
                                                        if(SharedPlace2.endCheck()){ break JamesAttack;}

                                                        mention.gameInfo(pl.myScore,james.myScore,pl.foulCount,james.foulCount);
                                                        if(defenseWay == 1){
                                                            pictureNpcTurn.line3CloseOpponent(james);
                                                        }else {
                                                            pictureNpcTurn.line3FarOpponent(james);
                                                        }
                                                        //endregion
                                                        //제임스 3점라인 공격
                                                        int attackNumber = james.AttackPhase1();
                                                        switch (attackNumber) {
                                                            //region 돌파 or 크로스오버
                                                            case 0:
                                                                System.out.println("\n                                                                                               "+james.myName+"이 돌파를 시도합니다.\n");

                                                                while(true){

                                                                    sharedPlace.playerDefenseWay = "0";
                                                                    mention.SelectionMent("penetration");
                            
                                                                    Thread jdLine3_1Thread = new Thread(new Runnable(){
                                                                        @Override
                                                                        public void run() {
                                                                            try{Thread.sleep(2000);
                                                                            }catch(Exception e){}
                                                                            if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                                if(SharedPlace2.endCheck()){return;}
                                                                                SharedPlace2.attackTimeReset1();
                                                                                int randNumber = rand.nextInt(2) + 1;
                                                                                if(randNumber == 1){
                                                                                    String result = defenseSituation.shooting(pl,james,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                                }else {
                                                                                    String result = defenseSituation.shooting(pl,james,mention,sc,"[덩크]","dunk",1,"2",0,2,0);
                                                                                }
                                                                            }
                                                                        }
                                                                    });
                                                                    jdLine3_1Thread.start();
                            
                                                                    sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                    try{ jdLine3_1Thread.join();
                                                                    }catch(Exception e){}
                            
                                                                    if(SharedPlace2.endCheck()){ break JamesAttack;}
                            
                                                                    if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2") ||sharedPlace.playerDefenseWay.equals("3")){
                                                                        break;
                                                                    }else {
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break JamesAttack;
                                                                        }
                                                                        System.out.println(errorMessage);
                                                                        try{Thread.sleep(500);
                                                                        }catch(Exception e){}
                                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break JamesAttack;
                                                                        }
                                                                        continue ;
                                                                    }
                                                                }

                                                                int peneOrCross = james.PenetrationOrCrossOver();

                                                                if (peneOrCross == 1) {
                                                                    if (sharedPlace.playerDefenseWay.equals("1")) {
                                                                        attackWay1 = defenseSituation.penetration(pl, james, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 1, defenseWay);
                                                                    } else {
                                                                        attackWay1 = defenseSituation.penetration(pl, james, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 0, defenseWay);
                                                                    }
                                                                } else if (peneOrCross == 2) {
                                                                    if (sharedPlace.playerDefenseWay.equals("2")) {
                                                                        attackWay1 = defenseSituation.penetration(pl, james, mention, sc, "[크로스오버]", "crossOver", sharedPlace.playerDefenseWay, 1, defenseWay);
                                                                    } else {
                                                                        attackWay1 = defenseSituation.penetration(pl, james, mention, sc, "[크로스오버]", "crossOver", sharedPlace.playerDefenseWay, 0, defenseWay);
                                                                    }
                                                                }
                                                                if (attackWay1.equals("Still")) {
                                                                    continue Still;
                                                                }else if (attackWay1.equals("End Turn")) {
                                                                    break JamesAttack;
                                                                }else if(attackWay1.equals("Restart")){
                                                                    continue JamesAttack;
                                                                }
                                                                break;
                                                            //endregion
                                                            //region 3점 슈팅 or 훼이크
                                                            case 1:
                                                                whoseTurn = "";
                                                                while (true) {
                                                                    int shootOrFake = james.ShootOrFake();
                                                                    if(whoseTurn.equals("Still")){
                                                                        mention.gameInfo(pl.myScore,james.myScore,pl.foulCount,james.foulCount);
                                                                        pictureNpcTurn.line3CloseOpponent(james);
                                                                    }

                                                                    System.out.println("\n                                                                                               "+james.myName+"이 슛 모션을 취합니다.\n");
                                                                    while(true){
                                                                        sharedPlace.playerDefenseWay = "0";
                                                                        mention.SelectionMent("shooting");

                                                                        Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                            @Override
                                                                            public void run() {
                                                                                try{Thread.sleep(2000);
                                                                                }catch(Exception e){}
                                                                                if(sharedPlace.playerDefenseWay.equals("0")){

                                                                                    if(SharedPlace2.endCheck()){ return ;}
                                                                                    SharedPlace2.attackTimeReset1();
                                                                                    int randNumber = rand.nextInt(2) + 1;

                                                                                    String result = defenseSituation.shooting(pl,james,mention,sc,"3점슛","point3",1,"2",0,3,0);

                                                                                }
                                                                            }
                                                                        });
                                                                        jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                        jdLine3_2Thread.start();


                                                                        sharedPlace.playerDefenseWay = sc.nextLine();

                                                                        try{jdLine3_2Thread.join();
                                                                        }catch(Exception e){}

                                                                        if(SharedPlace2.endCheck()){ break JamesAttack;}

                                                                        if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                            break;
                                                                        }else {
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break JamesAttack;
                                                                            }
                                                                            System.out.println(errorMessage);
                                                                            try{Thread.sleep(500);
                                                                            }catch(Exception e){}
                                                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break JamesAttack;
                                                                            }
                                                                            continue ;
                                                                        }
                                                                    }

                                                                    whoseTurn = defenseSituation.shooting(pl, james, mention, sc, "3점슛", "point3", shootOrFake, sharedPlace.playerDefenseWay, 1, 3,1);

                                                                    if (whoseTurn.equals("Still")) {
                                                                        continue;
                                                                    } else if (whoseTurn.equals("End Turn")) {
                                                                        break JamesAttack;
                                                                    }else if(whoseTurn.equals("Restart")){
                                                                        continue JamesAttack;
                                                                    }else if(whoseTurn.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }
                                                                }
                                                                //endregion

                                                        }

                                                        //제임스 자유투 라인 공격
                                                        //region 자유투 라인 공격 - 제임스가 완전히 돌파했을 때
                                                        if (attackWay1.equals("Fully Penetration")) {
                                                            int layUpOrDunk = james.LayUpOrDunk(pl.myScore);

                                                            if (layUpOrDunk == 1) {
                                                                whoseTurn = defenseSituation.shooting(pl, james, mention, sc, "[레이업]", "layUp", 1, "2", 0, 2,0);
                                                            } else {
                                                                int oneHandOrTwoHand = rand.nextInt(2);
                                                                if (oneHandOrTwoHand == 1) {
                                                                    whoseTurn = defenseSituation.shooting(pl, james, mention, sc, "[토마호크 슬램덩크]", "dunk", 1, "2", 0, 2,0);
                                                                } else {
                                                                    whoseTurn = defenseSituation.shooting(pl, james, mention, sc, "[투핸드 슬램덩크]", "dunk", 1, "2", 0, 2,0);
                                                                }
                                                            }
                                                            if(whoseTurn.equals("GameEnd")){
                                                                break GameStart;
                                                            }
                                                            break JamesAttack;

                                                        }
                                                        //endregion
                                                        //region 자유투라인 공격 - 제임스가 완전히 돌파하지 못했을 때(내가 쫓아갈 때)
                                                        if (attackWay1.equals("Half Penetration")) {
                                                            //덩크할 때
                                                            int DunkOrPullUpOrPene = james.DunkOrPullUpOrPene(pl.myScore);
                                                            if (DunkOrPullUpOrPene == 1) {

                                                            }
                                                            //풀업 점퍼 or 2점 슛
                                                            else if (DunkOrPullUpOrPene == 2) {
                                                                whoseTurn = "";
                                                                while (true) {
                                                                    int shootOrFake = james.ShootOrFake();
                                                                    mention.gameInfo(pl.myScore,james.myScore,pl.foulCount,james.foulCount);
                                                                    pictureNpcTurn.freethrowWithOpponent(james);
                                                                    if (whoseTurn == "Still") {
                                                                        System.out.println("\n                                                                                              "+james.myName+"이 다시 슛 모션을 취합니다.\n");
                                                                    } else {
                                                                        System.out.println("\n                                                                                          "+james.myName+"이 자유투 라인 부근에서 슛 모션을 취합니다.\n");
                                                                    }
                                                                    while(true){
                                                                        sharedPlace.playerDefenseWay = "0";
                                                                        mention.SelectionMent("shooting");

                                                                        Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                            @Override
                                                                            public void run() {
                                                                                try{Thread.sleep(2000);
                                                                                }catch(Exception e){}
                                                                                if(sharedPlace.playerDefenseWay.equals("0")){

                                                                                    if(SharedPlace2.endCheck()){ return ;}
                                                                                    SharedPlace2.attackTimeReset1();
                                                                                    int randNumber = rand.nextInt(2) + 1;

                                                                                    String result = defenseSituation.shooting(pl,jd,mention,sc,"2점슛","point2",1,"2",0,2,0);

                                                                                }
                                                                            }
                                                                        });
                                                                        jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                        jdLine3_2Thread.start();


                                                                        sharedPlace.playerDefenseWay = sc.nextLine();

                                                                        try{jdLine3_2Thread.join();
                                                                        }catch(Exception e){}

                                                                        if(SharedPlace2.endCheck()){ break JamesAttack;}

                                                                        if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                            break;
                                                                        }else {
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break JamesAttack;
                                                                            }
                                                                            System.out.println(errorMessage);
                                                                            try{Thread.sleep(500);
                                                                            }catch(Exception e){}
                                                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break JamesAttack;
                                                                            }
                                                                            continue ;
                                                                        }
                                                                    }

                                                                    if (whoseTurn == "Still") {
                                                                        whoseTurn = defenseSituation.shooting(pl, james, mention, sc, "2점슛", "point2", shootOrFake, sharedPlace.playerDefenseWay, 1, 2,1);
                                                                    } else {
                                                                        whoseTurn = defenseSituation.shooting(pl, james, mention, sc, "[풀업 점퍼]", "pullUpJumper", shootOrFake, sharedPlace.playerDefenseWay, 1, 2,1);
                                                                    }
                                                                    if (whoseTurn.equals("Still")) {
                                                                        continue ;
                                                                    } else if (whoseTurn.equals("End Turn")) {
                                                                        break JamesAttack;
                                                                    }else if(whoseTurn.equals("Restart")){
                                                                        continue JamesAttack;
                                                                    }else if(whoseTurn.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }

                                                                }

                                                                //계속 돌파할 때
                                                            } else if (DunkOrPullUpOrPene == 3) {
                                                                mention.gameInfo(pl.myScore,james.myScore,pl.foulCount,james.foulCount);
                                                                pictureNpcTurn.freethrowWithOpponent(james);
                                                                System.out.println("\n                                                                                          "+james.myName+"이 자유투 라인 부근을 지나 계속 돌파합니다.\n");
                                                                 while(true){
                                                                    sharedPlace.playerDefenseWay = "0";
                                                                    mention.SelectionMent("penetration");
                            
                                                                    Thread jdLine2_2Thread = new Thread(new Runnable(){
                                                                        @Override
                                                                        public void run() {
                                                                            try{Thread.sleep(2000);
                                                                            }catch(Exception e){}
                                                                            if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                                if(SharedPlace2.endCheck()){return;}
                                                                                SharedPlace2.attackTimeReset1();
                                                                                int randNumber = rand.nextInt(2) + 1;
                                                                                if(randNumber == 1){
                                                                                    String result = defenseSituation.shooting(pl,james,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                                }else {
                                                                                    String result = defenseSituation.shooting(pl,james,mention,sc,"[덩크]","dunk",1,"2",0,2,0);
                                                                                }
                                                                            }
                                                                        }
                                                                    });
                                                                    jdLine2_2Thread.start();
                            
                                                                    sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                    try{ jdLine2_2Thread.join();
                                                                    }catch(Exception e){}
                            
                                                                    if(SharedPlace2.endCheck()){ break JamesAttack;}
                            
                                                                    if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")||sharedPlace.playerDefenseWay.equals("3")){
                                                                        break;
                                                                    }else {
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break JamesAttack;
                                                                        }
                                                                        System.out.println(errorMessage);
                                                                        try{Thread.sleep(500);
                                                                        }catch(Exception e){}
                                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break JamesAttack;
                                                                        }
                                                                        continue ;
                                                                    }
                                                                }

                                                                if (sharedPlace.playerDefenseWay.equals("4")) {

                                                                    int layUpOrDunk = james.LayUpOrDunk(pl.myScore);
                                                                    if (layUpOrDunk == 1) {
                                                                        whoseTurn = defenseSituation.shooting(pl, james, mention, sc, "[레이업]", "layUp", 1, "2", 0, 2,0);
                                                                    } else {
                                                                        int oneHandOrTwoHand = rand.nextInt(2);
                                                                        if (oneHandOrTwoHand == 1) {
                                                                            whoseTurn = defenseSituation.shooting(pl, james, mention, sc, "[토마호크 슬램덩크]", "dunk", 1, "2", 0, 2,0);
                                                                        } else {
                                                                            whoseTurn = defenseSituation.shooting(pl, james, mention, sc, "[투핸드 슬램덩크]", "dunk", 1, "2", 0, 2,0);
                                                                        }
                                                                    }
                                                                    if(whoseTurn.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }
                                                                    break JamesAttack;

                                                                } else {
                                                                    int peneOrSpin = rand.nextInt(2) + 1;

                                                                    if (peneOrSpin == 1) {
                                                                        if (sharedPlace.playerDefenseWay.equals("1")) {
                                                                            attackWay2 = defenseSituation.penetration(pl, james, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 1, 0);
                                                                        } else {
                                                                            attackWay2 = defenseSituation.penetration(pl, james, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 0, 0);
                                                                        }
                                                                    } else if (peneOrSpin == 2) {
                                                                        if (sharedPlace.playerDefenseWay.equals("2")) {
                                                                            attackWay2 = defenseSituation.penetration(pl, james, mention, sc, "[스핀무브]", "spinMove", sharedPlace.playerDefenseWay, 1, 0);
                                                                        } else {
                                                                            attackWay2 = defenseSituation.penetration(pl, james, mention, sc, "[스핀무브]", "spinMove", sharedPlace.playerDefenseWay, 0, 0);
                                                                        }
                                                                    }
                                                                    if (attackWay2.equals("Still")) {
                                                                        continue Still;
                                                                    } else if (attackWay2.equals("End Turn")) {
                                                                        break JamesAttack;
                                                                    }else if(attackWay2.equals("Restart")){
                                                                        continue JamesAttack;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        //endregion

                                                        //제임스 골 밑 공격
                                                        //region 레이업 or 더블 클러치
                                                        if (attackWay2.equals("Half Penetration")) {
                                                            int layUpOrDoubleClutch = james.LayUpOrDoubleClutch();
                                                            whoseTurn = "";
                                                            int shootOrFake = james.ShootOrFake();
                                                            mention.gameInfo(pl.myScore,james.myScore,pl.foulCount,james.foulCount);
                                                            pictureNpcTurn.underRimwWithOpponent(james);
                                                            System.out.println("\n                                                                                            "+james.myName+"이 스텝을 밟고 [레이업]을 올라갔습니다.\n");

                                                             while(true){
                                                                sharedPlace.playerDefenseWay = "0";
                                                                mention.SelectionMent("shooting");
                    
                                                                Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                    @Override
                                                                    public void run() {
                                                                        try{Thread.sleep(2000);
                                                                        }catch(Exception e){}
                                                                        if(sharedPlace.playerDefenseWay.equals("0")){
                    
                                                                            if(SharedPlace2.endCheck()){ return ;}
                                                                            SharedPlace2.attackTimeReset1();
                                                                            int randNumber = rand.nextInt(2) + 1;
                    
                                                                            String result = defenseSituation.shooting(pl,jd,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                    
                                                                        }
                                                                    }
                                                                });
                                                                jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                jdLine3_2Thread.start();
                    
                    
                                                                sharedPlace.playerDefenseWay = sc.nextLine();
                    
                                                                try{jdLine3_2Thread.join();
                                                                }catch(Exception e){}
                    
                                                                if(SharedPlace2.endCheck()){ break JamesAttack;}
                    
                                                                if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                    break;
                                                                }else {
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break JamesAttack;
                                                                    }
                                                                    System.out.println(errorMessage);
                                                                    try{Thread.sleep(500);
                                                                    }catch(Exception e){}
                                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break JamesAttack;
                                                                    }
                                                                    continue ;
                                                                }
                                                            }

                                                            if (layUpOrDoubleClutch == 1) {
                                                                whoseTurn = defenseSituation.shooting(pl, james, mention, sc, "[레이업]", "layUp", 1, sharedPlace.playerDefenseWay, 1, 2,1);
                                                            } else {
                                                                whoseTurn = defenseSituation.shooting(pl, james, mention, sc, "[더블 클러치]", "doubleClutch", 0, sharedPlace.playerDefenseWay, 1, 2,0);
                                                            }
                                                            if(whoseTurn.equals("GameEnd")){
                                                                break GameStart;
                                                            }
                                                            break JamesAttack;
                                                        }
                                                        //endregion

                                                    }
                                                }
                                            //플레이어 공격권
                                            case "player" :
                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("                                                                                                "+pl.myName + "         " + james.myName
                                                        +"\n");
                                                System.out.println("                                                                                                    "+pl.stamina + "               " + james.stamina+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                sharedPlace.reset();
                                                pl.FailCountZero();
                                                if(sharedPlace.gameEnd == 1){ break GameStart;}

                                                //하프라인 시작
                                                Thread myAttackThread = new Thread(myAttack,"myAttackThread");
                                                StateCheckThread stateCheck = new StateCheckThread(myAttackThread);
                                                Thread stateCheckThread = new Thread(stateCheck,"stateCheckThread");
                                                myAttackThread.start();
                                                stateCheckThread.start();
                                                mainWait.waitMain();
                                                pl.turn = james.myName;
                                                //하프라인 시작

                                        }
                                    }
                                    SharedPlace.gameEnd = 1;
                                    mainWait.notifyMain();
                                    sharedPlace.notifyNpc();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          최종 점수\n");
                                    System.out.println("                                                                                               "+pl.myName + "  "+pl.myScore+ " : "+james.myScore+"  "+james.myName+"\n");
                                    if(pl.myScore > 14){
                                        System.out.println("                                                                                                【 승리 】             【 패배 】\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                        축하합니다.");
                                        System.out.println("\n                                                                                               포워드 포지션을 갖게 되었습니다. \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                               [스핀무브]를 익혔습니다. \n");
                                        System.out.println("\n                                                                                               [풀업 점퍼]를 익혔습니다. \n");
                                        System.out.println("\n                                                                                               [덩크]를 익혔습니다. \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        pl.isPullUpJumper = 1;
                                        pl.isSpinMove = 1;
                                        pl.isDunk = 1;
                                        pl.SkillPut();
                                    }else if(james.myScore > 14) {
                                        System.out.println("                                                                                                【 패배 】             【 승리 】\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                    }

                                    pl.AfterGameInitialize();
                                    james.AfterGameInitialize();
                                    james.StaminaInitialize();

                                    break;
                                }
                                else if(select.equals("센터")){
                                    oneal.InitializeStat();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                         - 경기에서 이기면 센터 포지션을 갖게 됩니다. -\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    sc.nextLine();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                        ENTER키를 누르면 샤킬 오닐과의 경기가 시작됩니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    sc.nextLine();
                                    mention.IntroductionMent(pl,oneal);
                                    sc.nextLine();
                                    mention.RuleMent();
                                    sc.nextLine();
                                    sc.nextLine();
                                    sharedPlace.setPlayer(pl);
                                    sharedPlace.setNpc(oneal);
                                    //region 자유투로 순서 정하기 - 샤킬 오닐
                                        while(true){
                                            String freethrowOneal = oneal.FreeThrow();
                                            String freethrowMine = pl.FreeThrow();
                                            if(freethrowOneal.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  "+oneal.myName+"이 자유투를 시도합니다.\n");
                                                System.out.println("\n                                                                                                 "+oneal.myName+"의 자유투는 성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }else {
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  "+oneal.myName+"이 자유투를 시도합니다.\n");
                                                System.out.println("\n                                                                                                 "+oneal.myName+"의 자유투는 실패하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }
                                            sc.nextLine();
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                       "+pl.myName+"의 차례입니다.\n");
                                                System.out.println("\n                                                                                                 자유투를 던지려면 ENTER키를 눌러주세요\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            sc.nextLine();
                                            if(freethrowMine.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          자유투를 던집니다.\n");
                                                System.out.println("\n                                                                                                 "+pl.myName+"의 자유투는 성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }else {
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          자유투를 던집니다.\n");
                                                System.out.println("\n                                                                                                 "+pl.myName+"의 자유투는 실패하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                                            }
                                            sc.nextLine();
                                            oneal.InitializeScore();
                                            pl.InitializeScore();

                                            if(freethrowOneal.equals("1")&&freethrowMine.equals("0")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                    "+oneal.myName+"의 선공으로 시작합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+
                                                                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기시작" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                pl.turn = oneal.myName;
                                                sc.nextLine();
                                                break;
                                            }else if(freethrowOneal.equals("0")&&freethrowMine.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                   " +userName + "의 선공으로 시작합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                sc.nextLine();
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기시작" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                pl.turn = "player";
                                                sc.nextLine();
                                                break;
                                            }
                                        }

                                    //endregion
                                    sharedPlace.gameEnd = 0 ;
                                    sharedPlace.setNpc(oneal);
                                    sharedPlace.setPlayer(pl);
                                    defenseSituation.setPlayerNpc(pl,oneal);
                                    MyAttack myAttack = new MyAttack(sharedPlace,oneal,mainWait,pl);
                                    Thread gameTimeThread = new Thread(new Runnable() {
                                            @Override
                                            public void run() {
                                                sharedPlace.stopGameTime();
                                            }
                                        });
                                    gameTimeThread.start();SharedPlace.attackTimeReset = 1;

                                    GameStart :
                                    while(oneal.myScore<15 && pl.myScore<15){

                                        switch (pl.turn){
                                            //샤킬 오닐 공격권
                                            case "샤킬 오닐" :
                                                //region 체력 및 파울 표시
                                                try{Thread.sleep(1500);
                                                }catch(Exception e){}
                                                sharedPlace.reset();
                                                if(sharedPlace.gameEnd == 1){ break GameStart;}
                                                SharedPlace.attackTime = 14;
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("                                                                                                "+pl.myName + "         " + oneal.myName+"\n");
                                                System.out.println("                                                                                                    "+pl.stamina + "                 " + oneal.stamina+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}
                                                mention.gameInfo2(pl.myScore,oneal.myScore,pl.foulCount,oneal.foulCount);

                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}

                                                if(sharedPlace.gameEnd == 1){ break GameStart;}

                                                //region 체력 및 파울 표시
                                                pl.StaminaEffect();
                                                oneal.StaminaEffect();
                                                if(pl.staminaEffectCount == 1 || pl.staminaEffectCount == 2 || pl.staminaEffectCount == 3 ||oneal.staminaEffectCount == 1 || oneal.staminaEffectCount == 2 || oneal.staminaEffectCount == 3){
                                                    try{Thread.sleep(1000);
                                                    }catch(Exception e){}
                                                }

                                                //endregion
                                                OnealAttack :
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
                                                    if(SharedPlace2.endCheck()){ break OnealAttack;}
                                                    mention.gameInfo(pl.myScore,oneal.myScore,pl.foulCount,oneal.foulCount);
                                                    pictureNpcTurn.line3CloseOpponent(oneal);
                                                    System.out.println("\n                                                                                                "+oneal.myName+"이 드리블을 시작했습니다.");
                                                    System.out.println("\n                                                                                              "+oneal.myName+"이 3점 라인 근처까지 왔습니다.\n");
                                                    attackWay1 = "";
                                                    attackWay2 = "";
                                                    whoseTurn = "";
                                                    int defenseWay =-1;

                                                    Still :
                                                    while (true) {

                                                        //region 공격 시작
                                                        if(attackWay1.equals("Still") || attackWay2.equals("Still") || whoseTurn.equals("Still") ){
                                                            mention.gameInfo(pl.myScore,oneal.myScore,pl.foulCount,oneal.foulCount);
                                                            pictureNpcTurn.line3CloseOpponent(oneal);
                                                        }

                                                        while(true){
                                                            try{
                                                                sharedPlace.playerDefenseWay = "0";
                                                                mention.SelectionMent("gameStart");
                            
                                                                Thread jdLine3Thread = new Thread(new Runnable(){
                            
                                                                    @Override
                                                                    public void run() {
                                                                        try{Thread.sleep(2000);
                                                                        }catch(Exception e){}
                                                                        if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                            int randNumber = rand.nextInt(2) + 1;
                                                                            if(SharedPlace2.endCheck()){return;}
                                                                            SharedPlace2.attackTimeReset1();
                                                                            if(randNumber == 2){
                                                                                String result = defenseSituation.shooting(pl,oneal,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                            }else {
                                                                                String result = defenseSituation.shooting(pl,oneal,mention,sc,"[덩크]","dunk",1,"2",0,2,0);
                                                                            }
                                                                        }
                                                                    }
                                                                });
                                                                jdLine3Thread.start();
                            
                                                                sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                try{ jdLine3Thread.join();
                                                                }catch(Exception e){}
                            
                                                                if(SharedPlace2.endCheck()){ break OnealAttack;}
                            
                            
                                                                if(!(sharedPlace.playerDefenseWay.equals("1") || sharedPlace.playerDefenseWay.equals("2"))){
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break OnealAttack;
                                                                    }
                                                                    System.out.println(errorMessage);
                                                                    try{Thread.sleep(500);
                                                                    }catch(Exception e){}
                                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break OnealAttack;
                                                                    }
                                                                    continue ;
                                                                }
                            
                                                                break;
                                                            }catch(Exception e){
                                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                    break OnealAttack;
                                                                }
                                                                System.out.println(errorMessage);
                                                                try{Thread.sleep(500);
                                                                }catch(Exception k){}
                                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                    break OnealAttack;
                                                                }
                                                                continue;
                                                            }
                                                        }
                            
                                                        if(SharedPlace2.endCheck()){ break OnealAttack;}


                                                        mention.gameInfo(pl.myScore,oneal.myScore,pl.foulCount,oneal.foulCount);
                                                        if(defenseWay == 1){
                                                            pictureNpcTurn.line3CloseOpponent(oneal);
                                                        }else {
                                                            pictureNpcTurn.line3FarOpponent(oneal);
                                                        }
                                                        //endregion
                                                        //오닐 3점라인 공격

                                                        // region 포스트업

                                                        System.out.println("\n                                                                                         "+oneal.myName+"이 45도 각도에서 [포스트업]을 시작했습니다.\n");

                                                        while(true){
                                                            sharedPlace.playerDefenseWay = "0";
                                                            mention.SelectionMent("postUp");
                                                            Thread jdLine3_1Thread = new Thread(new Runnable(){
                                                                @Override
                                                                public void run() {
                                                                    try{Thread.sleep(2000);
                                                                    }catch(Exception e){}
                                                                    if(sharedPlace.playerDefenseWay.equals("0")){

                                                                        if(SharedPlace2.endCheck()){return;}
                                                                        SharedPlace2.attackTimeReset1();
                                                                        int randNumber = rand.nextInt(2) + 1;
                                                                        if(randNumber == 1){
                                                                            String result = defenseSituation.shooting(pl,oneal,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                        }else {
                                                                            String result = defenseSituation.shooting(pl,oneal,mention,sc,"[덩크]","dunk",1,"2",0,2,0);
                                                                        }
                                                                    }
                                                                }
                                                            });
                                                            jdLine3_1Thread.start();

                                                            sharedPlace.playerDefenseWay = sc.nextLine();

                                                            try{ jdLine3_1Thread.join();
                                                            }catch(Exception e){}

                                                            if(SharedPlace2.endCheck()){ break OnealAttack;}

                                                            if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2") ||sharedPlace.playerDefenseWay.equals("3")){
                                                                break;
                                                            }else {
                                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                    break OnealAttack;
                                                                }
                                                                System.out.println(errorMessage);
                                                                try{Thread.sleep(500);
                                                                }catch(Exception e){}
                                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                    break OnealAttack;
                                                                }
                                                                continue ;
                                                            }
                                                        }

                                                        attackWay1 = defenseSituation.postUp(pl, oneal, mention, sc, sharedPlace.playerDefenseWay);

                                                        if (attackWay1.equals("Still")) {
                                                            continue Still;
                                                        } else if (attackWay1.equals("End Turn")) {
                                                            break OnealAttack;
                                                        }else if(attackWay1.equals("Restart")){
                                                                continue OnealAttack;
                                                            }
                                                    //endregion

                                                        //오닐 자유투 라인 공격
                                                        //region 자유투 라인 공격 - 오닐이 포스트업으로 들어왔을 때
                                                        if (attackWay1.equals("PostUp")) {
                                                            mention.gameInfo(pl.myScore,oneal.myScore,pl.foulCount,oneal.foulCount);
                                                            pictureNpcTurn.freethrowPostUp(oneal);
                                                            System.out.println("\n                                                                                          "+oneal.myName+"이 자유투 라인 근처까지 들어오고 있습니다.\n");

                                                            while(true){
                                                                sharedPlace.playerDefenseWay = "0";
                                                                mention.SelectionMent("postUp");

                                                                Thread jdLine2_3Thread = new Thread(new Runnable(){
                                                                    @Override
                                                                    public void run() {
                                                                        try{Thread.sleep(2000);
                                                                        }catch(Exception e){}
                                                                        if(sharedPlace.playerDefenseWay.equals("0")){

                                                                            if(SharedPlace2.endCheck()){return;}
                                                                            SharedPlace2.attackTimeReset1();
                                                                            String result = defenseSituation.shooting(pl,oneal,mention,sc,"2점슛","point2",1,"2",0,2,0);
                                                                        }
                                                                    }
                                                                });
                                                                jdLine2_3Thread.start();

                                                                sharedPlace.playerDefenseWay = sc.nextLine();

                                                                try{ jdLine2_3Thread.join();
                                                                }catch(Exception e){}

                                                                if(SharedPlace2.endCheck()){ break OnealAttack;}

                                                                if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")||sharedPlace.playerDefenseWay.equals("3")){
                                                                    break;
                                                                }else {
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break OnealAttack;
                                                                    }
                                                                    System.out.println(errorMessage);
                                                                    try{Thread.sleep(500);
                                                                    }catch(Exception e){}
                                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break OnealAttack;
                                                                    }
                                                                    continue ;
                                                                }
                                                            }

                                                                attackWay2 = defenseSituation.postUp(pl, oneal, mention, sc, sharedPlace.playerDefenseWay);
                                                                if (attackWay2.equals("Still")) {
                                                                        continue ;
                                                                    } else if (attackWay2.equals("End Turn")) {
                                                                        break OnealAttack;
                                                                    }else if(attackWay2.equals("Restart")){
                                                                        continue OnealAttack;
                                                                    }else if(attackWay2.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }
                                                        }
                                                        //endregion

                                                        //오닐 골 밑 공격
                                                        //region 훅 샷
                                                        if (attackWay2.equals("PostUp")) {
                                                            int hookShotOrDunk = rand.nextInt(2) + 1;
                                                            if (hookShotOrDunk == 1) {
                                                                whoseTurn = "";
                                                                while (true) {
                                                                    int shootOrFake = oneal.ShootOrFake();
                                                                    mention.gameInfo(pl.myScore,oneal.myScore,pl.foulCount,oneal.foulCount);
                                                                    pictureNpcTurn.underRimPostUp(oneal);
                                                                    if (whoseTurn == "Still") {
                                                                        System.out.println("\n                                                                                              "+oneal.myName+"이 다시 슛 모션을 취합니다.\n");
                                                                    } else {
                                                                        System.out.println("\n                                                                                        "+oneal.myName+"이 골밑에서 [훅 샷]을 시도합니다.\n");
                                                                    }

                                                                    while(true){
                                                                        sharedPlace.playerDefenseWay = "0";
                                                                        mention.SelectionMent("shooting");
                            
                                                                        Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                            @Override
                                                                            public void run() {
                                                                                try{Thread.sleep(2000);
                                                                                }catch(Exception e){}
                                                                                if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                                    if(SharedPlace2.endCheck()){ return ;}
                                                                                    SharedPlace2.attackTimeReset1();
                                                                                    int randNumber = rand.nextInt(2) + 1;
                            
                                                                                    String result = defenseSituation.shooting(pl,oneal,mention,sc,"골밑슛","underRim",1,"2",0,2,0);
                            
                                                                                }
                                                                            }
                                                                        });
                                                                        jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                        jdLine3_2Thread.start();
                            
                            
                                                                        sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                        try{jdLine3_2Thread.join();
                                                                        }catch(Exception e){}
                            
                                                                        if(SharedPlace2.endCheck()){ break OnealAttack;}
                            
                                                                        if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                            break;
                                                                        }else {
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break OnealAttack;
                                                                            }
                                                                            System.out.println(errorMessage);
                                                                            try{Thread.sleep(500);
                                                                            }catch(Exception e){}
                                                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break OnealAttack;
                                                                            }
                                                                            continue ;
                                                                        }
                                                                    }
                                                                    if (whoseTurn == "Still") {
                                                                        whoseTurn = defenseSituation.shooting(pl, oneal, mention, sc, "골밑슛", "underRim", shootOrFake, sharedPlace.playerDefenseWay, 1, 2,1);
                                                                    } else {
                                                                        whoseTurn = defenseSituation.shooting(pl, oneal, mention, sc, "[훅 샷]", "hookShot", shootOrFake, sharedPlace.playerDefenseWay, 1, 2,1);
                                                                    }
                                                                    if (whoseTurn.equals("Still")) {
                                                                        continue;
                                                                    } else if (whoseTurn.equals("End Turn")) {
                                                                        break OnealAttack;
                                                                    }else if(whoseTurn.equals("Restart")){
                                                                        continue OnealAttack;
                                                                    }else if(whoseTurn.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }

                                                                }
                                                            } else {
                                                                mention.gameInfo(pl.myScore,oneal.myScore,pl.foulCount,oneal.foulCount);
                                                                pictureNpcTurn.baseLine(oneal);
                                                                System.out.println("\n                                                                                 샤킬 오닐이 베이스라인 쪽으로 돌파하여 [리버스 덩크]를 시도합니다.\n");

                                                                 while(true){
                                                                sharedPlace.playerDefenseWay = "0";
                                                                mention.SelectionMent("shooting");

                                                                Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                    @Override
                                                                    public void run() {
                                                                        try{Thread.sleep(2000);
                                                                        }catch(Exception e){}
                                                                        if(sharedPlace.playerDefenseWay.equals("0")){

                                                                            if(SharedPlace2.endCheck()){ return ;}
                                                                            SharedPlace2.attackTimeReset1();
                                                                            int randNumber = rand.nextInt(2) + 1;

                                                                            String result = defenseSituation.shooting(pl,jd,mention,sc,"[리버스 덩크]","dunk",1,"2",0,2,0);

                                                                        }
                                                                    }
                                                                });
                                                                jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                jdLine3_2Thread.start();


                                                                sharedPlace.playerDefenseWay = sc.nextLine();

                                                                try{jdLine3_2Thread.join();
                                                                }catch(Exception e){}

                                                                if(SharedPlace2.endCheck()){ break OnealAttack;}

                                                                if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                    break;
                                                                }else {
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break OnealAttack;
                                                                    }
                                                                    System.out.println(errorMessage);
                                                                    try{Thread.sleep(500);
                                                                    }catch(Exception e){}
                                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break OnealAttack;
                                                                    }
                                                                    continue ;
                                                                }
                                                            }
                                                                whoseTurn = defenseSituation.shooting(pl, oneal, mention, sc, "[리버스 덩크]", "dunk", 1, sharedPlace.playerDefenseWay, 1, 2,1);
                                                            }
                                                            if (whoseTurn.equals("Still")) {
                                                                continue Still;
                                                            } else if (whoseTurn.equals("End Turn")) {
                                                                break OnealAttack;
                                                            }else if(whoseTurn.equals("Restart")){
                                                                continue OnealAttack;
                                                            }else if(whoseTurn.equals("GameEnd")){
                                                                break GameStart;
                                                            }

                                                        }
                                                        //endregion
                                                    }
                                                }
                                            //플레이어 공격권
                                            case "player" :
                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("                                                                                                "+pl.myName + "         " + oneal.myName
                                                        +"\n");
                                                System.out.println("                                                                                                    "+pl.stamina + "               " + oneal.stamina+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                sharedPlace.reset();
                                                pl.FailCountZero();
                                                if(sharedPlace.gameEnd == 1){ break GameStart;}

                                                //하프라인 시작
                                                Thread myAttackThread = new Thread(myAttack,"myAttackThread");
                                                StateCheckThread stateCheck = new StateCheckThread(myAttackThread);
                                                Thread stateCheckThread = new Thread(stateCheck,"stateCheckThread");
                                                myAttackThread.start();
                                                stateCheckThread.start();
                                                mainWait.waitMain();
                                                pl.turn = oneal.myName;

                                        }
                                    }
                                    SharedPlace.gameEnd = 1;
                                    mainWait.notifyMain();
                                    sharedPlace.notifyNpc();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          최종 점수\n");
                                    System.out.println("                                                                                               "+pl.myName + "  "+pl.myScore+ " : "+oneal.myScore+"  "+oneal.myName+"\n");
                                    if(pl.myScore > 14){
                                        System.out.println("                                                                                                【 승리 】             【 패배 】\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                        축하합니다.");
                                        System.out.println("\n                                                                                                센터 포지션을 갖게 되었습니다. \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                               [포스트업]을 익혔습니다. \n");
                                        System.out.println("\n                                                                                               [훅 샷]을 익혔습니다. \n");
                                        System.out.println("\n                                                                                               [덩크]를 익혔습니다. \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        pl.isPostUp = 1;
                                        pl.isHookShot = 1;
                                        pl.isDunk = 1;
                                        pl.SkillPut();
                                    }else if(oneal.myScore > 14) {
                                        System.out.println("                                                                                                【 패배 】             【 승리 】\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                    }

                                    pl.AfterGameInitialize();
                                    oneal.AfterGameInitialize();
                                    oneal.StaminaInitialize();

                                    break;
                                }
                                else if(select.equals("7777")){
                                    continue Location;
                                }
                                else {
                                    System.out.println(noPosition);
                                    sc.nextLine();
                                    continue;
                                }
                            }
                            break;
                        case "4":
                            Home.getOut = false;
                            Music.runningIntroMusic = true;
                            Music openDoorMusic = new Music("C:\\Users\\손지우\\IdeaProjects\\TeamNova\\농구게임 실험공간\\audio\\openDoor1.wav",false);
                            openDoorMusic.start();
                            System.out.println("                                                                                                      집으로 가는 중입니다.");
                            System.out.print("                                                                                                   ");
                            for(int i=0; i<14; i++) {
                                System.out.print("￣");
                                try{ Thread.sleep(200);
                                }catch(Exception e){}
                            }
                            try{ Thread.sleep(500);
                            }catch(Exception e){}
                            while(true){
                                Home home = new Home(pl);
                                Thread getStaminaThread = new Thread(home);
                                getStaminaThread.start();

                                mention.MyHome();
                                select = sc.nextLine();

                                if(select.equals("0")){
                                    Home.getOut = true;
                                    continue MainMenu;
                                }else{
                                    System.out.println(errorMessage);
                                    continue ;
                                }
                            }
                        case "5":
                            System.out.println("                                                                                                 길거리 농구장으로 가는 중입니다.");
                            System.out.print("                                                                                                   ");
                            for(int i=0; i<14; i++) {
                                System.out.print("￣");
                                try{ Thread.sleep(200);
                                }catch(Exception e){}
                            }
                            while(true){
                                mention.RoadCourt();
                                select = sc.nextLine();
                                if(select.equals("A코트")||select.equals("a코트")||select.equals("A")||select.equals("a")){
                                    murray.InitializeStat();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                        ENTER키를 누르면 자말 머레이와의 경기가 시작됩니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    sc.nextLine();
                                    mention.IntroductionMent(pl,murray);
                                    sc.nextLine();
                                    mention.RuleMent();
                                    sc.nextLine();
                                    sc.nextLine();
                                    sharedPlace.setPlayer(pl);
                                    sharedPlace.setNpc(murray);
                                    //region 자유투로 순서 정하기 - 자말 머레이
                                        while(true){
                                            String freethrowmurray = murray.FreeThrow();
                                            String freethrowMine = pl.FreeThrow();
                                            if(freethrowmurray.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  "+murray.myName+"이 자유투를 시도합니다.\n");
                                                System.out.println("\n                                                                                                 "+murray.myName+"의 자유투는 성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }else {
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  "+murray.myName+"이 자유투를 시도합니다.\n");
                                                System.out.println("\n                                                                                                 "+murray.myName+"의 자유투는 실패하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }
                                            sc.nextLine();
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                       "+pl.myName+"의 차례입니다.\n");
                                                System.out.println("\n                                                                                                 자유투를 던지려면 ENTER키를 눌러주세요\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            sc.nextLine();
                                            if(freethrowMine.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          자유투를 던집니다.\n");
                                                System.out.println("\n                                                                                                 "+pl.myName+"의 자유투는 성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }else {
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          자유투를 던집니다.\n");
                                                System.out.println("\n                                                                                                 "+pl.myName+"의 자유투는 실패하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                                            }
                                            sc.nextLine();
                                            murray.InitializeScore();
                                            pl.InitializeScore();

                                            if(freethrowmurray.equals("1")&&freethrowMine.equals("0")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                    "+murray.myName+"의 선공으로 시작합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+
                                                                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기시작" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                turn = murray.myName;
                                                sc.nextLine();
                                                break;
                                            }else if(freethrowmurray.equals("0")&&freethrowMine.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                   " +userName + "의 선공으로 시작합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                sc.nextLine();
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기시작" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                pl.turn = "player";
                                                sc.nextLine();
                                                break;
                                            }
                                        }

                                    //endregion
                                    sharedPlace.gameEnd = 0 ;
                                    sharedPlace.setNpc(murray);
                                    sharedPlace.setPlayer(pl);
                                    defenseSituation.setPlayerNpc(pl,murray);
                                    NpcDefense npcDefense = new NpcDefense(sharedPlace,murray,pl);
                                    MyAttack myAttack = new MyAttack(sharedPlace,murray,mainWait,pl);
                                    Thread gameTimeThread = new Thread(new Runnable() {
                                            @Override
                                            public void run() {
                                                sharedPlace.stopGameTime();
                                            }
                                        });
                                    gameTimeThread.start();
                                    GameStart :
                                    while(murray.myScore < 15 && pl.myScore < 15){

                                        switch (pl.turn){
                                            //자말 머레이 공격권
                                            case "자말 머레이" :
                                                //region 체력 및 파울 표시
                                                try{Thread.sleep(1500);
                                                }catch(Exception e){}
                                                sharedPlace.reset();
                                                if(sharedPlace.gameEnd == 1){ break GameStart;}
                                                SharedPlace.attackTime = 14;
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("                                                                                                "+pl.myName + "         " + murray.myName+"\n");
                                                System.out.println("                                                                                                    "+pl.stamina + "                 " + murray.stamina+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}
                                                mention.gameInfo2(pl.myScore,murray.myScore,pl.foulCount,murray.foulCount);

                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}

                                                if(sharedPlace.gameEnd == 1){ break GameStart;}

                                                //region 체력 및 파울 표시
                                                pl.StaminaEffect();
                                                murray.StaminaEffect();
                                                if(pl.staminaEffectCount == 1 || pl.staminaEffectCount == 2 || pl.staminaEffectCount == 3 ||murray.staminaEffectCount == 1 || murray.staminaEffectCount == 2 || murray.staminaEffectCount == 3){
                                                    try{Thread.sleep(1000);
                                                    }catch(Exception e){}
                                                }

                                                //endregion
                                                murrayAttack :
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
                                                    if(SharedPlace2.endCheck()){ break murrayAttack;}
                                                    mention.gameInfo(pl.myScore,murray.myScore,pl.foulCount,murray.foulCount);
                                                    pictureNpcTurn.line3CloseOpponent(murray);
                                                    System.out.println("\n                                                                                                "+murray.myName+"가 드리블을 시작했습니다.");
                                                    System.out.println("\n                                                                                              "+murray.myName+"가 3점 라인 근처까지 왔습니다.\n");
                                                    attackWay1 = "";
                                                    attackWay2 = "";
                                                    whoseTurn = "";
                                                    int defenseWay =-1;

                                                    Still :
                                                    while (true) {

                                                        //region 공격 시작
                                                        if(attackWay1.equals("Still") || attackWay2.equals("Still") || whoseTurn.equals("Still") ){
                                                            mention.gameInfo(pl.myScore,murray.myScore,pl.foulCount,murray.foulCount);
                                                            pictureNpcTurn.line3CloseOpponent(murray);
                                                        }

                                                        while(true){
                                                            try{
                                                                sharedPlace.playerDefenseWay = "0";
                                                                mention.SelectionMent("gameStart");
                            
                                                                Thread jdLine3Thread = new Thread(new Runnable(){
                            
                                                                    @Override
                                                                    public void run() {
                                                                        try{Thread.sleep(2000);
                                                                        }catch(Exception e){}
                                                                        if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                            int randNumber = rand.nextInt(3) + 1;
                                                                            if(SharedPlace2.endCheck()){return;}
                                                                            SharedPlace2.attackTimeReset1();
                                                                            if(randNumber == 1){
                                                                                String result = defenseSituation.shooting(pl,murray,mention,sc,"3점슛","point3",1,"2",0,3,0);
                                                                            }else if(randNumber == 2){
                                                                                String result = defenseSituation.shooting(pl,murray,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                            }
                                                                        }
                                                                    }
                                                                });
                                                                jdLine3Thread.start();
                            
                                                                sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                try{ jdLine3Thread.join();
                                                                }catch(Exception e){}
                            
                                                                if(SharedPlace2.endCheck()){ break murrayAttack;}
                            
                            
                                                                if(!(sharedPlace.playerDefenseWay.equals("1") || sharedPlace.playerDefenseWay.equals("2"))){
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break murrayAttack;
                                                                    }
                                                                    System.out.println(errorMessage);
                                                                    try{Thread.sleep(500);
                                                                    }catch(Exception e){}
                                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break murrayAttack;
                                                                    }
                                                                    continue ;
                                                                }
                            
                                                                break;
                                                            }catch(Exception e){
                                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                    break murrayAttack;
                                                                }
                                                                System.out.println(errorMessage);
                                                                try{Thread.sleep(500);
                                                                }catch(Exception k){}
                                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                    break murrayAttack;
                                                                }
                                                                continue;
                                                            }
                                                        }
                            
                                                        if(SharedPlace2.endCheck()){ break murrayAttack;}

                                                        mention.gameInfo(pl.myScore,murray.myScore,pl.foulCount,murray.foulCount);
                                                        if(defenseWay == 1){
                                                            pictureNpcTurn.line3CloseOpponent(murray);
                                                        }else {
                                                            pictureNpcTurn.line3FarOpponent(murray);
                                                        }
                                                        //endregion
                                                        //머레이 3점라인 공격
                                                        int attackNumber = murray.AttackPhase1();
                                                        switch (attackNumber) {
                                                            //region 돌파
                                                            case 0:
                                                                System.out.println("\n                                                                                               "+murray.myName+"이 돌파를 시도합니다.\n");

                                                                while(true){

                                                                    sharedPlace.playerDefenseWay = "0";
                                                                    mention.SelectionMent("penetration");
                            
                                                                    Thread jdLine3_1Thread = new Thread(new Runnable(){
                                                                        @Override
                                                                        public void run() {
                                                                            try{Thread.sleep(2000);
                                                                            }catch(Exception e){}
                                                                            if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                                if(SharedPlace2.endCheck()){return;}
                                                                                SharedPlace2.attackTimeReset1();
                                                                                int randNumber = rand.nextInt(2) + 1;
                                                                                if(randNumber == 1){
                                                                                    String result = defenseSituation.shooting(pl,murray,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                                }
                                                                            }
                                                                        }
                                                                    });
                                                                    jdLine3_1Thread.start();
                            
                                                                    sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                    try{ jdLine3_1Thread.join();
                                                                    }catch(Exception e){}
                            
                                                                    if(SharedPlace2.endCheck()){ break murrayAttack;}
                            
                                                                    if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2") ||sharedPlace.playerDefenseWay.equals("3")){
                                                                        break;
                                                                    }else {
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break murrayAttack;
                                                                        }
                                                                        System.out.println(errorMessage);
                                                                        try{Thread.sleep(500);
                                                                        }catch(Exception e){}
                                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break murrayAttack;
                                                                        }
                                                                        continue ;
                                                                    }
                                                                }

                                                                if (sharedPlace.playerDefenseWay.equals("1")) {
                                                                    attackWay1 = defenseSituation.penetration(pl, murray, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 1, defenseWay);
                                                                } else {
                                                                    attackWay1 = defenseSituation.penetration(pl, murray, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 0, defenseWay);
                                                                }

                                                                if (attackWay1.equals("Still")) {
                                                                    continue Still;
                                                                }else if (attackWay1.equals("End Turn")) {
                                                                    break murrayAttack;
                                                                }else if(attackWay1.equals("Restart")){
                                                                    continue murrayAttack;
                                                                }
                                                                break;
                                                            //endregion
                                                            //region 3점 슈팅 or 훼이크
                                                            case 1:
                                                                whoseTurn = "";
                                                                while (true) {
                                                                    int shootOrFake = murray.ShootOrFake();
                                                                    if(whoseTurn.equals("Still")){
                                                                        mention.gameInfo(pl.myScore,murray.myScore,pl.foulCount,murray.foulCount);
                                                                        pictureNpcTurn.line3CloseOpponent(murray);
                                                                    }

                                                                    System.out.println("\n                                                                                               "+murray.myName+"이 슛 모션을 취합니다.\n");
                                                                    while(true){
                                                                        sharedPlace.playerDefenseWay = "0";
                                                                        mention.SelectionMent("shooting");

                                                                        Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                            @Override
                                                                            public void run() {
                                                                                try{Thread.sleep(2000);
                                                                                }catch(Exception e){}
                                                                                if(sharedPlace.playerDefenseWay.equals("0")){

                                                                                    if(SharedPlace2.endCheck()){ return ;}
                                                                                    SharedPlace2.attackTimeReset1();
                                                                                    int randNumber = rand.nextInt(2) + 1;

                                                                                    String result = defenseSituation.shooting(pl,murray,mention,sc,"3점슛","point3",1,"2",0,3,0);

                                                                                }
                                                                            }
                                                                        });
                                                                        jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                        jdLine3_2Thread.start();


                                                                        sharedPlace.playerDefenseWay = sc.nextLine();

                                                                        try{jdLine3_2Thread.join();
                                                                        }catch(Exception e){}

                                                                        if(SharedPlace2.endCheck()){ break murrayAttack;}

                                                                        if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                            break;
                                                                        }else {
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break murrayAttack;
                                                                            }
                                                                            System.out.println(errorMessage);
                                                                            try{Thread.sleep(500);
                                                                            }catch(Exception e){}
                                                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break murrayAttack;
                                                                            }
                                                                            continue ;
                                                                        }
                                                                    }

                                                                    whoseTurn = defenseSituation.shooting(pl, murray, mention, sc, "3점슛", "point3", shootOrFake, sharedPlace.playerDefenseWay, 1, 3,1);

                                                                    if (whoseTurn.equals("Still")) {
                                                                        continue;
                                                                    } else if (whoseTurn.equals("End Turn")) {
                                                                        break murrayAttack;
                                                                    }else if(whoseTurn.equals("Restart")){
                                                                        continue murrayAttack;
                                                                    }else if(whoseTurn.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }
                                                                }
                                                                //endregion

                                                        }

                                                        //머레이 자유투 라인 공격
                                                        //region 자유투 라인 공격 - 머레이가 완전히 돌파했을 때
                                                        if (attackWay1.equals("Fully Penetration")) {

                                                            whoseTurn = defenseSituation.shooting(pl, murray, mention, sc, "골밑슛", "underRim", 1, "2", 0, 2,0);

                                                            if(whoseTurn.equals("GameEnd")){
                                                                break GameStart;
                                                            }
                                                            break murrayAttack;

                                                        }
                                                        //endregion
                                                        //region 자유투라인 공격 - 머레이가 완전히 돌파하지 못했을 때(내가 쫓아갈 때)
                                                        if (attackWay1.equals("Half Penetration")) {
                                                            int point2OrPene = rand.nextInt(2) + 1 ;

                                                            //2점 슛
                                                            if (point2OrPene == 1) {
                                                                whoseTurn = "";
                                                                while (true) {
                                                                    int shootOrFake = murray.ShootOrFake();
                                                                    mention.gameInfo(pl.myScore,murray.myScore,pl.foulCount,murray.foulCount);
                                                                    pictureNpcTurn.freethrowWithOpponent(murray);
                                                                    if (whoseTurn == "Still") {
                                                                        System.out.println("\n                                                                                              "+murray.myName+"이 다시 슛 모션을 취합니다.\n");
                                                                    } else {
                                                                        System.out.println("\n                                                                                          "+murray.myName+"이 자유투 라인 부근에서 슛 모션을 취합니다.\n");
                                                                    }
                                                                    while(true){
                                                                        sharedPlace.playerDefenseWay = "0";
                                                                        mention.SelectionMent("shooting");

                                                                        Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                            @Override
                                                                            public void run() {
                                                                                try{Thread.sleep(2000);
                                                                                }catch(Exception e){}
                                                                                if(sharedPlace.playerDefenseWay.equals("0")){

                                                                                    if(SharedPlace2.endCheck()){ return ;}
                                                                                    SharedPlace2.attackTimeReset1();
                                                                                    int randNumber = rand.nextInt(2) + 1;

                                                                                    String result = defenseSituation.shooting(pl,murray,mention,sc,"2점슛","point2",1,"2",0,2,0);

                                                                                }
                                                                            }
                                                                        });
                                                                        jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                        jdLine3_2Thread.start();


                                                                        sharedPlace.playerDefenseWay = sc.nextLine();

                                                                        try{jdLine3_2Thread.join();
                                                                        }catch(Exception e){}

                                                                        if(SharedPlace2.endCheck()){ break murrayAttack;}

                                                                        if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                            break;
                                                                        }else {
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break murrayAttack;
                                                                            }
                                                                            System.out.println(errorMessage);
                                                                            try{Thread.sleep(500);
                                                                            }catch(Exception e){}
                                                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break murrayAttack;
                                                                            }
                                                                            continue ;
                                                                        }
                                                                    }

                                                                    whoseTurn = defenseSituation.shooting(pl, murray, mention, sc, "2점슛", "point2", shootOrFake, sharedPlace.playerDefenseWay, 1, 2,1);

                                                                    if (whoseTurn.equals("Still")) {
                                                                        continue ;
                                                                    } else if (whoseTurn.equals("End Turn")) {
                                                                        break murrayAttack;
                                                                    }else if(whoseTurn.equals("Restart")){
                                                                        continue murrayAttack;
                                                                    }else if(whoseTurn.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }

                                                                }

                                                                //계속 돌파할 때
                                                            } else if (point2OrPene == 2) {
                                                                mention.gameInfo(pl.myScore,murray.myScore,pl.foulCount,murray.foulCount);
                                                                pictureNpcTurn.freethrowWithOpponent(murray);
                                                                System.out.println("\n                                                                                          "+murray.myName+"이 자유투 라인 부근을 지나 계속 돌파합니다.\n");
                                                                 while(true){
                                                                    sharedPlace.playerDefenseWay = "0";
                                                                    mention.SelectionMent("penetration");
                            
                                                                    Thread jdLine2_2Thread = new Thread(new Runnable(){
                                                                        @Override
                                                                        public void run() {
                                                                            try{Thread.sleep(2000);
                                                                            }catch(Exception e){}
                                                                            if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                                if(SharedPlace2.endCheck()){return;}
                                                                                SharedPlace2.attackTimeReset1();
                                                                                int randNumber = rand.nextInt(2) + 1;
                                                                                if(randNumber == 1){
                                                                                    String result = defenseSituation.shooting(pl,murray,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                                }
                                                                            }
                                                                        }
                                                                    });
                                                                    jdLine2_2Thread.start();
                            
                                                                    sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                    try{ jdLine2_2Thread.join();
                                                                    }catch(Exception e){}
                            
                                                                    if(SharedPlace2.endCheck()){ break murrayAttack;}
                            
                                                                    if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")||sharedPlace.playerDefenseWay.equals("3")){
                                                                        break;
                                                                    }else {
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break murrayAttack;
                                                                        }
                                                                        System.out.println(errorMessage);
                                                                        try{Thread.sleep(500);
                                                                        }catch(Exception e){}
                                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break murrayAttack;
                                                                        }
                                                                        continue ;
                                                                    }
                                                                }

                                                                if (sharedPlace.playerDefenseWay.equals("4")) {
                                                                    whoseTurn = defenseSituation.shooting(pl, murray, mention, sc, "골밑슛", "underRim", 1, "2", 0, 2,0);

                                                                    if(whoseTurn.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }
                                                                    break murrayAttack;

                                                                } else {
                                                                    if (sharedPlace.playerDefenseWay.equals("1")) {
                                                                        attackWay2 = defenseSituation.penetration(pl, murray, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 1, 0);
                                                                    } else {
                                                                        attackWay2 = defenseSituation.penetration(pl, murray, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 0, 0);
                                                                    }

                                                                    if (attackWay2.equals("Still")) {
                                                                        continue Still;
                                                                    } else if (attackWay2.equals("End Turn")) {
                                                                        break murrayAttack;
                                                                    }else if(attackWay2.equals("Restart")){
                                                                        continue murrayAttack;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        //endregion

                                                        //머레이 골 밑 공격
                                                        //region 레이업 or 더블 클러치
                                                        if (attackWay2.equals("Half Penetration")) {

                                                            whoseTurn = "";
                                                            while (true) {
                                                                int shootOrFake = murray.ShootOrFake();
                                                                mention.gameInfo(pl.myScore,murray.myScore,pl.foulCount,murray.foulCount);
                                                                pictureNpcTurn.underRimwWithOpponent(murray);
                                                                if (whoseTurn == "Still") {
                                                                    System.out.println("\n                                                                                              "+murray.myName+"이 다시 슛 모션을 취합니다.\n");
                                                                } else {
                                                                    System.out.println("\n                                                                                             "+murray.myName+"이 골밑에서 슛 모션을 취합니다.\n");
                                                                }
                                                                while(true){
                                                                    sharedPlace.playerDefenseWay = "0";
                                                                    mention.SelectionMent("shooting");

                                                                    Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                        @Override
                                                                        public void run() {
                                                                            try{Thread.sleep(2000);
                                                                            }catch(Exception e){}
                                                                            if(sharedPlace.playerDefenseWay.equals("0")){

                                                                                if(SharedPlace2.endCheck()){ return ;}
                                                                                SharedPlace2.attackTimeReset1();
                                                                                int randNumber = rand.nextInt(2) + 1;

                                                                                String result = defenseSituation.shooting(pl,murray,mention,sc,"골밑슛","underRim",1,"2",0,2,0);

                                                                            }
                                                                        }
                                                                    });
                                                                    jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                    jdLine3_2Thread.start();


                                                                    sharedPlace.playerDefenseWay = sc.nextLine();

                                                                    try{jdLine3_2Thread.join();
                                                                    }catch(Exception e){}

                                                                    if(SharedPlace2.endCheck()){ break murrayAttack;}

                                                                    if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                        break;
                                                                    }else {
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break murrayAttack;
                                                                        }
                                                                        System.out.println(errorMessage);
                                                                        try{Thread.sleep(500);
                                                                        }catch(Exception e){}
                                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break murrayAttack;
                                                                        }
                                                                        continue ;
                                                                    }
                                                                }

                                                                whoseTurn = defenseSituation.shooting(pl, murray, mention, sc, "골밑슛", "underRim", shootOrFake, sharedPlace.playerDefenseWay, 1, 2,1);

                                                                if (whoseTurn.equals("Still")) {
                                                                    continue ;
                                                                } else if (whoseTurn.equals("End Turn")) {
                                                                    break murrayAttack;
                                                                }else if(whoseTurn.equals("Restart")){
                                                                    continue murrayAttack;
                                                                }else if(whoseTurn.equals("GameEnd")){
                                                                    break GameStart;
                                                                }

                                                            }
                                                        }
                                                        //endregion

                                                    }
                                                }
                                            //플레이어 공격권
                                            case "player" :
                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("                                                                                                "+pl.myName + "         " + murray.myName
                                                        +"\n");
                                                System.out.println("                                                                                                    "+pl.stamina + "               " + murray.stamina+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                sharedPlace.reset();
                                                pl.FailCountZero();
                                                if(sharedPlace.gameEnd == 1){ break GameStart;}

                                                //하프라인 시작
                                                Thread myAttackThread = new Thread(myAttack,"myAttackThread");
                                                StateCheckThread stateCheck = new StateCheckThread(myAttackThread);
                                                Thread stateCheckThread = new Thread(stateCheck,"stateCheckThread");
                                                myAttackThread.start();
                                                stateCheckThread.start();
                                                mainWait.waitMain();
                                                sharedPlace.attackEnd = 1;
                                                pl.turn = murray.myName;


                                                //region 체력 및 파울 표시

                                        }
                                    }
                                    SharedPlace.gameEnd = 1;
                                    mainWait.notifyMain();
                                    sharedPlace.notifyNpc();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          최종 점수\n");
                                    System.out.println("                                                                                               "+pl.myName + "  "+pl.myScore+ " : "+murray.myScore+"  "+murray.myName+"\n");
                                    if(pl.myScore > 14){
                                        System.out.println("                                                                                                【 승리 】             【 패배 】\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        if(pl.basketBallLevel <murray.basketBallLevel){
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                 농구 경험치가 20 상승했습니다.\n");
                                        pl.basketBallLevel = pl.basketBallLevel + 20;
                                        if(pl.doPoint3 == 1){
                                            System.out.println("\n                                                                                                 3점슛 능력치가 10 상승했습니다.\n");
                                            pl.point3AbilityFixed = pl.point3AbilityFixed + 10;
                                        }
                                        if(pl.doPoint2 == 1){
                                            pl.point2AbilityFixed = pl.point2AbilityFixed + 10;
                                            System.out.println("\n                                                                                                 2점슛 능력치가 10 상승했습니다.\n");
                                        }
                                        if(pl.doUnderRim == 1){
                                            pl.underRim2AbilityFixed = pl.underRim2AbilityFixed + 10;
                                            System.out.println("\n                                                                                                 골밑슛 능력치가 10 상승했습니다.\n");
                                        }
                                        System.out.println("\n                                                                                                 볼핸들링 능력치가 10 상승했습니다.\n");
                                        System.out.println("\n                                                                                                 자유투 능력치가 10 상승했습니다.\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        pl.ballHandlingFixed = pl.ballHandlingFixed + 10;
                                        pl.freeThrowAbilityFixed = pl.freeThrowAbilityFixed + 10;
                                        }else {
                                        System.out.println("\n                                                                                        농구 경험치가 낮아 더 이상 능력치가 오르지 않습니다.\n");
                                        System.out.println("\n                                                                                자신보다 경험이 더 많은 상대와 경기하면 농구 경험치를 얻을 수 있습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        }


                                    }else if(murray.myScore > 14) {
                                        System.out.println("                                                                                                【 패배 】             【 승리 】\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                    }

                                    pl.AfterGameInitialize();
                                    murray.AfterGameInitialize();
                                    murray.StaminaInitialize();


                                    break;
                                }else if(select.equals("B코트")||select.equals("b코트")||select.equals("B")||select.equals("b")){

                                    young.InitializeStat();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                         ENTER키를 누르면 트레이 영과의 경기가 시작됩니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    sc.nextLine();
                                    mention.IntroductionMent(pl,young);
                                    sc.nextLine();
                                    mention.RuleMent();
                                    sc.nextLine();
                                    sc.nextLine();
                                    sharedPlace.setPlayer(pl);
                                    sharedPlace.setNpc(young);
                                    //region 자유투로 순서 정하기 - 트레이 영
                                        while(true){
                                            String freethrowyoung = young.FreeThrow();
                                            String freethrowMine = pl.FreeThrow();
                                            if(freethrowyoung.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  "+young.myName+"이 자유투를 시도합니다.\n");
                                                System.out.println("\n                                                                                                 "+young.myName+"의 자유투는 성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }else {
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  "+young.myName+"이 자유투를 시도합니다.\n");
                                                System.out.println("\n                                                                                                 "+young.myName+"의 자유투는 실패하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }
                                            sc.nextLine();
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                       "+pl.myName+"의 차례입니다.\n");
                                                System.out.println("\n                                                                                                 자유투를 던지려면 ENTER키를 눌러주세요\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            sc.nextLine();
                                            if(freethrowMine.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          자유투를 던집니다.\n");
                                                System.out.println("\n                                                                                                 "+pl.myName+"의 자유투는 성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }else {
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          자유투를 던집니다.\n");
                                                System.out.println("\n                                                                                                 "+pl.myName+"의 자유투는 실패하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                                            }
                                            sc.nextLine();
                                            young.InitializeScore();
                                            pl.InitializeScore();

                                            if(freethrowyoung.equals("1")&&freethrowMine.equals("0")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                    "+young.myName+"의 선공으로 시작합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+
                                                                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기시작" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                pl.turn = young.myName;
                                                sc.nextLine();
                                                break;
                                            }else if(freethrowyoung.equals("0")&&freethrowMine.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                   " +userName + "의 선공으로 시작합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                sc.nextLine();
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기시작" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                pl.turn = "player";
                                                sc.nextLine();
                                                break;
                                            }
                                        }

                                    //endregion
                                    sharedPlace.gameEnd = 0 ;
                                    sharedPlace.setNpc(young);
                                    sharedPlace.setPlayer(pl);
                                    defenseSituation.setPlayerNpc(pl,young);
                                    MyAttack myAttack = new MyAttack(sharedPlace,young,mainWait,pl);
                                    Thread gameTimeThread = new Thread(new Runnable() {
                                            @Override
                                            public void run() {
                                                sharedPlace.stopGameTime();
                                            }
                                        });
                                    gameTimeThread.start();
                                    GameStart :
                                    while(young.myScore < 15 && pl.myScore < 15){

                                        switch (pl.turn){
                                            //트레이 영 공격권
                                            case "트레이 영" :
                                                //region 체력 및 파울 표시
                                                try{Thread.sleep(1500);
                                                }catch(Exception e){}
                                                sharedPlace.reset();
                                                if(sharedPlace.gameEnd == 1){ break GameStart;}
                                                SharedPlace.attackTime = 14;
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("                                                                                                "+pl.myName + "         " + young.myName+"\n");
                                                System.out.println("                                                                                                    "+pl.stamina + "                 " + young.stamina+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}
                                                mention.gameInfo2(pl.myScore,young.myScore,pl.foulCount,young.foulCount);

                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}

                                                if(sharedPlace.gameEnd == 1){ break GameStart;}

                                                //region 체력 및 파울 표시
                                                pl.StaminaEffect();
                                                young.StaminaEffect();
                                                if(pl.staminaEffectCount == 1 || pl.staminaEffectCount == 2 || pl.staminaEffectCount == 3 ||young.staminaEffectCount == 1 || young.staminaEffectCount == 2 || young.staminaEffectCount == 3){
                                                    try{Thread.sleep(1000);
                                                    }catch(Exception e){}
                                                }

                                                //endregion
                                                youngAttack :
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
                                                    if(SharedPlace2.endCheck()){ break youngAttack;}
                                                    mention.gameInfo(pl.myScore,young.myScore,pl.foulCount,young.foulCount);
                                                    pictureNpcTurn.line3CloseOpponent(young);
                                                    System.out.println("\n                                                                                                "+young.myName+"이 드리블을 시작했습니다.");
                                                    System.out.println("\n                                                                                              "+young.myName+"이 3점 라인 근처까지 왔습니다.\n");
                                                    attackWay1 = "";
                                                    attackWay2 = "";
                                                    whoseTurn = "";
                                                    int defenseWay =-1;

                                                    Still :
                                                    while (true) {

                                                        //region 공격 시작
                                                        if(attackWay1.equals("Still") || attackWay2.equals("Still") || whoseTurn.equals("Still") ){
                                                            mention.gameInfo(pl.myScore,young.myScore,pl.foulCount,young.foulCount);
                                                            pictureNpcTurn.line3CloseOpponent(young);
                                                        }

                                                        while(true){
                                                            try{
                                                                sharedPlace.playerDefenseWay = "0";
                                                                mention.SelectionMent("gameStart");
                            
                                                                Thread jdLine3Thread = new Thread(new Runnable(){
                            
                                                                    @Override
                                                                    public void run() {
                                                                        try{Thread.sleep(2000);
                                                                        }catch(Exception e){}
                                                                        if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                            int randNumber = rand.nextInt(3) + 1;
                                                                            if(SharedPlace2.endCheck()){return;}
                                                                            SharedPlace2.attackTimeReset1();
                                                                            if(randNumber == 1){
                                                                                String result = defenseSituation.shooting(pl,young,mention,sc,"3점슛","point3",1,"2",0,3,0);
                                                                            }else if(randNumber == 2){
                                                                                String result = defenseSituation.shooting(pl,young,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                            }
                                                                        }
                                                                    }
                                                                });
                                                                jdLine3Thread.start();
                            
                                                                sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                try{ jdLine3Thread.join();
                                                                }catch(Exception e){}
                            
                                                                if(SharedPlace2.endCheck()){ break youngAttack;}
                            
                            
                                                                if(!(sharedPlace.playerDefenseWay.equals("1") || sharedPlace.playerDefenseWay.equals("2"))){
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break youngAttack;
                                                                    }
                                                                    System.out.println(errorMessage);
                                                                    try{Thread.sleep(500);
                                                                    }catch(Exception e){}
                                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break youngAttack;
                                                                    }
                                                                    continue ;
                                                                }
                            
                                                                break;
                                                            }catch(Exception e){
                                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                    break youngAttack;
                                                                }
                                                                System.out.println(errorMessage);
                                                                try{Thread.sleep(500);
                                                                }catch(Exception k){}
                                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                    break youngAttack;
                                                                }
                                                                continue;
                                                            }
                                                        }
                            
                                                        if(SharedPlace2.endCheck()){ break youngAttack;}


                                                        mention.gameInfo(pl.myScore,young.myScore,pl.foulCount,young.foulCount);
                                                        if(defenseWay == 1){
                                                            pictureNpcTurn.line3CloseOpponent(young);
                                                        }else {
                                                            pictureNpcTurn.line3FarOpponent(young);
                                                        }
                                                        //endregion
                                                        //영 3점라인 공격
                                                        int attackNumber = young.AttackPhase1();
                                                        switch (attackNumber) {
                                                            //region 돌파 or 크로스오버
                                                            case 0:
                                                                System.out.println("\n                                                                                               "+young.myName+"이 돌파를 시도합니다.\n");

                                                                while(true){

                                                                    sharedPlace.playerDefenseWay = "0";
                                                                    mention.SelectionMent("penetration");
                            
                                                                    Thread jdLine3_1Thread = new Thread(new Runnable(){
                                                                        @Override
                                                                        public void run() {
                                                                            try{Thread.sleep(2000);
                                                                            }catch(Exception e){}
                                                                            if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                                if(SharedPlace2.endCheck()){return;}
                                                                                SharedPlace2.attackTimeReset1();
                                                                                int randNumber = rand.nextInt(2) + 1;
                                                                                if(randNumber == 1){
                                                                                    String result = defenseSituation.shooting(pl,young,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                                }
                                                                            }
                                                                        }
                                                                    });
                                                                    jdLine3_1Thread.start();
                            
                                                                    sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                    try{ jdLine3_1Thread.join();
                                                                    }catch(Exception e){}
                            
                                                                    if(SharedPlace2.endCheck()){ break youngAttack;}
                            
                                                                    if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2") ||sharedPlace.playerDefenseWay.equals("3")){
                                                                        break;
                                                                    }else {
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break youngAttack;
                                                                        }
                                                                        System.out.println(errorMessage);
                                                                        try{Thread.sleep(500);
                                                                        }catch(Exception e){}
                                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break youngAttack;
                                                                        }
                                                                        continue ;
                                                                    }
                                                                }

                                                                if (sharedPlace.playerDefenseWay.equals("1")) {
                                                                    attackWay1 = defenseSituation.penetration(pl, young, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 1, defenseWay);
                                                                } else {
                                                                    attackWay1 = defenseSituation.penetration(pl, young, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 0, defenseWay);
                                                                }

                                                                if (attackWay1.equals("Still")) {
                                                                    continue Still;
                                                                }else if (attackWay1.equals("End Turn")) {
                                                                    break youngAttack;
                                                                }else if(attackWay1.equals("Restart")){
                                                                    continue youngAttack;
                                                                }
                                                                break;
                                                            //endregion
                                                            //region 3점 슈팅 or 훼이크
                                                            case 1:
                                                                whoseTurn = "";
                                                                while (true) {
                                                                    int shootOrFake = young.ShootOrFake();
                                                                    if(whoseTurn.equals("Still")){
                                                                        mention.gameInfo(pl.myScore,young.myScore,pl.foulCount,young.foulCount);
                                                                        pictureNpcTurn.line3CloseOpponent(young);
                                                                    }

                                                                    System.out.println("\n                                                                                               "+young.myName+"이 슛 모션을 취합니다.\n");
                                                                    while(true){
                                                                        sharedPlace.playerDefenseWay = "0";
                                                                        mention.SelectionMent("shooting");

                                                                        Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                            @Override
                                                                            public void run() {
                                                                                try{Thread.sleep(2000);
                                                                                }catch(Exception e){}
                                                                                if(sharedPlace.playerDefenseWay.equals("0")){

                                                                                    if(SharedPlace2.endCheck()){ return ;}
                                                                                    SharedPlace2.attackTimeReset1();
                                                                                    int randNumber = rand.nextInt(2) + 1;

                                                                                    String result = defenseSituation.shooting(pl,young,mention,sc,"3점슛","point3",1,"2",0,3,0);

                                                                                }
                                                                            }
                                                                        });
                                                                        jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                        jdLine3_2Thread.start();


                                                                        sharedPlace.playerDefenseWay = sc.nextLine();

                                                                        try{jdLine3_2Thread.join();
                                                                        }catch(Exception e){}

                                                                        if(SharedPlace2.endCheck()){ break youngAttack;}

                                                                        if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                            break;
                                                                        }else {
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break youngAttack;
                                                                            }
                                                                            System.out.println(errorMessage);
                                                                            try{Thread.sleep(500);
                                                                            }catch(Exception e){}
                                                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break youngAttack;
                                                                            }
                                                                            continue ;
                                                                        }
                                                                    }

                                                                    whoseTurn = defenseSituation.shooting(pl, young, mention, sc, "3점슛", "point3", shootOrFake, sharedPlace.playerDefenseWay, 1, 3,1);

                                                                    if (whoseTurn.equals("Still")) {
                                                                        continue;
                                                                    } else if (whoseTurn.equals("End Turn")) {
                                                                        break youngAttack;
                                                                    }else if(whoseTurn.equals("Restart")){
                                                                        continue youngAttack;
                                                                    }else if(whoseTurn.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }
                                                                }
                                                                //endregion

                                                        }

                                                        //영 자유투 라인 공격
                                                        //region 자유투 라인 공격 - 영이 완전히 돌파했을 때
                                                        if (attackWay1.equals("Fully Penetration")) {

                                                            whoseTurn = defenseSituation.shooting(pl, young, mention, sc, "[레이업]", "layUp", 1, "2", 0, 2,0);

                                                            if(whoseTurn.equals("GameEnd")){
                                                                break GameStart;
                                                            }
                                                            break youngAttack;

                                                        }
                                                        //endregion
                                                        //region 자유투라인 공격 - 영이 완전히 돌파하지 못했을 때(내가 쫓아갈 때)
                                                        if (attackWay1.equals("Half Penetration")) {
                                                            int point2OrPene = rand.nextInt(2) + 1 ;

                                                            //2점 슛
                                                            if (point2OrPene == 1) {
                                                                whoseTurn = "";
                                                                while (true) {
                                                                    int shootOrFake = young.ShootOrFake();
                                                                    mention.gameInfo(pl.myScore,young.myScore,pl.foulCount,young.foulCount);
                                                                    pictureNpcTurn.freethrowWithOpponent(young);
                                                                    if (whoseTurn == "Still") {
                                                                        System.out.println("\n                                                                                              "+young.myName+"이 다시 슛 모션을 취합니다.\n");
                                                                    } else {
                                                                        System.out.println("\n                                                                                          "+young.myName+"이 자유투 라인 부근에서 슛 모션을 취합니다.\n");
                                                                    }
                                                                    while(true){
                                                                        sharedPlace.playerDefenseWay = "0";
                                                                        mention.SelectionMent("shooting");

                                                                        Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                            @Override
                                                                            public void run() {
                                                                                try{Thread.sleep(2000);
                                                                                }catch(Exception e){}
                                                                                if(sharedPlace.playerDefenseWay.equals("0")){

                                                                                    if(SharedPlace2.endCheck()){ return ;}
                                                                                    SharedPlace2.attackTimeReset1();
                                                                                    int randNumber = rand.nextInt(2) + 1;

                                                                                    String result = defenseSituation.shooting(pl,young,mention,sc,"2점슛","point2",1,"2",0,2,0);

                                                                                }
                                                                            }
                                                                        });
                                                                        jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                        jdLine3_2Thread.start();


                                                                        sharedPlace.playerDefenseWay = sc.nextLine();

                                                                        try{jdLine3_2Thread.join();
                                                                        }catch(Exception e){}

                                                                        if(SharedPlace2.endCheck()){ break youngAttack;}

                                                                        if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                            break;
                                                                        }else {
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break youngAttack;
                                                                            }
                                                                            System.out.println(errorMessage);
                                                                            try{Thread.sleep(500);
                                                                            }catch(Exception e){}
                                                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break youngAttack;
                                                                            }
                                                                            continue ;
                                                                        }
                                                                    }

                                                                    whoseTurn = defenseSituation.shooting(pl, young, mention, sc, "2점슛", "point2", shootOrFake, sharedPlace.playerDefenseWay, 1, 2,1);

                                                                    if (whoseTurn.equals("Still")) {
                                                                        continue ;
                                                                    } else if (whoseTurn.equals("End Turn")) {
                                                                        break youngAttack;
                                                                    }else if(whoseTurn.equals("Restart")){
                                                                        continue youngAttack;
                                                                    }else if(whoseTurn.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }

                                                                }

                                                                //계속 돌파할 때
                                                            } else if (point2OrPene == 2) {
                                                                mention.gameInfo(pl.myScore,young.myScore,pl.foulCount,young.foulCount);
                                                                pictureNpcTurn.freethrowWithOpponent(young);
                                                                System.out.println("\n                                                                                          "+young.myName+"이 자유투 라인 부근을 지나 계속 돌파합니다.\n");
                                                                 while(true){
                                                                    sharedPlace.playerDefenseWay = "0";
                                                                    mention.SelectionMent("penetration");
                            
                                                                    Thread jdLine2_2Thread = new Thread(new Runnable(){
                                                                        @Override
                                                                        public void run() {
                                                                            try{Thread.sleep(2000);
                                                                            }catch(Exception e){}
                                                                            if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                                if(SharedPlace2.endCheck()){return;}
                                                                                SharedPlace2.attackTimeReset1();
                                                                                int randNumber = rand.nextInt(2) + 1;
                                                                                if(randNumber == 1){
                                                                                    String result = defenseSituation.shooting(pl,young,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                                }
                                                                            }
                                                                        }
                                                                    });
                                                                    jdLine2_2Thread.start();
                            
                                                                    sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                    try{ jdLine2_2Thread.join();
                                                                    }catch(Exception e){}
                            
                                                                    if(SharedPlace2.endCheck()){ break youngAttack;}
                            
                                                                    if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")||sharedPlace.playerDefenseWay.equals("3")){
                                                                        break;
                                                                    }else {
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break youngAttack;
                                                                        }
                                                                        System.out.println(errorMessage);
                                                                        try{Thread.sleep(500);
                                                                        }catch(Exception e){}
                                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break youngAttack;
                                                                        }
                                                                        continue ;
                                                                    }
                                                                }

                                                                if (sharedPlace.playerDefenseWay.equals("4")) {
                                                                    whoseTurn = defenseSituation.shooting(pl, young, mention, sc, "[레이업]", "layUp", 1, "2", 0, 2,0);

                                                                    if(whoseTurn.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }
                                                                    break youngAttack;

                                                                } else {
                                                                    if (sharedPlace.playerDefenseWay.equals("1")) {
                                                                        attackWay2 = defenseSituation.penetration(pl, young, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 1, 0);
                                                                    } else {
                                                                        attackWay2 = defenseSituation.penetration(pl, young, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 0, 0);
                                                                    }

                                                                    if (attackWay2.equals("Still")) {
                                                                        continue Still;
                                                                    } else if (attackWay2.equals("End Turn")) {
                                                                        break youngAttack;
                                                                    }else if(attackWay2.equals("Restart")){
                                                                        continue youngAttack;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        //endregion

                                                        //영 골 밑 공격
                                                        //region 레이업 or 더블 클러치
                                                        if (attackWay2.equals("Half Penetration")) {
                                                            whoseTurn = "";
                                                            int shootOrFake = young.ShootOrFake();
                                                            mention.gameInfo(pl.myScore,young.myScore,pl.foulCount,young.foulCount);
                                                            pictureNpcTurn.underRimwWithOpponent(young);
                                                            System.out.println("\n                                                                                            "+young.myName+"이 스텝을 밟고 [레이업]을 올라갔습니다.\n");

                                                             while(true){
                                                                sharedPlace.playerDefenseWay = "0";
                                                                mention.SelectionMent("shooting");

                                                                Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                    @Override
                                                                    public void run() {
                                                                        try{Thread.sleep(2000);
                                                                        }catch(Exception e){}
                                                                        if(sharedPlace.playerDefenseWay.equals("0")){

                                                                            if(SharedPlace2.endCheck()){ return ;}
                                                                            SharedPlace2.attackTimeReset1();
                                                                            int randNumber = rand.nextInt(2) + 1;

                                                                            String result = defenseSituation.shooting(pl,jd,mention,sc,"[레이업]","layUp",1,"2",0,2,0);

                                                                        }
                                                                    }
                                                                });
                                                                jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                jdLine3_2Thread.start();


                                                                sharedPlace.playerDefenseWay = sc.nextLine();

                                                                try{jdLine3_2Thread.join();
                                                                }catch(Exception e){}

                                                                if(SharedPlace2.endCheck()){ break youngAttack;}

                                                                if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                    break;
                                                                }else {
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break youngAttack;
                                                                    }
                                                                    System.out.println(errorMessage);
                                                                    try{Thread.sleep(500);
                                                                    }catch(Exception e){}
                                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break youngAttack;
                                                                    }
                                                                    continue ;
                                                                }
                                                            }

                                                             whoseTurn = defenseSituation.shooting(pl, young, mention, sc, "[레이업]", "layUp", 1, sharedPlace.playerDefenseWay, 1, 2,1);

                                                            if(whoseTurn.equals("GameEnd")){
                                                                break GameStart;
                                                            }
                                                            break youngAttack;
                                                        }
                                                        //endregion

                                                    }
                                                }
                                            //플레이어 공격권
                                            case "player" :
                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("                                                                                                "+pl.myName + "         " + young.myName
                                                        +"\n");
                                                System.out.println("                                                                                                    "+pl.stamina + "               " + young.stamina+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                sharedPlace.reset();
                                                pl.FailCountZero();
                                                if(sharedPlace.gameEnd == 1){ break GameStart;}

                                                //하프라인 시작
                                                Thread myAttackThread = new Thread(myAttack,"myAttackThread");
                                                StateCheckThread stateCheck = new StateCheckThread(myAttackThread);
                                                Thread stateCheckThread = new Thread(stateCheck,"stateCheckThread");
                                                myAttackThread.start();
                                                stateCheckThread.start();
                                                mainWait.waitMain();
                                                pl.turn = young.myName;


                                        }
                                    }
                                    SharedPlace.gameEnd = 1;
                                    mainWait.notifyMain();
                                    sharedPlace.notifyNpc();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          최종 점수\n");
                                    System.out.println("                                                                                               "+pl.myName + "  "+pl.myScore+ " : "+young.myScore+"  "+young.myName+"\n");
                                    if(pl.myScore > 14){
                                        System.out.println("                                                                                                【 승리 】             【 패배 】\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        if(pl.basketBallLevel <young.basketBallLevel){
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                 농구 경험치가 20 상승했습니다.\n");
                                        pl.basketBallLevel = pl.basketBallLevel + 20;
                                        if(pl.doPoint3 == 1){
                                            System.out.println("\n                                                                                                 3점슛 능력치가 10 상승했습니다.\n");
                                            pl.point3AbilityFixed = pl.point3AbilityFixed + 10;
                                        }
                                        if(pl.doPoint2 == 1){
                                            pl.point2AbilityFixed = pl.point2AbilityFixed + 10;
                                            System.out.println("\n                                                                                                 2점슛 능력치가 10 상승했습니다.\n");
                                        }
                                        if(pl.doUnderRim == 1){
                                            pl.underRim2AbilityFixed = pl.underRim2AbilityFixed + 10;
                                            System.out.println("\n                                                                                                 골밑슛 능력치가 10 상승했습니다.\n");
                                        }
                                        System.out.println("\n                                                                                                 볼핸들링 능력치가 10 상승했습니다.\n");
                                        System.out.println("\n                                                                                                 자유투 능력치가 10 상승했습니다.\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        pl.ballHandlingFixed = pl.ballHandlingFixed + 10;
                                        pl.freeThrowAbilityFixed = pl.freeThrowAbilityFixed + 10;
                                        }else {
                                        System.out.println("\n                                                                                        농구 경험치가 낮아 더 이상 능력치가 오르지 않습니다.\n");
                                        System.out.println("\n                                                                                자신보다 경험이 더 많은 상대와 경기하면 농구 경험치를 얻을 수 있습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        }


                                    }else if(young.myScore > 14) {
                                        System.out.println("                                                                                                【 패배 】             【 승리 】\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                    }

                                    pl.AfterGameInitialize();
                                    young.AfterGameInitialize();
                                    young.StaminaInitialize();


                                    break;
                                }else if(select.equals("C코트")||select.equals("c코트")||select.equals("C")||select.equals("c")){

                                    siakam.InitializeStat();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                       ENTER키를 누르면 파스칼 시아캄과의 경기가 시작됩니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    sc.nextLine();
                                    mention.IntroductionMent(pl,siakam);
                                    sc.nextLine();
                                    mention.RuleMent();
                                    sc.nextLine();
                                    sc.nextLine();
                                    sharedPlace.setPlayer(pl);
                                    sharedPlace.setNpc(siakam);
                                    //region 자유투로 순서 정하기 - 파스칼 시아캄
                                        while(true){
                                            String freethrowSiakam = siakam.FreeThrow();
                                            String freethrowMine = pl.FreeThrow();
                                            if(freethrowSiakam.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  "+siakam.myName+"이 자유투를 시도합니다.\n");
                                                System.out.println("\n                                                                                                 "+siakam.myName+"의 자유투는 성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }else {
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  "+siakam.myName+"이 자유투를 시도합니다.\n");
                                                System.out.println("\n                                                                                                 "+siakam.myName+"의 자유투는 실패하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }
                                            sc.nextLine();
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                       "+pl.myName+"의 차례입니다.\n");
                                                System.out.println("\n                                                                                                 자유투를 던지려면 ENTER키를 눌러주세요\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            sc.nextLine();
                                            if(freethrowMine.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          자유투를 던집니다.\n");
                                                System.out.println("\n                                                                                                 "+pl.myName+"의 자유투는 성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }else {
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          자유투를 던집니다.\n");
                                                System.out.println("\n                                                                                                 "+pl.myName+"의 자유투는 실패하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                                            }
                                            sc.nextLine();
                                            siakam.InitializeScore();
                                            pl.InitializeScore();

                                            if(freethrowSiakam.equals("1")&&freethrowMine.equals("0")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                    "+siakam.myName+"의 선공으로 시작합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+
                                                                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기시작" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                pl.turn = siakam.myName;
                                                sc.nextLine();
                                                break;
                                            }else if(freethrowSiakam.equals("0")&&freethrowMine.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                   " +userName + "의 선공으로 시작합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                sc.nextLine();
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기시작" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                pl.turn = "player";
                                                sc.nextLine();
                                                break;
                                            }
                                        }

                                    //endregion
                                    sharedPlace.gameEnd = 0 ;
                                    sharedPlace.setNpc(siakam);
                                    sharedPlace.setPlayer(pl);
                                    defenseSituation.setPlayerNpc(pl,siakam);
                                    MyAttack myAttack = new MyAttack(sharedPlace,siakam,mainWait,pl);
                                    Thread gameTimeThread = new Thread(new Runnable() {
                                            @Override
                                            public void run() {
                                                sharedPlace.stopGameTime();
                                            }
                                        });
                                    gameTimeThread.start();
                                    GameStart :
                                    while(siakam.myScore < 15 && pl.myScore < 15){

                                        switch (pl.turn){
                                            //파스칼 시아캄 공격권
                                            case "파스칼 시아캄" :
                                                //region 체력 및 파울 표시
                                                try{Thread.sleep(1500);
                                                }catch(Exception e){}
                                                sharedPlace.reset();
                                                if(sharedPlace.gameEnd == 1){ break GameStart;}
                                                SharedPlace.attackTime = 14;
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("                                                                                                "+pl.myName + "         " + siakam.myName+"\n");
                                                System.out.println("                                                                                                    "+pl.stamina + "                 " + siakam.stamina+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}
                                                mention.gameInfo2(pl.myScore,siakam.myScore,pl.foulCount,siakam.foulCount);

                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}

                                                if(sharedPlace.gameEnd == 1){ break GameStart;}

                                                //region 체력 및 파울 표시
                                                pl.StaminaEffect();
                                                siakam.StaminaEffect();
                                                if(pl.staminaEffectCount == 1 || pl.staminaEffectCount == 2 || pl.staminaEffectCount == 3 ||siakam.staminaEffectCount == 1 || siakam.staminaEffectCount == 2 || siakam.staminaEffectCount == 3){
                                                    try{Thread.sleep(1000);
                                                    }catch(Exception e){}
                                                }

                                                //endregion
                                                siakamAttack :
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
                                                    if(SharedPlace2.endCheck()){ break siakamAttack;}
                                                    mention.gameInfo(pl.myScore,siakam.myScore,pl.foulCount,siakam.foulCount);
                                                    pictureNpcTurn.line3CloseOpponent(siakam);
                                                    System.out.println("\n                                                                                                "+siakam.myName+"이 드리블을 시작했습니다.");
                                                    System.out.println("\n                                                                                              "+siakam.myName+"이 3점 라인 근처까지 왔습니다.\n");
                                                    attackWay1 = "";
                                                    attackWay2 = "";
                                                    whoseTurn = "";
                                                    int defenseWay =-1;

                                                    Still :
                                                    while (true) {

                                                        //region 공격 시작
                                                        if(attackWay1.equals("Still") || attackWay2.equals("Still") || whoseTurn.equals("Still") ){
                                                            mention.gameInfo(pl.myScore,siakam.myScore,pl.foulCount,siakam.foulCount);
                                                            pictureNpcTurn.line3CloseOpponent(siakam);
                                                        }

                                                        while(true){
                                                            try{
                                                                sharedPlace.playerDefenseWay = "0";
                                                                mention.SelectionMent("gameStart");
                            
                                                                Thread jdLine3Thread = new Thread(new Runnable(){
                            
                                                                    @Override
                                                                    public void run() {
                                                                        try{Thread.sleep(2000);
                                                                        }catch(Exception e){}
                                                                        if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                            int randNumber = rand.nextInt(3) + 1;
                                                                            if(SharedPlace2.endCheck()){return;}
                                                                            SharedPlace2.attackTimeReset1();
                                                                            if(randNumber == 1){
                                                                                String result = defenseSituation.shooting(pl,siakam,mention,sc,"3점슛","point3",1,"2",0,3,0);
                                                                            }else if(randNumber == 2){
                                                                                String result = defenseSituation.shooting(pl,siakam,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                            }else {
                                                                                String result = defenseSituation.shooting(pl,siakam,mention,sc,"[덩크]","dunk",1,"2",0,2,0);
                                                                            }
                                                                        }
                                                                    }
                                                                });
                                                                jdLine3Thread.start();
                            
                                                                sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                try{ jdLine3Thread.join();
                                                                }catch(Exception e){}
                            
                                                                if(SharedPlace2.endCheck()){ break siakamAttack;}
                            
                            
                                                                if(!(sharedPlace.playerDefenseWay.equals("1") || sharedPlace.playerDefenseWay.equals("2"))){
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break siakamAttack;
                                                                    }
                                                                    System.out.println(errorMessage);
                                                                    try{Thread.sleep(500);
                                                                    }catch(Exception e){}
                                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break siakamAttack;
                                                                    }
                                                                    continue ;
                                                                }
                            
                                                                break;
                                                            }catch(Exception e){
                                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                    break siakamAttack;
                                                                }
                                                                System.out.println(errorMessage);
                                                                try{Thread.sleep(500);
                                                                }catch(Exception k){}
                                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                    break siakamAttack;
                                                                }
                                                                continue;
                                                            }
                                                        }
                            
                                                        if(SharedPlace2.endCheck()){ break siakamAttack;}

                                                        mention.gameInfo(pl.myScore,siakam.myScore,pl.foulCount,siakam.foulCount);
                                                        if(defenseWay == 1){
                                                            pictureNpcTurn.line3CloseOpponent(siakam);
                                                        }else {
                                                            pictureNpcTurn.line3FarOpponent(siakam);
                                                        }
                                                        //endregion
                                                        //시아캄 3점라인 공격
                                                        int attackNumber = siakam.AttackPhase1();
                                                        switch (attackNumber) {
                                                            //region 돌파 or 크로스오버
                                                            case 0:
                                                                System.out.println("\n                                                                                               "+siakam.myName+"이 돌파를 시도합니다.\n");

                                                                while(true){

                                                                    sharedPlace.playerDefenseWay = "0";
                                                                    mention.SelectionMent("penetration");
                            
                                                                    Thread jdLine3_1Thread = new Thread(new Runnable(){
                                                                        @Override
                                                                        public void run() {
                                                                            try{Thread.sleep(2000);
                                                                            }catch(Exception e){}
                                                                            if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                                if(SharedPlace2.endCheck()){return;}
                                                                                SharedPlace2.attackTimeReset1();
                                                                                int randNumber = rand.nextInt(2) + 1;
                                                                                if(randNumber == 1){
                                                                                    String result = defenseSituation.shooting(pl,siakam,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                                }
                                                                            }
                                                                        }
                                                                    });
                                                                    jdLine3_1Thread.start();
                            
                                                                    sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                    try{ jdLine3_1Thread.join();
                                                                    }catch(Exception e){}
                            
                                                                    if(SharedPlace2.endCheck()){ break siakamAttack;}
                            
                                                                    if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2") ||sharedPlace.playerDefenseWay.equals("3")){
                                                                        break;
                                                                    }else {
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break siakamAttack;
                                                                        }
                                                                        System.out.println(errorMessage);
                                                                        try{Thread.sleep(500);
                                                                        }catch(Exception e){}
                                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break siakamAttack;
                                                                        }
                                                                        continue ;
                                                                    }
                                                                }

                                                                int peneOrCross = siakam.PenetrationOrCrossOver();

                                                                if (peneOrCross == 1) {
                                                                    if (sharedPlace.playerDefenseWay.equals("1")) {
                                                                        attackWay1 = defenseSituation.penetration(pl, siakam, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 1, defenseWay);
                                                                    } else {
                                                                        attackWay1 = defenseSituation.penetration(pl, siakam, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 0, defenseWay);
                                                                    }
                                                                } else if (peneOrCross == 2) {
                                                                    if (sharedPlace.playerDefenseWay.equals("2")) {
                                                                        attackWay1 = defenseSituation.penetration(pl, siakam, mention, sc, "[크로스오버]", "crossOver", sharedPlace.playerDefenseWay, 1, defenseWay);
                                                                    } else {
                                                                        attackWay1 = defenseSituation.penetration(pl, siakam, mention, sc, "[크로스오버]", "crossOver", sharedPlace.playerDefenseWay, 0, defenseWay);
                                                                    }
                                                                }
                                                                if (attackWay1.equals("Still")) {
                                                                    continue Still;
                                                                }else if (attackWay1.equals("End Turn")) {
                                                                    break siakamAttack;
                                                                }else if(attackWay1.equals("Restart")){
                                                                    continue siakamAttack;
                                                                }
                                                                break;
                                                            //endregion
                                                            //region 3점 슈팅 or 훼이크
                                                            case 1:
                                                                whoseTurn = "";
                                                                while (true) {
                                                                    int shootOrFake = siakam.ShootOrFake();
                                                                    if(whoseTurn.equals("Still")){
                                                                        mention.gameInfo(pl.myScore,siakam.myScore,pl.foulCount,siakam.foulCount);
                                                                        pictureNpcTurn.line3CloseOpponent(siakam);
                                                                    }

                                                                    System.out.println("\n                                                                                               "+siakam.myName+"이 슛 모션을 취합니다.\n");
                                                                    while(true){
                                                                        sharedPlace.playerDefenseWay = "0";
                                                                        mention.SelectionMent("shooting");

                                                                        Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                            @Override
                                                                            public void run() {
                                                                                try{Thread.sleep(2000);
                                                                                }catch(Exception e){}
                                                                                if(sharedPlace.playerDefenseWay.equals("0")){

                                                                                    if(SharedPlace2.endCheck()){ return ;}
                                                                                    SharedPlace2.attackTimeReset1();
                                                                                    int randNumber = rand.nextInt(2) + 1;

                                                                                    String result = defenseSituation.shooting(pl,siakam,mention,sc,"3점슛","point3",1,"2",0,3,0);

                                                                                }
                                                                            }
                                                                        });
                                                                        jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                        jdLine3_2Thread.start();


                                                                        sharedPlace.playerDefenseWay = sc.nextLine();

                                                                        try{jdLine3_2Thread.join();
                                                                        }catch(Exception e){}

                                                                        if(SharedPlace2.endCheck()){ break siakamAttack;}

                                                                        if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                            break;
                                                                        }else {
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break siakamAttack;
                                                                            }
                                                                            System.out.println(errorMessage);
                                                                            try{Thread.sleep(500);
                                                                            }catch(Exception e){}
                                                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break siakamAttack;
                                                                            }
                                                                            continue ;
                                                                        }
                                                                    }

                                                                    whoseTurn = defenseSituation.shooting(pl, siakam, mention, sc, "3점슛", "point3", shootOrFake, sharedPlace.playerDefenseWay, 1, 3,1);

                                                                    if (whoseTurn.equals("Still")) {
                                                                        continue;
                                                                    } else if (whoseTurn.equals("End Turn")) {
                                                                        break siakamAttack;
                                                                    }else if(whoseTurn.equals("Restart")){
                                                                        continue siakamAttack;
                                                                    }else if(whoseTurn.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }
                                                                }
                                                                //endregion

                                                        }

                                                        //시아캄 자유투 라인 공격
                                                        //region 자유투 라인 공격 - 시아캄가 완전히 돌파했을 때
                                                        if (attackWay1.equals("Fully Penetration")) {

                                                            whoseTurn = defenseSituation.shooting(pl, siakam, mention, sc, "[레이업]", "layUp", 1, "2", 0, 2,0);

                                                            if(whoseTurn.equals("GameEnd")){
                                                                break GameStart;
                                                            }
                                                            break siakamAttack;

                                                        }
                                                        //endregion
                                                        //region 자유투라인 공격 - 시아캄가 완전히 돌파하지 못했을 때(내가 쫓아갈 때)
                                                        if (attackWay1.equals("Half Penetration")) {
                                                            //덩크할 때
                                                            int point2OrPene = rand.nextInt(2) + 1 ;

                                                            //2점 슛
                                                            if (point2OrPene == 1) {
                                                                whoseTurn = "";
                                                                while (true) {
                                                                    int shootOrFake = siakam.ShootOrFake();
                                                                    mention.gameInfo(pl.myScore,siakam.myScore,pl.foulCount,siakam.foulCount);
                                                                    pictureNpcTurn.freethrowWithOpponent(siakam);
                                                                    if (whoseTurn == "Still") {
                                                                        System.out.println("\n                                                                                              "+siakam.myName+"이 다시 슛 모션을 취합니다.\n");
                                                                    } else {
                                                                        System.out.println("\n                                                                                          "+siakam.myName+"이 자유투 라인 부근에서 슛 모션을 취합니다.\n");
                                                                    }
                                                                    while(true){
                                                                        sharedPlace.playerDefenseWay = "0";
                                                                        mention.SelectionMent("shooting");

                                                                        Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                            @Override
                                                                            public void run() {
                                                                                try{Thread.sleep(2000);
                                                                                }catch(Exception e){}
                                                                                if(sharedPlace.playerDefenseWay.equals("0")){

                                                                                    if(SharedPlace2.endCheck()){ return ;}
                                                                                    SharedPlace2.attackTimeReset1();
                                                                                    int randNumber = rand.nextInt(2) + 1;

                                                                                    String result = defenseSituation.shooting(pl,siakam,mention,sc,"2점슛","point2",1,"2",0,2,0);

                                                                                }
                                                                            }
                                                                        });
                                                                        jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                        jdLine3_2Thread.start();


                                                                        sharedPlace.playerDefenseWay = sc.nextLine();

                                                                        try{jdLine3_2Thread.join();
                                                                        }catch(Exception e){}

                                                                        if(SharedPlace2.endCheck()){ break siakamAttack;}

                                                                        if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                            break;
                                                                        }else {
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break siakamAttack;
                                                                            }
                                                                            System.out.println(errorMessage);
                                                                            try{Thread.sleep(500);
                                                                            }catch(Exception e){}
                                                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                            if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                                break siakamAttack;
                                                                            }
                                                                            continue ;
                                                                        }
                                                                    }

                                                                    whoseTurn = defenseSituation.shooting(pl, siakam, mention, sc, "2점슛", "point2", shootOrFake, sharedPlace.playerDefenseWay, 1, 2,1);

                                                                    if (whoseTurn.equals("Still")) {
                                                                        continue ;
                                                                    } else if (whoseTurn.equals("End Turn")) {
                                                                        break siakamAttack;
                                                                    }else if(whoseTurn.equals("Restart")){
                                                                        continue siakamAttack;
                                                                    }else if(whoseTurn.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }

                                                                }

                                                                //계속 돌파할 때
                                                            } else if (point2OrPene == 2) {
                                                                mention.gameInfo(pl.myScore,siakam.myScore,pl.foulCount,siakam.foulCount);
                                                                pictureNpcTurn.freethrowWithOpponent(siakam);
                                                                System.out.println("\n                                                                                          "+siakam.myName+"이 자유투 라인 부근을 지나 계속 돌파합니다.\n");
                                                                 while(true){
                                                                    sharedPlace.playerDefenseWay = "0";
                                                                    mention.SelectionMent("penetration");
                            
                                                                    Thread jdLine2_2Thread = new Thread(new Runnable(){
                                                                        @Override
                                                                        public void run() {
                                                                            try{Thread.sleep(2000);
                                                                            }catch(Exception e){}
                                                                            if(sharedPlace.playerDefenseWay.equals("0")){
                            
                                                                                if(SharedPlace2.endCheck()){return;}
                                                                                SharedPlace2.attackTimeReset1();
                                                                                int randNumber = rand.nextInt(2) + 1;
                                                                                if(randNumber == 1){
                                                                                    String result = defenseSituation.shooting(pl,siakam,mention,sc,"[레이업]","layUp",1,"2",0,2,0);
                                                                                }
                                                                            }
                                                                        }
                                                                    });
                                                                    jdLine2_2Thread.start();
                            
                                                                    sharedPlace.playerDefenseWay = sc.nextLine();
                            
                                                                    try{ jdLine2_2Thread.join();
                                                                    }catch(Exception e){}
                            
                                                                    if(SharedPlace2.endCheck()){ break siakamAttack;}
                            
                                                                    if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")||sharedPlace.playerDefenseWay.equals("3")){
                                                                        break;
                                                                    }else {
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break siakamAttack;
                                                                        }
                                                                        System.out.println(errorMessage);
                                                                        try{Thread.sleep(500);
                                                                        }catch(Exception e){}
                                                                        System.out.println("");
                                                                        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                            break siakamAttack;
                                                                        }
                                                                        continue ;
                                                                    }
                                                                }

                                                                if (sharedPlace.playerDefenseWay.equals("4")) {
                                                                    whoseTurn = defenseSituation.shooting(pl, siakam, mention, sc, "[레이업]", "layUp", 1, "2", 0, 2,0);

                                                                    if(whoseTurn.equals("GameEnd")){
                                                                        break GameStart;
                                                                    }
                                                                    break siakamAttack;

                                                                } else {
                                                                    if (sharedPlace.playerDefenseWay.equals("1")) {
                                                                        attackWay2 = defenseSituation.penetration(pl, siakam, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 1, 0);
                                                                    } else {
                                                                        attackWay2 = defenseSituation.penetration(pl, siakam, mention, sc, "돌파", "basicPenetration", sharedPlace.playerDefenseWay, 0, 0);
                                                                    }

                                                                    if (attackWay2.equals("Still")) {
                                                                        continue Still;
                                                                    } else if (attackWay2.equals("End Turn")) {
                                                                        break siakamAttack;
                                                                    }else if(attackWay2.equals("Restart")){
                                                                        continue siakamAttack;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        //endregion

                                                        //시아캄 골 밑 공격
                                                        //region 레이업 or 더블 클러치
                                                        if (attackWay2.equals("Half Penetration")) {
                                                            int layUpOrDoubleClutch = siakam.LayUpOrDoubleClutch();
                                                            whoseTurn = "";
                                                            int shootOrFake = siakam.ShootOrFake();
                                                            mention.gameInfo(pl.myScore,siakam.myScore,pl.foulCount,siakam.foulCount);
                                                            pictureNpcTurn.underRimwWithOpponent(siakam);
                                                            System.out.println("\n                                                                                            "+siakam.myName+"이 스텝을 밟고 [레이업]을 올라갔습니다.\n");

                                                             while(true){
                                                                sharedPlace.playerDefenseWay = "0";
                                                                mention.SelectionMent("shooting");

                                                                Thread jdLine3_2Thread = new Thread(new Runnable(){
                                                                    @Override
                                                                    public void run() {
                                                                        try{Thread.sleep(2000);
                                                                        }catch(Exception e){}
                                                                        if(sharedPlace.playerDefenseWay.equals("0")){

                                                                            if(SharedPlace2.endCheck()){ return ;}
                                                                            SharedPlace2.attackTimeReset1();
                                                                            int randNumber = rand.nextInt(2) + 1;

                                                                            String result = defenseSituation.shooting(pl,siakam,mention,sc,"[레이업]","layUp",1,"2",0,3,0);

                                                                        }
                                                                    }
                                                                });
                                                                jdLine3_2Thread.setName("jdLine3_2Thread");
                                                                jdLine3_2Thread.start();


                                                                sharedPlace.playerDefenseWay = sc.nextLine();

                                                                try{jdLine3_2Thread.join();
                                                                }catch(Exception e){}

                                                                if(SharedPlace2.endCheck()){ break siakamAttack;}

                                                                if(sharedPlace.playerDefenseWay.equals("1") ||sharedPlace.playerDefenseWay.equals("2")){
                                                                    break;
                                                                }else {
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break siakamAttack;
                                                                    }
                                                                    System.out.println(errorMessage);
                                                                    try{Thread.sleep(500);
                                                                    }catch(Exception e){}
                                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                    if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1 || SharedPlace.attackTimeReset == 1){
                                                                        break siakamAttack;
                                                                    }
                                                                    continue ;
                                                                }
                                                            }

                                                            if (layUpOrDoubleClutch == 1) {
                                                                whoseTurn = defenseSituation.shooting(pl, siakam, mention, sc, "[레이업]", "layUp", 1, sharedPlace.playerDefenseWay, 1, 2,1);
                                                            } else {
                                                                whoseTurn = defenseSituation.shooting(pl, siakam, mention, sc, "[더블 클러치]", "doubleClutch", 0, sharedPlace.playerDefenseWay, 1, 2,0);
                                                            }
                                                            if(whoseTurn.equals("GameEnd")){
                                                                break GameStart;
                                                            }
                                                            break siakamAttack;
                                                        }
                                                        //endregion

                                                    }
                                                }
                                            //플레이어 공격권
                                            case "player" :
                                                try{Thread.sleep(1000);
                                                }catch(Exception e){}
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          현재 체력\n");
                                                System.out.println("                                                                                                "+pl.myName + "         " + siakam.myName
                                                        +"\n");
                                                System.out.println("                                                                                                    "+pl.stamina + "               " + siakam.stamina+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                sharedPlace.reset();
                                                pl.FailCountZero();
                                                if(sharedPlace.gameEnd == 1){ break GameStart;}

                                                //하프라인 시작
                                                Thread myAttackThread = new Thread(myAttack,"myAttackThread");
                                                StateCheckThread stateCheck = new StateCheckThread(myAttackThread);
                                                Thread stateCheckThread = new Thread(stateCheck,"stateCheckThread");
                                                myAttackThread.start();
                                                stateCheckThread.start();
                                                mainWait.waitMain();
                                                pl.turn = siakam.myName;


                                        }
                                    }
                                    SharedPlace.gameEnd = 1;
                                    mainWait.notifyMain();
                                    sharedPlace.notifyNpc();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          최종 점수\n");
                                    System.out.println("                                                                                               "+pl.myName + "  "+pl.myScore+ " : "+siakam.myScore+"  "+siakam.myName+"\n");
                                    if(pl.myScore > 14){
                                        System.out.println("                                        " +
                                                "" +
                                                "                                                        【 승리 】             【 패배 】\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        if(pl.basketBallLevel <siakam.basketBallLevel){
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                 농구 경험치가 20 상승했습니다.\n");
                                        pl.basketBallLevel = pl.basketBallLevel + 20;
                                        if(pl.doPoint3 == 1){
                                            System.out.println("\n                                                                                                 3점슛 능력치가 10 상승했습니다.\n");
                                            pl.point3AbilityFixed = pl.point3AbilityFixed + 10;
                                        }
                                        if(pl.doPoint2 == 1){
                                            pl.point2AbilityFixed = pl.point2AbilityFixed + 10;
                                            System.out.println("\n                                                                                                 2점슛 능력치가 10 상승했습니다.\n");
                                        }
                                        if(pl.doUnderRim == 1){
                                            pl.underRim2AbilityFixed = pl.underRim2AbilityFixed + 10;
                                            System.out.println("\n                                                                                                 골밑슛 능력치가 10 상승했습니다.\n");
                                        }
                                        System.out.println("\n                                                                                                 볼핸들링 능력치가 10 상승했습니다.\n");
                                        System.out.println("\n                                                                                                 자유투 능력치가 10 상승했습니다.\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        pl.ballHandlingFixed = pl.ballHandlingFixed + 10;
                                        pl.freeThrowAbilityFixed = pl.freeThrowAbilityFixed + 10;
                                        }else {
                                        System.out.println("\n                                                                                        농구 경험치가 낮아 더 이상 능력치가 오르지 않습니다.\n");
                                        System.out.println("\n                                                                                자신보다 경험이 더 많은 상대와 경기하면 농구 경험치를 얻을 수 있습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        }


                                    }else if(siakam.myScore > 14) {
                                        System.out.println("                                                                                                【 패배 】             【 승리 】\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                    }

                                    pl.AfterGameInitialize();
                                    siakam.AfterGameInitialize();
                                    siakam.StaminaInitialize();


                                    break;
                                }else{
                                    System.out.println(nocourt);
                                    sc.nextLine();
                                    continue ;
                                }
                            }
                            break;
                        case "6":
                            System.out.println("                                                                                              마이클 조던의 대저택으로 가는 중입니다.");
                            System.out.print("                                                                                                   ");
                            for(int i=0; i<14; i++) {
                                System.out.print("￣");
                                try{ Thread.sleep(200);
                                }catch(Exception e){}
                            }
                            JordanHome :
                            while(true){
                                pl.basketBallLevel = 80;
                                pl.isBehindBack = 1;
                                pl.isStepBack2 = 1;
                                pl.isStepBack3 = 1;
                                pl.isDeepThree = 1;
                                pl.position = "가드";
                                SharedPlace.islegthrow = 1;

                                mention.JordanHome();
                                select = sc.nextLine();
                                if(select.equals("1")){
                                    jd.InitializeStat();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                        ENTER키를 누르면 마이클조던과의 경기가 시작됩니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    String stadium = sc.nextLine();
                                    mention.IntroductionMent(pl,jd);
                                    sc.nextLine();
                                    mention.RuleMent();
                                    sc.nextLine();
                                    sc.nextLine();
                                    sharedPlace.setPlayer(pl);
                                    sharedPlace.setNpc(jd);

                                    //region 자유투로 순서 정하기 - 마이클 조던
                                    while(true){
                                            String freethrowJordan = jd.FreeThrow();
                                            String freethrowMine = pl.FreeThrow();
                                            if(freethrowJordan.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  "+jd.myName+"이 자유투를 시도합니다.\n");
                                                System.out.println("\n                                                                                                 "+jd.myName+"의 자유투는 성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }else {
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  "+jd.myName+"이 자유투를 시도합니다.\n");
                                                System.out.println("\n                                                                                                 "+jd.myName+"의 자유투는 실패하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }
                                            sc.nextLine();
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                       "+pl.myName+"의 차례입니다.\n");
                                                System.out.println("\n                                                                                                 자유투를 던지려면 ENTER키를 눌러주세요\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            sc.nextLine();
                                            if(freethrowMine.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          자유투를 던집니다.\n");
                                                System.out.println("\n                                                                                                 "+pl.myName+"의 자유투는 성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            }else {
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          자유투를 던집니다.\n");
                                                System.out.println("\n                                                                                                 "+pl.myName+"의 자유투는 실패하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                                            }
                                            sc.nextLine();
                                            jd.InitializeScore();
                                            pl.InitializeScore();

                                            if(freethrowJordan.equals("1")&&freethrowMine.equals("0")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                    "+jd.myName+"의 선공으로 시작합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+
                                                                    "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기시작" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                pl.turn = jd.myName;
                                                sc.nextLine();
                                                break;
                                            }else if(freethrowJordan.equals("0")&&freethrowMine.equals("1")){
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                   " +userName + "의 선공으로 시작합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                sc.nextLine();
                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기시작" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                pl.turn = "player";
                                                sc.nextLine();
                                                break;
                                            }
                                        }

                                    //endregion
                                    sharedPlace.gameEnd = 0 ;
                                    MyAttack myAttack = new MyAttack(sharedPlace,jd,mainWait,pl);
                                    Thread gameTimeThread = new Thread(new Runnable() {
                                            @Override
                                            public void run() {
                                                sharedPlace.stopGameTime();
                                            }
                                        });
                                    gameTimeThread.start();

                                    sharedPlace.setNpc(jd);
                                    sharedPlace.setPlayer(pl);
                                    defenseSituation.setPlayerNpc(pl,jd);

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
                                                SharedPlace.scanner();
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
                                                                        try{Thread.sleep(2000);
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
                                                                    if(SharedPlace2.endCheck()){break JordanAttack;}
                                                                    if(SharedPlace2.attackTimeResetCheck()){break JordanAttack;}
                                                                    System.out.println(errorMessage);
                                                                    try{Thread.sleep(500);
                                                                    }catch(Exception e){}
                                                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                    if(SharedPlace2.endCheck()){break JordanAttack;}
                                                                    if(SharedPlace2.attackTimeResetCheck()){break JordanAttack;}
                                                                    continue ;
                                                                }

                                                                break;
                                                            }catch(Exception e){
                                                                if(SharedPlace2.endCheck()){break JordanAttack;}
                                                                if(SharedPlace2.attackTimeResetCheck()){break JordanAttack;}
                                                                System.out.println(errorMessage);
                                                                try{Thread.sleep(500);
                                                                }catch(Exception k){}
                                                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                if(SharedPlace2.endCheck()){break JordanAttack;}
                                                                if(SharedPlace2.attackTimeResetCheck()){break JordanAttack;}
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
                                                                            try{Thread.sleep(2000);
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
                                                                        if(SharedPlace2.endCheck()){break JordanAttack;}
                                                                        if(SharedPlace2.attackTimeResetCheck()){break JordanAttack;}
                                                                        System.out.println(errorMessage);
                                                                        try{Thread.sleep(500);
                                                                        }catch(Exception e){}
                                                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
                                                                        if(SharedPlace2.endCheck()){break JordanAttack;}
                                                                        if(SharedPlace2.attackTimeResetCheck()){break JordanAttack;}
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
                                                                                try{Thread.sleep(2000);
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
                                                                            try{Thread.sleep(2000);
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
                                                                                try{Thread.sleep(2000);
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
                                                                            try{Thread.sleep(2000);
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
                                                                        try{Thread.sleep(2000);
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
                                                                        try{Thread.sleep(2000);
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
                                    SharedPlace.gameEnd = 1;
                                    mainWait.notifyMain();
                                    sharedPlace.notifyNpc();
                                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          최종 점수\n");
                                    System.out.println("                                                                                               "+pl.myName + "  "+pl.myScore+ " : "+jd.myScore+"  "+jd.myName+"\n");
                                    if(pl.myScore > 14 || pl.myScore > jd.myScore){
                                        System.out.println("                                                                                                【 승리 】             【 패배 】\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                        sc.nextLine();
                                        pictureMyTurn.jordanPrize();
                                        sc.nextLine();
                                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                            ..." +
                "\n                                                                                                            ...\n                                                                                                            ..." +
                "\n\n\n\n\n\n\n\n\n\n                                                                                                        T H E  E N D\n\n\n\n\n\n\n\n\n\n");
                                        break MainMenu;
                                    }else if(jd.myScore > 14 || pl.myScore < jd.myScore) {
                                        System.out.println("                                                                                                【 패배 】             【 승리 】\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    }

                                    pl.AfterGameInitialize();
                                    jd.AfterGameInitialize();
                                    jd.StaminaInitialize();

                                }else if(select.equals("2")){
                                    continue Location;

                                }

                            }

                    }

                }

            }
            else if(select.equals("2")){
                pl.StatWindow();
                while(true){
                    System.out.println("\n100.이전으로 되돌아가기\n");
                    select = sc.nextLine();
                    if(select.equals("100")){
                       continue MainMenu;
                    }else{
                        System.out.println(errorMessage);
                        continue ;
                    }
                }


            }else if(select.equals("3")){
                while(true) {
                    pl.SkillWindow();
                    System.out.println("\n100. 이전으로 되돌아가기\n");
                    select = sc.nextLine();
                    if (select.equals("100")) {
                        continue MainMenu;
                    } else {
                        System.out.println(errorMessage);
                        continue;
                    }
                }

            }else{
                System.out.println(errorMessage);
                continue ;
            }


        }


    }
}
