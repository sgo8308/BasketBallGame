import java.util.Random;

public class NbaCharacter {
    SharedPlace sharedPlace;
    int doLegThrow , doSteal;
    //스탯 스킬 변수
    String myName,age,height,wingSpan,position;
    int stamina,muscle,jump,speed,ballHandling,basketBallLevel;
    int point3Ability,point2Ability,underRim2Ability,layUpAbility,freeThrowAbility;
    int blockAbility, stealAbility;
    int legThrewAbility;

    //기타 변수
    int myScore,foulCount,failCount,staminaEffectCount;
    int isLayUp, isCrossOver, isSpinMove,isLegThrow,isPostUp,isShoulderFake,isDunk,isPullUpJumper,isStepBack2,isStepBack3,isHookShot,isDoubleClutch ,isDeepThree,isBehindBack;
    int doPoint3,doPoint2,doUnderRim,doLayUp;

    //스탯 고정값
    int staminaFixed,heightFixed,wingSpanFixed,muscleFixed,jumpFixed,speedFixed,ballHandlingFixed;
    int point3AbilityFixed,point2AbilityFixed,underRim2AbilityFixed,layUpAbilityFixed,freeThrowAbilityFixed;
    int blockAbilityFixed, stealAbilityFixed;


    String turn;

    Random rand = new Random();

    //슈팅 기술
    public int shootingInOrOut(String skillName,int opponentBlock, int opponentNearBy, int opponentIsBlock,int opponentFoul) {
        int probability = -1;
        switch (skillName){
            case "point3" :
                probability = Math.round(point3Ability - Math.abs(90-sharedPlace.gauge)  - opponentNearBy * 10 - opponentIsBlock * (opponentBlock / 10 - 40*opponentFoul));
                if(stamina>1){
                stamina--;
                }
                break;
            case "point2" :
                probability = Math.round(point2Ability- Math.abs(60-sharedPlace.gauge) - opponentNearBy * 10 - opponentIsBlock * (opponentBlock / 10)- 40*opponentFoul);
                if(stamina>1){
                stamina--;
                }
                break;
            case "underRim" :
                probability = Math.round(underRim2Ability - Math.abs(30-sharedPlace.gauge) - opponentNearBy * 10 - opponentIsBlock * (opponentBlock / 10) - 40*opponentFoul);
                if(stamina>1){
                stamina--;
                }
                break;
            case "layUp" :
                probability = Math.round(layUpAbility - Math.abs(30-sharedPlace.gauge) - opponentNearBy * 10 - opponentIsBlock * (opponentBlock / 10)-40*opponentFoul);
                if(stamina>1){
                stamina--;
                }
                break;
            case "doubleClutch" :
                probability = Math.round(layUpAbility- Math.abs(30-sharedPlace.gauge) - opponentNearBy * 10 - opponentIsBlock * (opponentBlock / 10) - 40*opponentFoul);
                if(stamina>2){
                stamina = stamina - 2;
                }
                break;
            case "pullUpJumper" :
                probability = Math.round(point2Ability- Math.abs(60-sharedPlace.gauge) - opponentNearBy * 5 - opponentIsBlock * (opponentBlock / 20) - 40*opponentFoul);
                if(stamina>2){
                stamina = stamina - 2;
                }
                break;
            case "stepBack2" :
                probability = Math.round(point2Ability- Math.abs(60-sharedPlace.gauge) - opponentNearBy * 5 - opponentIsBlock * (opponentBlock / 20) - 40*opponentFoul);
                if(stamina>2){
                stamina = stamina - 2;
                }
            break;
            case "stepBack3" :
                probability = Math.round(point3Ability- Math.abs(90-sharedPlace.gauge) - opponentNearBy * 5 - opponentIsBlock * (opponentBlock / 20) - 40*opponentFoul);
                if(stamina>2){
                stamina = stamina - 2;
                }
            break;
            case "deepThree" :
                probability = Math.round(point3Ability- Math.abs(90-sharedPlace.gauge) - 10  - 40*opponentFoul);
                if(stamina>2){
                stamina = stamina - 2;
                }
                break;
            case "hookShot" :
                probability = Math.round(underRim2Ability- Math.abs(30-sharedPlace.gauge) - opponentNearBy * 5 - 40*opponentFoul);
                if(stamina>2){
                stamina = stamina - 2;
            }
                break;
            case "fadeAwayUnderRim" :
                probability = Math.round(underRim2Ability- Math.abs(30-sharedPlace.gauge) - opponentNearBy * 5 - opponentIsBlock * (opponentBlock / 20) + 20 - 40*opponentFoul);
                if(stamina>2){
                stamina = stamina - 2;
                }
                break;
            case "dunk" :
                probability = 100;
                if(stamina>3){
                stamina = stamina - 3;
                }
                break;


        }

        int randomNumber = rand.nextInt(100);
        int result;

        if (randomNumber < probability) {
            result = 1;
            if(skillName.equals("point3")||skillName.equals("stepBack3")||skillName.equals("deepThree")){
                if(sharedPlace.gameEnd == 1 ||sharedPlace.attackEnd == 1){
                    myScore = myScore;
                }else {
                    if(myScore < 13) {
                        myScore = myScore + 3;
                    }else {
                        myScore = 15;
                    }
                }
            }else{
                if(sharedPlace.gameEnd == 1 || sharedPlace.attackEnd == 1){
                    myScore = myScore;
                }else {
                    if(myScore<14) {
                        myScore = myScore + 2;
                    }else {
                        myScore = 15;
                    }
                }
            }
        } else {
            result = 0;
        }
        return result;
    }

    public void ShootFake(){
        if(stamina>1){
            stamina--;
        }
    }

    public String FreeThrow(){
        int randNumber = rand.nextInt(100);
        String result;
        randNumber = rand.nextInt(100);
        if(randNumber<freeThrowAbility){
            result = "1";
            myScore = myScore + 1;
        }
        else {
            result = "0";
        }
        return result;
    }

    //기본 공격 기술
    public int penetrationResult(String skillName,int opponentSpeed,int opponentMuscle, int opponentIsBlock, int opponentDefenceWay){
        int probability = -1;
        int result;
        switch (skillName){
            case "basicPenetration" :
                probability = 50 + (speed + muscle - opponentSpeed - opponentMuscle)/2 - (opponentDefenceWay-1)*10 - opponentIsBlock * 10; // 수정필요
                if(stamina>1){
                    stamina--;
                }
                break;
            case "crossOver":
                probability = 50 + (speed + muscle - opponentSpeed - opponentMuscle)/2 - (opponentDefenceWay-1)*10 - opponentIsBlock * 5; // 수정필요
                if(stamina>2){
                    stamina = stamina - 2;
                }
                break;
            case "spinMove":
                probability = 50 + speed - opponentSpeed - (opponentDefenceWay-1)*10 - opponentIsBlock * 5;
                if(stamina>2){
                    stamina = stamina - 2;
                }

            case "behindBack":
                probability = 50 + (speed + muscle - opponentSpeed - opponentMuscle)/2 - (opponentDefenceWay-1)*10 - opponentIsBlock * 5;
                if(stamina > 2){
                    stamina = stamina - 2;
                }
                break;
        }
        if ( opponentIsBlock == 4) {
            result = 1;
        } else {
            if ((speed - opponentSpeed) > 30) {
                result = 1;
            } else {
                int randNumber = rand.nextInt(100);
                if (randNumber <probability) {
                    result = rand.nextInt(2) +1 ;
                } else {
                    result = 0;
                    failCount++;
                }
            }
        }
        return result;
    }

    public int PostUp(int opponentMuscle,int opponentIsBlock){
        int result = -1;
        if(opponentIsBlock==0){
            result = 1;
        }else if(opponentIsBlock ==1){
            int probability = 70 + muscle - opponentMuscle;
            int randomNumber = rand.nextInt(100);
            if (randomNumber < probability) {
            result = 1;
            } else {
            result = 0;
            failCount++;
            }
        }
        if(stamina > 2){
        stamina = stamina - 2;
        }
        return result;
    }

    //기본 수비 기술
    public void SideStep (){
        if(stamina>1){
        stamina--;
        }
    }
    public void Block (){
        if(stamina>1){
        stamina--;
        }
    }
    public String Steal (int opponentBallHandling,int legThrewAbility){
        int randNumber = rand.nextInt(100);
        int probability;
        String result;
//        probability = stealAbility - opponentBallHandling/10 - legThrewAbility*10;
        probability = 0;
        if(randNumber < probability){
            result = "1";
        }else {
            result = "0";
        }
        if(stamina>1){
        stamina = stamina - 1;
        }
        return result;
    }
    public void PostUpDefence(){
        if(stamina>1){
        stamina--;
        }
    }


    //기타

    public void FailCountZero(){
        failCount = 0;
    }
    public void FoulCountZero(){
        foulCount = 0;
    }

    public void StaminaEffect(){
        int fall = 0;
        if(staminaEffectCount == 0){
            if(stamina < staminaFixed/2 && stamina > staminaFixed/4 ){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                  " + myName+"의 체력이 50% 이하로 떨어졌습니다. 모든 능력치가 10만큼 하락합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                fall = 10;
                staminaEffectCount ++;
            }
        }
        if(staminaEffectCount == 1){
           if(stamina < staminaFixed/4 ){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                  " + myName+"의 체력이 25% 이하로 떨어졌습니다. 모든 능력치가 20만큼 더 하락합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                fall = 20;
                staminaEffectCount ++;
           }
        }
        if(staminaEffectCount == 2){
           if(stamina < 2 ){
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                     " + myName+"의 체력이 모두 바닥났습니다. 모든 능력치가 30만큼 더 하락합니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                fall = 30;
                staminaEffectCount ++;
            }
        }
        jump = jumpFixed - fall;
        speed = speedFixed - fall;
        ballHandling = ballHandlingFixed - fall;
        point3Ability = point3AbilityFixed - fall;
        point2Ability = point2AbilityFixed - fall;
        underRim2Ability = underRim2AbilityFixed - fall;
        layUpAbility = layUpAbilityFixed - fall;
        freeThrowAbility = freeThrowAbilityFixed - fall;
        blockAbility = blockAbilityFixed - fall;
        stealAbility = stealAbilityFixed - fall;
        freeThrowAbility = freeThrowAbilityFixed - fall;

        
    }


    public void AfterGameInitialize(){
        jump = jumpFixed ;
        speed = speedFixed ;
        ballHandling = ballHandlingFixed ;
        point3Ability = point3AbilityFixed ;
        point2Ability = point2AbilityFixed ;
        underRim2Ability = underRim2AbilityFixed ;
        layUpAbility = layUpAbilityFixed ;
        freeThrowAbility = freeThrowAbilityFixed ;
        blockAbility = blockAbilityFixed ;
        stealAbility = stealAbilityFixed ;
        freeThrowAbility = freeThrowAbilityFixed ;
        failCount = 0;
        foulCount = 0;
        myScore = 0;
        staminaEffectCount = 0;
        doPoint3 = doPoint2 = doUnderRim = doLayUp = 0;

    }
    
    //파울 메소드

    public int BlockingFoul(int opponentSpeed){
        int result;
        int probability = 10 + (opponentSpeed - speed)/10;
        int randNumber = rand.nextInt(100);
        if(randNumber < probability){
            result = 1;
            foulCount ++;
        }else {
           result = 0;
        }
    return result;
    }

    public int HackingFoul(int opponentBallHandling){
            int result;
            int probability = 10 + (opponentBallHandling - stealAbility)/10;
            int randNumber = rand.nextInt(100);
            if(randNumber < 20){
                result = 1;
                foulCount ++;
            }else {
               result = 0;
            }
        return result;
        }

    public int ShootingFoul(int opponentJump){
            int result;
            int probability = 10 + (opponentJump - jump)/10;
            int randNumber = rand.nextInt(100);
            if(randNumber < probability){
                result = 1;
                foulCount ++;
            }else {
               result = 0;
            }
        return result;
        }

    public int PushingFoul(int opponentMuscle){
        int result;
        int probability = 10 + (opponentMuscle - muscle)/10;
        int randNumber = rand.nextInt(100);
        if(randNumber < probability){
            result = 1;
            foulCount ++;
        }else {
           result = 0;
        }
    return result;
    }

    public void FoulUp() {
        foulCount ++;
    }

    public void InitializeScore(){ myScore = 0;}

    public void StaminaDown(){
        stamina --;
    }

    public void StaminaInitialize(){stamina = staminaFixed;}

    //NPC 메소드

    public int DunkOrPullUpOrPene(int opponentScore){
        int result;
        int randNumber = rand.nextInt(100);

        if(stamina<30 && myScore<13 && opponentScore < 13){
            result = rand.nextInt(2)+2;
        }else if(stamina < 30 && (myScore>=13 || opponentScore >= 13)){
            result = 1;
        }else if(stamina >=30 && (myScore>=13 || opponentScore >= 13)){
            result = 1;
        }else{
            if(randNumber < 20){
            result = 1;
            }else if(randNumber>=20&&randNumber<60){
                result = 2;
            }else{
                result = 3;
            }
        }
        return result ;
    }

    public int ShootOrFake(){
        int result = rand.nextInt(2)+1;
        return result;
    }

    public int PenetrationOrCrossOver(){
        int result = rand.nextInt(2)+1;
        return result;
    }
    public int LayUpOrDunk(int opponentScore){
        int result;
        if(stamina<30 && myScore<13 && opponentScore < 13){
           result = 1;
        }else if(stamina < 30 && (myScore>=13 || opponentScore >= 13)){
            result = 2;
        }else if(stamina >=30 && (myScore>=13 || opponentScore >= 13)){
            result = 2;
        }else{
            result = rand.nextInt(2)+1;
        }
        return result;
    }
    public int LayUpOrDoubleClutch(){
        int result = rand.nextInt(2)+1;
        return result;
    }
    public int PostUpOrFadeAway(){
        int result = rand.nextInt(2)+1;
        return result;
    }
}


