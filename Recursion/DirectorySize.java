package Recursion;

import java.io.File;
import java.util.Scanner;

public class DirectorySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a directory of file :");
		Scanner input = new Scanner(System.in);
		String directory = input.nextLine();
		System.out.println(getSize(new File(directory))+"bytes");

	}

	public static long getSize(File file) {
		
		long size =0;
		
		if(file.isDirectory()) {
			
			File []files = file.listFiles();
			for(int i=0;files!=null && i<files.length;i++) {
				size += getSize(files[i]);
				
			}
			
		}
		else {
			size += file.length();
		}
		return size;
	}
}
