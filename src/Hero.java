public class Hero {
    private String superAbility;
    private int HDamage;
    private int HHealth;


    public Hero(String superAbility, int HDamage, int HHealth) {
        this.superAbility = superAbility;
        this.HDamage = HDamage;
        this.HHealth = HHealth;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

    public int getHDamage() {
        return HDamage;
    }

    public void setHDamage(int HDamage) {
        this.HDamage = HDamage;
    }

    public int getHHealth() {
        return HHealth;
    }

    public void setHHealth(int HHealth) {
        this.HHealth = HHealth;
    }

    public Hero(String superAbility, int HDamage) {
        this.superAbility = superAbility;
        this.HDamage = HDamage;
    }
}
