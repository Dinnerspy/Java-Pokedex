
package pokedex;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class Audio{
   
    
       public Audio(String Cries) 
  throws Exception
  {
    // open the sound file as a Java input stream
    String gongFile = "C:\\Users\\Nicholas\\Documents\\NetBeansProjects\\AudioTest\\"+Cries;
    InputStream in = new FileInputStream(gongFile);

    // create an audiostream from the inputstream
    AudioStream audioStream = new AudioStream(in);

    // play the audio clip with the audioplayer class
    AudioPlayer.player.start(audioStream);
    Thread.sleep(audioStream.getLength());
    AudioPlayer.player.stop(audioStream);
  }
}
