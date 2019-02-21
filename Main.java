import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        // Save a pokemon
        PokemonController.getInstance().save("bulbasaur", true, 100, 150);
        PokemonController.getInstance().save("pikachu", true, 100, 150);
        PokemonController.getInstance().save("squitle", true, 100, 150);
        PokemonController.getInstance().save("charmander", true, 100, 150);

        // retrieve pokemons
        Pokemon[] pokemons = PokemonController.getInstance().retrieve();
        for (int i = 0; i < pokemons.length - 1; i++) {
            if (pokemons[i] != null) {
                System.out.println(pokemons[i].getName());
            }
        }
    }
}