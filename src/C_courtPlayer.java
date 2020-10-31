public class C_courtPlayer extends Npc {

    public void InitializeStat(){
        myName = "파스칼 시아캄";
        age = "23세" ;
        height = "200cm";
        wingSpan = "203cm";
        staminaFixed = 70;
        muscleFixed = 65;
        jumpFixed = 50;
        speedFixed = 60;
        ballHandlingFixed = 60;
        position = "？？";
        basketBallLevel = 60 ;

        point3AbilityFixed = 50 ;
        point2AbilityFixed = 60 ;
        underRim2AbilityFixed = 90;
        layUpAbilityFixed = 80;
        stealAbilityFixed = 50;
        blockAbilityFixed = (jumpFixed + 190)/3;
        freeThrowAbilityFixed = 10;

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
