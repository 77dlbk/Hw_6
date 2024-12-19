public class Hw_6_main {
    public static void main(String[] args) {
        Weapon bossWeapon= new Weapon(WeaponType.COLD, "Sword");
        Boss boss = new Boss("Dark boss", 400, 50, bossWeapon);
        boss.printInfo();
        Weapon weaponOfSkeleton1 = new Weapon(WeaponType.BOW, "Fire Bow");
        Skeleton skeleton1 = new Skeleton("Fire skeleton", 200, 70,
                weaponOfSkeleton1, 15);
        Weapon weaponOfSkeleton2 = new Weapon(WeaponType.BOW, "Frozen Bow");
        Skeleton skeleton2 = new Skeleton("Frozen skeleton", 400, 30,
                weaponOfSkeleton2, 20);
        skeleton1.printInfo();
        skeleton2.printInfo();


    }
}
