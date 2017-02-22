/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedex;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicholas
 */
public class Pokedex {
    

    public static void main(String[] args) throws FileNotFoundException, Exception {
        PokemonArrayMaker newOne = new PokemonArrayMaker();
        ArrayList<Pokemon> AllPokemon = new ArrayList();
        AllPokemon = newOne.DexOfPokemon;
        String UserResponce;
        int Counter,PokemonPos;
        boolean Continue;
        Continue= false;
        
        System.out.println("Welcome to the txt based Pokedex.\nWe have " + AllPokemon.size() + " Pokemon Loaded in." + "\nPlease Enter the name of a pokemon or number.");
        Scanner myscanner = new Scanner(System.in);
        UserResponce = myscanner.next();
        Counter = 0;
        PokemonPos=-1;

        if (UserResponce.matches("[a-zA-Z]+")) {
            while (Counter < AllPokemon.size()) {
                if (UserResponce.equalsIgnoreCase(AllPokemon.get(Counter).getname())) {
                    PokemonPos = Counter;
                    AllPokemon.get(PokemonPos).pokemonSound();
                    System.out.println("\n\nPokemon Found\n");
                    AllPokemon.get(PokemonPos).ToStringDex();
                }
                Counter++;
            }
            if(PokemonPos==-1){
            
            System.out.println("\nPokemon name not found.");
            
            }

        }else{
        if(Integer.parseInt(UserResponce)>0&&Integer.parseInt(UserResponce)<AllPokemon.size()+1){
        
            AllPokemon.get(Integer.parseInt(UserResponce)-1).pokemonSound();
            AllPokemon.get(Integer.parseInt(UserResponce)-1).ToStringDex();
        
        }else{
        
        
        System.out.println("\nNumber Out of rannge.");
        }
            
       
        
        } 
        System.out.println("\nPlease either type xxx to leave or Pokemons Name or Number.");
        UserResponce = myscanner.next();
        
        Continue = !UserResponce.equalsIgnoreCase("xxx");
        
        while(Continue==true){
            Counter=0;
        if (UserResponce.matches("[a-zA-Z]+")) {
            while (Counter < AllPokemon.size()) {
                if (UserResponce.equalsIgnoreCase(AllPokemon.get(Counter).getname())) {
                    PokemonPos = Counter;
                    AllPokemon.get(PokemonPos).pokemonSound();
                    System.out.println("\n\nPokemon Found\n");
                    AllPokemon.get(PokemonPos).ToStringDex();
                }
                Counter++;
            }
            if(PokemonPos==-1){
            
            System.out.println("\nPokemon name not found.");
            
            }

        }else{
            
        if(Integer.parseInt(UserResponce)>0&&Integer.parseInt(UserResponce)<AllPokemon.size()+1){
        
            AllPokemon.get(Integer.parseInt(UserResponce)-1).pokemonSound();
            AllPokemon.get(Integer.parseInt(UserResponce)-1).ToStringDex();
        
        }else{
        
        
        System.out.println("\nNumber Out of rannge.");
        }
            
       
        
        } 
        System.out.println("\nPlease either type xxx to leave or Pokemons Name or Number.");
        UserResponce = myscanner.next();
        
        Continue = !UserResponce.equalsIgnoreCase("xxx");
        }
    }

}
