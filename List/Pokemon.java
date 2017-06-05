public class Pokemon { 
   public String name; 
   public int level;
   
   public Pokemon(String name, int level) { 
      this.name = name;
      this.level = level;
   }

   public static void main(String[] args) {
      Pokemon p = new Pokemon("Pikachu", 17);
      int level = 100;
      change(p, level);
      System.out.println("Name: " + p.name + ", Level: " + p.level);
   }
   public static void change(Pokemon poke, int level) { 
      poke.level = level;
      level = 50;
      poke = new Pokemon("Gengar", 1); // poke no longer point to "p" in main, 
                                       // so the following change will not affect "p" in main 
                                       // but the "p" in main still points to the original object
   } 
}