package controller;

import java.io.FileReader;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import model.data_structures.DobleListaEncadenada;
import model.logic.Comparendos;
import model.logic.Modelo;
import view.View;

public class Controller {

	/*
	 * 
	 */
	private DobleListaEncadenada<Comparendos> listaComparendos;

	/* Instancia del Modelo*/
	private Modelo modelo;

	/* Instancia de la Vista*/
	private View view;

	private Comparendos comparendo;

	public static final String ruta="./data/comparendos.geojson";
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public Controller()
	{
		listaComparendos= new DobleListaEncadenada<Comparendos>();
		view = new View();
		modelo = new Modelo();
	}

	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String localidad = null;
		String fechaYhora = null;
		Integer dato = null;
		Object datoS = null;
		String respuesta = "";
		String fecha1 = "";
		String fecha2 = "";


		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
			case 1:
				modelo = new Modelo(); 
				modelo.loadComparendos(ruta);
				System.out.println(modelo);
				System.out.println("Arreglo Dinamico creado");
				System.out.println("Numero actual de elementos " + modelo.darTamano() + "\n---------");	
				System.out.println("Primer Elemento: " + modelo.retornoPrimero() + "\n---------");		
				System.out.println("Ultimo Elemento: " + modelo.retornoUltimo() + "\n---------");
				System.out.println("Tamanio Copia: " + modelo.tamanioCopia()+ "\n---------");
				System.out.println("TODOS PRUEBA: "+ "\n---------");
				modelo.primerosYUltimos();

				break;

			case 2:
				System.out.println("--------- \nDar Localidad a buscar: ");
				localidad = lector.next();
				respuesta =  modelo.buscarPorLocalidad(localidad) + "";
				if ( respuesta != null)
				{
					System.out.println("Dato encontrado: "+ respuesta);
				}
				else
				{
					System.out.println("Dato NO encontrado");
				}
				System.out.println("Numero actual de elementos " + modelo.darTamano() + "\n---------");						
				break;

			case 3:

				System.out.println("--------- \nDar Localidad a buscar: ");
				localidad = lector.next();
				respuesta =  modelo.comparendosPorFecha(fechaYhora) + "";
				if ( respuesta != null)
				{
					System.out.println("Dato encontrado: "+ respuesta);
				}
				else
				{
					System.out.println("Dato NO encontrado");
				}
				System.out.println("Numero actual de elementos " + modelo.darTamano() + "\n---------");						
				break;



			case 4:
				System.out.println("--------- \nDar fecha1 a buscar: ");
				fecha1 = lector.next();
				System.out.println("--------- \nDar fecha2 a buscar: ");
				fecha2 = lector.next();
				respuesta =  modelo.comparendosPorFechas(fecha1, fecha2) + "";
				if ( respuesta != null)
				{
					System.out.println("fechas: "+ respuesta);
				}
				else
				{
					System.out.println("Dato NO encontrado");
				}
				System.out.println("Numero actual de elementos " + modelo.darTamano() + "\n---------");						
				break;


			case 5:
				System.out.println("--------- \nDar infraccion a buscar: ");
				fecha2 = lector.next();
				respuesta =  modelo.buscarPorInfraccion(fecha2) + "";
				if ( respuesta != null)
				{
					System.out.println("Comparendo: "+ respuesta);
				}
				else
				{
					System.out.println("Dato NO encontrado");
				}
				System.out.println("Numero actual de elementos " + modelo.darTamano() + "\n---------");						
				break;


			case 6:
				System.out.println("--------- \nDar infraccion a buscar: ");
				fecha2 = lector.next();
				respuesta =  modelo.comparendosPorinfraccion(fecha2) + "";
				if ( respuesta != null)
				{
					System.out.println("Comparendo: "+ respuesta);
				}
				else
				{
					System.out.println("Dato NO encontrado");
				}
				System.out.println("Numero actual de elementos " + modelo.darTamano() + "\n---------");						
				break;

			case 7:
				System.out.println("--------- \nDar particular a buscar: ");
				fecha1 = lector.next();
				System.out.println("--------- \nDar publico a buscar: ");
				fecha2 = lector.next();
				respuesta =  modelo.comparendosPorTipo(fecha1, fecha2) + "";
				if ( respuesta != null)
				{
					System.out.println("Comparendo: "+ respuesta);
				}
				else
				{
					System.out.println("Dato NO encontrado");
				}
				System.out.println("Numero actual de elementos " + modelo.darTamano() + "\n---------");						
				break;

			case 8:

				System.out.println("--------- \nDar localidad a buscar: ");
				respuesta = lector.next();
				System.out.println("--------- \nDar Fecha Hora ini a buscar: ");
				fecha1 = lector.next();
				System.out.println("--------- \nDar Fecha hora fin a buscar: ");
				fecha2 = lector.next();
				respuesta =  modelo.comparendosEntreFechas(fecha1, fecha2, respuesta)+ "";
				if ( respuesta != null)
				{
					System.out.println("Comparendo: "+ respuesta);
				}
				else
				{
					System.out.println("Dato NO encontrado");
				}
				System.out.println("Numero actual de elementos " + modelo.darTamano() + "\n---------");						
				break;

			case 9:
				modelo = new Modelo(); 
				modelo.loadComparendos(ruta);
				System.out.println(modelo);
				System.out.println("Arreglo Dinamico creado");
				System.out.println("Numero actual de elementos " + modelo.darTamano() + "\n---------");	
				System.out.println("Primer Elemento: " + modelo.retornoPrimero() + "\n---------");		
				System.out.println("Ultimo Elemento: " + modelo.retornoUltimo() + "\n---------");
				System.out.println("Tamanio Copia: " + modelo.tamanioCopia()+ "\n---------");
				System.out.println("TODOS PRUEBA: "+ "\n---------");
				modelo.primerosYUltimos();

				break;
			case 10:
				modelo = new Modelo(); 
				modelo.loadComparendos(ruta);
				System.out.println(modelo);
				System.out.println("Arreglo Dinamico creado");
				System.out.println("Numero actual de elementos " + modelo.darTamano() + "\n---------");	
				System.out.println("Primer Elemento: " + modelo.retornoPrimero() + "\n---------");		
				System.out.println("Ultimo Elemento: " + modelo.retornoUltimo() + "\n---------");
				System.out.println("Tamanio Copia: " + modelo.tamanioCopia()+ "\n---------");
				System.out.println("TODOS PRUEBA: "+ "\n---------");
				modelo.primerosYUltimos();

				break;


			default: 
				System.out.println("--------- \n Opcion Invalida !! \n---------");
				break;
			}
		}
	}
}	