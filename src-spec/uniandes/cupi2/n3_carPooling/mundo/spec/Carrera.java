package uniandes.cupi2.n3_carPooling.mundo.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.*;

/**
* 
*/
public class Carrera extends _Carrera
{

	/**
	* 
	*/
	public final static String TARJETA = "Tarjeta";
	/**
	* 
	*/
	public final static String EFECTIVO = "Efectivo";
	

	/**
	* 
	*/
	@Atributo(genGet=true, genSet=true)
	private String destino;
	/**
	* 
	*/
	@Atributo(genGet=true, genSet=true)
	private String medioDePago;
	/**
	* 
	*/
	@Atributo(genGet=true, genSet=true)
	private String nombre_usuario;
	/**
	* 
	*/
	@Atributo(genGet=true, genSet=true)
	private double distancia;
	/**
	* 
	*/
	@Atributo(genGet=true, genSet=true)
	private int telefono_celular;
	/**
	* 
	*/
	@Atributo(genGet=true, genSet=true)
	private int tiempo;
	/**
	* 
	*/
	@Atributo(genGet=true, genSet=true)
	private String origen;
	

	

	/**
	* 
	*/
	public String darOrigen()
	{
	
	}
	
	/**
	* 
	*/
	public int darTiempo()
	{
	
	}
	
	/**
	* 
	*/
	public int darTelefonoCelular()
	{
	
	}
	
	/**
	* 
	*/
	public String darMedioDePago()
	{
	
	}
	
	/**
	* 
	*/
	public String darDestino()
	{
	
	}
	
	/**
	* 
	*/
	public String darNombre()
	{
	
	}
	
	
}

