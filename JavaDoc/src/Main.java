

import java.util.Scanner;
import java.util.Random;
/**
 * Classe principal del programa, es la classe que ens permet jugar.
 * Té com atributs tres atributs statics i protected.
 * paraules: Vector de String que ens guarde tres paraules diferents.
 * index: Enter que ens guarda la posició al vector.
 * paraula_usuari: String que ens guarda les lletres introduides per l'usuari.
 *  
 * @author Joan Hombrado
 * 
 */
public class Main {

    
    /**
     * Mètode principal del programa, es on hem creat tot el joc, printem el "tauler" del joc i l'usuari realment juga
     * per tant es el metode on es desenvolupa la partida.
     * 
     * <p>
     * Variables: 
     * Fem servir una variable rand que es genera un nou numero aleatori.
     * També instanciem un objecte Scanner anomenat reader que fem servir per demanar les dades a l'usuari
     * Index es un atribut de la classe que creem estatic.
     * </p>
     * 
     * @param args Vector d'String que rep el mètode on són els arguments que fa servir el main.
     */
    public static void main(String[] args) {
    	Partida P1 = new Partida();
    	P1.Jugar();
        
   }
    
    /**
     * Mètode que ens busca a la paraula la nova lletra que estem buscant.
     * Fa servir una variable local trobada de tipus bool que s'inicialitza a false, es un centinela de si la lletra es troba
     * o no a la paraula seleccionada (p).
     * També fa servir un String anomenat paraula_old s'inicialitza amb el contingut de p, lletres acertades per l'usuari.
     * 
     * @param nova char que es rep com a parametre, conté la lletra que ha introduit l'usuari.
     * @return trobada variable bool que ens diu si la lletra que ens ha introduit l'usuari hi es o no al String p.
     */
       

}

