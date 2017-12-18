import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

public class MahJongBoard extends JPanel implements MouseListener{
    private MahJongModel model;
    private PlayClip playClip;

    protected ImageIcon image;
    private static int WIDTH;
    private static int HEIGHT;
    private static int EDGE;
    private int x;
    private int y;
    public Tile t;
    public Tile firstTile;
    public boolean soundSwitch;

    public Scroll	scroll;

    private JPanel top;
    private JPanel frame;
    private JPanel bottom;

    static
    {
        WIDTH = 80;
        HEIGHT = 100;
        EDGE = 20;
    }


    public MahJongBoard(boolean soundSwitch)
    {
        frame= new JPanel(new BorderLayout());

        top = new JPanel();
        top.setPreferredSize(new Dimension(1920,835));



        bottom = new JPanel();
        bottom.setPreferredSize(new Dimension(1920,200));
        bottom.setBackground(Color.GREEN);

        firstTile = new Tile();
        firstTile = null;
        this.soundSwitch = soundSwitch;

        model = new MahJongModel();
        top.setLayout(null);        //require "setSize" in the tile constructor
        this.placeTile();

        add(bottom,BorderLayout.NORTH);

    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        super.setBackground(Color.YELLOW);
        URL bgImage = getClass().getResource("images/dragon_bg.png");
        image = new ImageIcon(bgImage);
        image.paintIcon(this, g, 522, 290);
    }

    public void placeTile()
    {

        t = model.tiles[4][0][0] ;
        x = 0 * WIDTH + 0 * EDGE;
        y = 4 * HEIGHT -50;
        t.row = 4;
        t.col = 0;
        t.layer = 0;
        t.setLocation(x ,y);
        t.addMouseListener(this);
        top.add(t);


        //layer 4
        if(model.tiles[4][7][4] != null)
        {
            t = model.tiles[4][7][4];
            x = 7 * WIDTH + 4 * EDGE -40 ;
            y = 4 * HEIGHT - 4 * EDGE -50;
            t.row = 4;
            t.col = 7;
            t.layer = 4;
            t.setLocation(x ,y);
            t.addMouseListener(this);
            top.add(t);
        }


        //layer 3

        for(int i = 6; i <= 7; i++)
        {
            for(int j = 4; j >= 3;j--)
            {
                t = model.tiles[j][i][3];
                x = i * WIDTH + 3 * EDGE;
                y = j * HEIGHT - 3 * EDGE;
                t.row = j;
                t.col = i;
                t.layer = 3;
                t.setLocation(x ,y);
                t.addMouseListener(this);
                top.add(t);

            }
        }

        //layer 2

        for(int i = 5; i<=8; i++)
        {
            for(int j = 5; j >=2;j--)
            {

                t = model.tiles[j][i][2];
                x = i * WIDTH + 2 * EDGE;
                y = j * HEIGHT - 2 * EDGE;
                t.setLocation(x ,y);
                t.addMouseListener(this);
                t.row = j;
                t.col = i;
                t.layer = 2;
                top.add(t);

            }
        }
        //layer 1

        for(int i = 4; i<=9; i++)
        {
            for(int j = 6; j >=1;j--)
            {
                t = model.tiles[j][i][1];
                x = i * WIDTH + 1 * EDGE;
                y = j * HEIGHT - 1 * EDGE;
                t.setLocation(x ,y);
                t.addMouseListener(this);
                t.row = j;
                t.col = i;
                t.layer = 1;
                top.add(t);

            }
        }

        //layer 0

        for(int i = 1; i<=12; i++)
        {
            for(int j = 7; j >=0;j--)
            {
                if( i==1 && (j==1 || j ==2 || j==5 || j==6)
                        || i == 2 && (j == 1 || j ==6)
                        || i == 11 && (j == 1 || j ==6)
                        || i==12 && (j==1 || j ==2 || j==5 || j==6)
                        )
                {
                    continue;

                }
                else
                {
                    t = model.tiles[j][i][0];
                    x = i * WIDTH + 0 * EDGE;
                    y = j * HEIGHT + 0 * EDGE;
                    t.setLocation(x ,y);
                    t.addMouseListener(this);
                    t.row = j;
                    t.col = i;
                    t.layer = 0;
                    top.add(t);

                }

            }
        }
        //the layer 0 right two
        t = model.tiles[3][13][0] ;
        x = 13 * WIDTH + 0 * EDGE;
        y = 4 * HEIGHT -50;
        t.setLocation(x ,y);
        t.row = 3;
        t.col = 13;
        t.layer = 0;
        t.addMouseListener(this);
        top.add(t);

        t = model.tiles[3][14][0] ;
        x = 14 * WIDTH + 0 * EDGE;
        y = 4 * HEIGHT -50;
        t.setLocation(x ,y);
        t.row = 3;
        t.col = 14;
        t.layer = 0;
        t.addMouseListener(this);
        top.add(t);

        frame.add(top,BorderLayout.NORTH);

        add(frame);


    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Tile t = (Tile) e.getSource();
        t = model.getTile(t.row,t.col,t.layer);

        if(model.isTileOpen(t.row,t.col,t.layer) )
        {
            if(this.firstTile == null)
            {
                this.firstTile = t;
                this.firstTile.setBorder(BorderFactory.createEtchedBorder(Color.RED,Color.YELLOW));
            }
            else if(t == this.firstTile)
            {
                t.setBorder(null);
                this.firstTile = null;
            }
            else
            {
                if(t.matches(this.firstTile) && (t.row != this.firstTile.row || t.col != this.firstTile.col || t.layer != this.firstTile.layer))
                {
                    top.remove(t);
                    top.remove(this.firstTile);
                    top.repaint();
                    model.tiles[t.row][t.col][t.layer]=null;
                    model.tiles[this.firstTile.row][this.firstTile.col][this.firstTile.layer]=null;
                    scroll.addToUndo(this.firstTile,t);
                    bottom.add(scroll);
                    frame.add(bottom,BorderLayout.SOUTH);
                    frame.repaint();
                    add(frame);
                    revalidate();
                    repaint();


//                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                    frame.add(scroll);
//                    frame.setSize(400, 325);
//                    frame.setVisible(true);


                    if(soundSwitch)
                    {
                        playClip = new PlayClip("audio/stone-scraping.wav", soundSwitch);
                        playClip.play();
                    }


                }
                    this.firstTile = null;
            }

        }


    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
