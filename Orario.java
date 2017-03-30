package registro;

public class Orario  {
    private int giorno;
    private int mese;
    private int anno;
    private int ora;
    private int minuti;
    public Orario(int giorno ,int mese ,int anno ,int ora ,int minuti){
        this.giorno=giorno;
        this.mese=mese;
        this.anno=anno;
        this.ora=ora;
        this.minuti=minuti;
    }
    private int Getgiorno () {return giorno;}
    private int Getmese () {return mese;}
    private int Getanno () {return anno;}
    private int Getora () {return ora;}
    private int Getminuti () {return minuti;}
    private void Setgiorno (int giorno){this.giorno=giorno;}
    private void Setmese (int mese){this.mese=mese;}
    private void Setanno (int anno){this.anno=anno;}
    private void Setora (int ora){this.ora=ora;}
    private void Setminuti (int minuti){this.minuti=minuti;}
    
}

Public int  Calendario (){
GregorianCalendar gc = new GregorianCalendar();
int anno = gc.get(Calendar.YEAR);
int mese = gc.get(Calendar.MONTH) + 1;
int giorno = gc.get(Calendar.DATE);
int ore = gc.get(Calendar.HOUR);
int min = gc.get(Calendar.MINUTE);
int sec = gc.get(Calendar.SECOND);
System.out.println(giorno + “/” + mese + “/” + anno + ” ” + ore + “:” + min + “:” + sec);
}
