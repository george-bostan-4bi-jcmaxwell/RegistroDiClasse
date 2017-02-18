package registro;
import java.util.Scanner;

public class Professore {
  private String nome;
  private String cognome;
  private String nomeUtente;
  private String materia;
  private double votiMateria[];
  private static final int votiMax = 10;
    
  public Studente (String nome, String cognome, String nomeUtente, String materia) {
    setNome (nome);
    setCognome (cognome);
    setNomeUtente (nomeUtente);
    votiMateria = new double[votiMax];
    }
    
  public String getNome () {return nome;}
  private void setNome (String n) {nome = n;}
  public String getCognome () {return cognome;}
  private void setCognome (String c) {cognome = c;}
  public String getNomeUtente () {return nomeUtente;}
  private void setNomeUtente (String u) {nomeUtente = u;}
  
  public void inserisciVoti() {
    int i;
    Scanner sc = new Scanner (System.in);
    for (i=0; i<votiMax; i++)
    {
      votiMateria[i] = sc.nextDouble();
    }
  }
  
  public void togliVoti() {
    int i, pos = 0, num;
    bool trovato = false;
    Scanner sc = new Scanner (System.in);
    System.out.println("inserire il voto che si vuole togliere");
    num = sc.nextDouble();
    for (i=0; i<votiMax; i++)
    {
      if (num == votiMateria[i])
      {
        pos = i;
        trovato = true;
      }
    }
    if (trovato == true)
    {
      votiMateria[pos] = null;
    }
    else
    {
      System.out.println("non è stato trovato nessun voto uguale a quello inserito");
    }
  }
  
  public double mediaVoti() {
    double media;
    int somma = 0;
    int i;
    for (i=0; i<votiMax; i++)
    {
      somma = somma + votiMateria[i];
    }
    media = somma / votiMax;
    if (media >= 6)
    {
      System.out.println("PROMOSSO");
    }
    else
    {
      System.out.println("A RISCHIO BOCCIATURA");
    }
    return media;
  }
}
