
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome The Basicworldzz..");
        System.out.println(" Q for Quit..");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {        
            System.out.println("Which character do you want to select ?");
            String process = scanner.nextLine();
            
            if (process.equals("q")){
                System.out.println("Quitting the world..");
                break;
            }
            else {
                WorldCharacters characters = new WorldCharacters();
                World world = characters.characterUret(process);
                
                if (world == null) {
                    System.out.println("Please type a class shown above !");
                }
                else {
                    world.displayInfo();
                    world.attack();
                    world.WearArmorAndTransformYourself();
                }
            }
            
        }
    }
}
