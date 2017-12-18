import java.awt.*;

public class CircleTile extends RankTile {
    public CircleTile(int rank)
    {
        super(rank);

    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        switch (super.rank)
        {
            case 1:
                g.setColor(Color.GREEN);
                g.fillOval(30,20,60,60);
                g.setColor(Color.RED);
                g.fillOval(40,30,40,40);
                g.setColor(Color.WHITE);
                g.fillOval(50,40,20,20);
                setToolTipText("Circle " + super.rank);
                break;
            case 2:
                g.setColor(Color.GREEN);
                g.fillOval(45,10,30,30);
                g.setColor(Color.WHITE);
                g.fillOval(55,20,10,10);
                g.setColor(Color.RED);
                g.fillOval(45,60,30,30);
                g.setColor(Color.WHITE);
                g.fillOval(55,70,10,10);
                setToolTipText("Circle " + super.rank);
                break;
            case 5:
                g.setColor(Color.GREEN);
                g.fillOval(65,5,30,30);
                g.setColor(Color.WHITE);
                g.fillOval(75,15,10,10);
                g.setColor(Color.BLUE);
                g.fillOval(25,65,30,30);
                g.setColor(Color.WHITE);
                g.fillOval(35,75,10,10);
                setToolTipText("Circle " + super.rank);
            case 3:
                g.setColor(Color.GREEN);
                g.fillOval(25,5,30,30);
                g.setColor(Color.WHITE);
                g.fillOval(35,15,10,10);
                g.setColor(Color.RED);
                g.fillOval(45,35,30,30);
                g.setColor(Color.WHITE);
                g.fillOval(55,45,10,10);
                g.setColor(Color.BLUE);
                g.fillOval(65,65,30,30);
                g.setColor(Color.WHITE);
                g.fillOval(75,75,10,10);
                setToolTipText("Circle " + super.rank);
                break;
            case 4:
                g.setColor(Color.GREEN);
                g.fillOval(25,10,30,30);
                g.setColor(Color.WHITE);
                g.fillOval(35,20,10,10);
                g.setColor(Color.BLUE);
                g.fillOval(65,10,30,30);
                g.setColor(Color.WHITE);
                g.fillOval(75,20,10,10);
                g.setColor(Color.BLUE);
                g.fillOval(25,60,30,30);
                g.setColor(Color.WHITE);
                g.fillOval(35,70,10,10);
                g.setColor(Color.GREEN);
                g.fillOval(65,60,30,30);
                g.setColor(Color.WHITE);
                g.fillOval(75,70,10,10);
                setToolTipText("Circle " + super.rank);
                break;
            case 6:
                g.setColor(Color.GREEN);
                g.fillOval(30,10,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(35,15,10,10);
                g.setColor(Color.RED);
                g.fillOval(30,40,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(35,45,10,10);
                g.setColor(Color.RED);
                g.fillOval(30,70,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(35,75,10,10);
                g.setColor(Color.GREEN);
                g.fillOval(70,10,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(75,15,10,10);
                g.setColor(Color.RED);
                g.fillOval(70,40,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(75,45,10,10);
                g.setColor(Color.RED);
                g.fillOval(70,70,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(75,75,10,10);
                setToolTipText("Circle " + super.rank);
                break;
            case 7:
                g.setColor(Color.GREEN);
                g.fillOval(30,10,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(35,15,10,10);
                g.setColor(Color.GREEN);
                g.fillOval(50,15,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(55,20,10,10);
                g.setColor(Color.GREEN);
                g.fillOval(70,20,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(75,25,10,10);
                g.setColor(Color.RED);
                g.fillOval(30,40,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(35,45,10,10);
                g.setColor(Color.RED);
                g.fillOval(30,70,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(35,75,10,10);
                g.setColor(Color.RED);
                g.fillOval(70,40,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(75,45,10,10);
                g.setColor(Color.RED);
                g.fillOval(70,70,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(75,75,10,10);
                setToolTipText("Circle " + super.rank);
                break;
            case 8:
                g.setColor(Color.BLUE);
                g.fillOval(30,10,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(35,15,10,10);
                g.setColor(Color.BLUE);
                g.fillOval(30,30,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(35,35,10,10);
                g.setColor(Color.BLUE);
                g.fillOval(30,50,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(35,55,10,10);
                g.setColor(Color.BLUE);
                g.fillOval(30,70,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(35,75,10,10);
                g.setColor(Color.BLUE);
                g.fillOval(70,10,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(75,15,10,10);
                g.setColor(Color.BLUE);
                g.fillOval(70,30,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(75,35,10,10);
                g.setColor(Color.BLUE);
                g.fillOval(70,50,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(75,55,10,10);
                g.setColor(Color.BLUE);
                g.fillOval(70,70,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(75,75,10,10);
                setToolTipText("Circle " + super.rank);
                break;
            case 9:
                g.setColor(Color.GREEN);
                g.fillOval(30,10,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(35,15,10,10);
                g.setColor(Color.RED);
                g.fillOval(30,40,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(35,45,10,10);
                g.setColor(Color.BLUE);
                g.fillOval(30,70,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(35,75,10,10);
                g.setColor(Color.GREEN);
                g.fillOval(50,10,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(55,15,10,10);
                g.setColor(Color.RED);
                g.fillOval(50,40,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(55,45,10,10);
                g.setColor(Color.BLUE);
                g.fillOval(50,70,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(55,75,10,10);
                g.setColor(Color.GREEN);
                g.fillOval(70,10,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(75,15,10,10);
                g.setColor(Color.RED);
                g.fillOval(70,40,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(75,45,10,10);
                g.setColor(Color.BLUE);
                g.fillOval(70,70,20,20);
                g.setColor(Color.WHITE);
                g.fillOval(75,75,10,10);
                setToolTipText("Circle " + super.rank);
                break;
            default:
                System.err.println("Something went wrong!!");

        }
    }


    public String toString()
    {
        return "Circle" + super.rank;
    }
}
