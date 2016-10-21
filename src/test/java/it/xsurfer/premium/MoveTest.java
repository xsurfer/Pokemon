package it.xsurfer.premium;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by fabio on 21/10/16.
 */
public class MoveTest {

    @Test
    public void testNord() throws Exception {
        assertEquals(new Point(0,1), Move.N.execute(0,0));
        assertEquals(new Point(10,1), Move.N.execute(10,0));
        assertEquals(new Point(999,1000), Move.N.execute(999,999));
        assertEquals(new Point(0,-1), Move.N.execute(0,-2));
        assertEquals(new Point(-99,-98), Move.N.execute(-99,-99));
    }

    @Test
    public void testSud() throws Exception {
        assertEquals(new Point(0,-1), Move.S.execute(0,0));
        assertEquals(new Point(10,-1), Move.S.execute(10,0));
        assertEquals(new Point(999,998), Move.S.execute(999,999));
        assertEquals(new Point(0,-3), Move.S.execute(0,-2));
        assertEquals(new Point(-99,-100), Move.S.execute(-99,-99));
    }

    @Test
    public void testEast() throws Exception {
        assertEquals(new Point(1,0), Move.E.execute(0,0));
        assertEquals(new Point(11,0), Move.E.execute(10,0));
        assertEquals(new Point(1000,999), Move.E.execute(999,999));
        assertEquals(new Point(1,-2), Move.E.execute(0,-2));
        assertEquals(new Point(-98,-99), Move.E.execute(-99,-99));
    }

    @Test
    public void testWest() throws Exception {
        assertEquals(new Point(-1,0), Move.O.execute(0,0));
        assertEquals(new Point(9,0), Move.O.execute(10,0));
        assertEquals(new Point(998,999), Move.O.execute(999,999));
        assertEquals(new Point(-1,-2), Move.O.execute(0,-2));
        assertEquals(new Point(-100,-99), Move.O.execute(-99,-99));
    }
}