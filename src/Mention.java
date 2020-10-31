import java.util.Scanner;

public class Mention {
    Scanner sc = new Scanner(System.in);
    SharedPlace sharedPlace;
    String[] oneTwoThreeCount = new String[3];

    Mention(){
        oneTwoThreeCount[0] = "첫번째";
        oneTwoThreeCount[1] = "두번째";
        oneTwoThreeCount[2] = "세번째";
    }

    public void ChangeAttackMent(String userName){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                               공격권이 "+userName+"에게로 넘어갑니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }


    public void FoulMent(NbaCharacter whoDoFoul2, String foulName, String whoDoFoul, String whoGetFoul){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  / - "+whoDoFoul+"의 "+foulName +"파울 - /\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            try{Thread.sleep(1000);
            }catch(Exception e){}
            if(whoDoFoul2.foulCount == 7){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  파울 갯수가 6개를 초과하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }else if(whoDoFoul2.foulCount < 7){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                 다시 "+ whoGetFoul+"의 공격권입니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }
            try{Thread.sleep(1000);
            }catch(Exception e){}
    }

    public void FoulFreethrowMent(NbaCharacter whoGetFoul, int howMany){

        if(howMany == 1){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                             득점 인정 후 1개의 자유투 기회가 주어집니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            try{Thread.sleep(1000);
            }catch(Exception e){}
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                      "+whoGetFoul.myName + "의 자유투,\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            try{Thread.sleep(1000);
            }catch(Exception e){}
            if(whoGetFoul.FreeThrow().equals("1")){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                       성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                try{Thread.sleep(1000);
                if(whoGetFoul.myScore > 14){
                    SharedPlace2.gameEnd1();
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기종료" +
                            "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    try{ Thread.sleep(2000);
                    }catch(Exception e){}
                    return;
                }
            }catch(Exception e){}
            }else{
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                       실패하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                try{Thread.sleep(1000);
            }catch(Exception e){}
            }
        }else{
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                               "+whoGetFoul.myName+"에게 "+howMany+"개의 자유투 기회가 주어집니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            try{Thread.sleep(1000);
            }catch(Exception e){}
            for(int i=0; i < howMany; i++) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                      "+oneTwoThreeCount[i]+" 자유투,\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                try{Thread.sleep(1000);
            }catch(Exception e){}
                if(whoGetFoul.FreeThrow().equals("1")){
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                         성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    try{Thread.sleep(1000);
            }catch(Exception e){}
                }else{
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                         실패하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    try{Thread.sleep(1000);
            }catch(Exception e){}
                }
            }

        }
    }

    public void IntroductionMent(NbaCharacter player, NbaCharacter npc){
        if(player.position.equals("포워드")){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                             ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                                ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                                                              \n"+
                           "                                                             이름　　: 브랜든 리치" +"                                               "+"이름　　: "+npc.myName+" \n" +
                           "                                                             나이　　: 27세  " +"                                                   "+"나이　　: "+npc.age+"\n" +
                           "                                                             키　　　: "+"195cm  "+"                                                  "+"키　　　: "+npc.heightFixed+"\n"+
                           "                                                             윙스팬　: " + "200cm  " +"                                                  "+"윙스팬　: "+npc.wingSpanFixed+"\n" +
                           "                                                             포지션　: 포워드                   　        　       　         　　"+"포지션　: "+npc.position+"\n" +
                           "                                                             체력　　: " + player.staminaFixed+"                                                       "+"체력　　: "+npc.staminaFixed+"\n" +
                           "                                                             스피드　: " + player.speedFixed +"                                    vs                 "+"스피드　: "+npc.speedFixed+"\n"+
                           "                                                             점프력　: " + player.jumpFixed +"                                                       "+"점프력　: "+npc.jumpFixed+"\n" +
                           "                                                             근육량　: " + player.muscleFixed+"                                                       "+"근육량　: "+npc.muscleFixed+"\n" +
                           "                                                             3점슛 　: " + player.point3AbilityFixed+"                                                       "+"3점슛 　: "+npc.point3AbilityFixed+"\n" +
                           "                                                             2점슛 　: " + player.point2AbilityFixed+"                                                       "+"2점슛 　: "+npc.point2AbilityFixed+"\n" +
                           "                                                             골밑슛　: " + player.underRim2AbilityFixed+"                                                       "+"골밑슛　: "+npc.underRim2AbilityFixed+"\n" +
                           "                                                             볼핸들링: " + player.ballHandlingFixed+"                                                       "+"볼핸들링: "+npc.ballHandlingFixed+"\n" +
                           "                                                             경험치　: " + player.basketBallLevel+"                                                       "+"경험치　: "+npc.basketBallLevel+"\n" +
                           "                                                             ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                                ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n\n\n\n\n\n\n\n\n\n\n");

        }else{
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                             ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                                ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                                                              \n"+
                           "                                                             이름　　: 브랜든 리치" +"                                               "+"이름　　: "+npc.myName+" \n" +
                           "                                                             나이　　: 27세  " +"                                                   "+"나이　　: "+npc.age+"\n" +
                           "                                                             키　　　: "+"195cm  "+"                                                  "+"키　　　: "+npc.height+"\n"+
                           "                                                             윙스팬　: " + "200cm  " +"                                                  "+"윙스팬　: "+npc.wingSpan+"\n" +
                           "                                                             포지션　: " + player.position+"                                                  　　"+"포지션　: "+npc.position+"\n" +
                           "                                                             체력　　: " + player.staminaFixed+"                                                       "+"체력　　: "+npc.staminaFixed+"\n" +
                           "                                                             스피드　: " + player.speedFixed +"                                    vs                 "+"스피드　: "+npc.speedFixed+"\n"+
                           "                                                             점프력　: " + player.jumpFixed +"                                                       " +"점프력　: "+npc.jumpFixed+"\n" +
                           "                                                             근육량　: " + player.muscleFixed+"                                                       "+"근육량　: "+npc.muscleFixed+"\n" +
                           "                                                             3점슛 　: " + player.point3AbilityFixed+"                                                       "+"3점슛 　: "+npc.point3AbilityFixed+"\n" +
                           "                                                             2점슛 　: " + player.point2AbilityFixed+"                                                       "+"2점슛 　: "+npc.point2AbilityFixed+"\n" +
                           "                                                             골밑슛　: " + player.underRim2AbilityFixed+"                                                       "+"골밑슛　: "+npc.underRim2AbilityFixed+"\n" +
                           "                                                             볼핸들링: " + player.ballHandlingFixed+"                                                       "+"볼핸들링: "+npc.ballHandlingFixed+"\n" +
                           "                                                             경험치　: " + player.basketBallLevel+"                                                       "+"경험치　: "+npc.basketBallLevel+"\n" +
                           "                                                             ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒                                ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n\n\n\n\n\n\n\n\n\n\n");
        }



    }

    public void RuleMent(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                       ┌                - 경기 규칙 -                ┐\n" +
                "                                                                                                                          　　　  　  \n" +
                "                                                                                                  15점을 먼저 넣는 사람이 승리           \n" +
                "                                                                                                                              　　   \n" +
                "                                                                                                      3번 막히면 턴 종료       　　     \n" +
                "                                                                                                                                    \n" +
                "                                                                                                시간제한 7분,공격 제한 시간 14초     　　 　  　        \n"+
                "                                                                                                                                     \n" +
                "                                                                                             슈팅 파울시 자유투, 3점은 3개 2점은 2개　　    \n"+
                "                                                                                                                                    \n" +
                "                                                                                             파울했는데 슛이 들어갔을시 자유투 1개          \n"+
                "                                                                                                                                    \n" +
                "                                                                                             6파울 이후 슈팅 파울이 아니라도 자유투        \n" +
                "                                                                                       └                                           ┘ \n\n"+
                "                                                                                               * 매너를 지켜서 플레이 해주세요 *\n\n"+
                "                                                                                               자유투를 통하여 선공을 결정합니다.\n\n" +
                "                                                                                            계속 진행시하려면 엔터키를 두 번 눌러주세요\n\n\n\n\n\n");




    }

    public void SelectionMent(String nameOfSituation){
        switch (nameOfSituation){
            case "gameStart" :
                nameOfSituation = "                                                                          1. 가까이 붙어서 슛을 막는다.                        2. 떨어져서 돌파를 막는다.";
                break;
            case "penetration" :
                nameOfSituation = "                                                                   1. 바로 사이드스텝으로 따라간다.      2. 한 템포 기다렸다 따라간다.      3. 스틸을 시도한다.     ";
                break;
            case "shooting" :
                nameOfSituation = "                                                                                  1. 블락 뛴다.                       2. 반응하지 않고 기다린다.";
                break;
            case "postUp" :
                nameOfSituation = "                                                                      1. 못 들어오게 몸으로 버틴다.         2. 거리를 두고 막는다.         3. 스틸을 시도한다.";
                break;
        }

        System.out.println("-------------------------------------------------------------------------------------------------" +
                "------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(nameOfSituation+"\n-------------------------------------------------------------------------------------------------" +
                "------------------------------------------------------------------------------------------------------------------------------\n\n\n\n\n\n");

    }
    public void SelectionMent2(String nameOfSituation){

        switch (nameOfSituation){
            case "gameStart" :
                nameOfSituation = "                                                                                       1. 드리블 시작                    100.게임 포기                     # 스킬을 사용하려면 커맨드를 입력해주세요 #"    ;
                break;
            case "line3" :
                nameOfSituation = "                                                                              1. 3점슛                2. 슛 훼이크                3. 기본 돌파              # 스킬을 사용하려면 커맨드를 입력해주세요 #    ";
                break;
            case "line3AfterFake" :
                nameOfSituation = "                                                                                             1. 3점슛                  2. 슛 훼이크   " ;
                break;
            case "layup" :
                nameOfSituation = "                                                                                                   1. 레이업을 한다.                                       # 스킬을 사용하려면 커맨드를 입력해주세요 #";
                break;
            case "dunk" :
                nameOfSituation = "                                                                                    1. 원핸드 덩크                        2. 투핸드 덩크";
                break;
            case "line2WithPenetration" :
                nameOfSituation = "                                                                              1. 2점슛                2. 슛 훼이크                3. 계속 돌파               # 스킬을 사용하려면 커맨드를 입력해주세요 #";
                break;
            case "line2AfterFake" :
                nameOfSituation = "                                                                                             1. 2점슛                  2. 슛 훼이크   ";
                break;
            case "line2WithPostUp" :
                nameOfSituation = "                                                                               1. 2점슛               2. 슛 훼이크               3. 계속 포스트업             # 스킬을 사용하려면 커맨드를 입력해주세요 #";
                break;
            case "underRimPostUp" :
                nameOfSituation = "                                                                                             1. 골밑슛                  2. 슛 훼이크                         # 스킬을 사용하려면 커맨드를 입력해주세요 #";
                break;
            case "underRimAfterFake" :
                nameOfSituation = "                                                                                             1. 골밑슛                  2. 슛 훼이크   ";
                break;
            case "fullyPenetration" :
                nameOfSituation = "                                                                                                       1. 골밑슛                                            # 스킬을 사용하려면 커맨드를 입력해주세요 #";
                break;
        }

        System.out.println("-------------------------------------------------------------------------------------------------" +
                "------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(nameOfSituation+"\n-------------------------------------------------------------------------------------------------" +
                "------------------------------------------------------------------------------------------------------------------------------\n\n\n\n\n\n");

    }

    public void MainMenu(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                      M A I N  M E N U\n");
        System.out.println("\n                                                                              ▩                                                            ▩");
        System.out.println("\n\n                                                                                                       1. 장소 이동                      ");
        System.out.println("\n\n                                                                                                       2. 상태창                         ");
        System.out.println("\n\n                                                                                                       3. 스킬창                                ");
        System.out.println("\n\n                                                                              ▩                                                            ▩\n\n\n\n\n\n\n\n\n\n");
    }
    public void Location(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                      L O C A T I O N\n");
        System.out.println("\n                                                                              ▩                                                            ▩");
        System.out.println("\n\n                                                                                   0. 메인 메뉴             　  　         ");
        System.out.println("\n\n                                                                                   1. 스킬 트레이닝 센터              2. 피지컬 트레이닝 센터          ");
        System.out.println("\n\n                                                                                   3. 포지션 센터       　　   　     4. 집                          ");
        System.out.println("\n\n                                                                                   5. 길거리 농구장             　  　6. 마이클 조던의 대저택          ");
        System.out.println("\n\n                                                                              ▩                                                            ▩\n\n\n\n\n\n\n\n\n\n\n");
    }
    public void SkillTrainingCenter(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                          S K I L L  T R A I N I N G  C E N T E R\n");
        System.out.println("\n                                                                              ▩                                                            ▩");
        System.out.println("\n\n\n\n                                                                                     0. 메인 메뉴           1. 슈팅           2. 드리블                          ");
        System.out.println("\n\n\n\n                                                                              ▩                                                            ▩\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public void PhysicalTrainingCenter(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                      P H Y S I C A L  T R A I N I N G  C E N T E R\n");
        System.out.println("\n\n                                                                              ▩                                                            ▩");
        System.out.println("\n\n                                                                                            0. 메인 메뉴     　　       1. 순발력         ");
        System.out.println("\n\n                                                                                            2. 점프력             　　　3. 웨이트                 ");
        System.out.println("\n\n                                                                              ▩                                                            ▩\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public void PositionCenter(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                P O S I T I O N  C E N T E R\n\n\n");
        System.out.println("                                      ▩                                                                                                                                                    ▩");
        System.out.println("\n\n                                                     가드 - 스테판 커리 교관                         포워드 - 르브론 제임스 교관                         센터 - 샤킬 오닐 교관");
        System.out.println("\n                                                 ￣￣￣￣￣￣\\　　　/￣￣￣￣￣￣                   ￣￣￣￣￣￣\\　　　/￣￣￣￣￣￣                   ￣￣￣￣￣￣\\　　　/￣￣￣￣￣￣\n" +
                           "        　\n" +
                           "\n" +
                           "                                                  　       C U R R Y                                      J A M E S                                     O ' N E A L\n" +
                           "\n" +
                           "                                                              3 0                                            2 3                                            3 4\n" +
                           "\n" +
                           "\n" +
                           "\n" +
                           " \n" +
                           "\n" +
                           "                                                 ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣         　         ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣                    ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣");
        System.out.println("\n\n                                      ▩                                                                                                                                                    ▩\n\n\n\n\n\n");
        System.out.print  ("                                                                                                 갖고 싶은 포지션을 입력해주세요 : ");
    }
    public void RoadCourt(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                      # 길거리 농구장 #\n");
        System.out.println("\n\n                                                             A코트(\"하\")                                B코트(\"중\")                                  C코트(\"상\")\n" +
                "                                                  ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣                ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣                ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                                                               *  *                                       *  *                                        *  *              \n" +
                "                                                  -----------*------*---------               -----------*------*----------               -----------*------*----------\n" +
                "                                                               *  *                                       *  *                                        *  *              \n" +
                "\n" +
                "            \n" +
                "\n" +
                "\n" +
                "                                                  ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣                ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣                ￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣\n\n\n\n\n\n\n\n\n");
        System.out.print  ("                                                                                                 가고 싶은 코트를 입력해주세요 : ");
    }

    public void gameInfo(int playerScore,int npcScore,int playerFoulCount,int npcFoulCount){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                         　             　                                                        ￣￣￣￣￣￣￣￣￣￣￣￣￣￣\n" +
                "                         　             　                                                        HOME     TIME     GUEST\n" +
                "                         　             　                                                         "+npcScore+"      "+SharedPlace.stopGameTime+"      "+playerScore+"\n" +
                "                         　             　                                                        -----------------------        \n" +
                "                         　             　                                                        FOUL   SHOTCLOCK   FOUL \n" +
                "                         　             　                                                         "+npcFoulCount+"        "+SharedPlace.attackTime+"        "+playerFoulCount+"   \n" +
                "                         　             　                                                        ￣￣￣￣￣￣￣￣￣￣￣￣￣￣");
    }

    public void gameInfo2(int playerScore,int npcScore,int playerFoulCount,int npcFoulCount){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                         　             　                                                        ￣￣￣￣￣￣￣￣￣￣￣￣￣￣\n" +
                "                         　             　                                                        HOME     TIME     GUEST\n" +
                "                         　             　                                                         "+npcScore+"      "+SharedPlace.stopGameTime+"      "+playerScore+"\n" +
                "                         　             　                                                        -----------------------        \n" +
                "                         　             　                                                        FOUL   SHOTCLOCK   FOUL \n" +
                "                         　             　                                                         "+npcFoulCount+"        "+SharedPlace.attackTime+"        "+playerFoulCount+"   \n" +
                "                         　             　                                                        ￣￣￣￣￣￣￣￣￣￣￣￣￣￣\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }


    public void JordanHome(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                   # 마이클 조던의 대저택 #\n");
        System.out.println("\n" +
                           "                                                                                        00000000000000                 000000000000000                                                         \n" +
                           "                                                                                       0000000000000000               00000000000000000                                                        \n" +
                           "                                                                                       0000        0000               0000         0000                                                        \n" +
                           "                                                                                       0000        0000               0000         0000                                                        \n" +
                           "                                                                                       0000        0000               0000         0000                                                        \n" +
                           "                                                                                       0000        0000               0000         0000                                                        \n" +
                           "                                                                                       0000        0000               0000         0000                                                        \n" +
                           "                                                                                       0000        0000               0000         0000                                                        \n" +
                           "                                                                                                   0000                            0000                                                        \n" +
                           "                                                                                                  0000                          000000                                                         \n" +
                           "                                                                                                 0000                         000000                                                           \n" +
                           "                                                                                                0000                        00000                                                              \n" +
                           "                                                                                               0000                         00000                                                              \n" +
                           "                                                                                               0000                           000000                                                           \n" +
                           "                                                                                              0000                              000000                                                         \n" +
                           "                                                                                             0000                                  0000                                                        \n" +
                           "                                                                                            0000                                   0000                                                        \n" +
                           "                                                                                           0000                       0000         0000                                                        \n" +
                           "                                                                                           0000                       0000         0000                                                        \n" +
                           "                                                                                          0000                        0000         0000                                                        \n" +
                           "                                                                                         0000                         0000         0000                                                        \n" +
                           "                                                                                        0000                          0000         0000                                                        \n" +
                           "                                                                                       0000                           0000         0000                                                        \n" +
                           "                                                                                      00000000000000000     /   \\     0000000000000000                                                        \n" +
                           "                                                                                      00000000000000000    /     \\     00000000000000 \n\n");
        System.out.println("                                                                             1. 마이클 조던의 개인 농구장                      2. 왔던 길로 되돌아간다.\n\n\n");
    }
    public void MyHome(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                          # 집 #\n");
        System.out.println("\n                                                                                                                   ▒" +
                           "\n                                                                                                      ▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n\n");
        System.out.println("\n                                                                                                      휴식을 취합니다.\n");
        System.out.println("\n                                                                                                        0.메인 메뉴 \n\n\n\n\n\n\n\n" +
                "");
    }
}
