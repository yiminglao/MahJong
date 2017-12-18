import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Scroll extends JScrollPane{

    private static Dimension size = new Dimension(101,121);
    private JPanel[] discard = new JPanel[2];
    private Stack<Tile> undoStack = new Stack<Tile>();
    private int width = 107;
    private int height = 121;
    private int count;

    public Scroll()
    {
        setPreferredSize(new Dimension(0,2*height+33));
        setBorder(BorderFactory.createRaisedBevelBorder());
        discard[0] = new JPanel(new FlowLayout(FlowLayout.LEFT));
        discard[1] = new JPanel(new FlowLayout(FlowLayout.LEFT));
        discard[0].setPreferredSize(new Dimension(0,height));
        discard[1].setPreferredSize(new Dimension(0,height));

        setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        JPanel panel = new JPanel(new BorderLayout());
        setViewportView(panel);
        panel.add(discard[0],BorderLayout.NORTH);
        panel.add(discard[1],BorderLayout.SOUTH);

        discard[0].setBackground(new Color(254, 205, 33));
        discard[1].setBackground(new Color(254, 205, 33));
        panel.setBackground(new Color(254, 205, 33));
    }

    public void addToUndo(Tile t1, Tile t2)
    {
        undoStack.push(t1);
        undoStack.push(t2);

        Dimension size = new Dimension(++count * width, height+6);

        discard[0].setPreferredSize(size);
        discard[1].setPreferredSize(size);

        discard[0].add(t1);
        discard[1].add(t2);

        Rectangle	r = new Rectangle(count * width, 0, width, height + 6);
        getViewport().scrollRectToVisible(r);

        revalidate();
        repaint();

    }

}