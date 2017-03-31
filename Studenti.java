package registro;

public class Studente {
  private String nome;
  private String cognome;
  private String nomeUtente;
  private double[] italiano;
  private double[] matematica;
  private double[] inglese;
  private double[] informatica;
  private double[] sistemi;
  private double[] storia;
  private double[] tpsit;
  private double[] ginnastica;
  private double[] telecomunicazioni;

  private int numVotiItaliano;
  private int numVotiMatematica;
  private int numVotiInglese;
  private int numVotiInformatica;
  private static final int Voti = 30;
  
  public Studente (String nome, String cognome, String nomeUtente) {
    setNome (nome);
    setCognome (cognome);
    setNomeUtente (nomeUtente);
    numVotiItaliano = 0;
    numVotiMatematica = 0;
    numVotiInglese = 0;
    numVotiInformatica = 0;
    numVotiSistemi = 0;
    numVotiStoria = 0;
    numVotiTpsit = 0;
    numVotiGinnastica = 0;
    numVotiTelecomunicazioni = 0;
    italiano = new double[Voti];
    matematica = new double[Voti];
    inglese = new double[Voti];
    informatica = new double[Voti];
    sistemi = new double[Voti];
    storia  = new double[Voti];= 
    tpsit =new double [Voti];=
    ginnastica  = new double[Voti];
    telecomunicazioni  = new double[Voti];
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
    for (i=0; i<votiSistemi; i++)
    {
      somma = somma + sistemi[i];
    }
    mediaSistem = somma / votiSistemi;
    somma = 0;
    i = 0;
    return mediaSistemi;
    
    for (i=0; i<votiStoria; i++)
    {
      somma = somma + storia[i];
    }
    mediaStoria = somma / votiStoria;
    somma = 0;
    i = 0;
    return mediaStoria;
    
    for (i=0; i<votiGinnastica; i++)
    {
      somma = somma + ginnastica[i];
    }
    mediaGinnastica = somma / votiGinnastica;
    somma = 0;
    i = 0;
    return mediaGinnastica;
    
    for (i=0; i<votiTpsit; i++)
    {
      somma = somma + tpsit[i];
    }
    mediaTpsit = somma / votiTpsit;
    somma = 0;
    i = 0;
    return mediaTpsit;
    
    for (i=0; i<votiTelecomunicazioni; i++)
    {
      somma = somma + telecomunicazioni[i];
    }
    mediaTelecomunicazioni = somma / votitelecomunicazioni;
    somma = 0;
    i = 0;
    return mediaTelecomunicazioni;
    
    
    return mediaInformatica;
    System.out.println("la media di italiano è:" + mediaItaliano + " .");
    System.out.println("la media di matematica è:" + mediaMatematica + " .");
    System.out.println("la media di inglese è:" + mediaInglese + " .");
    System.out.println("la media di informatica è:" + mediaInformatica + " .");
    System.out.println("la media di sistemi è:" + mediaSistemi + " .");
    System.out.println("la media di storia è:" + mediaStoria + " .");
    System.out.println("la media di tpsit è:" + mediaTpsit + " .");
    System.out.println("la media di ginnastica è:" + mediaGinnastica + " .");
    System.out.println("la media di telecomunicazioni è:" + mediaTelecomunicazioni + " .");
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
