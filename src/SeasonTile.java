import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class SeasonTile extends PictureTile {

    protected ImageIcon image;

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        switch (name)
        {
            case "Spring":
            case "spring":
                URL imgSpring = getClass().getResource("images/Spring.png");
                image = new ImageIcon(imgSpring);
                setToolTipText(toString());
                image.paintIcon(this,g,30,30);
                break;
            case "Summer":
            case "summer":
                URL imgSummer = getClass().getResource("images/Summer.png");
                image = new ImageIcon(imgSummer);
                setToolTipText(toString());
                image.paintIcon(this,g,30,20);
                break;
            case "Fall":
            case "fall":
                URL imgFall = getClass().getResource("images/Fall.png");
                image = new ImageIcon(imgFall);
                setToolTipText(toString());
                image.paintIcon(this,g,30,15);
                break;
            case "Winter":
            case "winter":
                URL imgWinter = getClass().getResource("images/Winter.png");
                image = new ImageIcon(imgWinter);
                setToolTipText(toString());
                image.paintIcon(this,g,30,20);
                break;
        }
    }

    public SeasonTile(String name)
    {
        super(name);
    }
}
