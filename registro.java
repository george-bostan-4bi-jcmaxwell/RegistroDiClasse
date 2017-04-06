package registro;

public class registro {
  private static final int prof = 9;
  private static final int stud = 30;
  private Professore p[];
  private Studente s[];
  
  public registro () {
  }
  
  public void registraStudente() {
    String utente;
    String pass;
    Scanner sc = new Scanner(System.in);
    System.out.println("Inserire il nome tentedello studente");
    utente = sc.next();
    System.out.println("Inserire la password dello studente");
    pass = sc.next();
