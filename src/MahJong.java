
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.*;

public class MahJong extends JFrame {

    private MahJongBoard board;
    private JPanel gameBoard;
    protected ImageIcon image;
    private ArrayList<Tile> tileList;

    public MahJong()
    {
        gameBoard = new JPanel();
        setTitle("MahJong game");
        setSize(1920,1024);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exit();
            }
        });

        board = new MahJongBoard(true);

        add(board);

        gameMenu();

        setVisible(true);
    }

    public void exit()
    {
        if(JOptionPane.showConfirmDialog(this,"Do you wanna exit?","Exit program",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }

    public void gameMenu()
    {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu game = new JMenu("Game");
        game.setMnemonic('g');
        menuBar.add(game);
        //play menu
        JMenuItem play = new JMenuItem("Play",'p');
        play.setAccelerator(KeyStroke.getKeyStroke("ctrl P"));
        play.setToolTipText("start a new game");
        game.add(play);
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                board = new MahJongBoard(true);

                add(board);

                revalidate();
                repaint();
            }
        });


        //restart menu
        JMenuItem restart = new JMenuItem("Restart" , 'R');
        restart.setAccelerator(KeyStroke.getKeyStroke("ctrl R"));
        restart.setToolTipText("restart the current game");
        game.add(restart);
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                revalidate();
                repaint();
            }
        });
        //Numbered menu
        JMenuItem numbered = new JMenuItem("Numbered" , 'n');
        numbered.setAccelerator(KeyStroke.getKeyStroke("ctrl N"));
        numbered.setToolTipText("play a numbered (and therefore a repeatable game)");
        game.add(numbered);
        numbered.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        //Tournament menu
        JMenuItem tournament = new JMenuItem("Tournament" , 't');
        tournament.setToolTipText("start a game in tournament mode");
        tournament.setAccelerator(KeyStroke.getKeyStroke("ctrl T"));
        game.add(tournament);
        tournament.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        ButtonGroup group = new ButtonGroup();
        JMenu sound = new JMenu("Sound");
        sound.setMnemonic('S');
        menuBar.add(sound);

        JRadioButtonMenuItem soundOn = new JRadioButtonMenuItem("On", true);
        group.add(soundOn);
        sound.add(soundOn);
        soundOn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                board.soundSwitch = true;
            }
        });
        JRadioButtonMenuItem soundOff = new JRadioButtonMenuItem("Off");
        group.add(soundOff);
        sound.add(soundOff);
        soundOff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                board.soundSwitch = false;
            }
        });

        JMenu move = new JMenu("Move");
        move.setMnemonic('m');
        menuBar.add(move);

        JMenuItem undo = new JMenuItem("Undo", 'u');
        undo.setAccelerator(KeyStroke.getKeyStroke("ctrl Z"));
        move.add(undo);
        undo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JMenu help = new JMenu("Help");
        help.setMnemonic('h');
        menuBar.add(help);

        JMenuItem operation = new JMenuItem("Operation", 'o');
        operation.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
        help.add(operation);
        operation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JMenuItem gameRules = new JMenuItem("Game Rules", 'r');
        gameRules.setAccelerator(KeyStroke.getKeyStroke("ctrl R"));
        help.add(gameRules);
        gameRules.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }




    public static void main(String[] args)
    {
        new MahJong();
    }


}
