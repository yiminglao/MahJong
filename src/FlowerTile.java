import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class FlowerTile extends PictureTile {
    protected ImageIcon image;

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        switch (name)
        {
            case "Chrysanthemum":
            case "chrysanthemum":
                URL imgSpring = getClass().getResource("images/Chrysanthemum.png");
                image = new ImageIcon(imgSpring);
                setToolTipText(toString());
                image.paintIcon(this,g,30,30);
                setToolTipText(super.name);

                break;
            case "Orchid":
            case "orchid":
                URL imgSummer = getClass().getResource("images/Orchid.png");
                image = new ImageIcon(imgSummer);
                setToolTipText(toString());
                image.paintIcon(this,g,30,20);
                setToolTipText(super.name);

                break;
            case "Plum":
            case "plum":
                URL imgFall = getClass().getResource("images/Plum.png");
                image = new ImageIcon(imgFall);
                setToolTipText(toString());
                image.paintIcon(this,g,30,15);
                setToolTipText(super.name);

                break;
            case "Bamboo":
            case "bamboo":
                URL imgWinter = getClass().getResource("images/Bamboo.png");
                image = new ImageIcon(imgWinter);
                setToolTipText(toString());
                image.paintIcon(this,g,35,20);
                setToolTipText(super.name);

                break;
        }
    }
    public FlowerTile(String name)
    {
        super(name);
    }
}
