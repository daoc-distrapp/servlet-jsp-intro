
package codigo;

import javax.ejb.Stateless;


/**
 *
 * @author dordonez@ute.edu.ec
 */
@Stateless
public class ModelEJB {
        
    public String[] autentica(String usuario, String clave) {
        if(usuario.equals("diego") && clave.equals("1111")) {
            return new String[] {"uno", "dos", "tres", "cuatro"};
        }
        if(usuario.equals("maria") && clave.equals("2222")) {
            return new String[] {"uno", "tres"};
        }    
        return null;
    }
       
}
