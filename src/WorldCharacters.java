

public class WorldCharacters {
    public World characterUret(String select_character) {
        
        
        if (select_character.equals("Warrior")) {
            return new Warrior("Arthas", 1000, 300, "Baron Geddon");
        }
        else if (select_character.equals("Hunter")) {
            return new Hunter("Rexxar", 500, 800, "Woodlor's Raid Bracers");
        }
        else if (select_character.equals("Priest")) {
            return new Priest("Crossblesser", 300, 900, "Legionfall Barbute");
        }
        else if (select_character.equals("Druid")) {
            return new Druid("Petekqt", 300, 850, "Chestpiece of the Viper", "Bear Form");
        }
        else {
            return null;
        }
    }
}
