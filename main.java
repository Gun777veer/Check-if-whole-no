
//import javax.swing.JOptionPane;

//public static void main(String[] args) {
//	int a = int.parseint(JOptionPane.showInputDialog("Enter the value of a: "));
//	int b = int.parseint(JOptionPane.showInputDialog("Enter the value of b: "));
//	int c = int.parseint(JOptionPane.showInputDialog("Enter the value of c: "));
//	int d = int.parseint(JOptionPane.showInputDialog("Enter the value of d: "));
//	int e = int.parseint(JOptionPane.showInputDialog("Enter the value of e: "));
//	int f = int.parseint(JOptionPane.showInputDialog("Enter the value of f: "));
 //   int x = ((e*d)-(b*f))/((a*d)-(b*c));
 //   int y = ((a*f)-(e*c))/((a*d)-(b*c));{
 //       if (x - Math.floor(x) == 0 && y - Math.floor(y) == 0){
//			JOptionPane.showMessageDialog(null, "x and y are whole no.'s.");
  //      	}
   //     else{
//			JOptionPane.showMessageDialog(null, "x and y are not whole no.'s.");  
//        	}
//    }
//}

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import javax.sound.sampled.*;

public class main {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		boolean run = true;
		while(run){
		Scanner input = new Scanner(System.in);
	        System.out.println("Enter the minumum value :");
	      int min = input.nextInt();
	        System.out.println("Enter the maximum value :");
	      int max = input.nextInt();
        System.out.println("1st equation :");
        int a = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("a "+a);
        int b = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("b "+b);
        int e = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("e "+e);
        System.out.println("2nd equation :");
        int c = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("c "+c);
        int d = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("d "+d);
        int f = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println("f "+f);
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("\n");
        System.out.print("x "+ x +"\n"+ "y " + y);
        System.out.println("\n");
        if (x - Math.floor(x) == 0 && y - Math.floor(y) == 0){
        	System.out.println("x and y are whole no.'s.");
        	}
        else{
            	System.out.println("x and y are not whole no.'s");
        	}
        System.out.println("\n");
		}
	}
}



