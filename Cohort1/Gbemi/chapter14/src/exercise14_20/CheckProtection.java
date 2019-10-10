package exercise14_20;

public class CheckProtection {
	private String value;
	//StringBuilder star = new StringBuilder("*********");
	private String star;
	public String getvalue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String  star) {
		this.star = star;
	}
	public void printProtection() {
		
		String[] newValue = value.split(" ");
		for(int y=0;y<newValue.length;y++) {
			star = star.replaceFirst("\\*", newValue[y]);
//			star.replace(1, 9, newValue[y]);
		}
		System.out.print(star);
	}

}
