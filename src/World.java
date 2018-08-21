public class World {
    private String Human;
    private int Attackpower;
    private int Gem;

    public World(String Human, int Attackpower, int Gem) {
        this.Human = Human;
        this.Attackpower = Attackpower;
        this.Gem = Gem;
    }

    public String getHuman() {
        return Human;
    }

    public void setHuman(String Human) {
        this.Human = Human;
    }

    public int getAttackpower() {
        return Attackpower;
    }

    public void setAttackpower(int Attackpower) {
        this.Attackpower = Attackpower;
    }

    public int getGem() {
        return Gem;
    }

    public void setGem(int Gem) {
        this.Gem = Gem;
    }
    
    public void attack(){
        System.out.println(Human + " " + Attackpower + " with attack and " + Gem + " piece gems has been collected.. ");
    }
    public void WearArmorAndTransformYourself(){
        System.out.println("This human has a armor and trasnform to itself..");
    }
    public void displayInfo(){
        System.out.println("Human Name : " + Human);
        System.out.println("Attacak Power : " + Attackpower);
        System.out.println("Collected Gems : " + Gem);
    }
}
