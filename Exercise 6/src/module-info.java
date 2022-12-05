module Main {
	  import java.io.BufferedReader;
		import java.io.BufferedWriter;
		import java.io.File;
		import java.io.FileReader;
		import java.io.FileWriter;
		import java.io.IOException;

		public class Assignmnet6 {

		   public static void main(String[] args) throws IOException {
		       //read from the file
		       File inputFile = new File("R:\\input.in"); // please change the path of file here to your local path
		       BufferedReader br = new BufferedReader(new FileReader(inputFile));
		      
		       //open the results.out file for writing
		       BufferedWriter writer = new BufferedWriter(new FileWriter("R:\\results.out")); // please change the path of file here to your local path

		       String line;
		       while((line = br.readLine()) != null) {
		           //split the line into words
		           String[] words = line.split(" ");
		          
		           //iterate through each word
		           for(String word : words) {
		               //encrypt the word
		               String firstHalf = word.substring(0,(word.length()+1)/2);
		               String secondHalf = "";
		               if(word.length() > 1) {
		                   secondHalf = word.substring((word.length()+1)/2);
		               }
		              
		               String encryptedWord = secondHalf+firstHalf;
		               encryptedWord = encryptedWord.toUpperCase();
		              
		              
		               //write the original word and encrypted word into results.out file
		               writer.write(word+" "+encryptedWord+"\n");
		           }
		       }
		       writer.close();
		       
		       File file;
			if (file.createNewFile()) {
		    	    System.out.println("File created.");
		    	} else {
		    	    System.out.println("File already exists.");
		    	}
		      
		   }

		}
}