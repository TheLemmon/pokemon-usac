import java.io.File;
import java.io.IOException;

public class PokemonController {

    private static PokemonController instance;
    
    private PokemonController(){}
    
    public static PokemonController getInstance(){
        if(instance == null){
            instance = new PokemonController();
        }
        return instance;
    }

    public void save(Pokemon pokemon) throws IOException {
        String fileName = "./temp/" + pokemon.getName() + ".ser";
        File file = new File(fileName);
        file.createNewFile();
        PokemonSerializer.getInstance().serializePokemon(pokemon, fileName);
    }

    public Pokemon retrieve(String pokemonName) {
        Pokemon pokemon = null;
        String fileName = "./temp/" + pokemonName + ".ser";
        pokemon = PokemonSerializer.getInstance().deserializePokemon(fileName);
        return pokemon;
    }
}
