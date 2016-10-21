package it.xsurfer.premium;


import java.awt.*;

/**
 * Created by fabio on 20/10/16.
 */
public enum Move {

    N {
        public Point execute(int currX, int currY) {
            int y = currY + 1;
            return new Point(currX, y);
        }

    },
    S {
        public Point execute(int currX, int currY) {
            int y = currY - 1;
            return new Point(currX, y);
        }

    },
    E {
        public Point execute(int currX, int currY) {
            int x = currX + 1;
            return new Point(x, currY);
        }

    },
    O {
        public Point execute(int currX, int currY) {
            int x = currX - 1;
            return new Point(x, currY);
        }

    };

    public abstract Point execute(int currX, int currY);

}
