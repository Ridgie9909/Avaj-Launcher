package avaj_launcher.ground;
import avaj_launcher.sky.*;
import avaj_launcher.aircraft.*;

public class Tower
{
    private static List<Flyable> observers = new ArrayList<Flyable>();
    private static List<Flyable> unregistered = new ArrayList<flyable>();
    
    public void register(Flyable flyable)
    {
        observers.add(flyable);
    }
    public void unregister(Flyable flyable)
    {
        unregister.add(flyable);
    }
    protected void conditionsChanged()
    {
        for (Flyable flyable: observers)
        {
            flyable.updateconditions();
        }
    }
}

