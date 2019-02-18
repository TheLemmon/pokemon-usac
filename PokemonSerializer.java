import java.io.*;

public class PokemonSerializer {

    private static PokemonSerializer instance;
    
    private PokemonSerializer(){}
    
    public static PokemonSerializer getInstance(){
        if(instance == null){
            instance = new PokemonSerializer();
        }
        return instance;
    }

    public void serializePokemon(Pokemon pokemon, String fileName) {
        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(pokemon);
            output.close();
            file.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public Pokemon deserializePokemon(String fileName) {
        Pokemon pokemon = null;
        try {
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream input = new ObjectInputStream(file);
            pokemon = (Pokemon) input.readObject();
            input.close();
            file.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return pokemon;
    }
}
