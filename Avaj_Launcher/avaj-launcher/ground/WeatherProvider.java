package avaj_launcher.ground;
import avaj_launcher.ground.*;
import avaj_launcher.sky.*

public class WeatherProvider
{
    private static WeatherProvider weatherProvider;
    private static String[] weather = {"SUN", "RAIN", "FOG", "SNOW"};

    private WeatherProvider()
    {   
    }

    public static WeatherProvider getProvider()
    {
        if (weatherProvider == null)
        {
            weatherProvider = new WeatherProvider();
        }
        return weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates)
    {
        Random random = new Random();
        int randomElement = random.nextInt(weather.length);
        return weather[randomElement];
    }
}