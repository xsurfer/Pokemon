package it.xsurfer.premium;

import it.xsurfer.premium.util.Move;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by fabio on 20/10/16.
 */
public class PokemonTest {
    @Test
    public void moveToE() throws Exception {

        List<Move> moves = new ArrayList<Move>();
        moves.add(Move.E);
        IPokemon pok = new Pokemon(moves);
        int result = pok.catchPokemons();
        assertEquals(2, result);
    }

    @Test
    public void moveToNESO() throws Exception {

        List<Move> moves = new ArrayList<Move>();
        moves.add(Move.N);
        moves.add(Move.E);
        moves.add(Move.S);
        moves.add(Move.O);
        IPokemon pok = new Pokemon(moves);
        int result = pok.catchPokemons();
        assertEquals(4, result);
    }

    @Test
    public void moveToNSNSNSNSNS() throws Exception {

        List<Move> moves = new ArrayList<Move>();
        moves.add(Move.N);
        moves.add(Move.S);
        moves.add(Move.N);
        moves.add(Move.S);
        moves.add(Move.N);
        moves.add(Move.S);
        moves.add(Move.N);
        moves.add(Move.S);
        moves.add(Move.N);
        moves.add(Move.S);
        IPokemon pok = new Pokemon(moves);
        int result = pok.catchPokemons();
        assertEquals(2, result);
    }

    @Test
    public void movingUP() throws Exception {
        List<Move> moves = new ArrayList<Move>(9999999);
        for (int i=0; i<9999999;i++)
            moves.add(Move.N);

        IPokemon pok = new Pokemon(moves);
        int result = pok.catchPokemons();
        assertEquals(10000000, result);
    }

    @Test
    public void smallCircle() throws Exception {
        List<Move> moves = new ArrayList<Move>(9999999);
        for (int i=0; i<3;i++)
            moves.add(Move.N);
        for (int i=0; i<3;i++)
            moves.add(Move.O);
        for (int i=0; i<3;i++)
            moves.add(Move.S);
        for (int i=0; i<3;i++)
            moves.add(Move.E);

        IPokemon pok = new Pokemon(moves);
        int result = pok.catchPokemons();
        assertEquals(12, result);
    }

    @Test
    public void bigCircle() throws Exception {
        List<Move> moves = new ArrayList<Move>(9999999);
        for (int i=0; i<999;i++)
            moves.add(Move.N);
        for (int i=0; i<999;i++)
            moves.add(Move.O);
        for (int i=0; i<999;i++)
            moves.add(Move.S);
        for (int i=0; i<999;i++)
            moves.add(Move.E);

        IPokemon pok = new Pokemon(moves);
        int result = pok.catchPokemons();
        assertEquals(3996, result);
    }

    @Test
    public void star() throws Exception {
        List<Move> moves = new ArrayList<Move>(9999999);
        for (int i=0; i<3;i++)
            moves.add(Move.N);
        moves.add(Move.S);
        for (int i=0; i<3;i++)
            moves.add(Move.O);
        moves.add(Move.E);
        for (int i=0; i<3;i++)
            moves.add(Move.S);
        moves.add(Move.N);
        for (int i=0; i<3;i++)
            moves.add(Move.E);

        IPokemon pok = new Pokemon(moves);
        int result = pok.catchPokemons();
        assertEquals(12, result);
    }

    @Test
    public void empty() throws Exception {
        IPokemon pok = new Pokemon(new ArrayList<>());
        int result = pok.catchPokemons();
        assertEquals(1, result);
    }
}