import avaj_launcher.aircraft.*;
import avaj_launcher.ground.*;
package avaj_launcher.ground;

public class AircraftFactory
{
    i = [];
    u = 0;
    public Flyable newAircraft(String type, String name, int longitude, int latitude, int height)
    {
        if (height > 100)
        {
            height = 100;
        }
        Coordinates coordinates = new Coordinates(longitude, latitude, height);
        for i in type:
            if (type == "Helicopter" || type == "JetPlane" || type == "Baloon")
            {
                u = 1;
                switch(type)
                {
                    case "Helicopter":
                        return new Helicopter(name, coordinates);
                    case "JetPlane":
                        return new JetPlane(name, coordinates);
                    case "Baloon":
                        return new baloon(name, coordinates);
                }
            }
            else if(u == 0)
            {
                System.out.println("'"+ type +"'" + "Identify yourself or be shot down by Cape Town airforce!");
                System.out.println("Next time you fly in our air space make sure you're registered with the Tower!");
                System.exit(0);
            }
    }
}