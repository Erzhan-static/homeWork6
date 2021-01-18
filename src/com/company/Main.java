public class Main {

    public static void main(String[] args) {
        // write your code here
        Boss boss = new Boss();
        boss.setSaveType("kogti");
        boss.setbHealth(100);
        boss.setbDamage(10);
        System.out.println("Damage = " + boss.getbDamage() + "," +
                " Health lvl = " + boss.getbHealth() + "," +
                " save - " + boss.getSaveType());
    }

    public static Hero[] createheroes() {
        Hero thor = new Hero("hummer", 50, 200);
        Hero berserk = new Hero("strong", 30, 300);
        Hero golem = new Hero("massive", 10);

        Hero[] heroes = {thor, berserk, golem};
        return heroes;


        for (int i = 0; i <heroes.length ; i++) {
            System.out.println("Hero: "+ heroes);
        }
    }

}