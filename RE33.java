import java.io.*;
import java.util.*;
public class RE33{

	private double[] userIn;
       private String[] inputs = {"cx", "cy", "vx", "vy", "dx", "dy", "wx", "wy"};
	PrintWriter simplexOutputFile;


	public static void main(String[] args)throws IOException{
		new RE33();
	}

	public RE33()throws IOException{
		Scanner scn = new Scanner(System.in);
		userIn = new double[8];
		simplexOutputFile = new PrintWriter(new File("RE33_Simplex_File"));
		System.out.println("Enterx and y values for c, v,d and w: ");
		for(int i = 0; i<userIn.length;i++){
			System.out.print(inputs[i]+": ");
			userIn[i] = scn.nextDouble();
		}

	}
	
//	private void basics(){
//		PrintWriter.print




}
