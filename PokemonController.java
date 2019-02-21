public class PokemonController {

    private static PokemonController instance;
    private Pokemon[] pokemons = new Pokemon[20];

    private PokemonController(){}
    
    public static PokemonController getInstance(){
        if(instance == null){
            instance = new PokemonController();
        }
        return instance;
    }

    public void save(String name, Boolean state, Integer healthPoint, Integer attackPoint) {
        for (int i = 0; i < pokemons.length - 1; i++) {
            if (pokemons[i] == null) {
                pokemons[i] = new Pokemon(i, name, state, healthPoint, attackPoint);
                return;
            }
        }
    }

    public Pokemon[] retrieve() {
        return this.pokemons;
    }
}
 