package generador;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 
 * @author sergi
 * @version 1.0
 *
 */


/**
 * 
 * La classe: Definimos la clase parametrizada
 * 
 */
@RunWith(value = Parameterized.class)
public class GarbellTestv2 {
	
    
    
        /**
         * Creamos la lista de objetos, el primer numero hace referencia a la
         * primera variable que encontrara la func. en este caso: MAX
         * 
         * El segundo numero hace referencia a la segunda variable que
         * encontrara la func. en este caso: ESPERADO
         * @return Devolvemos el valor por cada linea en la lista creada.
         */
	@Parameters
	public static Iterable<Object[]> getData() {
		List<Object[]> obj = new ArrayList<>();
		obj.add(new Object[] {20,5});
		obj.add(new Object[] {120,30});
		obj.add(new Object[] {20,8});
		obj.add(new Object[] {120,30});
		obj.add(new Object[] {20,8});
		obj.add(new Object[] {120,20});
		
		return obj;
	}
	/**
         * Declaramos las variables que usaremos mas abajo
         */
		private int max, esperat;
        /**
         * 
         * @param max Hasta donde contara
         * @param esperat Numero esperado de casos encontrados
         */
	public GarbellTestv2(int max, int esperat)
	{
		this.max = max;
		this.esperat = esperat;
	}
	
        /**
         * Creamos la funcion @Test, que es la encargada de comprobar
         * los casos expuestos mas arriba
         */
	@Test
	public void test(){
		Garbell gb = new Garbell();
		int [] FinalTest;
		FinalTest = Garbell.obtenirPrimers(max);
		assertEquals(esperat,FinalTest.length);
		//fail("Not yet implemented");

	}
	

}
