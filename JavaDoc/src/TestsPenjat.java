import static org.junit.Assert.*;

import org.junit.Test;

public class TestsPenjat {
	
	static protected String paraules[] = {"hola","programació","casa"};
    static protected int index;
    static protected String p;

	@Test
	
	
	public void testNova_lletra() {
		char nova = 'h';
		
		assertEquals("ERROR", true, nova_lletra(nova));
	}
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
