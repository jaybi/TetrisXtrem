package tetris.tetriminos;


public class TetriS extends Tetrimino {
    public TetriS() {
        this.shape = new int [][][] {
            {{0,0,0,0}, {0,0,1,1}, {0,1,1,0}, {0,0,0,0}},
            {{0,0,1,0}, {0,0,1,1}, {0,0,0,1}, {0,0,0,0}},
            {{0,0,0,0}, {0,0,1,1}, {0,1,1,0}, {0,0,0,0}},
            {{0,0,1,0}, {0,0,1,1}, {0,0,0,1}, {0,0,0,0}}
        };
    }
}