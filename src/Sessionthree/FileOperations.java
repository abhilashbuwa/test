package sessionThree;

import java.io.*;
import java.util.Scanner;
public class FileOperations {
	public static final String ORIGINAL_FILE_PATH="C:\\Users\\sujiti\\Desktop\\original.txt";
	public static final String COPY_FILE_PATH="C:\\Users\\sujiti\\Desktop\\copy.txt";
	static 
	{
		File original_file = new File(ORIGINAL_FILE_PATH);
		File copy_file = new File(COPY_FILE_PATH);
		System.out.println("Files Created!");
		try {
            original_file.createNewFile();
            copy_file.createNewFile();
        } catch (IOException ioe) {
            System.out.println("Error while creating empty file: " + ioe.getMessage());
        }
 


	}
	public static void main(String args[])
	{
		
		  FileInputStream in = null;
	      FileOutputStream out = null;
	      Scanner scan=new Scanner(System.in);
	           
	      try {
	    	 out = new FileOutputStream(ORIGINAL_FILE_PATH);
	    	 out.write("Hello".getBytes()); //write data to file
	    	 out.close();
	         in = new FileInputStream(ORIGINAL_FILE_PATH);
	         out = new FileOutputStream(COPY_FILE_PATH);
	         int c;
	         while ((c = in.read()) != -1) {
	        	 
	            out.write(c);			//copy data to output file 
	         }
	      }
	      catch(Exception e){}
	    	  finally {
	    		 try{
	         if (in != null) {
					in.close();
	         }
	         if (out != null) {
					out.close();
	         }
	    	}catch(IOException e){
	    		
	    	}
	      }
		
	}
}
