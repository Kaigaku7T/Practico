/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.uagrm.ficct.inf310sb.arboles;

import java.util.List;
/**
 *
 * @author jose andres 
 * @param <K>
 * @param <V>
 */

//    LA INTENCION DE UTILIZAR LAS INTERFACES, ES DECLARAR EL METODO EN LA CLASE 
//    Y UTILIZAR SOLO LOS METODOS DECLARADOS EN LA INTERFAZ E INTANCIARLOS CON LA CLASE

public interface IArbolBusqueda<K extends Comparable<K>, V> {
    //NO SE IMPLEMENTA CODIGO CUERPO EN LA INTERFAZ
    void insertar(K claveAInsertar, V valorAInsertar) throws NullPointerException;
//    Esta emulando lo que hace java cuando trabaja con mapas
//    En un mapa cuando se inserta a veces devuelve falso o verdadero o simplemente si existe reemplaza el valor
//    y si no existe simplemente lo agrega al arbol
//    lo unico que se esta controlando es que la clave no sea nula
//    En los mismo mapas cuando le pasan la clave y cuando lo eliminan retorna el valor por si necesita hacer algo con ese valor
//    Al buscarlo toma el valor para hacer algo con ese valor
//    NINGUNO DE ESTO METOS SON ESTATICOS, TODOS SON METODOS PUBLICOS
//    **CONCEPTO PARA LOS METODOS ELIMINAR Y BUSCAR** (INVESTIGAR ESTE TIPO DE METODOS NO MUY COMUNES)
    V eliminar(K claveAEliminar) throws ExcepcionClaveNoExiste;
    V buscar(K claveABuscar);
    boolean contiene(K claveABuscar);
    int size(); //Tamaño
    int altura();
    void vaciar();
    boolean esArbolVacio();
    int nivel();
    
    List<K> recorridoPorNiveles();
    List<K> recorridoEnPreOrden();
    List<K> recorridoEnInOrden();
    List<K> recorridoEnPosOrden();
    
}