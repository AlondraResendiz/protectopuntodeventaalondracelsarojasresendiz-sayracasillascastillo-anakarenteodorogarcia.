
package puntodeventa;

import Conexion.conexion;
import login.Login;

public class PuntoDeVenta {

    
    public static void main(String[] args) {
      Login objVistaLogin= new Login();
     objVistaLogin.setVisible(true);
conexion prueba=new conexion();
prueba.getConnection();
    }
 
}
