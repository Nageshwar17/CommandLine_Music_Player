package patternArts;

public class Art {
    int i,j;
    public void music(){
      System.out.println("\n\n\n");
     for(i=0;i<6;i++){
         for(j=0;j<i+1;j++){
             System.out.print("*");
           System.out.print("  ");  
         }
         for(j=i+1;j<6+1;j++){
           System.out.print(" ");
         System.out.print("  ");  
       }
         for(int k=0;k<14;k++){
           if(k==2||k==3||k==12||k==13||k-i==2||i+k==13){
             System.out.print("m");
           }
           else
           System.out.print(" ");
         }
         for(int k=0;k<10;k++){
           if(k==1){
             System.out.print("USIC    PLAYER");
           }
           else
           System.out.print(" ");
         }
         System.out.println();
       }
     for(i=0;i<7;i++){
       for(j=i+1;j<6;j++){
           System.out.print("*");
         System.out.print("  ");  
       }
       System.out.println();
   }
 }
 public static void main(String[] args) {
    System.err.println("hi");
 }
}
