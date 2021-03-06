package AccesoBD;

/**
 *Clase Conector
 *Clase que inicializa la conexi�n con
 *los valores correctos y
 *permite manejar una �nica
 *conexi�n para todo el proyecto y
 *@author Adrian Vega
 *@author Marvin Calvo
 *@author Jose Madrigal
 *@author Danilo Calderon
 *@version v1.0
*/
 
public class Conector{
	//atributo de la clase	
	private static AccesoBD conectorBD = null;
	
	/**
	 *M�todo est�tico que devuelve el 
	 *objeto AccesoBD para que sea utilizado
	 *por las clases
	 *@return objeto del tipo AccesoBD del paquete 
	 *CapaAccesoDatos
	 */
	 
//	public static AccesoBD getConector() throws 
//	java.sql.SQLException,Exception{
//		if (conectorBD == null){			
////			conectorBD = new AccesoBD("sun.jdbc.odbc.JdbcOdbcDriver","jdbc:odbc:BDCxC","sa","jass2002");
//			conectorBD = new AccesoBD("sun.jdbc.odbc.JdbcOdbcDriver","jdbc:odbc:BDCxCAccess","","");
//		}
//		return conectorBD;
//	}
//	
	
	public static AccesoBD getConector() throws java.sql.SQLException,Exception{
		if(conectorBD==null){
			conectorBD = new AccesoBD("net.ucanaccess.jdbc.UcanaccessDriver","jdbc:ucanaccess://../PrPinturaMCalvo/BD/BDCuadros.accdb");
		}
		return conectorBD;
	}
	
}