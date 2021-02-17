import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {
    private Rectangle rectangle;
    private int col;
    private int row;
    private boolean painted;

    public Cell(int col, int row) {

        rectangle = new Rectangle(Grid.PADDING + Grid.CELL_SIZE * col, Grid.PADDING + Grid.CELL_SIZE * row, Grid.CELL_SIZE, Grid.CELL_SIZE);
        rectangle.setColor(Color.BLACK);
        rectangle.draw();
    }

    public int getRow(int i) {
        return row;
    }

    public int getCol(int i) {
        return col;
    }

}
