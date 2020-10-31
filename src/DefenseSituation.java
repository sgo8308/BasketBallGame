import java.util.Random;
import java.util.Scanner;

public class DefenseSituation {
    SharedPlace sharedPlace = new SharedPlace();
    Player player ;
    Npc npc ;

    public void setPlayerNpc(Player player,Npc npc) {
        this.player = player;
        this.npc = npc;
    }

    Random rand = new Random();
    public String shooting(NbaCharacter player, NbaCharacter npc, Mention mention, Scanner sc, String shootNameKor, String shootNameEng , int shootOrFake, String tryBlockOrNot, int opponentNearBy, int point2Or3, int canFoul ){
        int isFoul = -1;
        int isSuccess = -1;
if(SharedPlace2.endCheck()){ return "End Turn";}if(shootOrFake == 2 && tryBlockOrNot.equals("2") && shootNameEng!="doubleClutch"){
            npc.ShootFake();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                   " + npc.myName +"의 훼이크에 속지 않았습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            try{ Thread.sleep(1000);
        }catch(Exception e){}
    if(SharedPlace2.endCheck()){ return "End Turn";}return "Still";
        }else if(shootOrFake == 2 && tryBlockOrNot.equals("1")){
            player.Block();
            npc.ShootFake();
            isSuccess = npc.shootingInOrOut(shootNameEng,player.blockAbility,opponentNearBy,0,0);
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                   " + npc.myName +"의 훼이크에 속았습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            try{ Thread.sleep(1000);
        }catch(Exception e){}
    if(SharedPlace2.endCheck()){ return "End Turn";}SharedPlace.attackTimeReset = 1;
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                          " + npc.myName +"이(가) 블락을 피하고 "+shootNameKor+"를(을) 시도합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }else {
            isFoul = player.ShootingFoul(npc.jump);

            if(canFoul == 0 || tryBlockOrNot.equals("2")){
               isFoul = 0;
            }
    if(SharedPlace2.endCheck()){ return "End Turn";}SharedPlace.attackTimeReset = 1;
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                             " + npc.myName + "이(가) " + shootNameKor + "를(을) 시도합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            if(tryBlockOrNot.equals("1") && isFoul != 1) {
                player.Block();
                    isSuccess = npc.shootingInOrOut(shootNameEng,player.blockAbility, opponentNearBy, 1, 0);
            }else if(tryBlockOrNot.equals("2") ){
                isSuccess = npc.shootingInOrOut(shootNameEng,player.blockAbility,opponentNearBy,0,0);
            }else if(tryBlockOrNot.equals("1") && isFoul == 1) {
                player.Block();
        if(SharedPlace2.endCheck()){ return "End Turn";}SharedPlace.attackTimeReset = 1;
                isSuccess = npc.shootingInOrOut(shootNameEng,player.blockAbility, opponentNearBy, 1, 1);
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  / - 브랜든 리치의 슈팅 파울 - / \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }
        }

        try{ Thread.sleep(1000);
        }catch(Exception e){}

if(SharedPlace2.endCheck()){ return "End Turn";}if(isSuccess == 1){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                             " + npc.myName +"의 "+shootNameKor+"이(가) 성공하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            SharedPlace.attackTimeReset = 1;

            if(npc.myScore > 14){
                SharedPlace2.gameEnd1();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-------------------------------------------------------------------------------------------------------------경기종료" +
                                                        "---------------------------------------------------------------------------------------------------------\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                try{ Thread.sleep(1000);
                }catch(Exception e){}
                return "GameEnd";
            }
            if(isFoul == 1){
                SharedPlace.attackTimeReset = 1;
                try{ Thread.sleep(1000);
        }catch(Exception e){}
                mention.FoulFreethrowMent(npc,1);
            }
        }else if(isSuccess == 0){
            if(isFoul == 1){
        if(SharedPlace2.endCheck()){ return "End Turn";}SharedPlace.attackTimeReset = 1;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                             " + npc.myName +"의 "+shootNameKor+"이(가) 실패했습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                try{ Thread.sleep(1000);
        }catch(Exception e){}
                mention.FoulFreethrowMent(npc,point2Or3);
            }else if(shootOrFake == 1 && tryBlockOrNot.equals("1")){
        if(SharedPlace2.endCheck()){ return "End Turn";}SharedPlace.attackTimeReset = 1;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                     " + npc.myName +"의 "+shootNameKor+"을(를) 블락하는데 성공했습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }else {
        if(SharedPlace2.endCheck()){ return "End Turn";}SharedPlace.attackTimeReset = 1;
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                             " + npc.myName +"의 "+shootNameKor+"이(가) 실패했습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }
        }
if(SharedPlace2.endCheck()){ return "End Turn";}SharedPlace.attackTimeReset = 1;
        try{ Thread.sleep(1000);
        }catch(Exception e){}
        mention.ChangeAttackMent(player.myName);
        try{Thread.sleep(1000);
        }catch(Exception e){}
        npc.FailCountZero();
        return "End Turn";


    }

    public String penetration(NbaCharacter player, NbaCharacter npc, Mention mention, Scanner sc, String skillNameKor, String skillNameEng , String blockOrWaitOrStealOrNo, int isBlock, int defenceWay ){
        String select;

        if(blockOrWaitOrStealOrNo.equals("1") || blockOrWaitOrStealOrNo.equals("2")){
            player.SideStep();
            int isFoul= player.BlockingFoul(npc.speed);
            if(isFoul == 1){
        if(SharedPlace2.endCheck()){ return "End Turn";}SharedPlace.attackTimeReset = 1;
                mention.FoulMent(player,"블로킹", player.myName,npc.myName);
                npc.FailCountZero();
                if(player.foulCount > 6){
                    mention.FoulFreethrowMent(npc,2);
                   return "End Turn";
                }
                return "Restart";
            }
        }else if(blockOrWaitOrStealOrNo.equals("3") ){
            if(npc.isLegThrow == 1){
        if(SharedPlace2.endCheck()){ return "End Turn";}System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                       "+npc.myName+"이(가) [레그 스루]를 사용했습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                try{ Thread.sleep(1000);
                }catch(Exception e){}
                npc.StaminaDown();
            }

            int isFoul = player.HackingFoul(npc.ballHandling);
            if(isFoul == 1){
                SharedPlace.attackTimeReset = 1;
                mention.FoulMent(player,"해킹", player.myName,npc.myName);
                npc.FailCountZero();
                if(player.foulCount > 6){
                    mention.FoulFreethrowMent(npc,2);
                   return "End Turn";
                }
                return "Restart";
            }else {
                String StealSuccess = player.Steal(npc.ballHandling, npc.legThrewAbility);
        if(SharedPlace2.endCheck()){ return "End Turn";}if(StealSuccess.equals("1")){
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                             "+npc.myName+"의 공을 스틸했습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    SharedPlace.attackTimeReset = 1;
                    npc.FailCountZero();
                    try{ Thread.sleep(1000);
                    }catch(Exception e){}
                    mention.ChangeAttackMent(player.myName);
                    try{ Thread.sleep(1000);
                    }catch(Exception e){}
                    return "End Turn";
                }else if(StealSuccess.equals("0")){
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                          "+npc.myName+"의 공을 스틸하지 못했습니다.\n");
            if(SharedPlace2.endCheck()){ return "End Turn";}System.out.println("\n                                                                                         "+npc.myName+"이(가) 다시 공격 준비를 합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    try{ Thread.sleep(1000);
                    }catch(Exception e){}
                    return "Still";
                }
            }
        }

        int penetrationSuccess = npc.penetrationResult(skillNameEng,player.speed, player.muscle,isBlock,defenceWay);

        if(penetrationSuccess == 1){
    if(SharedPlace2.endCheck()){ return "End Turn";}System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                          "+npc.myName+"의 "+ skillNameKor +"를 막는데 실패했습니다.\n");
            System.out.println("-------------------------------------------------------------------------------------------------" +
                "------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                                                                       1. 파울로 끊기                2. 파울하지 않기\n-------------------------------------------------------------------------------------------------" +
        "------------------------------------------------------------------------------------------------------------------------------\n\n\n\n\n\n");
            select = sc.nextLine();
            if(SharedPlace2.endCheck()){ return "End Turn";}
            if(select.equals("1")){
                player.FoulUp();
                SharedPlace.attackTimeReset = 1;
                mention.FoulMent(npc,"홀딩","브랜든 리치",npc.myName);
                npc.FailCountZero();
                if(player.foulCount > 6){
                    mention.FoulFreethrowMent(npc,2);
                   return "End Turn";
                }
                return "Restart";
            }
            return "Fully Penetration";

        }else if(penetrationSuccess == 0){
    if(SharedPlace2.endCheck()){ return "End Turn";}System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                         "+npc.myName+"의 "+ skillNameKor +"를(을) 막는데 성공했습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            try{ Thread.sleep(1000);
            }catch(Exception e){}
            if(npc.isBehindBack == 1){
                int randNumber = rand.nextInt(2);
                if(randNumber == 1){
            if(SharedPlace2.endCheck()){ return "End Turn";}System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                         스테판 커리가 [비하인드 백 드리블]을 사용합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    try{ Thread.sleep(1000);
                    }catch(Exception e){}
                    npc.failCount --;
                    return penetration(player, npc, mention, sc, "[비하인드 백 드리블]", "behindBack", "4", 0, 1);
                }
            }


            if(npc.failCount > 2){
        if(SharedPlace2.endCheck()){ return "End Turn";}System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                               3번의 공격 실패로 공격권이 넘어갑니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                try{ Thread.sleep(1000);
                }catch(Exception e){}
                npc.FailCountZero();
                return "End Turn";
            }
    if(SharedPlace2.endCheck()){ return "End Turn";}System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                       "+npc.myName+"이(가) 공을 끌고 나가 다시 공격 준비를 하고 있습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            try{ Thread.sleep(1000);
            }catch(Exception e){}
            return "Still";

        }else if(penetrationSuccess == 2){
    if(SharedPlace2.endCheck()){ return "End Turn";}System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                              "+npc.myName+"를(을) 사이드스텝으로 따라갑니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            try{ Thread.sleep(1000);
            }catch(Exception e){}
            return "Half Penetration";

        }
        return "error";
        }

    public String postUp(NbaCharacter player, NbaCharacter npc, Mention mention, Scanner sc , String blockOrWaitOrSteal ){

        if(blockOrWaitOrSteal.equals("1")){
            int isFoul = player.PushingFoul(npc.muscle);
            if(isFoul == 1){
        if(SharedPlace2.endCheck()){ return "End Turn";}SharedPlace.attackTimeReset = 1;
                mention.FoulMent(player,"푸싱","브랜든 리치",npc.myName);
                npc.FailCountZero();
                if(player.foulCount > 6){
                    mention.FoulFreethrowMent(npc,2);
                   return "End Turn";
                }
                return "Restart";
            }

            player.PostUpDefence();
            int postUpSuccess = npc.PostUp(player.muscle,1);

            if(postUpSuccess == 1){
        if(SharedPlace2.endCheck()){ return "End Turn";}System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                             "+npc.myName+" [포스트업]을 막지 못했습니다. \n");
                System.out.println(("\n                                                                                           "+npc.myName+"이 등을 지고 계속해서 밀고 들어옵니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"));
                try{ Thread.sleep(1000);
                }catch(Exception e){}
                return "PostUp";
            }else if(postUpSuccess == 0){
        if(SharedPlace2.endCheck()){ return "End Turn";}System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                              "+npc.myName+" [포스트업]을 막아냈습니다.\n");
                try{ Thread.sleep(1000);
                }catch(Exception e){}
                if(npc.failCount > 2){
            if(SharedPlace2.endCheck()){ return "End Turn";}System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                             3번의 공격 실패로 공격권이 넘어갑니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    try{Thread.sleep(1000);
                    }catch(Exception e){}
                    npc.FailCountZero();
                    return "End Turn";
                }
        if(SharedPlace2.endCheck()){ return "End Turn";}System.out.println("\n                                                                                   "+npc.myName+"이(가) 공을 끌고 나가 다시 공격 준비를 하고 있습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                try{ Thread.sleep(1000);
        }catch(Exception e){}
                return "Still";
            }
        }else if(blockOrWaitOrSteal.equals("2")){
    if(SharedPlace2.endCheck()){ return "End Turn";}
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                       "+npc.myName+"이(가) 등을 지고 서서히 3점 라인 안쪽으로 들어오고 있습니다. ");
            return "PostUp";
        }
        else if(blockOrWaitOrSteal.equals("3")){
            int isFoul = player.HackingFoul(npc.ballHandling);
    if(SharedPlace2.endCheck()){ return "End Turn";}if(isFoul == 1){
                SharedPlace.attackTimeReset = 1;
                mention.FoulMent(player,"해킹","브랜든 리치",npc.myName);
               npc.FailCountZero();
               if(player.foulCount > 6){
                   mention.FoulFreethrowMent(npc,2);
                   return "End Turn";
                }
               return "Restart";
            }
            String isSuccess = player.Steal(npc.ballHandling, npc.legThrewAbility);
            if(isSuccess.equals("1")){
        if(SharedPlace2.endCheck()){ return "End Turn";}System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                  "+npc.myName+" 공을 스틸했습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                SharedPlace.attackTimeReset = 1;
                npc.FailCountZero();
                mention.ChangeAttackMent(player.myName);
                try{ Thread.sleep(1000);
                }catch(Exception e){}
                return "End Turn";

            }else if(isSuccess.equals("0")){
        if(SharedPlace2.endCheck()){ return "End Turn";}
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                                "+npc.myName+" 공을 스틸하지 못했습니다.\n");
                System.out.println(("\n                                                                                           "+npc.myName+"이(가) 등을 지고 계속해서 밀고 들어옵니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"));
                try{ Thread.sleep(1000);
                }catch(Exception e){}
                return "PostUp";
            }
        }
        return "error";
    }
}



    