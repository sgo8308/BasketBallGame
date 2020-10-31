public class James extends Npc {

    public void InitializeStat(){
        myName = "르브론 제임스";
        age = "35세" ;
        height = "203cm";
        wingSpan = "213cm";
        staminaFixed = 90;
        muscleFixed = 100;
        jumpFixed = 85;
        speedFixed = 70;
        ballHandlingFixed = 65;
        position = "？？";
        basketBallLevel = 80 ;

        point3AbilityFixed = 50 ;
        point2AbilityFixed = 70 ;
        underRim2AbilityFixed = 90;
        layUpAbilityFixed = 90;
        stealAbilityFixed = 60;
        blockAbilityFixed = (jumpFixed + 203)/3 + 10;
        freeThrowAbilityFixed = 70;

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

        isLegThrow  = 1;
    }

    public int AttackPhase1(){
       int result = rand.nextInt(3);
       return result;
    }
}
