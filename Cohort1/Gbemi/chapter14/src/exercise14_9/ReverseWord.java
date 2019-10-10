package exercise14_9;
public class ReverseWord {
	String myWord;
	
	
	public String getMyWord() {
		return myWord;
	}


	public void setMyWord(String myWord) {
		this.myWord = myWord;
	}


	public void tokenMyWord() {
	
	
		String[] token =myWord.split(" ");
		
		
		for(int x=token.length-1;x>= 0;x--)
			System.out.println(token[x]);
		
	}
	

}
