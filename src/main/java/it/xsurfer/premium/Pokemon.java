package it.xsurfer.premium;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by fabio on 20/10/16.
 */
public class Pokemon implements IPokemon {

    private Set<Point> visited; // = new HashSet<Point>();
    private List<Move> moves;
    private Point position = new Point(0,0);
    private int pokemons = 0;

    public Pokemon(List<Move> moves){
        this.moves = new ArrayList<>(moves);
        visited = new HashSet<>(moves.size());
        catchOne(position);
    }

    public int catchPokemons(){
        for(Move move : moves){
            position = move.execute((int)position.getX(), (int) position.getY());
            catchOne(position);
        }
        return pokemons;
    }

    private void catchOne(Point point){
        if(visited.add(point))
            pokemons++;
    }

}