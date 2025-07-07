import java.io.File;
import java.util.Scanner;

class ButtonThread extends Playz {

    @SuppressWarnings("static-access")
    @Override
    public void run() {
        Scanner sc=new Scanner(System.in);
        while(super.next>0){
        System.out.println("\n\n\n\n\n\n[4] <<   ->PREVIOUS SONG           [5] >/|| ->PLAY OR PAUSE          [6] >>   ->NEXT SONG\n");
        System.out.println("[0] X    -->STOP/EXIT                                                [1] =    -->SONGS LIST\n");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(super.p%2!=0)
        System.out.println("The current song is paused plz Enter 5 to play");
        super.next=sc.nextInt();
        if(super.next==1){
            System.out.println("SELECT A SONG FROM THE LIST\nSNo    -SONG NAME-");
            for (int j=0;j<super.wavFilePaths.size();j++) {
            File f=new File(super.wavFilePaths.get(j));
            System.out.println(j+"  "+f.getName());
            }
            System.out.println();
            System.out.println("Enter a SNo of the Song to Play");
            int song=sc.nextInt();
            if(song<super.wavFilePaths.size()&&song>=0){
            super.i=song-1;
            super.next=6;
            }
            else
            System.err.println("No song is associated with SNo "+song);
        }
        else if(next==4){
            if(i==0)
                i=wavFilePaths.size()-1;
            else 
                super.i-=1;
        }
        else if(super.next!=6 && super.next!=5 && super.next!=1 && super.next!=0){
            System.out.println("xx--Wrong key, Try again--xx\n");
        }
        }
        sc.close();
        //throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
}
