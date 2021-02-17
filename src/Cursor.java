import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cursor extends Cell {
    Rectangle cursor;


    public Cursor(Grid grid) {
        super(5, 5);
        cursor = new Rectangle(Grid.PADDING, Grid.PADDING, Grid.CELL_SIZE, Grid.CELL_SIZE);
        cursor.setColor(Color.GREEN);
        cursor.fill();
    }

public void moveUp(){
        row--;
    cursor.translate(0,-CELL_SIZE);
}

public void moveDown(){}

public void moveLeft(){}

public void moveRight(){}


}