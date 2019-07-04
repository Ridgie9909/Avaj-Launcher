package Avaj_Launcher.avaj_launcher;

import java.io.File;
import java.io.IOException;


//File file = new File("Text.txt")
public class tester
{
//	String name = "text.txt";
//	File file = new File("Text.txt");
	public void main()
	{
		String name = "text.txt";
		//File file = new File(a);
		file = new File(bame);
		try
		{
			file.createNewFile (name);
		}
		catch(IOException ex)
		{
			System.out.println("Nope this doesn't work!");
		}
	}
}

