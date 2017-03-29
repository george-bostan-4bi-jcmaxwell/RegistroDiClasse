package registro;
import java.io.*;
import java.util.Scanner;

public class accesso {
    public accesso()
    {
      try 
      {
        System.out.println ("inserire il nome utente");
        Scanner nome = new Scanner (System.in);
        FileReader reader = new FileReader("registrazione"+".txt");
        BufferedReader bufferedReader = new BufferedReader(reader); // cerca e legge il file 
        String line;
        while ((line = bufferedReader.readLine()) != null) // finchè non finisce di leggere il file, non finisce la lettura
        { 
          if (nome == nomeUtente.registrazione())
          {
              System.out.println ("inserire la password");
              Scanner pass = new Scanner (System.in);
              if (pass == password.registrazione())
              {
                  
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
