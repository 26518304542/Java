package pck1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestDataStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		try(DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));){
			
			output.writeUTF("John");
			output.writeDouble(40.5);
			output.writeUTF("Kevin");
			output.writeDouble(180.5);
			output.writeUTF("Marie");
			output.writeDouble(120.57);
		}

		try(DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"))){
			
			System.out.println(input.readUTF() +" "+ input.readDouble());
			System.out.println(input.readUTF() +" "+ input.readDouble());
			System.out.println(input.readUTF() +" "+ input.readDouble());
		}
	}

}
