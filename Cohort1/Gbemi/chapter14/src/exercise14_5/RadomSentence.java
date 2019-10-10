package exercise14_5;
import java.security.SecureRandom;
public class RadomSentence {
	SecureRandom ran = new SecureRandom();
	
	private String article[] = {"the","a","one","some","any"};
	private String noun[] = {"boy","girl","dog","town","car"};
	private String verb[] = {"drove","jumped","run","walked","skipped"};
	private String preposition[]= {"to","from","over","under","on"};
	
	String newWord="";
	
	public void formSentence() {
		for(int i =0;i<3;i++) {
			int art = 1+ran.nextInt(4);
			int nou = 1+ran.nextInt(4);
			int ver = 1+ran.nextInt(4);
			int per = 1+ran.nextInt(4);
			//newWord =article[art]+noun[nou]+verb[ver]+preposition[per]+article[art]+noun[nou];
			System.out.println(String.join(" ",article[art],noun[nou],verb[ver],preposition[per],article[art],noun[nou] ).concat("."));
		}
		
		
		
	}
	public static void main(String[]args) {
		RadomSentence sen = new RadomSentence();
		sen.formSentence();
	}

}
