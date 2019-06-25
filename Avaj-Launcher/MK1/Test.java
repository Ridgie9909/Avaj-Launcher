import java.io.*;
import java.util.Scanner;


public class Test
{
	public static void main(String[] input)
	{
		String filename;
		Scanner scan = new Scanner(System.in);

		System.out.print("File scenario name? eg. input.txt: ");
		filename = scan.nextLine();
//		filename = "/goinfre/rdube/Documents/Java/Avaj-Launcher/input.txt";

		String line = null;
		try
		{

			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while((line = bufferedReader.readLine()) != null)
			{
				System.out.println(line);
			}

			bufferedReader.close();
		}
		catch(IOException ex)
		{
			System.out.println("Error reading file named '" + filename + "'");
		}
	}
}

