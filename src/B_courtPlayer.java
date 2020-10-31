public class B_courtPlayer extends Npc {

    public void InitializeStat(){
        myName = "트레이 영";
        age = "21세" ;
        height = "184cm";
        wingSpan = "190cm";
        staminaFixed = 60;
        muscleFixed = 50;
        jumpFixed = 40;
        speedFixed = 50;
        ballHandlingFixed = 50;
        position = "？？";
        basketBallLevel = 40 ;

        point3AbilityFixed = 40 ;
        point2AbilityFixed = 50 ;
        underRim2AbilityFixed = 80;
        layUpAbilityFixed = 70;
        stealAbilityFixed = 40;
        blockAbilityFixed = (jumpFixed + 190)/3;
        freeThrowAbilityFixed = 60;

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

        isLegThrow = 1;
    }

    public int AttackPhase1(){
       int result = rand.nextInt(2);
       return result;
    }
}
