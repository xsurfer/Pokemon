package it.xsurfer.premium;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by fabio on 21/10/16.
 */
public class ConverterTest {
    @Test
    public void testEmpty() throws Exception {
        String input = "";
        List<Move> restult = Converter.toMoves(input);
        assertEquals(new ArrayList<Move>(), restult);
    }

    @Test
    public void testNull() throws Exception {
        String input = null;
        List<Move> restult = Converter.toMoves(input);
        assertEquals(new ArrayList<Move>(), restult);
    }

    @Test
    public void testNESO() throws Exception {

        List<Move> expectedResult = new ArrayList<>();
        expectedResult.add(Move.N);
        expectedResult.add(Move.E);
        expectedResult.add(Move.S);
        expectedResult.add(Move.O);

        String input = "neso";
        List<Move> result = Converter.toMoves(input);
        assertEquals(expectedResult, result);

        input = "NeSo";
        result = Converter.toMoves(input);
        assertEquals(expectedResult, result);

        input = "NESO";
        result = Converter.toMoves(input);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testOrder() throws Exception {

        List<Move> expectedResult = new ArrayList<>();
        expectedResult.add(Move.E);
        expectedResult.add(Move.S);
        expectedResult.add(Move.O);
        expectedResult.add(Move.N);

        String input = "neso";
        List<Move> result = Converter.toMoves(input);
        assertNotEquals(expectedResult, result);

        input = "NeSo";
        result = Converter.toMoves(input);
        assertNotEquals(expectedResult, result);

        input = "NESO";
        result = Converter.toMoves(input);
        assertNotEquals(expectedResult, result);
    }
}