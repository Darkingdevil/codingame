import java.util.*;
import java.io.*;
import java.math.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String a[]=in.nextLine().split(" ");
        int LX=Integer.parseInt(a[0]);
        int LY=Integer.parseInt(a[1]);
        int LTX=Integer.parseInt(a[2]);
        int LTY=Integer.parseInt(a[3]);
        while(true){
            int s=Integer.parseInt(in.nextLine());
            String m="";
            if(LY>LTY){
                LTY++;
                m+="S";
            }
            else if(LY<LTY){
                LTY--;
                m+="N";
            }
            if(LX>LTX){
                LTX++;
                m+="E";
            }
            else if(LX<LTX){
                LTX--;
                m+="W";
            }
            System.out.println(m);
        }
    }
}
