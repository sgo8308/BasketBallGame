public class A_courtPlayer extends Npc {

    public void InitializeStat(){
        myName = "자말 머레이";
        age = "27세" ;
        height = "190cm";
        wingSpan = "195cm";
        staminaFixed = 50;
        muscleFixed = 40;
        jumpFixed = 30;
        speedFixed = 30;
        ballHandlingFixed = 30;
        position = "？？";
        basketBallLevel = 20 ;

        point3AbilityFixed = 30 ;
        point2AbilityFixed = 40 ;
        underRim2AbilityFixed = 70;
        layUpAbilityFixed = 60;
        stealAbilityFixed = 30;
        blockAbilityFixed = (jumpFixed + 190)/3;
        freeThrowAbilityFixed = 50;

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

    }

    public int AttackPhase1(){
       int result = rand.nextInt(2);
       return result;
    }
}
