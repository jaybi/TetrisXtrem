package tetris;

public class Area {

    private final int AREA_WIDTH = 10;
    private final int AREA_HEIGHT = 23;
    private final int SPAWN_X = 5;
    private final int SPAWN_Y = 1;

    private int[][] area = new int[AREA_WIDTH][AREA_HEIGHT];

    public int[][] getArea(){
        return this.area;
    }

}
