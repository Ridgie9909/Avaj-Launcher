package avaj_launcher.ground;
import avaj_launcher.aircraft.*;
import avaj_launcher.ground.*;
import avaj_launcher.sky.*;

public class WeatherTower extends Tower
{
    public String getWeather(Coordinates coordinates)
    {
        return WeatherProvider.getProvider().getCurrentWeather(coordinates);
    }

    void changeWeather()
    {
        this.conditionsChanged();
    }
    public void getChangeWeather()
    {
        this.changeWeather();
    }
}