package tetris.tetriminos;

public class TetriT extends Tetrimino {
    public TetriT() {
        this.shape=new int [][][] {
            {{0,0,0,0}, {0,1,1,1}, {0,0,1,0}, {0,0,0,0}},
            {{0,0,1,0}, {0,0,1,1}, {0,0,1,0}, {0,0,0,0}},
            {{0,0,1,0}, {0,1,1,1}, {0,0,0,0}, {0,0,0,0}},
            {{0,0,1,0}, {0,1,1,0}, {0,0,1,0}, {0,0,0,0}}
        };
    }
}
