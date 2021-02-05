package tetris;

public class TetriZ extends Tetrimino {
    public TetriZ() {
        this.shape = new int [][][]{
            {{0,0,0,0}, {0,1,1,0}, {0,0,1,1}, {0,0,0,0}},
            {{0,0,0,0}, {0,1,1,0}, {0,0,1,1}, {0,0,0,0}},
            {{0,0,0,1}, {0,0,1,1}, {0,0,1,0}, {0,0,0,0}}
        };
    }
}