public class Jordan extends Npc implements Runnable {
    Player player;

    public void InitializeStat(){
        myName = "마이클 조던";
        age = "57세";
        height = "198cm";
        wingSpan = "205cm";
        staminaFixed = 100;
        muscleFixed = 90;
        jumpFixed = 90;
        speedFixed = 90;
        ballHandlingFixed = 90;
        position = "가드";
        basketBallLevel = 100 ;

        point3AbilityFixed = 60 ;
        point2AbilityFixed = 70 ;
        underRim2AbilityFixed = 100;
        layUpAbilityFixed = 100;
        stealAbilityFixed = 80;
        blockAbilityFixed = (jumpFixed + 198)/3 + 10;
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

        isLegThrow  = 1;
    }

    public int AttackPhase1(){
       int result = rand.nextInt(2);
       return result;
    }

    public int FreeThrowLineDunk(){
        int result = 1;
        myScore = myScore + 2;
        if(stamina > 4){
        stamina = stamina - 4;
        }
        return result;
    }

    public void ClutchTime(){
        point3Ability = point3AbilityFixed + 20;
        point2Ability = point2AbilityFixed + 20;
        underRim2Ability = underRim2AbilityFixed + 20;
        freeThrowAbility = freeThrowAbilityFixed + 20;
        stealAbility = stealAbilityFixed + 20;
        ballHandling = ballHandlingFixed + 20;
        layUpAbility = layUpAbilityFixed + 20;

    }

    @Override
    public void run() {

    }
}
