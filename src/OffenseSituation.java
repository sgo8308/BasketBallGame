import java.util.Random;
import java.util.Scanner;

public class OffenseSituation {
    static SharedPlace sharedPlace = new SharedPlace();
    static StopGaugeBar stopGaugeBar = new StopGaugeBar();

    public String shooting(Player player, NbaCharacter npc, Mention mention, Scanner sc, String shootNameKor, String shootNameEng , int shootOrFake, int tryBlockOrNot, int opponentNearBy, int point2Or3, int canFoul ){
        int isFoul = -1;
        int isSuccess = -1;

        if(shootNameKor.equals("3점슛")){
           player.doPoint3 = 1;
        }else if(shootNameKor.equals("2점슛")){
           player.doPoint2 = 1;
        }else if(shootNameKor.equals("골밑슛")){
           player.doUnderRim = 1;
        }

        if(shootOrFake == 2 && tryBlockOrNot == 2 && shootNameEng!="doubleClutch"){
            player.ShootFake();
            try{Thread.sleep(500);
            }catch(Exception e){}
            if(SharedPlace2.endCheck()){ return "End Turn";}
            System.out.println("                                                                                                                    「 " + npc.myName +"이(가) 훼이크에 속지 않았습니다. 」");
            try{Thread.sleep(500);
            }catch(Exception e){}
            return "Still";
        }else if(shootOrFake == 2 && tryBlockOrNot == 1){
            npc.Block();
            try{Thread.sleep(500);
            }catch(Exception e){}
            if(SharedPlace2.endCheck()){ return "End Turn";}
            System.out.println("                                                                                                                    「 " + npc.myName +"이(가) 훼이크에 속았습니다. 」");
            System.out.println("                                                                   「 슛을 던지려면 ENTER키를 눌러주세요. 」");
            SharedPlace.scanner();
            if(SharedPlace2.endCheck()){ return "End Turn";}
            SharedPlace.attackTimeReset = 1;
            Thread thread0 = new Thread(stopGaugeBar);
            thread0.start();
            sharedPlace.gaugeBar();
            if(SharedPlace2.endCheck()){ return "End Turn";}
            isSuccess = player.shootingInOrOut(shootNameEng,npc.blockAbility,opponentNearBy,0,0);
            SharedPlace.attackTimeReset = 1;
            System.out.println("\n\n                                                              「 블락을 피하고 "+shootNameKor+"을(를) 시도합니다. 」");



        }else {

            isFoul = npc.ShootingFoul(player.jump);
            if(canFoul == 0 || tryBlockOrNot == 2){
               isFoul = 0;
            }
            if(tryBlockOrNot == 1 && isFoul != 1) {
                npc.Block();
                isSuccess = player.shootingInOrOut(shootNameEng,npc.blockAbility, opponentNearBy, 1, 0);
            }else if(tryBlockOrNot == 2){
                isSuccess = player.shootingInOrOut(shootNameEng,npc.blockAbility,opponentNearBy,0,0);
            }else if (tryBlockOrNot == 1 && isFoul == 1) {
                SharedPlace.attackTimeReset = 1;
                npc.Block();
                isSuccess = player.shootingInOrOut(shootNameEng,npc.blockAbility, opponentNearBy, 1, 1);
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  / - "+npc.myName+"의 슈팅 파울 - / ");
            }
        }
        if(SharedPlace2.endCheck()){ return "End Turn";}

        SharedPlace.attackTimeReset = 1;

        try{
          Thread.sleep(500);
        }catch(Exception e){}

        if(isSuccess == 1){
            System.out.println("\n\n                                                                            「 "+shootNameKor+"이(가) 성공하였습니다. 」");
            if(player.myScore > 14){
                try{Thread.sleep(500);
                }catch(Exception e){}
                SharedPlace2.gameEnd1();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기종료" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                try{ Thread.sleep(2000);
                }catch(Exception e){}
                return "End Turn";
            }
            if(isFoul == 1){
                try{Thread.sleep(500);
            }catch(Exception e){}
                mention.FoulFreethrowMent(player,1);
            }
        }else if(isSuccess == 0){
            if(isFoul == 1){
            System.out.println("\n\n                                                                            「 "+shootNameKor+"이(가) 실패하였습니다. 」");
                mention.FoulFreethrowMent(player,point2Or3);
            }else if(shootOrFake == 1 && tryBlockOrNot == 1){
                System.out.println("\n\n                                                                                                                    「 " + npc.myName +"이(가) "+shootNameKor+"을(를) 블락했습니다. 」");
            }else {
                System.out.println("\n\n                                                                            「 "+shootNameKor+"이(가) 실패했습니다. 」");

            }
        }else {
            System.out.println("아무것도 해당되지 않는다.");
        }

        if(player.myScore > 14){
                try{Thread.sleep(500);
            }catch(Exception e){};
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기종료" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                try{ Thread.sleep(2000);
                }catch(Exception e){}
                ;
                return "End Turn";
        }

        try{
          Thread.sleep(500);
        }catch(Exception e){
          e.printStackTrace();
        }

        mention.ChangeAttackMent(npc.myName);
        try{Thread.sleep(500);
        }catch(Exception e){}
        player.FailCountZero();
        return "End Turn";
    }

    public String penetration(NbaCharacter player, NbaCharacter npc, Mention mention, Scanner sc, Random rand, String skillNameKor, String skillNameEng , int blockOrWait, int isBlock, int defenceWay ){
        String select = "2";
            npc.SideStep();
            int isFoul= npc.BlockingFoul(player.speed);
            if(isFoul == 1){
                SharedPlace.attackTimeReset = 1;
                mention.FoulMent(npc,"블로킹", npc.myName,player.myName);
                player.FailCountZero();
                if(npc.foulCount > 6){
                    mention.FoulFreethrowMent(player,2);
                   return "End Turn";
                }
                return "Foul";
            }

        int penetrationSuccess = player.penetrationResult(skillNameEng,npc.speed, npc.muscle,isBlock,defenceWay);

        if(SharedPlace2.endCheck()){ return "End Turn";}


        if(penetrationSuccess == 1){
            System.out.println("                                                      「 "+npc.myName+"을(를) "+ skillNameKor +"로 완전히 벗겨냈습니다. 」");
            try{Thread.sleep(500);
            }catch(Exception e){}
            if(SharedPlace2.endCheck()){ return "End Turn";}
            int isfoul = -1;
            if(npc.foulCount < 4){
                isfoul = rand.nextInt(2);
            }else{
                isfoul = 0;
            }
            if(isfoul == 1 ){
                npc.FoulUp();
                SharedPlace.attackTimeReset = 1;
                mention.FoulMent(npc,"홀딩",npc.myName, player.myName);
                player.FailCountZero();
                if(npc.foulCount > 6){
                    mention.FoulFreethrowMent(player,2);

                   return "End Turn";
                }
                return "Foul";
            }
            return "Fully Penetration";

        }else if(penetrationSuccess == 0){
            System.out.println("                                                                                                                  「 "+npc.myName+"이(가) "+ skillNameKor +"를(을) 막았습니다. 」");
            try{Thread.sleep(500);
            }catch(Exception e){}
            if(SharedPlace2.endCheck()){ return "End Turn";}
            if(player.isBehindBack == 1){

                while(true){
                    if(SharedPlace2.endCheck()){ return "End Turn";}
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------" +
                    "------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("                                                                           1. [비하인드 백 드리블] 사용하기                           2. 사용하지 않기\n-------------------------------------------------------------------------------------------------" +
                    "------------------------------------------------------------------------------------------------------------------------------\n\n\n\n\n\n");
                    select = sc.nextLine();
                    if(SharedPlace2.endCheck()){ return "End Turn";}
                    if(select.equals("1")){
                        player.failCount --;
                        return penetration(player,npc,mention,sc,rand,"[비하인드 백 드리블]","behindBack",2,0,1);
                    }else {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                 # 옳바른 숫자를 입력해 주세요 #\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        try{Thread.sleep(500);
                        }catch(Exception e){};
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        continue;
                    }

                }

            }
            if(player.failCount > 2){
                SharedPlace.attackEnd = 1;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                               3번의 공격 실패로 공격권이 넘어갑니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                try{Thread.sleep(500);
            }catch(Exception e){}
                if(SharedPlace2.endCheck()){ return "End Turn";}
                player.FailCountZero();
                return "End Turn";
            }
            System.out.println("                                                             　  　           「 다시 공격 준비를 합니다. 」\n");
            try{Thread.sleep(500);
            }catch(Exception e){}

            return "Still";

        }else if(penetrationSuccess == 2){
            System.out.println("                                                                                                                  「 "+npc.myName+"(이)가 사이드스텝으로 따라 붙는데 성공했습니다. 」");
            try{Thread.sleep(500);
            }catch(Exception e){};

            return "Half Penetration";

        }

        return "error";
        }


    public String postUp(NbaCharacter player, NbaCharacter npc, Mention mention, Scanner sc ){

            int isFoul = npc.PushingFoul(player.muscle);
            if(isFoul == 1){
                SharedPlace.attackTimeReset = 1;
                mention.FoulMent(npc,"푸싱",npc.myName,"브랜든 리치");
                player.FailCountZero();
                if(npc.foulCount > 6){
                    mention.FoulFreethrowMent(player,2);
                   return "End Turn";
                }

                return "Foul";
            }

            int postUpSuccess = player.PostUp(npc.muscle,1);

        if(SharedPlace2.endCheck()){ return "End Turn";}


        if(postUpSuccess == 1){
                System.out.println("                                                                            「 [포스트업]을 성공했습니다. 」");
                try{Thread.sleep(500);
            }catch(Exception e){}
            if(SharedPlace2.endCheck()){ return "End Turn";}
            System.out.println("                                                          　 　      「 등을 지고 계속해서 밀고 들어갑니다. 」");
                try{Thread.sleep(500);
            }catch(Exception e){};

                return "PostUp";
            }else if(postUpSuccess == 0){
                System.out.println("                                                                                                                    「 "+npc.myName+"이(가) [포스트업]을 막았습니다. 」");
                try{Thread.sleep(500);
                }catch(Exception e){}
            if(SharedPlace2.endCheck()){ return "End Turn";}
            if(player.failCount > 2){
                    SharedPlace.attackEnd = 1;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                             3번의 공격 실패로 공격권이 넘어갑니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    player.FailCountZero();

                    return "End Turn";
                }
                System.out.println("                                                                 「 공을 끌고 나가 다시 공격 준비를 합니다. 」");
                try{Thread.sleep(500);
            }catch(Exception e){}

                return "Still";
            }

        return "error";
    }

}
