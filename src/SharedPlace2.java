public class SharedPlace2 {



    public static synchronized boolean endCheck(){
        if(SharedPlace.attackEnd == 1 || SharedPlace.gameEnd == 1){
            return true;
        }
        return false;
    }
    public static synchronized boolean attackTimeResetCheck(){
        if(SharedPlace.attackTimeReset == 1){
            return true;
        }
        return false;
    }

    public static synchronized boolean playerDefenseWayCheck(){
        if(SharedPlace.playerDefenseWay.equals("0")){
            return true;
        }
        return false;
    }
    public static synchronized void attackEnd1(){
        SharedPlace.attackEnd = 1 ;
    }
    public static synchronized void attackEnd0(){
        SharedPlace.attackEnd = 0 ;
    }
    public static synchronized void gameEnd1(){
        SharedPlace.gameEnd = 1 ;
    }
    public static synchronized void gameEnd0(){
        SharedPlace.gameEnd = 0 ;
    }

    public static synchronized void attackTimeReset1(){
        SharedPlace.attackTimeReset = 1 ;
    }
    public static synchronized void attackTimeReset0(){
        SharedPlace.attackTimeReset = 0 ;
    }




    public synchronized void notifyTest(){
        notify();
    }






}
