
public class Warrior extends World {
    private String WearYourArmor;

    public Warrior(String Human, int Attackpower, int Gem, String WearYourArmor) {
        super(Human, Attackpower, Gem);
        this.WearYourArmor = WearYourArmor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Warrior's plate armor is : " + WearYourArmor);
    }

    @Override
    public void WearArmorAndTransformYourself() {
        super.WearArmorAndTransformYourself();
        System.out.println(getHuman() + " 's wearing " + WearYourArmor );
        System.out.println(getHuman() + " 's attack name : ShockWave");
    }
    
}
