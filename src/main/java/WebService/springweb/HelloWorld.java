package WebService.springweb;

public class HelloWorld {

	private String message1;
	private String message2;
	
	public void setMessage1(String message1)
	{
		this.message1 = message1;
	}
	
	public void getMessage1() {
		System.out.println("Your message1 is" + message1);
	}
	
	public void setMessage2(String message2)
	{
		this.message2 = message2;
	}
	
	public void getMessage2()
	{
		 System.out.println("Your message2 is" + message2);
	}
}
