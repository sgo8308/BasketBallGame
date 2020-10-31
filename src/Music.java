import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

class Music extends Thread {
    SharedPlace sharedPlace = new SharedPlace();

    static boolean runningIntroMusic = true;
    static Clip clip;
    String pathName;
    boolean isLoop;
    Music(String pathName,boolean isLoop){
        this.pathName = pathName;
        this.isLoop = isLoop;
    }
    @Override
    public void run() {
        try{ Thread.sleep(2500);
        }catch(Exception e){}

        playSound(pathName,isLoop);

        while(runningIntroMusic){
            try{ Thread.sleep(100);
            }catch(Exception e){}
        }
        clip.stop();
        return;
    }

    public void playSound(String pathName, boolean isLoop){
        try{
          clip = AudioSystem.getClip();
          File audioFile = new File(pathName);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            clip.open(audioStream);

            FloatControl gainControl =
                (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                gainControl.setValue(-30.0f); // Reduce volume by 10 decibels.
            clip.start();
            if(isLoop){
               clip.loop(Clip.LOOP_CONTINUOUSLY);
            }

        }catch(LineUnavailableException e){
          e.printStackTrace();
        }catch(UnsupportedAudioFileException e){
          e.printStackTrace();
        }catch(IOException e){
          e.printStackTrace();
        }
    }



}