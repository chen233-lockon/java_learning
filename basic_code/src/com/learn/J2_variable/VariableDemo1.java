package com.learn.J2_variable;

public class VariableDemo1 {
     public static void main(String[] args) {
     /*微信余额：0元
     支付宝余额：10元
     银行卡余额：20元
     问题一：请问我的账户总余额是多少？
     问题二：微信收了10元红包，又发了5元红包，现在我的账户余额是多少？*/
     double wechat = 0;
     double alipay = 10;
     double bank = 20;
//   问题一：请问我的账户总余额是多少？
        System.out.println("账户总余额为：" + (wechat + alipay + bank));
//   问题二：微信收了10元红包，又发了5元红包，现在我的账户余额是多少？
        System.out.println("账户新的总余额为：" + (wechat + alipay + bank + 10 - 5));
//        普通攻击伤害公式：攻击力-防御力
//        技能造成伤害 = 攻击力*技能加成-对方的防御力
//   定义叉子的攻击力
//        java 中int占4字节，32 位
        int stickAttack = 220;
//   定义叉子的防御力
        int stickDefense = 85;
//   定义叉子的血量1012.5
        double stickBlood = 1012.5;
//   定义我方叉子的技能加成1.2
        double stickSkill = 1.2;
//   同理对方长手攻击为210，防御为80，血量为1223.3，技能加成1.3
        int longHandAttack = 210;
        int longHandDefense = 80;
        double longHandBlood = 1223.3;
        double longHandSkill = 1.3;
//   我方第一次进行普通攻击，造成多少伤害，对方还剩多少血量？
//    我方普通攻击造成的伤害
        double stickDamage = stickAttack - longHandDefense;
        longHandBlood -= stickDamage;
        System.out.println("我方第一次攻击造成了"+stickDamage+"伤害，对方还剩"+longHandBlood+"血量");
//     我方第二次进行技能攻击，造成多少伤害，对方还剩多少血量？
        double stickSkillDamage = stickAttack * stickSkill - longHandDefense;
        longHandBlood -= stickSkillDamage;
        System.out.println("我方第二次攻击造成了"+stickSkillDamage+"伤害，对方还剩"+longHandBlood+"血量");
        int a =2 ,b = 3,c = 2,d = 1;
        System.out.println(a+b*c/d);
    }
}
