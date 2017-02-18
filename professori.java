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
  
  public double inserisciVoti() {
    int i;
    for (i=0; i<votiMax; i++)
    {
      votiMateria[i] =
    }

}  
