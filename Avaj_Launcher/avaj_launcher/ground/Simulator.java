package avaj_launcher.ground;
import java.io.*;
import java.util.*;
import java.lang.*;
import avaj_launcher.aircraft.*;
import avaj_launcher.sky.*;


public class Simulator
{
    private static WeatherTower weatherTower;
    public static void main(String[] input)
    {
        String filename;
        Scanner scan = new Scanner(System.in);
        System.out.print("File scenario name? eg. input.txt: ");
        filename = scan.nextLine();
        String line = null;
        int i;
        i = 0;
        try
        {
            FileReader fileReader = FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            if((line = bufferedReader.readLine()) != null)
            {
                weatherTower = new WeatherTower();
                int simulations = Integer.parseInt(line.split(" ")[0]);
                if (simulations < 0)
                {
                    System.out.print("We can't simulate "+ simulations +" increase simulation count.");
                    System.exit(1);
                }
                while(line = bufferedReader.readLine() != null)
                {
                    AircraftFactory aircraftF = new AircraftFactory();
                    Flyable flyable = aircraftF.newAircraft(line.split(" ")[0], line.split(" ")[1], Integer.parseInt(line.split(" ")[2]), Integer.parseInt(line.split(" ")[3]), Integer.parseInt(line.split(" ")[4]));
                    if (flyable.getCoordinates() != null)
                    {
                        flyable.registerTower(weatherTower);
                    }
                }
                while (i < simulations)
                {
                    i++;
                    weatherTower.getChangeWeather();
                }
                bufferedReader.close();
            }
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Couldn't find the file named '" + filename + "'");
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + filename + "'");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Please give me an input file");
        }
    }
}