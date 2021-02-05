package tetris;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest {
    @Test
    public void checkSizeNewArea() {
        Area area = new Area();
        assertEquals(area.getArea().length,10);
        assertEquals(area.getArea()[0].length,23);
    }


    @Test 
    public void checkMovingRightPiece() {
        Area area = new Area();
        TetriI piece = new TetriI();
        piece.posx = 5;
        piece.posy = 12;
        assertTrue(area.move_right(piece));
        assertTrue(piece.posx == 6);
        assertTrue(piece.posy == 12);
        
    }

    @Test 
    public void checkMovingLeftPiece() {
        Area area = new Area();
        TetriI piece = new TetriI();
        piece.posx = 5;
        piece.posy = 12;
        assertTrue(area.move_left(piece));
        assertTrue(piece.posx == 4);
        assertTrue(piece.posy == 12);
        
    }
    @Test 
    public void checkMovingDownPiece() {
        Area area = new Area();
        TetriI piece = new TetriI();
        piece.posx = 5;
        piece.posy = 12;
        assertTrue(area.move_down(piece));
        assertTrue(piece.posx == 5);
        assertTrue(piece.posy == 13);
        
        
    }

    @Test 
    public void checkNoMovingPiece() {
        Area area = new Area();
        TetriI piece = new TetriI();
        piece.posx = 10;
        piece.posy = 23;
        assertFalse(area.move_right(piece));
        assertFalse(area.move_down(piece));
        /* rotate complexe pour les cas spéciaux */
        piece.posx = 0;
        assertFalse(area.move_left(piece));
    }
}
