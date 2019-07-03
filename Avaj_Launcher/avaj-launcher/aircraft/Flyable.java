package avaj_launcher.aircraft;

public interface Flyable
{
    public void updateconditions();
    public void registerTower(WeatherTower weatherTower);
    public Coordinates getCoordinates();
}