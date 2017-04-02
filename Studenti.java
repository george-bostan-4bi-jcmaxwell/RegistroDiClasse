package registro;

public class Studente {
  private String nome;
  private String cognome;
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
  
  public Studente (String nome, String cognome) {
    setNome (nome);
    setCognome (cognome);
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
  
  public void menuStudenti() {
    int numS;
    
    do
    {
        System.out.println ("Sceglire un numero: ");
        System.out.println ("1 per visualizzare la media");
        System.out.println ("2 per visualizzare lo stato");
        System.out.println ("3 per uscire");
        numS = sc.nextInt();
        switch(numS)
        {
          case 1:
            visualizzaMedia();
            break;
          case 2;
            visualizzaStato();
            break;
          case 3;
            System.out.println ("uscita...")
            break;
          default:
            System.out.println ("il numero inserito e errato");
            break;
        }
    }
    while (numS != 3)
    
    public void professore.visualizzaMedia() {
   
