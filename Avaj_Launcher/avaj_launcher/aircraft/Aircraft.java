import avaj_launcher.aircraft.*;
import avaj_launcher.ground.*;
package avaj_launcher.aircraft;

public class Aircraft
{
    protected static long id = 0;
    protected String name;
    protected Coordinates coordinates;
    private static long idCounter;

    public Aircraft()
    {
    }

    protected Aircraft(String name, Coordinates coordinates)
    {
        this.id = nextId();
    }

    private static long nextId()
    {
        this.createID();
    }

    public static synchronized String createID()
    {
        return String.valueOf(idCounter++);
    }
}
