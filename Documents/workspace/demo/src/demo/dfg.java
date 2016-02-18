package demo;

import java.io.File;

public class dfg {
	public static void main(String[] args)
	{
	File folder = new File("/users/tata/desktop");
	File[] listOfFiles = folder.listFiles();

	    for (int i = 0; i < listOfFiles.length; i++) {
	      if (listOfFiles[i].isFile()) {
	        System.out.println("File " + listOfFiles[i].getName());
	        System.out.println("File path " + listOfFiles[i].getAbsolutePath());
	       
	     
	    }
	}

}
}
