/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oef;

/**
 *
 * @author 010436
 */
public class Oef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int uitkomst = somFunctie(5,6);
        String begeleidendeTekst = "de uitkomst van 5+6 = ";
        
        printFunctie(begeleidendeTekst, uitkomst);
        
      int u2 =  vermenigvuldigFunctie (2,5);
      String t2 = "2 maal 5 = " ;
      printFunctie(t2,u2);
    int fa = faculteitFunctie(5);
    System.out.println("5! = "+fa);
    }
    
    
    public static int somFunctie(int getal1, int getal2){
        int optelling = getal1+getal2;
        
        return optelling;
    }
    
    
    public static void printFunctie(String tekst,int getal){
        System.out.println(tekst+getal);
    }

    private static int vermenigvuldigFunctie(int g1, int g2) {
        int vermenig = g1*g2;
        
        return vermenig;
    }
    public static int faculteitFunctie(int i) {       
        if (i == 1) {
         return 1;
        }
        if (i == 0) {
            return 0;
        }
        else {
            return i * faculteitFunctie(i-1);
        }
       
    }  
    
}




