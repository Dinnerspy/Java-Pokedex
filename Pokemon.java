package pokedex;

import org.apache.commons.lang3.text.WordUtils;

public class Pokemon {

    int Number;
    String Name, Classifaction, Pokedex, Gender, Hight, Mass, Type1, Type2, EggGroup1, EggGroup2,
            Abillity1, Abillity2, HiddenAbillity, Cries, Pre_Evolution;

    public Pokemon(int NumberOfPokemon, String PokemonName, String Class, String PokemonType1,
            String PokemonType2, String Dex, String Length, String Weight, String GenderRatio,
            String BreedingGroup1, String BreedingGroup2, String A1, String A2, String HA,
            String Sound, String Evolution) {

        Number = NumberOfPokemon;
        Name = PokemonName;
        Classifaction = Class;
        Pokedex = WordUtils.wrap(Dex, 30);
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
        Cries = Sound;
        Pre_Evolution = Evolution;

        if (Abillity2.equalsIgnoreCase("")) {

            Abillity2 = "N/A";

        }
        if (HiddenAbillity.equalsIgnoreCase("")) {
            HiddenAbillity = "N/A";

        }

    }

    public void pokemonSound() throws Exception {

        Audio NewPlay = new Audio(Cries);

    }

    public String getname() {

        return Name;
    }

    public void ToStringDex() {
        if (!Type2.equalsIgnoreCase("")) {
            if (!EggGroup2.equalsIgnoreCase("")) {
                System.out.println("Number: " + Number + "\nName: " + Name + "\nClassifaction: The " + Classifaction
                        + "\nTyping: " + Type1 + " & " + Type2 + "\nMass: " + Mass + " Hight: " + Hight +"\nAbillity "+Abillity1+ "\nOther abillity "+Abillity2+"\nHidden Abillity "+HiddenAbillity+"\nDex entry: " + Pokedex + "\nGender Ratio: " + Gender
                        + "\nBreedable with pokemon in the " + EggGroup1 + " & " + EggGroup2 + " EggGroups." + "\nEvolves from " + Pre_Evolution);
            } else {
                System.out.println("Number: " + Number + "\nName: " + Name + "\nClassifaction: The " + Classifaction
                        + "\nTyping: " + Type1 + " & " + Type2 + "\nMass: " + Mass + " Hight: " + Hight +"\nAbillity "+Abillity1+ "\nOther abillity "+Abillity2+"\nHidden Abillity "+HiddenAbillity+ "\nDex entry: " + Pokedex + "\nGender Ratio: " + Gender
                        + "\nBreedable with pokemon in the " + EggGroup1 + " EggGroup." + "\nEvolves from " + Pre_Evolution);

            }
        } else if (!EggGroup2.equalsIgnoreCase("")) {
            System.out.println("Number: " + Number + "\nName: " + Name + "\nClassifaction: The " + Classifaction
                    + "\nTyping: " + Type1 + "\nMass: " + Mass + " Hight: " + Hight + "\nAbillity "+Abillity1+ "\nOther abillity "+Abillity2+"\nHidden Abillity "+HiddenAbillity+"\nDex entry: " + Pokedex + "\nGender Ratio: " + Gender
                    + "\nBreedable with pokemon in the " + EggGroup1 + " & " + EggGroup2 + " EggGroups." + "\nEvolves from " + Pre_Evolution);

        } else {
            System.out.println("Number: " + Number + "\nName: " + Name + "\nClassifaction: The " + Classifaction
                    + "\nTyping: " + Type1 + "\nMass: " + Mass + " Hight: " + Hight + "\nAbillity "+Abillity1+ "\nOther abillity "+Abillity2+"\nHidden Abillity "+HiddenAbillity+"\nDex entry: " + Pokedex + "\nGender Ratio: " + Gender
                    + "\nBreedable with pokemon in the " + EggGroup1 + " EggGroup." + "\nEvolves from " + Pre_Evolution);

        }

    }

}
