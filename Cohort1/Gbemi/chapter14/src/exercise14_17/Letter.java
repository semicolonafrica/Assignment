package exercise14_17;
import java.security.SecureRandom;
public class Letter {
	String fiveLetters;
	SecureRandom ran = new SecureRandom();
	String threeLetters;
	String [] myThreeletters = {"bat","ate","the","tea","hat","bet","eat"}; 

	public String getFiveLetters() {
		return fiveLetters;
	}

	public void setFiveLetters(String fiveLetters) {
		if(fiveLetters.length()< 5 || fiveLetters.length() > 5) {
			throw new  StringIndexOutOfBoundsException("the letter must be 5letter");
		}
		this.fiveLetters = fiveLetters;
	}
	

	
	public void GenerateThreeletter() {
		
		String[] token = fiveLetters.split("");
		
		
		for(int x = 0; x<50; x++) {
			int rand = ran.nextInt(5);
			int ranm = ran.nextInt(5);
			int ra = ran.nextInt(5);
			threeLetters=token[rand].concat(token[ranm]).concat(token[ra]);
			//System.out.println(String.join("", token[rand],token[ranm],token[ra]));
			//if(threeLetters==myThreeletters[x]) {
				System.out.println(threeLetters);
			//}
			
		}
		
	}
}
