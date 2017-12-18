
import java.io.*;
import java.net.*;
import javax.sound.sampled.*;
import javax.swing.JOptionPane;
import javax.sound.*;

public class PlayClip implements LineListener{

    private URL url;
    private boolean showErrors;

    public PlayClip(String name)
    {
        this(name,false);
    }

    public PlayClip(String name, boolean showErrors)
    {
        this.showErrors = showErrors;
        this.url = PlayClip.class.getResource(name);
    }

    public void play()
    {
        if(AudioSystem.isLineSupported(Port.Info.SPEAKER))
        {
            try
            {
                Clip clip = null;
                AudioInputStream stream = AudioSystem.getAudioInputStream(url);
                clip = AudioSystem.getClip();
                clip.addLineListener(this);
                clip.open(stream);
                clip.start();
            }catch(LineUnavailableException lue)
            {
                if(showErrors)
                {
                    JOptionPane.showMessageDialog(null,"Speaker is unavailable for playback",
                            "Sound Clip Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            catch (UnsupportedAudioFileException uafe)
            {
                if (showErrors)
                    JOptionPane.showMessageDialog(null,
                            "Sound clip file type is not supported",
                            "Sound Clip Error",
                            JOptionPane.ERROR_MESSAGE);
            }
            catch (IOException ioe)
            {
                if (showErrors)
                    JOptionPane.showMessageDialog(null,
                            "File I/O error: " + ioe,
                            "Sound Clip Error",
                            JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    @Override

    public void update(LineEvent event)
    {
        if(event.getType() == LineEvent.Type.STOP)
            event.getLine().close();
    }


}
