package view;

import model.data_structures.DobleListaEncadenada;
import model.logic.Modelo;

public class View 
{
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("0. Requerimiento 0: Cargar los datos");
			System.out.println("1. Requerimiento A1: Primer comparendo con LOCALIDAD dada.");
			System.out.println("2. Requerimiento A2: Comparendos con una FECHA_HORA dada.");
			System.out.println("3. Requerimiento A3: Comparar INFRACCION de comparendos en 2 FECHA_HORA dadas.");
			System.out.println("4. Requerimiento B1: Primer comparendo con INFRACCION dada");
			System.out.println("5. Requerimiento B2: Comparendos con una INFRACCION dada.");
			System.out.println("6. Requerimiento B3:Comparar INFRACCION de comparendos por TIPO_SERVI");
			System.out.println("7. Requerimiento C1: Cantidad de comparendos en una LOCALIDAD, FECHA_HORAi y FECHA_HORAf.");
			System.out.println("8. Requerimiento C2: Consultar los N codigos de INFRACCION con mas comparendos dada una FECHA_HORAi y FECHA_HORAf.");
			System.out.println("9. Requerimiento C3: Tabla ASCII");
			
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(Modelo modelo)
		{
			// TODO implementar
			System.out.println(modelo.Lista());
			
		}
}