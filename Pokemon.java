package pokedex;

public class Pokemon {

    int Number;
    String Name, Classifaction, Pokedex, Gender, Hight, Mass, Type1, Type2, EggGroup1, EggGroup2,
            Abillity1, Abillity2, HiddenAbillity;

    public Pokemon(int NumberOfPokemon, String PokemonName, String Class, String PokemonType1,
            String PokemonType2, String Length, String Weight, String GenderRatio, String BreedingGroup1,
            String BreedingGroup2, String A1, String A2, String HA) {

        Number = NumberOfPokemon;
        Name = PokemonName;
        Classifaction = Class;
        Type1 = PokemonType1;
        Type2 = PokemonType2;
        Mass = Weight;
        Hight = Length;
        Gender = GenderRatio;
        EggGroup1 = BreedingGroup1;
        EggGroup2 = BreedingGroup2;
        Abillity1 = A1;
        Abillity2 = A2;
        HiddenAbillity = HA;
    }

}
