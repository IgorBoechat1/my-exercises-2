package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class GridPosition {
    private int col;
    private int row;
    private Grid grid;
    private Rectangle rectangle;
    private Rectangle cursor;


    public GridPosition(int col, int row, Grid grid) {
        this.col = col;
        this.row = row;
        this.grid = grid;
        rectangle = new Rectangle(grid.columnToX(col), grid.rowToY(row), grid.getCellSize(), grid.getCellSize());
        cursor = new Rectangle(10,10, grid.getCellSize(), grid.getCellSize());
        cursor.fill();
        cursor.setColor(Color.BLUE);
        rectangle.draw();
    }

    public Grid getGrid() {
        return grid;
    }

    public void setPos(int col, int row) {
        this.col = col;
        this.row = row;

    }

    public void setColor(int color) {

        rectangle.setColor(Color.BLUE);

        show();
    }

    public void show() {

    }
}
