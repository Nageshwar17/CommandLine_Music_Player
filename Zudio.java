import java.util.*;
import patternArts.Art;

public class Zudio {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            String devotional="C:\\Users\\NAGESWARA RAO\\OneDrive\\songs\\DevotionalSongs";
            String movie="C:\\Users\\NAGESWARA RAO\\OneDrive\\songs\\MovieSongs";
            String all="C:\\Users\\NAGESWARA RAO\\OneDrive";
            Art a =new Art();
            a.music();
            Playz p=new Playz();
            Thread t2=new Thread(p);
            
            ButtonThread obj=new ButtonThread();
            Thread t1=new Thread(obj);
            
            System.out.println("Choose a Play List\n1-->Play all songs\n2-->Devotional songs\n3-->Movie songs");
            int SongsChoice=scn.nextInt();
            //scn.close();
            
            t2.start();
            if(SongsChoice==1)
            p.getsongs(all);
            else if(SongsChoice==2)
            p.getsongs(devotional);
            else if(SongsChoice==3)
            p.getsongs(movie);
            else{
                p.getsongs(all);
                System.out.println("Wrong choice Playing all songs");
            }
            t1.start();
            p.playSongs(0);
        }
    }
}