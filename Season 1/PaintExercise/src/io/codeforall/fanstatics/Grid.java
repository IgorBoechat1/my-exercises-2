package io.codeforall.fanstatics;


import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.ArrayList;
import java.util.List;


public class Grid {

    private final int PADDING = 10;
    public final int CELLSIZE = 20; // celula inicial(mini quadrados)

    private int cols; //colunas
    private int rows; // linhas
    private Rectangle rectangle; // retangulo grande
    public GridPosition[][] gridPositions;
    public Cursor cursor;


    // construtor da grid
    public Grid(int cols, int rows) {

        this.cols = cols;
        this.rows = rows;
        cursor = new Cursor();
        init();
    }

    // inicialiação dos mini retangulos
    public void init() {
        gridPositions = new GridPosition[cols][rows];
        for (int i = 0; i < getCols(); i++) {
            for (int j = 0; j < getRows(); j++) {
                Rectangle rectangle = new Rectangle(PADDING, PADDING, cols * CELLSIZE, rows * CELLSIZE);
                rectangle.draw();
                gridPositions[i][j] = new GridPosition(i, j, this);

            }
        }
    }

    public int getCellSize() {
        return CELLSIZE;
    }

    public GridPosition makeGridPosition(int col, int row) {
        return new GridPosition(col, row, this);
    }


    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int rowToY(int row) {
        return (row * CELLSIZE) + PADDING;
    }

    public int columnToX(int column) {
        return (column * CELLSIZE) + PADDING;
    }



}


