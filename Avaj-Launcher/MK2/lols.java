import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class lols
{

    public static void main(String args[]) throws IOException
    {
        FileInputStream fis = null;
        // path currentRelativePath = Paths.get("");
        String file_location = currentRelativePath.toAbsolutePath.toString();
        File file = new File("hello.c");
		String path = file.getAbsolutePath();
        try
        {
            System.out.println(System.getProperty("user.dir"));
            fis = new FileInputSystem(file_location);
            
        }
        catch(Exception ex)
        {
            System.out.println("There was a problem creating the simulation file");
        }
        finally
        {
            if (fis != null)
            {
                fis.close();
            }
        }
    }
}