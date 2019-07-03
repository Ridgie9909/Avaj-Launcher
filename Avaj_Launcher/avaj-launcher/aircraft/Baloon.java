import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
package avaj_launcher.aircraft;

// public static void weatherupdate;

public class Baloon extends ident implements Flyable{
    
    private WeatherTower weatherTower;

    Baloon()
    {

    }
    Baloon(String name, Coordinates coordinates)
    {
        super(name, coordinates);
    };

    public void updateconditions()
    {
        String weather = weatherTower.getWeather(coordinates);
        switch(weather){
            case "SUN":
                // file
                coordinates.setLongitude(2);
                coordinates.setHeight(4);
                break;
            case "RAIN":
                // file
                coordinates.setLongitude(-5);
                break;
            case "FOG":
                // file
                coordinates.setLAtitude(-3);
                break;
            case "SNOW":
                // file
                coordinates.setHeight(-15);
                break;
            
        }
        if (this.getCoordinates().getHeight() <= 0)
        {
            // file
            this.weatherTower.unregister(this);
        }
    }
    public void registerTower(WeatherTower weatherTower)
    {
        this.weatherTower = weatherTower;
        // file
        this.weatherTower.register(this);
    }
    public String getType()
    {
        return "Baloon";
    }

}