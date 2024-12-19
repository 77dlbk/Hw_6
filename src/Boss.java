public class Boss extends GameEntity{
    private Weapon weapon;
    public Boss(String name, int health, int damage, Weapon weapon) {
        super(name , health, damage);
        this.weapon = weapon;
    }
    public void printInfo(){
        System.out.println("Информация o " + getName() + "\nЗдоровье: " + getHealth() + "\nУрон " + getDamage());
    }



}
