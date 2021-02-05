package tetris.tetriminos;

public class TetriJ extends Tetrimino {
    public TetriJ() {
        this.shape=new int [][][]{
            {{0,0,0,0}, {0,1,1,1}, {0,0,0,1}, {0,0,0,0}},
            {{0,0,1,1}, {0,0,1,0}, {0,0,1,0}, {0,0,0,0}},
            {{0,1,0,0}, {0,1,1,1}, {0,0,0,0}, {0,0,0,0}},
            {{0,0,1,0}, {0,0,1,0}, {0,1,1,0}, {0,0,0,0}}
        };
    }
}