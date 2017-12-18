import javax.swing.*;
import java.awt.*;
import java.net.*;

public class Bamboo1Tile extends PictureTile {
    protected ImageIcon image;
    public Bamboo1Tile()
    {
        super("Sparrow");
        URL imgUrl = getClass().getResource("images/Sparrow.png");
        image = new ImageIcon(imgUrl);
        setToolTipText(toString());
    }


    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        image.paintIcon(this,g,30,20);
    }

    public String toString()
    {
        return "Bamboo 1";
    }
}
