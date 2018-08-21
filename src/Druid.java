

public class Druid extends World{
    private String WearYourArmor;
    private String shapeshifter;
    
    public Druid(String Human, int Attackpower, int Gem, String WearYourArmor, String shapeshifter) {
        super(Human, Attackpower, Gem);
        this.WearYourArmor = WearYourArmor;
        this.shapeshifter = shapeshifter;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Druid's plate armor is : " + WearYourArmor);
        System.out.println("Shapeshift's form is : " + shapeshifter);
    }

    @Override
    public void WearArmorAndTransformYourself() {
        super.WearArmorAndTransformYourself();
        System.out.println(getHuman() + " 's wearing :  " + WearYourArmor );
        System.out.println(getHuman() + " 's attack name is  : Starfall");
    }
    
}
