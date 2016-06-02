import java.util.Random;
import java.util.Scanner;

public class Partida {
	static protected String paraules[] = {"hola","programació","casa"};
    static protected int index;
    static protected String paraula_usuari = "";
	
	public Partida(){
		Random rand = new Random();
	    index = rand.nextInt(3);
	}
	
	
	public void Jugar(){
		
		System.out.println("Comença el joc!");

	    
	    
	    ///CONSTANT QUE CONTE LA LLARGADA DE LA PARAULA 
	    final int largada_paraula = paraules[index].length();
	    
		for (int i=0; i<largada_paraula+1; i++) {
	        paraula_usuari += "_";
	    }

	    System.out.println(paraula_usuari);

	    Scanner reader = new Scanner(System.in);

	    int num_errors = 0;

	    while (!paraula_usuari.equals(paraules[index]) && num_errors < 5) {
	    	///VARIABLE QUE ENS GUARDA SI LA LLETRA ES TROBADA O NO.
	        boolean lletra_trobada = nova_lletra(reader.next().charAt(0));
	        
			if (!lletra_trobada) {
	            num_errors++;
	        }
	        System.out.println(paraula_usuari);
	    }

	}
	
	public boolean nova_lletra(char nova){
		 boolean trobada = false;
	        String paraula_old = paraula_usuari;
	        paraula_usuari = "";
	        for (int i=0; i<paraules[index].length(); i++) {
	            if (paraules[index].charAt(i) == nova) {
	                paraula_usuari += paraules[index].charAt(i);
	                trobada = true;
	            }
	            else {
	                paraula_usuari += paraula_old.charAt(i);
	            }
	        }
	        return trobada;
	    
	}
		
}
	
