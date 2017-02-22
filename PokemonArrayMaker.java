/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicholas
 */
public class PokemonArrayMaker {

     ArrayList<Pokemon> DexOfPokemon = new ArrayList();
int Counter=0;
    public PokemonArrayMaker() throws FileNotFoundException {

        try (//Loads arrayList from data
                Scanner read = new Scanner(new File("PokemonList1.txt"))) {
            read.useDelimiter(">");
            while (read.hasNext()) {
                //System.out.println(Counter++);
                String IntAsString = read.next().replaceAll("[^\\x00-\\x7F]", "");
                int Number = Integer.valueOf(IntAsString);
                String Name = read.next();

                String Class = read.next();
                String Type1 = read.next();
                String Type2 = read.next();
                String Entry = read.next();
                String Hight = read.next();
                String Weight = read.next();
                String Gender = read.next();
                String EG1 = read.next();
                String EG2 = read.next();
                String A1 = read.next();
                String A2 = read.next();
                String HA = read.next();
                String Sound = read.next();
                String Evo= read.next();
//                Counter++;
//                System.out.println(Counter);
                Pokemon NewPokemon = new Pokemon(Number,Name,Class,Type1,Type2,Entry,Hight,Weight,Gender,EG1,EG2,A1,A2,HA,Sound,Evo);
               DexOfPokemon.add(NewPokemon);
               
              
            }
           
        }
    }
    
    public ArrayList<Pokemon> ReturnList(){
    
    return DexOfPokemon;
   
    }
    


}
