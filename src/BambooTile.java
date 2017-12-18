import java.awt.*;

public class BambooTile extends RankTile{
    public BambooTile(int rank)
    {
        super(rank);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        switch (rank)
        {
            case 2:
                g.setColor(Color.BLUE);
                g2.fillRect(55,15,10,30);
                g2.fillRoundRect(50,12,20,5,5,5);
                g2.fillRoundRect(50,42,20,5,5,5);
                g.setColor(Color.GREEN);
                g2.fillRect(55,55,10,30);
                g2.fillRoundRect(50,52,20,5,5,5);
                g2.fillRoundRect(50,83,20,5,5,5);
                setToolTipText(toString());
                break;
            case 3:
                g.setColor(Color.BLUE);
                g2.fillRect(55,15,10,30);
                g2.fillRoundRect(50,12,20,5,5,5);
                g2.fillRoundRect(50,42,20,5,5,5);
                g.setColor(Color.GREEN);
                g2.fillRect(40,55,10,30);
                g2.fillRoundRect(35,52,20,5,5,5);
                g2.fillRoundRect(35,83,20,5,5,5);
                g.setColor(Color.GREEN);
                g2.fillRect(70,55,10,30);
                g2.fillRoundRect(65,52,20,5,5,5);
                g2.fillRoundRect(65,83,20,5,5,5);
                setToolTipText(toString());

                break;
            case 4:
                g.setColor(Color.GREEN);
                g2.fillRect(40,15,10,30);
                g2.fillRoundRect(35,12,20,5,5,5);
                g2.fillRoundRect(35,42,20,5,5,5);
                g.setColor(Color.BLUE);
                g2.fillRect(70,15,10,30);
                g2.fillRoundRect(65,12,20,5,5,5);
                g2.fillRoundRect(65,42,20,5,5,5);
                g.setColor(Color.BLUE);
                g2.fillRect(40,55,10,30);
                g2.fillRoundRect(35,52,20,5,5,5);
                g2.fillRoundRect(35,83,20,5,5,5);
                g.setColor(Color.GREEN);
                g2.fillRect(70,55,10,30);
                g2.fillRoundRect(65,52,20,5,5,5);
                g2.fillRoundRect(65,83,20,5,5,5);
                setToolTipText(toString());

                break;
            case 5:
                g.setColor(Color.GREEN);
                g2.fillRect(30,15,10,30);
                g2.fillRoundRect(25,12,20,5,5,5);
                g2.fillRoundRect(25,42,20,5,5,5);
                g.setColor(Color.BLUE);
                g2.fillRect(80,15,10,30);
                g2.fillRoundRect(75,12,20,5,5,5);
                g2.fillRoundRect(75,42,20,5,5,5);
                g.setColor(Color.RED);
                g2.fillRect(55,35,10,30);
                g2.fillRoundRect(50,32,20,5,5,5);
                g2.fillRoundRect(50,62,20,5,5,5);
                g.setColor(Color.BLUE);
                g2.fillRect(30,55,10,30);
                g2.fillRoundRect(25,52,20,5,5,5);
                g2.fillRoundRect(25,82,20,5,5,5);
                g.setColor(Color.GREEN);
                g2.fillRect(80,55,10,30);
                g2.fillRoundRect(75,52,20,5,5,5);
                g2.fillRoundRect(75,82,20,5,5,5);
                setToolTipText(toString());

                break;
            case 6:
                g.setColor(Color.GREEN);
                g2.fillRect(30,15,10,30);
                g2.fillRoundRect(25,12,20,5,5,5);
                g2.fillRoundRect(25,42,20,5,5,5);
                g2.fillRect(80,15,10,30);
                g2.fillRoundRect(75,12,20,5,5,5);
                g2.fillRoundRect(75,42,20,5,5,5);
                g2.fillRect(55,15,10,30);
                g2.fillRoundRect(50,12,20,5,5,5);
                g2.fillRoundRect(50,42,20,5,5,5);
                g.setColor(Color.BLUE);
                g2.fillRect(55,55,10,30);
                g2.fillRoundRect(50,52,20,5,5,5);
                g2.fillRoundRect(50,82,20,5,5,5);
                g2.fillRect(30,55,10,30);
                g2.fillRoundRect(25,52,20,5,5,5);
                g2.fillRoundRect(25,82,20,5,5,5);
                g2.fillRect(80,55,10,30);
                g2.fillRoundRect(75,52,20,5,5,5);
                g2.fillRoundRect(75,82,20,5,5,5);
                setToolTipText(toString());

                break;

            case 7:
                g.setColor(Color.RED);
                g2.fillRect(55,5,10,25);
                g2.fillRoundRect(50,2,20,5,5,5);
                g2.fillRoundRect(50,27,20,5,5,5);
                g.setColor(Color.GREEN);
                g2.fillRect(30,38,10,25);
                g2.fillRoundRect(25,35,20,5,5,5);
                g2.fillRoundRect(25,70,20,5,5,5);
                g2.fillRect(30,70,10,25);
                g2.fillRoundRect(25,67,20,5,5,5);
                g2.fillRoundRect(25,92,20,5,5,5);
                g.setColor(Color.BLUE);
                g2.fillRect(55,38,10,25);
                g2.fillRoundRect(50,35,20,5,5,5);
                g2.fillRoundRect(50,60,20,5,5,5);
                g2.fillRect(55,70,10,25);
                g2.fillRoundRect(50,67,20,5,5,5);
                g2.fillRoundRect(50,92,20,5,5,5);
                g.setColor(Color.GREEN);
                g2.fillRect(80,38,10,25);
                g2.fillRoundRect(75,35,20,5,5,5);
                g2.fillRoundRect(75,60,20,5,5,5);
                g2.fillRect(80,70,10,25);
                g2.fillRoundRect(75,67,20,5,5,5);
                g2.fillRoundRect(75,92,20,5,5,5);
                setToolTipText(toString());

                break;
            case 8:
                g.setColor(Color.GREEN);
                g2.fillRect(30,5,10,25);
                g2.fillRoundRect(25,2,20,5,5,5);
                g2.fillRoundRect(25,27,20,5,5,5);
                g.setColor(Color.GREEN);
                g2.fillRect(55,5,10,25);
                g2.fillRoundRect(50,2,20,5,5,5);
                g2.fillRoundRect(50,27,20,5,5,5);
                g.setColor(Color.GREEN);
                g2.fillRect(80,5,10,25);
                g2.fillRoundRect(75,2,20,5,5,5);
                g2.fillRoundRect(75,27,20,5,5,5);
                g.setColor(Color.RED);
                g2.fillRect(70,38,10,25);
                g2.fillRoundRect(65,35,20,5,5,5);
                g2.fillRoundRect(65,60,20,5,5,5);
                g.setColor(Color.RED);
                g2.fillRect(40,38,10,25);
                g2.fillRoundRect(35,35,20,5,5,5);
                g2.fillRoundRect(35,60,20,5,5,5);
                g.setColor(Color.BLUE);
                g2.fillRect(30,70,10,25);
                g2.fillRoundRect(25,67,20,5,5,5);
                g2.fillRoundRect(25,92,20,5,5,5);
                g2.fillRect(55,70,10,25);
                g2.fillRoundRect(50,67,20,5,5,5);
                g2.fillRoundRect(50,92,20,5,5,5);
                g2.fillRect(80,70,10,25);
                g2.fillRoundRect(75,67,20,5,5,5);
                g2.fillRoundRect(75,92,20,5,5,5);
                setToolTipText(toString());

                break;
            case 9:
                g.setColor(Color.RED);
                g2.fillRect(30,5,10,25);
                g2.fillRoundRect(25,2,20,5,5,5);
                g2.fillRoundRect(25,27,20,5,5,5);
                g2.fillRect(55,5,10,25);
                g2.fillRoundRect(50,2,20,5,5,5);
                g2.fillRoundRect(50,27,20,5,5,5);
                g2.fillRect(80,5,10,25);
                g2.fillRoundRect(75,2,20,5,5,5);
                g2.fillRoundRect(75,27,20,5,5,5);
                g.setColor(Color.GREEN);
                g2.fillRect(30,38,10,25);
                g2.fillRect(80,38,10,25);
                g2.fillRect(55,38,10,25);
                g2.fillRoundRect(25,35,20,5,5,5);
                g2.fillRoundRect(25,60,20,5,5,5);
                g2.fillRoundRect(50,35,20,5,5,5);
                g2.fillRoundRect(50,60,20,5,5,5);
                g2.fillRoundRect(75,35,20,5,5,5);
                g2.fillRoundRect(75,60,20,5,5,5);

                g.setColor(Color.BLUE);
                g2.fillRect(30,70,10,25);
                g2.fillRoundRect(25,67,20,5,5,5);
                g2.fillRoundRect(25,92,20,5,5,5);
                g2.fillRect(55,70,10,25);
                g2.fillRoundRect(50,67,20,5,5,5);
                g2.fillRoundRect(50,92,20,5,5,5);
                g2.fillRect(80,70,10,25);
                g2.fillRoundRect(75,67,20,5,5,5);
                g2.fillRoundRect(75,92,20,5,5,5);
                setToolTipText(toString());

                break;
        }
    }


    public String toString()
    {
        return "Bamboo" + super.rank;
    }
}
