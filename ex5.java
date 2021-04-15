package Lab3;

import java.io.*; 

public class ex5 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		File file = new File("F:\\Capgemini Workspace\\STS\\Lab3_Tasks\\src\\tasks\\Lab3_Exercise5_textFile.txt"); 
		FileInputStream fileStream = new FileInputStream(file); 
		InputStreamReader input = new InputStreamReader(fileStream); 
		BufferedReader reader = new BufferedReader(input); 
		
		String line; 
		
		// Initializing counters 
		int countWord = 0; 
		int sentenceCount = 0; 
		int characterCount = 0; 
		
		// Reading line by line from the 
		// file until a null is returned 
		reader.close();
		while((line = reader.readLine()) != null) 
		{ 
			if(line.equals("")) 
			{ 
			} else { 
				characterCount += line.length(); 
				
				// \\s+ is the space delimiter in java 
				String[] wordList = line.split("\\s+"); 
				
				countWord += wordList.length; 
//				whitespaceCount += countWord -1; 
				
				// [!?.:]+ is the sentence delimiter in java 
				String[] sentenceList = line.split("[!?.:]+"); 
				
				sentenceCount += sentenceList.length; 
			} 
		} 
		
		System.out.println("Total word count = " + countWord); 
		System.out.println("Total number of sentences = " + sentenceCount); 
		System.out.println("Total number of characters = " + characterCount); 
	} 
}