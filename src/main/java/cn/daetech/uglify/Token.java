package cn.daetech.uglify;

public class Token {
	


	private int tokenType;
	
	private String value;
	
	private Location startLocation;
	
	private Location endLocation;
	
	public Token(int tokenType) {
		this.tokenType = tokenType;
	}

}
