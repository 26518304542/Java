package pck1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		if(args.length!=2) {
			System.out.println("Usage : Java copy source file to targetfile");
			System.exit(1);
		}
		
		File sourceFile = new File(args[0]);
		if(!sourceFile.exists()) {
			System.out.println("Source file " + args[0] + "does not exist");
			System.exit(2);
		}
		
		File targetFile = new File(args[1]);
		if(targetFile.exists()) {
			System.out.println("Target File " + args[1] + " already exist");
			System.exit(3);
		}
		
		try(BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
				BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));) {
			
			int r,numberOfBytesCopied = 0; 
			
			while((r=input.read())!=-1) {
				
				output.write((byte)r);
				numberOfBytesCopied++;
			}
			
			System.out.println(numberOfBytesCopied + "bytes copied");
		}
		

	}

}
