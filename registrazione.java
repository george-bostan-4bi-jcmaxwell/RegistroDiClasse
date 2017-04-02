package registro;
import java.util.Scanner;
import java.io.*;

public class registrazione {
  public registrazione()
    {
      String utente, password;
      Scanner sc = new Scanner (System.in);
      System.out.println ("inserire il nome utente");
      utente = sc.nextString();
      File newFile = new File("registrazioneUtenti"+".txt");
      newFile.createNewFile();    
      FileWriter fileW = new FileWriter(newFile);
      BufferedWriter buffW = new BufferedWriter(fileW);                         
      buffW.write(utente);
      buffW.nextLine();
      System.out.println("Il file è stato creato!");
      buffW.close();
      System.out.println ("inserire la password");
      password = sc.nextString();
      File newFile = new File("registrazionePassword"+".txt");
      FileWriter fileW = new FileWriter(newFile);
      BufferedWriter buffW = new BufferedWriter(fileW);                         
      buffW.write(password);
      buffW.nextLine();
      System.out.println("Il file è stato creato!");
      buffW.close();             
     }   
