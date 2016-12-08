package uniandes.cupi2.n3_carPooling.interfaz.spec;

import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;
import uniandes.cupi2.n3_carPooling.mundo.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 * Ventana principal de la aplicación.
 */
@UIFrame(alto=800, ancho=600, titulo = "CarPooling")
public class InterfazCarPooling extends _InterfazCarPooling
{

	

	

	/**
	* 
	*/
	private PanelImagen panelImagen;
	
	/**
	* 
	*/
	private PanelOpciones panelOpciones;
	
	/**
	* 
	*/
	private CarPooling mundo_CarPooling;
	
	/**
	* 
	*/
	private PanelInformacion panelInformacion;
	
	

	/**
	* 
	*/
	public InterfazCarPooling()
	 {

	 }


	



    // -----------------------------------------------------------------
    // Puntos de Extensión
    // -----------------------------------------------------------------


    /**
     * Método para la extensión 1
     */
    public void reqFuncOpcion1( )
    {
        String resultado = mundo_CarPooling.metodo1();
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * Método para la extensión 2
     */
    public void reqFuncOpcion2( )
    {
        String resultado = mundo_CarPooling.metodo2();
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }



	// -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    /**
    * Este método ejecuta la aplicación, creando una nueva interfaz.
    * @param pArgs Argumentos para la ejecución de la aplicación. En este caso no son necesarios.
    */
    public static void main( String[] pArgs )
    {
    	// Unifica la interfaz para Mac y para Windows.
    	try 
    	{
			UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    	
        InterfazCarPooling interfaz = new InterfazCarPooling( );
        interfaz.setVisible( true );
    }
}
