package hust.soict.hedspi.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class NoGarbage {
	public static void main(String[] args) throws IOException {
		try {
	    	  File x = new File("file/alice29.txt");
	    	  long start = System.currentTimeMillis();
	    	  Scanner sc = new Scanner(x);
	    	  StringBuffer content = new StringBuffer();
	    	  while(sc.hasNextLine()) {
	    		  content.append(sc.nextLine() + "\n");
	    	  }
//	  	      System.out.println(content);
	    	  System.out.printf("Thoi gian xu ly: %d", System.currentTimeMillis() - start);

	    	  sc.close();
	    	} catch (FileNotFoundException e) {
	    		e.printStackTrace();
	    	}
	}
}
