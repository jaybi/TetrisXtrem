public class Tetrimino {
    protected int posx;
    protected int posy;
    protected int orientation ;
    protected int[][][] shape = new int[4][4][4] ;

    Tetrimino(){
        
    }

}

public class TetriI extends Tetrimino {
    public TetriI{
        this.shape={
            { { {0,0,0,0}, {1,1,1,1}, {0,0,0,0}, {0,0,0,0} } },
            { { {0,0,1,0}, {0,0,1,0}, {0,0,1,0}, {0,0,1,0} } },
            { { {0,0,0,0}, {1,1,1,1}, {0,0,0,0}, {0,0,0,0} } },
            { { {0,0,1,0}, {0,0,1,0}, {0,0,1,0}, {0,0,1,0} } }
           };
    }
}

public class TetriO extends Tetrimino {
    TetriO{
        this.shape={
            { { {{0,0,0,0}}, {{0,1,1,0}}, {{0,1,1,0}}, {{0,0,0,0}} } },
            { { {{0,0,0,0}}, {{0,1,1,0}}, {{0,1,1,0}}, {{0,0,0,0}} } },
            { { {{0,0,0,0}}, {{0,1,1,0}}, {{0,1,1,0}}, {{0,0,0,0}} } },
            { { {{0,0,0,0}}, {{0,1,1,0}}, {{0,1,1,0}}, {{0,0,0,0}} } }
           };
    }
}

public class TetriT extends Tetrimino {
    TetriT{
        this.shape={{
            { { {{0,0,0,0}}, {{0,1,1,1}}, {{0,0,1,0}}, {{0,0,0,0}} } },
            { { {{0,0,1,0}}, {{0,0,1,1}}, {{0,0,1,0}}, {{0,0,0,0}} } },
            { { {{0,0,1,0}}, {{0,1,1,1}}, {{0,0,0,0}}, {{0,0,0,0}} } },
            { { {{0,0,1,0}}, {{0,1,1,0}}, {{0,0,1,0}}, {{0,0,0,0}} } }
           }};
    }
}

public class TetriJ extends Tetrimino {
    TetriJ{
        this.shape={{
            { { {{0,0,0,0}}, {{0,1,1,1}}, {{0,0,0,1}}, {{0,0,0,0}} } },
            { { {{0,0,1,1}}, {{0,0,1,0}}, {{0,0,1,0}}, {{0,0,0,0}} } },
            { { {{0,1,0,0}}, {{0,1,1,1}}, {{0,0,0,0}}, {{0,0,0,0}} } },
            { { {{0,0,1,0}}, {{0,0,1,0}}, {{0,1,1,0}}, {{0,0,0,0}} } }
           }};
    }
}


public class TetriZ extends Tetrimino {
    TetriZ{
        this.shape={{
            { { {{0,0,0,0}}, {{0,1,1,0}}, {{0,0,1,1}}, {{0,0,0,0}} } },
            { { {{0,0,0,1}}, {{0,0,1,1}}, {{0,0,1,0}}, {{0,0,0,0}} } },
            { { {{0,0,0,0}}, {{0,1,1,0}}, {{0,0,1,1}}, {{0,0,0,0}} } },
            { { {{0,0,0,1}}, {{0,0,1,1}}, {{0,0,1,0}}, {{0,0,0,0}} } }
           }};
    }
}

public class TetriS extends Tetrimino {
    TetriS{
        this.shape={{
            { { {{0,0,0,0}}, {{0,0,1,1}}, {{0,1,1,0}}, {{0,0,0,0}} } },
            { { {{0,0,1,0}}, {{0,0,1,1}}, {{0,0,0,1}}, {{0,0,0,0}} } },
            { { {{0,0,0,0}}, {{0,0,1,1}}, {{0,1,1,0}}, {{0,0,0,0}} } },
            { { {{0,0,1,0}}, {{0,0,1,1}}, {{0,0,0,1}}, {{0,0,0,0}} } }
           }};
    }
}