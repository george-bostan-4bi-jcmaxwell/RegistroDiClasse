package registro;
import java.io.*;
import java.util.Scanner;

public class accesso {
    public accesso() throws InterruptedException
    {
      try 
      {
        System.out.println ("  
        FileReader reader = new FileReader("registrazione"+".txt");
        BufferedReader bufferedReader = new BufferedReader(reader); // cerca e legge il file 
        String line;
        while ((line = bufferedReader.readLine()) != null) // finchè non finisce di leggere il file, non finisce la lettura
        { 
          if ()
        }
          reader.close();
        } 
        catch (IOException e)
        {
          e.printStackTrace();
        }
      }
    }
}
