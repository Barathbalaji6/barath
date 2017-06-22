 import java.util.Scanner;
public class Pramid{

    public static void main(String[] args) {
       
       
    Scanner s=new Scanner(System.in);
    int x=s.nextInt();
    String ans="";
    for(int i=0;i<x;i++){
        for(int k=0;k<2;k++){
            for(int j=i;j<x;j++){
                System.out.print("*");
            }
            System.out.print(" ");
        }
        System.out.println();
    }
    }

}
