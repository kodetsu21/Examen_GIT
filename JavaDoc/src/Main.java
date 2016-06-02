

import java.util.Scanner;
import java.util.Random;
/**
 * Classe principal del programa, es la classe que ens permet jugar.
 * Té com atributs tres atributs statics i protected.
 * paraules: Vector de String que ens guarde tres paraules diferents.
 * index: Enter que ens guarda la posició al vector.
 * p: String que ens guarda les lletres introduirdes per l'usuari.
 *  
 * @author Joan Hombrado
 * 
 */
public class Main {

    static protected String paraules[] = {"hola","programació","casa"};
    static protected int index;
    static protected String p;
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
        System.out.println("Comença el joc!");

        Random rand = new Random();
        index = rand.nextInt(3);
        for (int i=0; i<paraules[index].length(); i++) {
            p += "_";
        }

        System.out.println(p);

        Scanner reader = new Scanner(System.in);

        int num_errors = 0;

        while (!p.equals(paraules[index]) && num_errors < 5) {
            if (!nova_lletra(reader.next().charAt(0))) {
                num_errors++;
            }
            System.out.println(p);
        }
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
    static public boolean nova_lletra(char nova) {
        boolean trobada = false;
        String paraula_old = p;
        p = "";
        for (int i=0; i<paraules[index].length(); i++) {
            if (paraules[index].charAt(i) == nova) {
                p += paraules[index].charAt(i);
                trobada = true;
            }
            else {
                p += paraula_old.charAt(i);
            }
        }
        return trobada;
    }

}

