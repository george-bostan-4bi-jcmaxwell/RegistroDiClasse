package registro;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class registro implements java.io.Serializable{
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
  
  public Studente accessoStudente() {
        int i, pos;
        Studente st;
        boolean trovato = false;
        String confrontaUtente, confrontaPassword;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Inserire nome utente");
        confrontaUtente = sc.next();
        System.out.println("Inserire password");
        confrontaPassword = sc.next();
        for(i=0; i<stud; i++)
        {
           st = s[i];
           if(s[i].getNomeUtente().equals(confrontaUtente) && s[i].getPassword().equals(confrontaPassword))
           {
               trovato = true;
               pos = i;             
           }
           else
           }
             if(trovato == false)
             {
                 System.out.println("Nome utente o password errati");
             }
           }
        }
        st = s[pos];
        return st;
}

public Professore accessoProfessore() {
        int i, pos;
        Professore pr;
        boolean trovato = false;
        String confrontaUtente, confrontaPassword;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Inserire nome utente");
        confrontaUtente = sc.next();
        System.out.println("Inserire password");
        confrontaPassword = sc.next();
        for(i=0; i<prof; i++)
        {
           pr = p[i];
           if(p[i].getNomeUtente().equals(confrontaUtente) && p[i].getPassword().equals(confrontaPassword))
           {
               trovato = true;
               pos = i;             
           }
           else
           }
             if(trovato == false)
             {
                 System.out.println("Nome utente o password errati");
             }
           }
        }
        pr = p[pos];
        return pr;
}
public void salva() throws java.io.IOException{
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("registro.bin"));
        stream.writeObject();
        stream.close();
    }
    public registro carica() throws java.io.IOException, ClassNotFoundException{
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream("registro.bin"));
        stream = () stream.readObject();
        stream.close();
        return registro;
    }
