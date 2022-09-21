public abstract class Hero implements HavingSuperAbility {
    public int damag;
    public int health;
    public String supper;

    public String getSupper() {
        return supper;
    }

    public void setSupper(String supper) {
        this.supper = supper;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamag() {
        return damag;
    }

    public void setDamag(int damag) {
        this.damag = damag;
    }
}
