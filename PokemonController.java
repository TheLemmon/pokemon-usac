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
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] == null) {
                pokemons[i] = new Pokemon(i, name, state, healthPoint, attackPoint);
                return;
            }
        }
    }

    public void displayPokemons() {
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] != null) {
                System.out.println(pokemons[i].getName());
            }
        }
    }

    public void edit(Integer id, String name, Integer healthPoint, Integer attackPoint) {
        for (int i = 0; i < pokemons.length; i++) {
            if (i == id) {
                Pokemon pokemon = pokemons[i];
                pokemon.setName(name);
                pokemon.setHealthPoint(healthPoint);
                pokemon.setAttackPoint(attackPoint);
            }
        }
    }

}
 