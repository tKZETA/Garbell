package generador;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

//@RunWith( value = Parameterized.class )
public class GarbellTest {
	private int max = 20;
	private int esperat = 8;
	/*@Parameters
	public static Iterable<Object[]> getData() {		
		 List<Object[]> obj = new ArrayList<>();
		 obj.add(new Object[] {120,30});
		 obj.add(new Object[] {20,8});
		 return obj;
		
	}

	private int max;
	private int[] arrayEsperat;
	
	public GarbellTest(int max, int[] arrayEsperat)
	{
		this.max = max;
		this.arrayEsperat = arrayEsperat;
		
	}
	
	@Test
	public void testv1(){
		Garbell garb = new Garbell();
		int [] FinalTest;
		FinalTest = Garbell.obtenirPrimers(max);
		assertEquals(arrayEsperat.length, FinalTest.length);
	}
	*/
	
	@Test
	public void testv2() {
		Garbell gb = new Garbell();
		int [] FinalTest;
		FinalTest = Garbell.obtenirPrimers(max);
		assertEquals(esperat,FinalTest.length);
		//fail("Not yet implemented");
	}

	
	
	@Test
	public void test() {
		int [] FinalTest;
		FinalTest = Garbell.obtenirPrimers(20);
		int EsperadoFinalTest = 8;
		assertEquals(EsperadoFinalTest, FinalTest.length);
	}


	@Test
	public void test2(){
		int[]  ArrayPrimersEsperats = {2,3,5,7,11,13,17,19};
		int[] ArrayPrimersTrobats = {};
		
		ArrayPrimersTrobats = Garbell.obtenirPrimers(20);
		assertEquals(Arrays.toString(ArrayPrimersEsperats),Arrays.toString(ArrayPrimersTrobats));
				
		//fail("Not yet implemented");
		assertEquals(ArrayPrimersEsperats.length, ArrayPrimersTrobats.length);
	}
	
	
}



