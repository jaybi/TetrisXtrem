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
}
