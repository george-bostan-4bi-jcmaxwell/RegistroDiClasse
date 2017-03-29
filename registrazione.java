package registro;

import java.io.*;

public class registrazione {
  public registrazione()
    {
      
      File newFile = new File("registrazione"+".txt");
      if(newFile.exists())
      {     
        System.out.println("Il file esiste già o non la directory non esiste");   
      }
        else
      {
        try
        {
          newFile.createNewFile();    
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }
        try
        {
          FileWriter fileW = new FileWriter(newFile);
          BufferedWriter buffW = new BufferedWriter(fileW);                         
          buffW.write("ciaoooo");  // scrive nel file , per andare a capo usa, " buffW.nextLine(); "
          System.out.println("File creato con successo");
          buffW.close();  // chiude il file e salva
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }               
     }   
