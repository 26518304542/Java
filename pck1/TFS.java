package pck1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TFS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try (FileOutputStream output = new FileOutputStream("tem.dat");){
			
			for(int i=0;i<10;i++) {
				
				output.write(i);
			}
		}
		try(FileInputStream input = new FileInputStream("tem.dat");){
			
			int val;
			while((val=input.read())!=-1) {
				
				System.out.println(val + " ");
			}
		}	
			
		} 
	}


