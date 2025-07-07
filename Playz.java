import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

class Playz implements Runnable {
    String adress;
    static int i;
    int exit=1;
    static int fmp;
    static int next=9;
    static int p;
    static List<String> wavFilePaths = new ArrayList<>();
    void getsongs(String str){
        this.adress=str;
        //next=9;
        String directoryPath =this.adress; //"C:\\Users\\NAGESWARA RAO\\OneDrive";
        
        try {
            Files.walk(Paths.get(directoryPath))
                 .filter(Files::isRegularFile)
                 .filter(path -> path.toString().toLowerCase().endsWith(".wav"))
                 .forEach(path -> wavFilePaths.add(path.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("static-access")
    void playSongs(int i){
        this.i=i;
        String wavFilePath = wavFilePaths.get(this.i);
        
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(wavFilePath).getAbsoluteFile());
            clip.open(audioInputStream);
            clip.setFramePosition(fmp);
            if(p%2==0)
                clip.start(); 
            File fl=new File(wavFilePaths.get(i));
            System.out.println("                             NOW PLAYING  -- ("+fl.getName()+")\nEnter Choice:");
            //Thread.sleep(clip.getMicrosecondLength() / 1000);
            while(clip.getMicrosecondPosition()<clip.getMicrosecondLength()){
                if(next==6||next==0||next==4||next==5)
                break;
                
            }

            if(next==5){
                p++;
                if(p%2!=0){
                    fmp=clip.getFramePosition();
                }
            }
            else if(next!=4){
                this.i++;
                fmp=0;
            }
            if(next==0)
                exit=0;
            this.i=this.i%wavFilePaths.size();
            clip.close();
            audioInputStream.close();
            next=9;
            if(exit!=0)
            playSongs(this.i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        //throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
}