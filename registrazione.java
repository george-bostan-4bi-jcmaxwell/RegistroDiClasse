package registro;
import java.util.Scanner;
import java.io.*;

public class registrazione {
  public registrazione()
    {
      System.out.println ("inserire il nome utente");
      Scanner nomeUtente = new Scanner (System.in);
      System.out.println ("inserire una password");
      Scanner password = new Scanner (System.in);
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
          buffW.write(nomeUtente);
          buffW.nextLine();
          buffW.write(password);
          buffW.nextLine();
          System.out.println("File creato con successo");
          buffW.close();
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }               
     }   
