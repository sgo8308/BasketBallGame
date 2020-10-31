public class Curry extends Npc {

    public void InitializeStat(){
        myName = "스테판 커리";
        age = "32세" ;
        height = "191cm";
        wingSpan = "191cm";
        staminaFixed = 70;
        muscleFixed = 70;
        jumpFixed = 60;
        speedFixed = 80;
        ballHandlingFixed = 80;
        position = "가드";
        basketBallLevel = 80;

        point3AbilityFixed = 65 ;
        point2AbilityFixed = 70 ;
        underRim2AbilityFixed = 80;
        layUpAbilityFixed = 80;
        stealAbilityFixed = 60;
        blockAbilityFixed = (jumpFixed + 198)/3 - 20;
        freeThrowAbilityFixed = 20;

        stamina = staminaFixed;
        jump = jumpFixed ;
        speed = speedFixed ;
        ballHandling = ballHandlingFixed ;
        point3Ability = point3AbilityFixed ;
        point2Ability = point2AbilityFixed ;
        underRim2Ability = underRim2AbilityFixed ;
        layUpAbility = layUpAbilityFixed ;
        blockAbility = blockAbilityFixed ;
        stealAbility = stealAbilityFixed ;
        freeThrowAbility = freeThrowAbilityFixed ;

        failCount = 0;
        foulCount = 0;
        myScore = 0;
        staminaEffectCount = 0;

        isBehindBack = isLegThrow = 1;
    }

    public int AttackPhase0(){
       int result = -1;
       int randNumber = rand.nextInt(100);
       if(randNumber < 20){
           result = 1;
       }else {
           result = 0;
       }
       return result;
    }

    public int AttackPhase1(){
       int result = rand.nextInt(3);
       return result;
    }
}
