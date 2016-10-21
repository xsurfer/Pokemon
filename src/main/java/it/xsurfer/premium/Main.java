package it.xsurfer.premium;

import it.xsurfer.premium.util.Move;
import it.xsurfer.premium.util.MoveConverter;
import it.xsurfer.premium.util.MoveParser;

import java.util.List;
import java.util.Scanner;

/**
 * Created by fabio on 20/10/16.
 */
public class Main {

    public static void main(String... args){

        String input = "";
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your movements: ");
            input = scanner.nextLine();
        }
        while (!MoveParser.parse(input));

        List<Move> moves = MoveConverter.toMoves(input);
        IPokemon ash = new Pokemon(moves);
        int pokemons = ash.catchPokemons();
        System.out.println(pokemons);
    }
}
