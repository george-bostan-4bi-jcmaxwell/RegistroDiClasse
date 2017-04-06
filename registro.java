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
  
  public void accesso() {
        int n, i;
        boolean trovato = false;
        String confrontaUtente, confrontaPassword;
        Scanner sc = new Scanner(System.in);        
        do
        {
            System.out.println("1 per Professore");
            System.out.println("2 per Studente");
            System.out.println("3 per Esci");
            n = sc.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Inserire nome utente");
                    confrontaUtente = sc.next();
                    System.out.println("Inserire password");
                    confrontaPassword = sc.next();
                    for(i=0; i<prof; i++)
                    {
                        if(p[i].getNomeUtente().equals(confrontaUtente) && admin.prof[i].getPassword().equals(confrontaPassword))
                        {
                            homeProfessori(admin, i);
                            t = 1;
                        }
                    }
                    if(t == 0)
                    {
                        System.out.println("Nome utente o password errati");
                    }
                    break;
                case 2:
                    System.out.println("Inserire nome utente");
                    nu = sc.next();
                    System.out.println("Inserire password");
                    pw = sc.next();
                    for(i=0; i<admin.nStudenti; i++)
                    {
                        if(admin.classe[i].getNomeUtente().equals(nu) && admin.classe[i].getPassword().equals(pw))
                        {
                            homeStudenti(admin, i);
                            t = 1;
                        }
                    }
                    if(t == 0)
                    {
                        System.out.println("Nome utente o password errati");
                    }
                    break;
                case 3:
                    System.out.println("Salvataggio in corso ...");
                    admin.salvaRegistro(admin);
                    System.out.println("Uscita in corso ...");
                    System.out.println("-------------------------");
                    break;
                default:
                    System.out.println("Tipologia di utente inesistente");
                    break;
            }
        }
        while(n != 3); 
    }
