import java.awt.*;

public class WhiteDragonTile extends Tile
{
    public WhiteDragonTile()
    {
        setToolTipText(toString());
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.WHITE);
        g2.fillRect(30,10,60,80);
        g.setColor(Color.decode("#FFF68F"));
        g2.fillRect(35,15,50,70);

        g2.setPaint(Color.BLUE);
        g2.fillRect(30,10,8,5);
        g2.setPaint(Color.BLUE);
        g2.fillRect(50,10,8,5);
        g2.setPaint(Color.BLUE);
        g2.fillRect(70,10,8,5);

        g2.setPaint(Color.BLUE);
        g2.fillRect(30,85,10,5);
        g2.setPaint(Color.BLUE);
        g2.fillRect(50,85,10,5);
        g2.setPaint(Color.BLUE);
        g2.fillRect(70,85,10,5);

        g2.setPaint(Color.BLUE);
        g2.fillRect(30,20,5,10);
        g2.setPaint(Color.BLUE);
        g2.fillRect(30,40,5,10);
        g2.setPaint(Color.BLUE);
        g2.fillRect(30,60,5,10);
        g2.setPaint(Color.BLUE);
        g2.fillRect(30,80,5,10);

        g2.setPaint(Color.BLUE);
        g2.fillRect(85,20,5,10);
        g2.setPaint(Color.BLUE);
        g2.fillRect(85,40,5,10);
        g2.setPaint(Color.BLUE);
        g2.fillRect(85,60,5,10);
        g2.setPaint(Color.BLUE);
        g2.fillRect(85,80,5,10);
    }

    public String toString()
    {
        return "White Dragon";
    }
}
