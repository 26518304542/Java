package pck1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DetectEndOfFile {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		try(DataOutputStream output = new DataOutputStream(new FileOutputStream("test.dat"))){
			
			output.writeDouble(123.5);
			output.writeDouble(234.98);
			output.writeDouble(43.123);
			
		}
		try(DataInputStream input = new DataInputStream(new FileInputStream("test.dat"));){
			while(true) {
				
				System.out.println(input.readDouble());
			}
			
		}
		catch(EOFException e) {
			
			System.out.println("Alles sind gelesen.");
		}
		catch(IOException a) {
			a.printStackTrace();
		}
	}

}
