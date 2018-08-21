
public class Hunter extends World {
     private String WearYourArmor;
    
    public Hunter(String Human, int Attackpower, int Gem, String WearYourArmor) {
        super(Human, Attackpower, Gem);
        this.WearYourArmor = WearYourArmor;
        
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Hunter's leather armor is  : " + WearYourArmor);
    }

    @Override
    public void WearArmorAndTransformYourself() {
        super.WearArmorAndTransformYourself(); 
        System.out.println(getHuman() + " 's wearing: " + WearYourArmor);
        System.out.println(getHuman() + " 's attack name : Arcane Shot");
    }
    
}