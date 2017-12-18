import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.*;

public class Tile extends JPanel{

    protected static Dimension SIZE;
    private static Polygon SIDE1;
    private static Polygon SIDE2;
    private static Polygon SIDE3;
    private static Polygon SIDE4;
    private static Rectangle FACE;
    private static GradientPaint GRAD1;
    private static GradientPaint GRAD2;
    public int row;
    public int col;
    public int layer;

    static
    {

        SIZE = new Dimension(101,121);
        int[] x1 = {0,10,10,0};
        int[] y1 = {20,10,110,120};
        SIDE1 = new Polygon(x1,y1,4);
        int[] x2 = {10,20,20,10};
        int[] y2 = {10,0,100,110};
        SIDE2 = new Polygon(x2,y2,4);
        int[] x3 = {20,100,90,10};
        int[] y3 = {100,100,110,110};
        SIDE3 = new Polygon(x3,y3,4);
        int[] x4 = {10,90,80,0};
        int[] y4 = {110,110,120,120};
        SIDE4 = new Polygon(x4,y4,4);

        FACE = new Rectangle(20,0,80,100);
        GRAD1 = new GradientPaint(0,20,Color.GREEN,20,120, Color.WHITE);
        GRAD2 = new GradientPaint(20,100,Color.WHITE,110,130,Color.GREEN);


    }

    public Tile()
    {
        setSize(SIZE);
        setPreferredSize(SIZE);

        setOpaque(false);
    }


    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        //side 1
        g2.setPaint(GRAD1);
        g2.fill(SIDE1);
        g.setColor(Color.BLACK);
        g.drawPolygon(SIDE1);
        //side 2
        g.setColor(Color.WHITE);
        g2.fill(SIDE2);
        g.setColor(Color.BLACK);
        g.drawPolygon(SIDE2);
        //side 3
        g.setColor(Color.WHITE);
        g2.fill(SIDE3);
        g.setColor(Color.BLACK);
        g.drawPolygon(SIDE3);
        //side 4
        g2.setPaint(GRAD2);
        g2.fill(SIDE4);

        g.setColor(Color.BLACK);
        g.drawPolygon(SIDE4);
        //face
        g2.setColor(Color.decode("#FFF68F"));
        g2.fill(FACE);

        g.setColor(Color.BLACK);
        g.drawRect(20,0,80,100);
    }

    public boolean matches(Tile other)
    {

        if(getClass() == other.getClass()){
            return true;
        }else
        {
            return false;
        }
    }
}
