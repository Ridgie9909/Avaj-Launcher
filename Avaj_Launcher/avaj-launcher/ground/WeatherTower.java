package avaj_launcher.aircraft;

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