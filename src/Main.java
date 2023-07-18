public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("armor");


        System.out.println("Boss information");
        System.out.println("Health " + boss.getHealth());
        System.out.println("Damage " + boss.getDamage());
        System.out.println("Defence " + boss.getDefenseType());

        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Information: ");
        for(Hero hero :heroes){
            System.out.println("Health "+ hero.getHealth());
            System.out.println("Damage "+ hero.getDamage());
            System.out.println("Power "+ hero.getSuperpower());
            System.out.println();
        }
    }

    public static Hero[] createHeroes(){
        Hero hero1 = new Hero(100,20,"Fight");
        Hero hero2 = new Hero(80,30);
        Hero hero3 = new Hero(120,15,"Invisible");
        Hero[] heroes = {hero1,hero2,hero3};
        return heroes;
    }
}