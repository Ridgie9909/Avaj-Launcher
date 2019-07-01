public class Aircraft
{
    protected static long id = 0;
    public static synchronized String createID()
    {
        return String.valueOf(id++);
    }
    public static void main(void)
    {
        
        // protected long id = String uniqueID = UUID.randomUUID().toString();
        protected String name;
        protected Coordinates coordinates;    
        try
        {
             if (id != 0)
             {
                 System.out.println(id)
             }
        }
        catch(IOException ex)
        {
            System.out.println("lol that didn't work"));
        }
    }
}