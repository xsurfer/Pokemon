package it.xsurfer.premium.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fabio on 20/10/16.
 */
public class MoveConverter {

    public static List<Move> toMoves(String moves){
        if(moves==null)
            return new ArrayList<>();
        List<Move> movesList = new ArrayList<>();
        for(char c : moves.toUpperCase().toCharArray()){
            movesList.add(Move.valueOf(String.valueOf(c)));
        }
        return movesList;
    }
}
