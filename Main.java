import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        // Save a pokemon
        PokemonController.getInstance().save("bulbasaur", true, 100, 150);
        PokemonController.getInstance().save("pikachu", true, 100, 150);
        PokemonController.getInstance().save("squitle", true, 100, 150);
        PokemonController.getInstance().save("charmander", true, 100, 150);
        PokemonController.getInstance().save("jj", true, 100, 150);

        // retrieve pokemons
        PokemonController.getInstance().displayPokemons();
    }
}