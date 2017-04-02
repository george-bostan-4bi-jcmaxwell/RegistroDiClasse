package registro;
import java.util.Scanner;
import java.io.*;

public class registrazione {
  public registrazione()
    {
      Scanner sc = new Scanner (System.in);
      System.out.println ("inserire il nome utente");
      System.out.println ("inserire una password");
      File newFile = new File("registrazione"+".txt");
      if(newFile.exists())
      {     
        System.out.println("Il file esiste già o la directory non esiste");   
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
          System.out.println("Il file è stato creato!");
          buffW.close();
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }               
     }   
