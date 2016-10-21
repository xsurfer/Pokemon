package it.xsurfer.premium.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fabio on 21/10/16.
 */
public class MoveParserTest {
    @Test
    public void failParsing() throws Exception {
        assertFalse(MoveParser.parse("ABC"));
        assertFalse(MoveParser.parse("NSEOD"));
    }

    @Test
    public void passParsing() throws Exception {
        assertTrue(MoveParser.parse("NSNSNSNS"));
        assertTrue(MoveParser.parse("NSOE"));
        assertTrue(MoveParser.parse("NNNNNNNNNNNNNNNNNNNNNNNNNNN"));
        assertTrue(MoveParser.parse("SSSSSSSSSSSS"));
        assertTrue(MoveParser.parse("EOEOEOEOEOOOOOEEOEOEE"));
        assertTrue(MoveParser.parse("eosn"));
        assertTrue(MoveParser.parse(""));
    }
}