package WebService.springweb;

public class TextEditor {

	private SpellChecker spellChecker;
	
	public void setspellChecker(SpellChecker spellChecker)
	{
		System.out.println("Inside setSpellChecker");
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getspellChecker()
	{
		return spellChecker;
	}
	
	public void spellCheck()
	{
		spellChecker.checkSpelling();
	}
}
