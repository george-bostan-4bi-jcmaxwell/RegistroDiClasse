package registro;
import java.util.Scanner;

public class Professore {
  private String nome;
  private String cognome;
  private String materia;
  private double votiItaliano[];
  private double votiMatematica[];
  private double votiInglese[];
  private double votiInformatica[];
  private double votiTPSIT[];
  private double votiTelecomunicazioni[];
  private double votiSistemi[];
  private double votiEducazioneFisica[];
  private double votiStoria[];
  private static final int votiMax = 50;
    
  public Professore (String nome, String cognome, String materia) {
    setNome (nome);
    setCognome (cognome);
    setNomeUtente (nomeUtente);
    votiMateria = new double[votiMax];
    }
    
  public String getNome () {return nome;}
  private void setNome (String n) {nome = n;}
  public String getCognome () {return cognome;}
  private void setCognome (String c) {cognome = c;}
  
  public void menuProfessori() {
    int numP;
    Scanner sc = new Scanner(System.in);
    do
    {
        System.out.println ("Sceglire un numero: ");
        System.out.println ("1 per inserire un voto");
        System.out.println ("2 per togliere un voto");
        System.out.println ("3 per visualizzare la media di uno studente");
        System.out.println ("4 per uscire");
        numP = sc.nextInt();
        switch(numP)
        {
          case 1:
            aggiungiVoti();
            break;
          case 2;
            togliVoti();
            break;
          case 3:
            visualizzaMedia();
            break;
          case 4;
            System.out.println ("uscita...")
            break;
          default:
            System.out.println ("il numero inserito e errato");
            break;
        }
    }
    while (numP != 4)
      
    public void aggiungiVoti(){
      int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0;
      double voto;
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
          System.out.println ("inserire il voto");
          voto = sc.nextDouble;
          votiItaliano[a] = voto;
          a++;
          break;
        case "Storia";
          System.out.println ("inserire il voto");
          voto = sc.nextDouble;
          votiStoria[b] = voto;
          b++;
          break;
        case "Matematica":
          System.out.println ("inserire il voto");
          voto = sc.nextDouble;
          votiMatematica[c] = voto;
          c++;
          break;
        case "Informatica";
          System.out.println ("inserire il voto");
          voto = sc.nextDouble;
          votiInformatica[d] = voto;
          d++;
          break;
        case "Inglese";
          System.out.println ("inserire il voto");
          voto = sc.nextDouble;
          votiInglese[e] = voto;
          e++;
          break;
        case "TPSIT";
          System.out.println ("inserire il voto");
          voto = sc.nextDouble;
          votiTPSIT[f] = voto;
          f++;
          break;
        case "Telecomunicazioni";
          System.out.println ("inserire il voto");
          voto = sc.nextDouble;
          votiTelecomunicazioni[g] = voto;
          g++;
          break;
        case "Sistemi";
          System.out.println ("inserire il voto");
          voto = sc.nextDouble;
          votiSistemi[h] = voto;
          h++;
          break;
        case "Educazione Fisica";
          System.out.println ("inserire il voto");
          voto = sc.nextDouble;
          votiEducazioneFisica[i] = voto;
          i++;
          break;
        default:
          System.out.println ("La materia inserita non e stata scritta correttamente");
          break;
      }
    }
    
    public void togliVoti(){
      int pos, i;
      boolean trovato = false;
      String inMateria;
      double elim;
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
          System.out.println ("inserire il voto che si vuole eliminare");
          elim = sc.nextDouble;
          for (i=0; i<votiMax; i++)
          {
            if (elim == votiItaliano[i])
            {
              trovato = true;
              pos = i;
            }
          }
          if (trovato == false)
          {
            System.out.println ("il voto non e stato trovato");
          }
          else
          {
            System.out.println ("il voto e stato eliminato");
          }
          break;
        case "Storia";
          System.out.println ("inserire il voto che si vuole eliminare");
          elim = sc.nextDouble;
          for (i=0; i<votiMax; i++)
          {
            if (elim == votiStoria[i])
            {
              trovato = true;
              pos = i;
            }
          }
          if (trovato == false)
          {
            System.out.println ("il voto non e stato trovato");
          }
          else
          {
            System.out.println ("il voto e stato eliminato");
          }
          break;
        case "Matematica":
          System.out.println ("inserire il voto che si vuole eliminare");
          elim = sc.nextDouble;
          for (i=0; i<votiMax; i++)
          {
            if (elim == votiMatematica[i])
            {
              trovato = true;
              pos = i;
            }
          }
          if (trovato == false)
          {
            System.out.println ("il voto non e stato trovato");
          }
          else
          {
            System.out.println ("il voto e stato eliminato");
          }
          break;
        case "Informatica";
          System.out.println ("inserire il voto che si vuole eliminare");
          elim = sc.nextDouble;
          for (i=0; i<votiMax; i++)
          {
            if (elim == votiInformatica[i])
            {
              trovato = true;
              pos = i;
            }
          }
          if (trovato == false)
          {
            System.out.println ("il voto non e stato trovato");
          }
          else
          {
            System.out.println ("il voto e stato eliminato");
          }
          break;
        case "Inglese";
          System.out.println ("inserire il voto che si vuole eliminare");
          elim = sc.nextDouble;
          for (i=0; i<votiMax; i++)
          {
            if (elim == votiInglese[i])
            {
              trovato = true;
              pos = i;
            }
          }
          if (trovato == false)
          {
            System.out.println ("il voto non e stato trovato");
          }
          else
          {
            System.out.println ("il voto e stato eliminato");
          }
          break;
        case "TPSIT";
          System.out.println ("inserire il voto che si vuole eliminare");
          elim = sc.nextDouble;
          for (i=0; i<votiMax; i++)
          {
            if (elim == votiTPSIT[i])
            {
              trovato = true;
              pos = i;
            }
          }
          if (trovato == false)
          {
            System.out.println ("il voto non e stato trovato");
          }
          else
          {
            System.out.println ("il voto e stato eliminato");
          }
          break;
        case "Telecomunicazioni";
          System.out.println ("inserire il voto che si vuole eliminare");
          elim = sc.nextDouble;
          for (i=0; i<votiMax; i++)
          {
            if (elim == votiTelecomunicazioni[i])
            {
              trovato = true;
              pos = i;
            }
          }
          if (trovato == false)
          {
            System.out.println ("il voto non e stato trovato");
          }
          else
          {
            System.out.println ("il voto e stato eliminato");
          }
          break;
        case "Sistemi";
          System.out.println ("inserire il voto che si vuole eliminare");
          elim = sc.nextDouble;
          for (i=0; i<votiMax; i++)
          {
            if (elim == votiSistemi[i])
            {
              trovato = true;
              pos = i;
            }
          }
          if (trovato == false)
          {
            System.out.println ("il voto non e stato trovato");
          }
          else
          {
            System.out.println ("il voto e stato eliminato");
          }
          break;
        case "Educazione Fisica";
         System.out.println ("inserire il voto che si vuole eliminare");
          elim = sc.nextDouble;
          for (i=0; i<votiMax; i++)
          {
            if (elim == votiEducazioneFisica[i])
            {
              trovato = true;
              pos = i;
            }
          }
          if (trovato == false)
          {
            System.out.println ("il voto non e stato trovato");
          }
          else
          {
            System.out.println ("il voto e stato eliminato");
          }
          break;
        default:
          System.out.println ("La materia inserita non e stata scritta correttamente");
          break;
      }
    }
    public void visualizzaMedia(){
      int i;
      double somma, media;
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
            somma = somma + votiItaliano[i];
          }
          media = somma / votiMax;
          System.out.println ("la media e: "+media)
          break;
        case "Storia";
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + votiStoria[i];
          }
          media = somma / votiMax;
          System.out.println ("la media e: "+media)
          break;
        case "Matematica":
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + votiMatematica[i];
          }
          media = somma / votiMax;
          System.out.println ("la media e: "+media)
          break;
        case "Informatica";
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + votiInformatica[i];
          }
          media = somma / votiMax;
          System.out.println ("la media e: "+media)
          break;
        case "Inglese";
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + votiInglese[i];
          }
          media = somma / votiMax;
          System.out.println ("la media e: "+media)
          break;
        case "TPSIT";
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + votiTPSIT[i];
          }
          media = somma / votiMax;
          System.out.println ("la media e: "+media)
          break;
        case "Telecomunicazioni";
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + votiTelecomunicazioni[i];
          }
          media = somma / votiMax;
          System.out.println ("la media e: "+media)
          break;
        case "Sistemi";
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + votiSistemi[i];
          }
          media = somma / votiMax;
          System.out.println ("la media e: "+media)
          break;
        case "Educazione Fisica";
          somma = 0;
          for (i=0; i<votiMax; i++)
          {
            somma = somma + votiEducazioneFisica[i];
          }
          media = somma / votiMax;
          System.out.println ("la media e: "+media)
          break;
        default:
          System.out.println ("La materia inserita non e stata scritta correttamente");
          break;
      }
    }
