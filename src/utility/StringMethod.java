package utility;

public class StringMethod {
	String mainstr;
	public String getInput() {
		return mainstr;
	}
	
	public String lower(String name) {
		name.toLowerCase();
		return name;
		
	}
	public String upper(String name)
	{
		name.toUpperCase();
		return name;
	}
	public String firstCharacter(String name)
	{
		String f=Character.toString(name.charAt(0));
		return f;
	}
	
	public String length(String name)
	{
		String f=Integer.toString(name.length());
		return f;
	}
	public String trim(String name)
	{
		String f=name.trim();
		return f;
	}
	public void setInput(String input) {
		
		mainstr=input;
	}
}
