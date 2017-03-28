/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programma;

/**
 *
 * @author FABIO.DECICCO
 */
public class Programma {
    private string Denominazione;
private string Produttore;
private string Versione;
private string Sistema_Operativo;
private int Anno;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  p1 programma;
  p2 programma;
  string str;
  p1=newprogramma("kmkds","intel",0101,"windows",2000);
  p2=newprogramma("jdnsfjn","amd",3030,"ubuntu",2010);
  p1.compareAnno(p2.getAnno());
  str=p1.toString();
  system.out.println(str);
  str=p2.toString();
  system.out.println(str);
  
        // TODO code application logic here
    }
    
}
