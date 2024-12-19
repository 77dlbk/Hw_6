public class Skeleton extends Boss{
    private int numberOfArrows;
    public Skeleton(String name,int health, int damage, Weapon weapon, int numberOfArrows) {
        super(name ,health, damage, weapon);
        this.numberOfArrows = numberOfArrows;

    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Количество стрел: " + numberOfArrows);
    }
}
