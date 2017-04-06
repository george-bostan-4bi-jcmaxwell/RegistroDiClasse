package registro;

public class Studente {
  private String nome;
  private String cognome;
  private String nomeUtente;
  private String password;
  public Studente (String nome, String cognome) {
    setNome (nome);
    setCognome (cognome);
    }
    
  public String getNome () {return nome;}
  private void setNome (String n) {nome = n;}
  public String getCognome () {return cognome;}
  private void setCognome (String c) {cognome = c;}
  public String getNomeUtente () {return nomeutente;}
  private void setNomeUtente (String nU) {nomeUtente = nU;}
  public String getPassword () {return password;}
  private void setPassword (String p) {password = p;}
  
  public void menuStudenti() {
    int numS;
    Scanner sc = new Scanner (System.in);
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
    
    public double visualizzaMedia(Professore p){
      int i;
      double somma, mediaIta, mediaSto, mediaMat, mediaInf, mediaIng, mediaTPSI, mediaTel, mediaSis, mediaEd;
      String inMateria;
      Scanner sc = new Scanner(System.in);
      System.out.println ("Sceglire la materia:");
      System.out.println ("Italiano");
      System.out.println ("Storia");
      System.out.println ("Matematica");
      System.out.println ("Informatica");
      System.out.println ("Inglese");
      System.out.println ("TPSIT");
      System.out.println ("Telecomunicazioni");
      System.out.println ("Sistemi");
      System.out.println ("Educazione Fisica");
      inMateria = sc.nextString;
      switch(inMateria)
      {
        case "Italiano":
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + p.votiItaliano[i];
          }
          mediaIta = somma / votiMax;
          System.out.println ("la media e: "+mediaIta);
          return mediaIta;
          break;
        case "Storia";
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + p.votiStoria[i];
          }
          mediaSto = somma / votiMax;
          System.out.println ("la media e: "+mediaSto)
          return mediaSto;
          break;
        case "Matematica":
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + p.votiMatematica[i];
          }
          mediaMat = somma / votiMax;
          System.out.println ("la media e: "+mediaMat)
          return mediaMat;
          break;
        case "Informatica";
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + p.votiInformatica[i];
          }
          mediaInf = somma / votiMax;
          System.out.println ("la media e: "+mediaInf)
          return mediaInf;
          break;
        case "Inglese";
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + p.votiInglese[i];
          }
          mediaIng = somma / votiMax;
          System.out.println ("la media e: "+mediaIng)
          return mediaIng;
          break;
        case "TPSIT";
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + p.votiTPSIT[i];
          }
          mediaTPSIT = somma / votiMax;
          System.out.println ("la media e: "+mediaTPSIT)
          return mediaTPSIT;
          break;
        case "Telecomunicazioni";
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + p.votiTelecomunicazioni[i];
          }
          mediaTel = somma / votiMax;
          System.out.println ("la media e: "+mediaTel)
          return mediaTel;
          break;
        case "Sistemi";
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + p.votiSistemi[i];
          }
          mediaSis = somma / votiMax;
          System.out.println ("la media e: "+mediaSis)
          return mediaSis;
          break;
        case "Educazione Fisica";
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + p.votiEducazioneFisica[i];
          }
          mediaEd = somma / votiMax;
          System.out.println ("la media e: "+mediaEd)
          return mediaEd;
          break;
        default:
          System.out.println ("La materia inserita non e stata scritta correttamente");
          break;
      }
    }
    
    public void visualizzaStato(Professore p){
      int i;
      mediaIta = visualizzaMedia(p);
      mediaSto = visualizzaMedia(p);
      mediaMat = visualizzaMedia(p);
      mediaInf = visualizzaMedia(p);
      mediaIng = visualizzaMedia(p); 
      mediaTPSI = visualizzaMedia(p); 
      mediaTel = visualizzaMedia(p); 
      mediaSis = visualizzaMedia(p); 
      mediaEd = visualizzaMedia(p);
      String inMateria;
      Scanner sc = new Scanner(System.in);
      System.out.println ("Sceglire la materia:");
      System.out.println ("Italiano");
      System.out.println ("Storia");
      System.out.println ("Matematica");
      System.out.println ("Informatica");
      System.out.println ("Inglese");
      System.out.println ("TPSIT");
      System.out.println ("Telecomunicazioni");
      System.out.println ("Sistemi");
      System.out.println ("Educazione Fisica");
      inMateria = sc.nextString;
      switch(inMateria)
      {
        case "Italiano":
          if (mediaIta >= 6)
          {
            System.out.println ("PROMOSSO");
          }
          else
          {
            System.out.println ("RISCHIO BOCCIATURA");
          }
          break;
        case "Storia";
          if (mediaSto >= 6)
          {
            System.out.println ("PROMOSSO");
          }
          else
          {
            System.out.println ("RISCHIO BOCCIATURA");
          }
          break;
        case "Matematica":
          if (mediaMat >= 6)
          {
            System.out.println ("PROMOSSO");
          }
          else
          {
            System.out.println ("RISCHIO BOCCIATURA");
          }
          break;
        case "Informatica";
          if (mediaInf >= 6)
          {
            System.out.println ("PROMOSSO");
          }
          else
          {
            System.out.println ("RISCHIO BOCCIATURA");
          }
          break;
        case "Inglese";
          if (mediaIng >= 6)
          {
            System.out.println ("PROMOSSO");
          }
          else
          {
            System.out.println ("RISCHIO BOCCIATURA");
          }
          break;
        case "TPSIT";
          if (mediaTPSIT >= 6)
          {
            System.out.println ("PROMOSSO");
          }
          else
          {
            System.out.println ("RISCHIO BOCCIATURA");
          }
          break;
        case "Telecomunicazioni";
          if (mediaTel >= 6)
          {
            System.out.println ("PROMOSSO");
          }
          else
          {
            System.out.println ("RISCHIO BOCCIATURA");
          }
          break;
        case "Sistemi";
          if (mediaSis >= 6)
          {
            System.out.println ("PROMOSSO");
          }
          else
          {
            System.out.println ("RISCHIO BOCCIATURA");
          }
          break;
        case "Educazione Fisica";
          if (mediaEd >= 6)
          {
            System.out.println ("PROMOSSO");
          }
          else
          {
            System.out.println ("RISCHIO BOCCIATURA");
          }
          break;
        default:
          System.out.println ("La materia inserita non e stata scritta correttamente");
          break;
      }
    }
