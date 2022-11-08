package it.fi.itismeucci;

/**
 * Hello world!
 *
 */
public class AppSer 
{
    public static void main( String[] args )
    {
        {
            Server server = new Server();
            try {
                server.connetti();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
