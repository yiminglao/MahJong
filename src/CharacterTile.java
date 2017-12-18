import javax.print.attribute.standard.MediaSize;
import java.awt.*;
import java.lang.*;

public class CharacterTile extends Tile {
    protected char symbol;
    protected String character;

    public CharacterTile(char symbol){
        this.symbol = symbol;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        switch (symbol){
            case 'n':
            case 'N':
                 character = Character.toString('\u5317');
                 g2.setColor(Color.BLACK);
                 g2.setFont(new Font("TimesRoman", Font.PLAIN, 70));
                 g2.drawString(character,25,75);
                 setToolTipText(toString());
                 break;
            case 'e':
            case 'E':
                character = Character.toString('\u6771');
                g2.setColor(Color.BLACK);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 70));
                g2.drawString(character,25,75);
                setToolTipText(toString());
                break;
            case 'w':
            case 'W':
                character = Character.toString('\u897F');
                g2.setColor(Color.BLACK);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 70));
                g2.drawString(character,25,75);
                setToolTipText(toString());
                break;
            case 's':
            case 'S':
                character = Character.toString('\u5357');
                g2.setColor(Color.BLACK);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 70));
                g2.drawString(character,25,75);
                setToolTipText(toString());
                break;
            case 'c':
            case 'C':
                character = Character.toString('\u4E2D');
                g2.setColor(Color.RED);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 70));
                g2.drawString(character,25,75);
                setToolTipText(toString());
                break;
            case 'f':
            case 'F':
                character = Character.toString('\u767C');
                g2.setColor(Color.GREEN);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 70));
                g2.drawString(character,25,75);
                setToolTipText(toString());
                break;
            case '1':
                character = Character.toString('\u4E00');
                g2.setColor(Color.BLACK);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,40);
                character = Character.toString('\u842C');
                g2.setColor(Color.RED);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,85);
                setToolTipText(toString());
                break;
            case '2':
                character = Character.toString('\u4E8C');
                g2.setColor(Color.BLACK);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,40);
                character = Character.toString('\u842C');
                g2.setColor(Color.RED);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,85);
                setToolTipText(toString());
                break;
            case '3':
                character = Character.toString('\u4E09');
                g2.setColor(Color.BLACK);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,40);
                character = Character.toString('\u842C');
                g2.setColor(Color.RED);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,85);
                setToolTipText(toString());
                break;
            case '4':
                character = Character.toString('\u4E09');
                g2.setColor(Color.BLACK);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,40);
                character = Character.toString('\u842C');
                g2.setColor(Color.RED);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,85);
                setToolTipText(toString());
                break;
            case '5':
                character = Character.toString('\u4E94');
                g2.setColor(Color.BLACK);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,40);
                character = Character.toString('\u842C');
                g2.setColor(Color.RED);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,85);
                setToolTipText(toString());
                break;
            case '6':
                character = Character.toString('\u516D');
                g2.setColor(Color.BLACK);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,40);
                character = Character.toString('\u842C');
                g2.setColor(Color.RED);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,85);
                setToolTipText(toString());
                break;
            case '7':
                character = Character.toString('\u4E03');
                g2.setColor(Color.BLACK);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,40);
                character = Character.toString('\u842C');
                g2.setColor(Color.RED);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,85);
                setToolTipText(toString());
                break;
            case '8':
                character = Character.toString('\u516B');
                g2.setColor(Color.BLACK);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,40);
                character = Character.toString('\u842C');
                g2.setColor(Color.RED);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,85);
                setToolTipText(toString());
                break;
            case '9':
                character = Character.toString('\u4E5D');
                g2.setColor(Color.BLACK);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,40);
                character = Character.toString('\u842C');
                g2.setColor(Color.RED);
                g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
                g2.drawString(character,40,85);
                setToolTipText(toString());
                break;
            default:
                    System.err.println("Invalid!! CharacterTile something go wrong");
        }
    }

    public boolean matches(Tile other){
        if(this == other){
            return true;
        }
        if(this == null){
            return false;
        }
        if(getClass() != other.getClass()){
            return false;
        }
        CharacterTile C = (CharacterTile) other;
        return (symbol == C.symbol);
    }

    public String toString(){
        switch (symbol){
            case 'n':
            case 'N':
                return "North Wind";
            case 'e':
            case 'E':
                return "East Wind";
            case 'w':
            case 'W':
                return "West Wind";
            case 's':
            case 'S':
                return "South Wind";
            case 'c':
            case 'C':
                return "Red Dragon";
            case 'f':
            case 'F':
                return "Green Dragon";
            default:
                int num = Character.getNumericValue(symbol);
                if(num >0 && num <10)
                    return "Character " + num;
                else
                    System.err.println("Invalid!! something go wrong");
        }
        return "Invalid!! something go wrong";
    }
}
