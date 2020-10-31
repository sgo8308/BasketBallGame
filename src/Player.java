public class Player extends NbaCharacter {

    int[] shootingSkill = new int[10];
    int[] dribbleSkill = new int[10];
    String[] shootingSkillKorean = new String[10];
    String[] dribbleSkillKorean = new String[10];
    int[] shootingSkillAbility  = new int[10];
    int[] dribbleSkillAbility = new int[10];
    String[] shootingSkillCommand = new String[10];
    String[] dribbleSkillCommand = new String[10];
    String[] shootingSkillInfo = new String[10];
    String[] dribbleSkillInfo = new String[10];

    {
        shootingSkillInfo();
        dribbleSkillInfo();
    }

    public void InitializeStat(){
        myName = "브랜든 리치";
        age = "27세" ;
        height = "191cm";
        wingSpan = "195cm";
//        staminaFixed = 50;
        staminaFixed = 20;
        muscleFixed = 30;
        jumpFixed = 30;
//        speedFixed = 30;
        speedFixed = 80;
        ballHandlingFixed = 70;
        position = "？？";
        basketBallLevel = 0 ;

//        point3AbilityFixed = 30 ;
//        point2AbilityFixed = 30 ;
//        underRim2AbilityFixed = 60;
//        layUpAbilityFixed = 60;
        point3AbilityFixed = 99 ;
        point2AbilityFixed = 89 ;
        underRim2AbilityFixed = 89;
        layUpAbilityFixed = 89;
        stealAbilityFixed = 30;
        blockAbilityFixed = 30;
        freeThrowAbilityFixed = 89;

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

    public void SkillCommandPut(){
        shootingSkillCommand[0] = "fpdldjq";
        shootingSkillCommand[1] = "ejqmfzmffjcl";
        shootingSkillCommand[2] = "vnfdjqwjavj";
        shootingSkillCommand[3] = "tmxpqqor2";
        shootingSkillCommand[4] = "tmxpqqor3";
        shootingSkillCommand[5] = "gnrtit" ;
        shootingSkillCommand[6] = "elqTmfl" ;
        shootingSkillCommand[7] = "ejdzm" ;

        dribbleSkillCommand[0] = "없음";
        dribbleSkillCommand[1] = "zmfhtmdhqj";
        dribbleSkillCommand[2] = "tmvlsanqm";
        dribbleSkillCommand[3] = "vhtmxmdjq";
        dribbleSkillCommand[4] = "없음";
    }

    public void SkillPut(){
        shootingSkill[0] = isLayUp;
        shootingSkill[1] = isDoubleClutch;
        shootingSkill[2] = isPullUpJumper;
        shootingSkill[3] = isStepBack2;
        shootingSkill[4] = isStepBack3;
        shootingSkill[5] = isHookShot;
        shootingSkill[6] = isDeepThree;
        shootingSkill[7] = isDunk;

        dribbleSkill[0] = isLegThrow;
        dribbleSkill[1] = isCrossOver;
        dribbleSkill[2] = isSpinMove;
        dribbleSkill[3] = isPostUp;
        dribbleSkill[4] = isBehindBack;
    }

    public void ShootingSkillKoreaen(){
        shootingSkillKorean[0] = "[레이업]　　     ";
        shootingSkillKorean[1] = "[더블 클러치]    ";
        shootingSkillKorean[2] = "[풀업 점퍼]　    ";
        shootingSkillKorean[3] = "[스텝백 점퍼 2점]";
        shootingSkillKorean[4] = "[스텝백 점퍼 3점]";
        shootingSkillKorean[5] = "[훅 샷]　　    　";
        shootingSkillKorean[6] = "[딥 쓰리]    　　";
        shootingSkillKorean[7] = "[덩크]　　　     ";

    }

    public void shootingSkillInfo(){
        shootingSkillInfo[0] = "* 골대 가까이에서 시도할 수 있는 가장 쉽고 안정적인 슛";
        shootingSkillInfo[1] = "* 레이업 중 블로킹을 피하기 위하여 공중에서 페이크를 넣거나 몸을 움츠린 후 다시 슛을 시도하는 동작";
        shootingSkillInfo[2] = "* 공을 가지고 드리블을 하며 움직이다 쏘는 형태의 슛 수비수의 방해를 피할 수 있다";
        shootingSkillInfo[3] = "* 대치상황에서 순간적으로 스텝을 뒤로 밟아 슛을 던지는 2점 기술";
        shootingSkillInfo[4] = "* 대치상황에서 순간적으로 스텝을 뒤로 밟아 슛을 던지는 3점 기술";
        shootingSkillInfo[5] = "* 몸을 반쯤 돌려 골대를 옆으로 둔 상태에서 공을 든 손을 위로 쑥 뻗은 후 던져 넣는 슛";
        shootingSkillInfo[6] = "* 3점 라인 훨씬 바깥에서 쏘는 3점 기술";
        shootingSkillInfo[7] = "* 공을 들고 뛰어서 림 위에서 아래로 내리꽂는 형태의 슛";
    }

    public void DribbleSkillKorean(){
        dribbleSkillKorean[0]  = "[레그 쓰루]　";
        dribbleSkillKorean[1]  = "[크로스오버] ";
        dribbleSkillKorean[2]  = "[스핀 무브]　";
        dribbleSkillKorean[3]  = "[포스트업]　 ";
        dribbleSkillKorean[4]  = "[비하인드 백]";
    }

    public void dribbleSkillInfo(){
        dribbleSkillInfo[0] = "* 공을 다리 사이로 집어 넣는 기술 , 스틸 당할 확률을 낮춰 준다.";
        dribbleSkillInfo[1] = "* 농구에서 V자로 방향전환하는 드리블";
        dribbleSkillInfo[2] = "* 이름 그대로 드리블 도중 몸을 회전시키는 기술";
        dribbleSkillInfo[3] = "* 상대 수비와 림을 등지고 공격하는 방식";
        dribbleSkillInfo[4] = "* 드리블 도중 공을 등 뒤로 넘기는 기술이다";
    }

    public void StatWindow(){

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                             ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n"+
                           "                                                                                             이름　　: 브랜든 리치\n" +
                           "                                                                                             나이　　: 27세  \n" +
                           "                                                                                             키　　　: "+"195cm  \n"+
                           "                                                                                             윙스팬　: " + "200cm  \n" +
                           "                                                                                             포지션　: " + position+"\n"+
                           "                                                                                             체력　　: " + stamina+"\n"+
                           "                                                                                             스피드　: " + speedFixed +"\n"+
                           "                                                                                             점프력　: " + jumpFixed +"\n"+
                           "                                                                                             근육량　: " + muscleFixed+"\n"+
                           "                                                                                             3점슛 　: " + point3AbilityFixed+"\n"+
                           "                                                                                             2점슛 　: " + point2AbilityFixed+"\n"+
                           "                                                                                             골밑슛　: " + underRim2AbilityFixed+"\n"+
                           "                                                                                             볼핸들링: " + ballHandlingFixed+"\n"+
                           "                                                                                             경험치　: " + basketBallLevel+"\n"+
                           "                                                                                             ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n\n\n\n\n\n\n\n\n");
    }

    public void SkillWindow(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n                                                                                      ==================  슈팅 스킬  ===================\n");
        System.out.println("                                                                                           스킬 이름                        커맨드                        "+"\n");

        for (int i = 0; i < shootingSkill.length; i++) {
            if (shootingSkill[i] == 1) {
        System.out.println("\n                                                                                           "+shootingSkillKorean[i]+"                "+shootingSkillCommand[i]+"      "+shootingSkillInfo[i]+"\n");
            }
        }
        System.out.println("\n                                                                                      ==================  드리블 스킬  ==================\n");
        System.out.println("                                                                                           스킬 이름                        커맨드                        "+"\n");
        for (int i = 0; i < dribbleSkill.length; i++) {
            if (dribbleSkill[i] == 1) {
        System.out.println("\n                                                                                          "+dribbleSkillKorean[i]+"                     "+dribbleSkillCommand[i]+"      "+dribbleSkillInfo[i]+"\n");
            }
        }
        System.out.println("\n                                                                                      ==================================================");

    }

    public void getStamina(){
        if(stamina < staminaFixed-4){
            stamina = stamina + 5;
        }else if(stamina > staminaFixed - 5){
            stamina = staminaFixed;
        }



    }}
