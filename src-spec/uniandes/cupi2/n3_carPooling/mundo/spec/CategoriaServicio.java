package uniandes.cupi2.n3_carPooling.mundo.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.*;

/**
* 
*/
public class CategoriaServicio extends _CategoriaServicio
{

	/**
	* 
	*/
	public final static int TARIFA_MINIMA_VAN = 7000;
	/**
	* 
	*/
	public final static int TARIFA_MINIMA_CONDUCTOR_ELEGIDO = 10000;
	/**
	* 
	*/
	public final static int TARIFA_MINIMA_ORANGE = 5500;
	/**
	* 
	*/
	public final static String VAN = "VAN";
	/**
	* 
	*/
	public final static String ORANGE = "ORANGE";
	/**
	* 
	*/
	public final static String Y = "Y";
	/**
	* 
	*/
	public final static String CONDUCTOR_ELEGIDO = "CONDUCTOR";
	/**
	* 
	*/
	public final static int TARIFA_MINIMA_Y = 4000;
	

	/**
	* 
	*/
	@Atributo(genGet=true, genSet=true)
	private String imagen;
	/**
	* 
	*/
	@Atributo(genGet=true, genSet=true)
	private String categoria;
	

	/**
	* 
	*/
	private ArrayList conductores;
	
	

	/**
	* 
	*/
	public Conductor buscarConductor(int pCedula)
	{
	
	}
	
	/**
	* 
	*/
	public int darCantidadConductores()
	{
	
	}
	
	/**
	* 
	*/
	public String darImagen()
	{
	
	}
	
	/**
	* 
	*/
	public void agregarConductor(String pNombre, int pCedula, String pPlaca, String pModeloCarro, String pImagen)
	{
	
	}
	
	/**
	* 
	*/
	public ArrayList darConductores()
	{
	
	}
	
	/**
	* 
	*/
	public void eliminarConductor(int pCedula)
	{
	
	}
	
	/**
	* 
	*/
	public String darCategoria()
	{
	
	}
	
	
}

