package pck1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));){
			
			output.writeUTF("John");
			output.writeDouble(85.5);
			output.writeObject(new java.util.Date());
			
		}
	}

}
