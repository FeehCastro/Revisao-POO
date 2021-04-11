/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fighters;

/**
 *
 * @author felip
 */
public class Fighters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fighter l = new Fighter("Felipe", "Brasil", 21, 171, 72, 10,9,0);
        l.empatarLuta();
        l.ganharLuta();
        l.apresentar();
        
    }
    
}
