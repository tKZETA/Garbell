package generador;

import java.util.Arrays;

/**
 * Classe que utiliza el garbell de Erastotenes para encontrar los nombres primeros.
 * Ver graficamente en el siguiente link:
 * http://blocs.xtec.cat/ceipcirera6/2014/10/08/garbell-derastostenes/
*/

public class Garbell {
	
	/**  
	   * Generar nombres primeros de 2 hasta max
	   * @param max es el valor maximo
	   * @return Vector de nombres primers
	   */
	
	public static int[] obtenirPrimers (int max) 
	{   
	     int i,j;
	     if (max >= 2) { 
		    	 
	        /**
                    *Declaracions
                    * Definimos el valor maximo de la variable
                    */
	        int dim = max + 1; 
	
	        /**
                 * Tamany de l'array
                 */
	        boolean[] bEsPrimer = new boolean[dim];     

	        /** 
                 * Inicialitzar l'array
                 */
                 
	        for (i=0; i<dim; i++)    
	        	bEsPrimer[i] = true; 
	        
	        	// D'entrada eliminem el 0 i l'1, ja que no son nombres primers
	        	bEsPrimer[0] = bEsPrimer[1] = false; 
	
	        	// Garbell d'Erast�tenes: marquem com no primers tots els m�ltiples dels primers
	        	for (i=2; i<Math.sqrt(dim)+1; i++) {    
	        		if (bEsPrimer[i]) 
	        			{
	        			// Eliminar els m�ltiples de i
	        			for (j=2*i; j<dim; j+=i)    
	        				bEsPrimer[j] = false; 
	        			} 
	        		}
	        
	        	// Quants nombres primers hi ha? Recomptem cada posici� a true del array bEsPrimer[]
	        	int comptador = 0;   
	        		for (i=0; i<dim; i++) {   
	        			if (bEsPrimer[i])   
	        				comptador++; 
	        		} 
	        
	                // Reomplim el vector posant cada valor de nombre primer en la seva posicio dins el vector
	                int[] VectorPrimers = new int[comptador];     
	                for (i=0, j=0; i<dim; i++) {    
	                    if (bEsPrimer[i])
	                       VectorPrimers[j++] = i;   
	                }     
	                return VectorPrimers; 
	             } else {  // max < 2
	                return new int[0];   // Vector buit
	        } 
	     }

	
    public static void main (String args[]) {
        System.out.println("Generacio de nombres primers amb Garbell d'Erastotenes:");
        System.out.println("-------------------------------------------------------");
        int[] VectorFinalPrimers;
        VectorFinalPrimers = obtenirPrimers (120);
        System.out.println(VectorFinalPrimers.length + " nombres primers trobats en el interval [1-120]");
        System.out.println(Arrays.toString(VectorFinalPrimers));
    }
	
}
	        
	        


