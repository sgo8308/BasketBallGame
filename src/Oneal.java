public class Oneal extends Npc {

    public void InitializeStat(){
        myName = "샤킬 오닐";
        age = "48세";
        height = "216cm";
        wingSpan = "229cm";
        staminaFixed = 70;
        muscleFixed = 100;
        jumpFixed = 80;
        speedFixed = 50;
        ballHandlingFixed = 50;
        position = "센터";
        basketBallLevel = 80 ;

        point3AbilityFixed = 40 ;
        point2AbilityFixed = 55 ;
        underRim2AbilityFixed = 100;
        layUpAbilityFixed = 100;
        stealAbilityFixed = 30;
        blockAbilityFixed = (jumpFixed + 198)/3 + 10;
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

        isLayUp = isCrossOver = isSpinMove = isLegThrow = isPullUpJumper = isStepBack3 = isStepBack2 = isBehindBack = isDunk = isPostUp = isShoulderFake = isHookShot = isDoubleClutch = isDeepThree = 0;
    }
}
