package exercise14_5;

import java.security.SecureRandom;

public class Random_Sentences {
	
	String[] articles = {"the","a","one","some","any"};
	String[] nouns = {"boy","girl","dog","town","car"};
	String[] verbs = {"drove","jumped","ran","walked","skipped"};
	String[] prepositions = {"to","from","over","under","on"};
	SecureRandom number = new SecureRandom();
	SecureRandom number1 = new SecureRandom();
	
	
	public String createSentence() {
		int random = number.nextInt(4);
		int value =  number1.nextInt(4);
		String sentence = "";
		sentence = sentence.concat(convertFirstIndexToUpperCase(random)).concat(" ").concat(nouns[random]).concat(" ").concat(verbs[random]).concat(" ").concat(prepositions[random])
				.concat(" ").concat(articles[value]).concat(" ").concat(nouns[value]).concat(".");
		
		System.out.println(sentence);
		return sentence;
	}
	
	public String convertFirstIndexToUpperCase(int number) {	
		char[] character = articles[number].toCharArray();
		char dim = character[0];
		char newdim = Character.toUpperCase(dim);
		String result = articles[number].replace(dim, newdim);
		return result;
		
	}
	
	public void generateSentences(int number) {
		int counter = 0;
		while(counter < number) {
			createSentence();
			counter++;
		}
	}
}
