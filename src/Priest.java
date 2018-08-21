

public class Priest  extends World {
    
    private String WearYourArmor;
            
    public Priest(String Human, int Attackpower, int Gem, String WearYourArmor) {
        super(Human, Attackpower, Gem);
        this.WearYourArmor = WearYourArmor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Priest's leather armor is  : " + WearYourArmor);
    }

    @Override
    public void WearArmorAndTransformYourself() {
        super.WearArmorAndTransformYourself(); 
        System.out.println(getHuman() + " 's wearing:  " + WearYourArmor);
        System.out.println(getHuman() + " 's attack name : Mind Control");
    }
    
}
