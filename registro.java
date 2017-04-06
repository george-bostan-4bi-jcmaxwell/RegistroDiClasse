package registro;
import java.util.Scanner;

public class registro {
  private static final int prof = 9;
  private static final int stud = 30;
  private Professore p[];
  private Studente s[];
  
  public registro (Professore p, Studente s) {
    p = new Professore[prof];
    s = new Studente[stud];
  }
  
  public void registraStudente() {
    String utente;
    String pass;
    Scanner sc = new Scanner(System.in);
    System.out.println("Inserire il nome utente dello studente");
    utente = sc.next();
    System.out.println("Inserire la password dello studente");
    pass = sc.next();
    s[stud] = new Studente(utente, pass);
  }
  
  public void registraProfessore() {
    String utente;
    String pass;
    Scanner sc = new Scanner(System.in);
    System.out.println("Inserire il nome utente del professore");
    utente = sc.next();
    System.out.println("Inserire la password del professore");
    pass = sc.next();
    p[prof] = new Professore(utente, pass);
  }
  
  public  accessoStudente() {
        int i;
        Studente st;
        boolean trovato = false;
        String confrontaUtente, confrontaPassword;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Inserire nome utente");
        confrontaUtente = sc.next();
        System.out.println("Inserire password");
        confrontaPassword = sc.next();
        for(i=0; i<prof; i++)
        {
           if(p[i].getNomeUtente().equals(confrontaUtente) && admin.prof[i].getPassword().equals(confrontaPassword))
           {
               trovato = true;
                            
           }
           else
           }
             if(t == 0)
             {
                 System.out.println("Nome utente o password errati");
             }
                   
