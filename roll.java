package forza;

import java.util.*; 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Math;

public class roll {
	public static  int Roll(int lines){
//		System.out.println(lines);
		return (int)(Math.random()*(lines-0+1)+0);
	}
	public static void Print() {
		System.out.println(list.get(Roll(intLines)));
	}
	static int intLines;
	static List<String> list=new ArrayList<String>();
	public static void main(String[] args) throws IOException{
		File file = new File("carlist.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String strLine;
		
		while((strLine=br.readLine())!=null)
	      {
	         intLines++;
	         list.add(strLine);
	      }
		Print();
		br.close();
	}
	
}
