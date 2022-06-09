/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.uagrm.ficct.inf310sb.arboles;

/**
 *
 * @author jose andres 
 */
public class ExcepcionClaveYaExiste extends Exception {

    /**
     * Creates a new instance of <code>ExcepcionClaveYaExiste</code> without
     * detail message.
     */
    public ExcepcionClaveYaExiste() {
    }

    /**
     * Constructs an instance of <code>ExcepcionClaveYaExiste</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ExcepcionClaveYaExiste(String msg) {
        super(msg);
    }
}
