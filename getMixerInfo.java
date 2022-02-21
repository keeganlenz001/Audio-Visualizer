import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;


public class getMixerInfo {
  public static void main(String[] args) throws LineUnavailableException {
    //     Mixer.Info[] mixers = AudioSystem.getMixerInfo();

    //     Info main_audio = mixers[0];
    //     System.out.println(main_audio.getClass().getName());
    //     Mixer m = AudioSystem.getMixer(main_audio);
    //     Line.Info[] lines = m.getTargetLineInfo();
    //     javax.sound.sampled.Line.Info audio_target = lines[0];

    //     System.out.println(main_audio);
    //     System.out.println(audio_target);
    //     System.out.println(audio_target.getClass().getName());


    Mixer.Info[] mixers = AudioSystem.getMixerInfo();
    javax.sound.sampled.Mixer.Info mixerInfo = mixers[0];
    Mixer mixer =  AudioSystem.getMixer(mixerInfo);

    mixer.open();
    Line.Info[] lines = mixer.getSourceLineInfo();
    System.out.println(lines.length);

    for (Line.Info linfo : lines) {
      DataLine line = (DataLine)AudioSystem.getLine(linfo);
      System.out.println(line.getLevel());
    }



    // Mixer.Info[] mixers = AudioSystem.getMixerInfo();
    // for (Mixer.Info mixerInfo : mixers) {
    //   Mixer mixer = AudioSystem.getMixer(mixerInfo);
    //   try {
    //     mixer.open();
    //     Line.Info[] lines = mixer.getSourceLineInfo();
    //     System.out.println(lines.length);
    //     for (Line.Info linfo : lines) {
    //       DataLine line = (DataLine)AudioSystem.getLine(linfo);
    //       if(line != null)
    //         System.out.println(line.getLevel());
    //       }
    //     } catch (LineUnavailableException e) {
    //       e.printStackTrace();
    //   }
    // }
  }
}
