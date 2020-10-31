import java.sql.ShardingKey;
import java.util.Random;

public class NpcDefense implements Runnable{
    String isStealSuccess = "-1";

    static Mention mention = new Mention();

    SharedPlace sharedPlace ;
    Npc npc;
    Player player;

    Random rand = new Random();


    NpcDefense(SharedPlace sharedPlace, Npc npc, Player player){
        this.sharedPlace = sharedPlace;
        this.npc = npc;
        this.player = player;
    }

    @Override
    public void run() {
        //하프라인 방어
        sharedPlace.setDefenseWay();

        if(StateCheckThread.state.equals(Thread.State.TERMINATED)){
            return;
        }

        if(SharedPlace.gameEnd == 1){
           return;
        }

        if(sharedPlace.attackWay0.equals("elqTmfl")){
            try{
                Thread.sleep(2500);
            }catch(Exception e){}

            sharedPlace.npcNearBy = 1;
            try{
                Thread.sleep(300);
            }catch(Exception e){}
            sharedPlace.npcBlock = rand.nextInt(2)+ 1;

            return;
        }

        try{
            Thread.sleep(1000);
        }catch(Exception e){}

        if(SharedPlace.gameEnd == 1){
            return;
        }

        if(SharedPlace2.endCheck()){ return;}

            if(sharedPlace.defenseWay == 1) {
                System.out.println("                                                                                                                    「 "+npc.myName+"이(가) 가까이 붙어서 수비를 시작합니다. 」");
                sharedPlace.npcNearBy = 1;
                try{
                    Thread.sleep(500);
                }catch(Exception e){
                  e.printStackTrace();
                }

                while(true){
                    if(SharedPlace.gameEnd ==1){
                        return;
                    }
                    System.out.println("                                                                                                                    「 "+npc.myName+"이(가) 스틸을 시도합니다. 」");
                    try{
                        Thread.sleep(500);
                    }catch(Exception e){}

                    if (SharedPlace.islegthrow == 1){
                        System.out.println("                                                                            「 [레그스루]를 사용했습니다. 」");
                        sharedPlace.isStealSuccess = npc.Steal(player.ballHandling, 2);
                    }else{
                        sharedPlace.isStealSuccess = npc.Steal(player.ballHandling, 0);
                    }

                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){}


                    if(SharedPlace2.endCheck()){ return;}

                    if(!sharedPlace.attackWay1.equals("-1")){
                        break;
                    }

                    if(sharedPlace.isStealSuccess.equals("1")){
                        System.out.println("                                                                                                                    「 "+npc.myName +"이(가) 스틸을 성공했습니다. 」");
                        sharedPlace.attackEnd = 1;

                        try{ Thread.sleep(1000);
                        }catch(Exception e){}

                        if(SharedPlace.gameEnd ==1){
                            return;
                        }

                        mention.ChangeAttackMent(npc.myName);

                        try{Thread.sleep(1000);
                        }catch(Exception e){}

                        return;
                    }else if(sharedPlace.isStealSuccess.equals("0")) {
                        System.out.println("                                                                                                                    「 "+npc.myName +"이(가) 스틸을 실패했습니다. 」");
                    }
                    int time = (rand.nextInt(3)+4) * 750;
                    try{
                        Thread.sleep(time);
                    }catch(Exception e){}

                    if(!sharedPlace.attackWay1.equals("-1")){
                        break;
                    }
                }
            }else {
                if(SharedPlace.gameEnd == 1) {
                    return;
                }
                if(SharedPlace2.endCheck()){ return;}
                System.out.println("\n                                                                                                                  「 "+npc.myName+"이(가) 거리를 두고 수비를 시작합니다. 」");
                sharedPlace.npcNearBy = 0;
            }
            sharedPlace.attackWay0 = "-1";

        if(SharedPlace.gameEnd ==1){
            return;
        }
        //3점라인 방어

        if(sharedPlace.attackWay1.equals("1")){
            if(sharedPlace.defenseWay == 2){
               try{ Thread.sleep(1500);
               }catch(Exception e){}
               sharedPlace.npcNearBy = 1;
            }

            try{ Thread.sleep(300);
            }catch(Exception e){}

            sharedPlace.npcBlock = rand.nextInt(2) + 1;

            return;

        }else if(sharedPlace.attackWay1.equals("2")){
            if(sharedPlace.defenseWay == 2){
               try{ Thread.sleep(1500);
               }catch(Exception e){}
               sharedPlace.npcNearBy = 1;
            }

            try{ Thread.sleep(300);
            }catch(Exception e){}

            sharedPlace.npcBlock = rand.nextInt(2) + 1;

            return;

        }else if(sharedPlace.attackWay1.equals("tmxpqqor3")){
            if(sharedPlace.defenseWay == 1){
                try{ Thread.sleep(2000);
               }catch(Exception e){}
               sharedPlace.npcNearBy = 1;
            }
            if(sharedPlace.defenseWay == 2){
                try{ Thread.sleep(2500);
                }catch(Exception e){}
                sharedPlace.npcNearBy = 1;
            }
            try{ Thread.sleep(300);
            }catch(Exception e){}

            sharedPlace.npcBlock = rand.nextInt(2) + 1;

            return;
        }

        if(SharedPlace.gameEnd ==1){
            return;
        }

        if(StateCheckThread.state.equals(Thread.State.TERMINATED)){
            return;
        }
        //자유투라인 방어
        while(true){
            if(!sharedPlace.attackWay2.equals("-1")){
               break;
            }
        }

        if(sharedPlace.whoseTurn.equals("Fully Penetration")){
            try{ Thread.sleep(3000);
            }catch(Exception e){}
            sharedPlace.npcNearBy = 1;
            sharedPlace.npcBlock = rand.nextInt();
            return;

        }else if(sharedPlace.whoseTurn.equals("Half Penetration")){

            if(sharedPlace.attackWay2.equals("1") || sharedPlace.attackWay2.equals("2")){
                sharedPlace.npcBlock = rand.nextInt(2) + 1;
            }else if(sharedPlace.attackWay2.equals("3") || sharedPlace.attackWay2.equals("tmvlsanqm")){
                sharedPlace.blockOrWait = rand.nextInt(2) + 1;
            }else if(sharedPlace.attackWay2.equals("tmxpqqor2") || sharedPlace.attackWay2.equals("vnfdjqwjavj")){
                try{ Thread.sleep(1500);
                }catch(Exception e){}
                sharedPlace.npcBlock = rand.nextInt(2) + 1;
            }

        }else if(sharedPlace.whoseTurn.equals("PostUp")){
            npc.PostUpDefence();
            if(sharedPlace.attackWay2.equals("tmvlsanqm")){
                sharedPlace.npcBlock = rand.nextInt(2) + 1;
            }else {
                sharedPlace.npcBlock = 1;
            }
        }
        if(SharedPlace.gameEnd ==1){
            return;
        }
        if(StateCheckThread.state.equals(Thread.State.TERMINATED)){
            return;
        }
        //골밑 방어

        while(true){
            if(!sharedPlace.attackWay3.equals("-1")){
               break;
            }
        }

        if(sharedPlace.whoseTurn.equals("Fully Penetration")){
            try{ Thread.sleep(1500);
            }catch(Exception e){}
            sharedPlace.npcNearBy = 1;
            sharedPlace.npcBlock = rand.nextInt();
            return;

        }else if(sharedPlace.whoseTurn.equals("Half Penetration")){
            sharedPlace.npcBlock = rand.nextInt(2) + 1;
            return;
        }else if(sharedPlace.whoseTurn.equals("PostUp")){
            sharedPlace.npcBlock = rand.nextInt(2) + 1;
            return;
        }
        if(StateCheckThread.state.equals(Thread.State.TERMINATED)){
            return;
        }
        if(SharedPlace.gameEnd ==1){
            return;
        }
    }
}
