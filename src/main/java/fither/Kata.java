package fither;

public class Kata {
//    public static String declareWinner(Kata.Fighter fighter1, Kata.Fighter fighter2, String firstAttacker) {
//        if (fighter1.name.equals(firstAttacker)) {
//            while (fighter2.health > 0 && fighter1.health > 0) {
//                fighter1.attack(fighter2);
//                if (fighter2.health < 1) {
//                    return fighter1.name;
//                }
//                fighter2.attack(fighter1);
//                if (fighter1.health < 1) {
//                    return fighter2.name;
//                }
//
//            }
//        } else {
//            while (fighter1.health > 0 && fighter2.health > 0) {
//                fighter1.attack(fighter2);
//                if (fighter1.health < 1) {
//                    return fighter2.name;
//                }
//
//                fighter2.attack(fighter1);
//                if (fighter2.health < 1) {
//                    return fighter1.name;
//                }
//            }
//        }
//        return null;
//    }
//    public class Fighter {
//        public String name;
//        public int health, damagePerAttack;
//        public Fighter(String name, int health, int damagePerAttack) {
//            this.name = name;
//            this.health = health;
//            this.damagePerAttack = damagePerAttack;
//        }
//        public void attack(Kata.Fighter fighter) {
//            fighter.health = fighter.health - damagePerAttack;
//            if (health <=0) {
//                System.out.println(fighter.name + " Боец сдох");
//            }
//
//        }
//
//    }
    public static String declareWinner(Fighter a, Fighter b, String firstAttacker) {
        if (firstAttacker.equals(a.name)) {
            return attack(a, b);
        }
        return attack(b, a);
    }

    public static String attack(Fighter fighter1, Fighter fighter2) {
        fighter2.health -= fighter1.damagePerAttack;
        if (fighter2.health < 1) {
            return fighter1.name;
        }
        return attack(fighter2, fighter1);
    }
}