public class Main {
    public static void main(String[] args) {
        Magic Eudora = new Magic();
        Medic Raphael = new Medic();
        Warrior Argus = new Warrior();
        Hero[] i = {Eudora, Raphael, Argus};
        for (Hero num : i) {
            num.applySuperAbility();
        }
    }
}