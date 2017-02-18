package registro;

public class Studente {
  private String nome;
  private String cognome;
  private String nomeUtente;
  private double[] italiano;
  private double[] matematica;
  private double[] inglese;
  private double[] informatica;
  private int numVotiItaliano;
  private int numVotiMatematica;
  private int numVotiInglese;
  private int numVotiInformatica;
  private static final int Voti = 10;
  
  public Studente (String nome, String cognome, String nomeUtente) {
    setNome (nome);
    setCognome (cognome);
    setNomeUtente (nomeUtente);
    numVotiItaliano = 0;
    numVotiMatematica = 0;
    numVotiInglese = 0;
    numVotiInformatica = 0;
    italiano = new double[Voti];
    matematica = new double[Voti];
    inglese = new double[Voti];
    informatica = new double[Voti];
    }
    
  public String getNome () {return nome;}
  private void setNome (String n) {nome = n;}
  public String getCognome () {return cognome;}
  private void setCognome (String c) {cognome = c;}
  public String getNomeUtente () {return nomeUtente;}
  private void setNomeUtente (String u) {nomeUtente = u;}
  
  public double mediaVoti() {
    double mediaItaliano, mediaMatematica, mediaInglese, mediaInformatica;
    int somma = 0;
    int i;
    for (i=0; i<votiItaliano; i++)
    {
      somma = somma + italiano[i];
    }
    mediaItaliano = somma / votiItaliano;
    somma = 0;
    i = 0;
    return mediaItaliano;
    
    for (i=0; i<votiMatematica; i++)
    {
      somma = somma + matematica[i];
    }
    mediaMatematica = somma / votiMatematica;
    somma = 0;
    i = 0;
    return mediaMatematica;
    
    for (i=0; i<votiInglese; i++)
    {
      somma = somma + inglese[i];
    }
    mediaInglese = somma / votiInglese;
    somma = 0;
    i = 0;
    return mediaInglese;
    
    for (i=0; i<votiInformatica; i++)
    {
      somma = somma + informatica[i];
    }
    mediaInformatica = somma / votiInformatica;
    somma = 0;
    i = 0;
    return mediaInformatica;
    System.out.println("la media di italiano è:" + mediaItaliano + " .");
    System.out.println("la media di matematica è:" + mediaMatematica + " .");
    System.out.println("la media di inglese è:" + mediaInglese + " .");
    System.out.println("la media di informatica è:" + mediaInformatica + " .");
    }
    
    public String statoStudente() {
      double somma = 0;
      double media;
      somma = mediaItaliano + mediaMatematica + mediaInglese + mediaInformatica;
      media = somma / 4;
      if (media >= 6)
      {
        System.out.println("PROMOSSO")
      }
      else
      {
        System.out.println("A RISCHIO BOCCIATURA")
      }
}    
