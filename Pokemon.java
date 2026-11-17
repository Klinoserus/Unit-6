public class Pokemon {

    public String species;
    public String type;
    public int maxHealth;
    public int health;
    public int attack;
    public static int knockouts;

    Pokemon(String species, String type, int maxHealth, int attack) {
        this.species = species;
        this.type = type;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.attack = attack;
    }

    public void takeDamage(int hp) {
        health -= hp;
        System.out.println(species + " took " + hp + " damage");
        if (health <= 0) {
            health = 0;
            knockouts++;
            System.out.println(species + " was knocked unconscious");
        } else {
            System.out.println(species + " has " + health + " health left");
        }
    }

    public void heal(int hp) {
        health += hp;
        if (health > maxHealth) {
            health = maxHealth;
        }
        System.out.println(species + " healed by " + hp);
        System.out.println(species + " has " + health + " health left");
    }

    public boolean isConcious(Pokemon species) {
        return (species.health > 0);
    }

    public boolean isFriend(Pokemon species) {
        if (species.type.equals(this.type)) {
            System.out.println(this.species + " is friends with " + species.species);
            return true;
        } else {
            return false;
        }
    }

    public void interact(Pokemon species) {

        if (isConcious(this) == false) {

        } else {
            if (isConcious(species) == false) {
                if (isFriend(species) == true) {
                    System.out.println(this.species + " helps the unconscious " + species.species);
                    species.heal(maxHealth / 4);
                } else {
                }
            } else {
                if (isFriend(species) == true) {
                    System.out.println(this.species + " leaves the conscious " + species.species + " alone");
                } else {
                    System.out.println(this.species + " attacks " + species.species);
                    species.takeDamage(attack);
                    takeDamage(species.attack / 2);
                }
            }
        }
    }

    public static void main(String[] args) {

        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 35, 28);
        Pokemon charizard = new Pokemon("Charizard", "Fire", 78, 42);
        Pokemon squirtle = new Pokemon("Squirtle", "Water", 44, 25);
        Pokemon charmander = new Pokemon("Charmander", "Fire", 38, 26);

        charmander.interact(pikachu);
        squirtle.interact(charmander);
        charizard.interact(squirtle);
        pikachu.interact(squirtle);
        charizard.interact(charmander);
        charmander.interact(charizard);
        pikachu.interact(charmander);

        System.out.println("Total knockouts: " + knockouts);

    }
}
