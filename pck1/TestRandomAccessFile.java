package pck1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		try(RandomAccessFile inout = new RandomAccessFile("inout.dat","rw")){
			
			inout.setLength(0);
			
			for(int i = 0;i<200;i++)
				inout.writeInt(i);
			
			System.out.println("Current file length is " + inout.length());
			
			inout.seek(0);
			System.out.println("First number is " + inout.readInt());
			
			inout.seek(1*4);
			System.out.println("Second Number is" + inout.readInt());
			
			inout.seek(9*4);
			System.out.println("Tenth Number is " + inout.readInt());
			
			inout.writeInt(555);
			
			inout.seek(inout.length());
			
			inout.writeInt(999);
			
			System.out.println("New Length is " + inout.length());
			
			inout.seek(10*4);
			
			System.out.println("New eleventh number " + inout.readInt());
			
			
		}
	}

}
