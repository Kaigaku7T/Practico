/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.edu.uagrm.ficct.inf310sb.consola;

import bo.edu.uagrm.ficct.inf310sb.arboles.ArbolBinarioBusquedaEnteroCadena;
import bo.edu.uagrm.ficct.inf310sb.arboles.ExcepcionClaveNoExiste;
import bo.edu.uagrm.ficct.inf310sb.arboles.AVL;
import bo.edu.uagrm.ficct.inf310sb.arboles.ArbolB;
import bo.edu.uagrm.ficct.inf310sb.arboles.ExcepcionOrdenInvalido;
import bo.edu.uagrm.ficct.inf310sb.arboles.ArbolMViasBusqueda;
import bo.edu.uagrm.ficct.inf310sb.arboles.ArbolBinarioBusqueda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose andres 
 */
public class Consola {
    
    public static void main(String[] args) throws ExcepcionClaveNoExiste, ExcepcionOrdenInvalido {
        AVL<Integer, String> avl = new AVL<>();
        ArbolMViasBusqueda<Integer, String> arbolB;
        ArbolMViasBusqueda<Integer,String> arbolMvias = new ArbolMViasBusqueda<>();
        ArbolMViasBusqueda<Integer,String> arbolMvias2 = new ArbolMViasBusqueda<>();
        ArbolBinarioBusqueda<Integer, String> arbolBusqueda1 = new ArbolBinarioBusqueda<>();
        ArbolBinarioBusqueda<Integer, String> arbolBusqueda3 = new ArbolBinarioBusqueda<>();
        ArbolBinarioBusqueda<String, String> arbolBusqueda2;
        ArbolBinarioBusquedaEnteroCadena arbolEnteroCadena1 = new ArbolBinarioBusquedaEnteroCadena();
        
        List<String> clavesInOrden = new ArrayList<>();
        clavesInOrden.add("CA");
        clavesInOrden.add("CF");
        clavesInOrden.add("CP");
        clavesInOrden.add("CZ");
        clavesInOrden.add("EK");
        clavesInOrden.add("FE");
        clavesInOrden.add("HM");
        clavesInOrden.add("LP");
        clavesInOrden.add("MK");
        clavesInOrden.add("TA");
        clavesInOrden.add("VB");

        List<String> valoresInOrden = new ArrayList<>();
        valoresInOrden.add("Juan");
        valoresInOrden.add("Pedro");
        valoresInOrden.add("Carlos");
        valoresInOrden.add("Jhon");
        valoresInOrden.add("Pepe");
        valoresInOrden.add("Smith");
        valoresInOrden.add("Meg");
        valoresInOrden.add("Marge");
        valoresInOrden.add("Homero");
        valoresInOrden.add("Bart");
        valoresInOrden.add("Lisa");

        List<String> clavesPostOrden = new ArrayList<>();
        clavesPostOrden.add("CF");
        clavesPostOrden.add("CA");
        clavesPostOrden.add("CZ");
        clavesPostOrden.add("CP");
        clavesPostOrden.add("FE");
        clavesPostOrden.add("EK");
        clavesPostOrden.add("LP");
        clavesPostOrden.add("MK");
        clavesPostOrden.add("VB");
        clavesPostOrden.add("TA");
        clavesPostOrden.add("HM");

        List<String> valoresPostOrden = new ArrayList<>();
        valoresPostOrden.add("Pedro");
        valoresPostOrden.add("Juan");
        valoresPostOrden.add("Jhon");
        valoresPostOrden.add("Carlos");
        valoresPostOrden.add("Smith");
        valoresPostOrden.add("Pepe");
        valoresPostOrden.add("Marge");
        valoresPostOrden.add("Homero");
        valoresPostOrden.add("Lisa");
        valoresPostOrden.add("Bart");
        valoresPostOrden.add("Meg");

        List<String> clavesPreOrden = new ArrayList<>();
        clavesPreOrden.add("HM");
        clavesPreOrden.add("EK");
        clavesPreOrden.add("CP");
        clavesPreOrden.add("CA");
        clavesPreOrden.add("CF");
        clavesPreOrden.add("CZ");
        clavesPreOrden.add("FE");
        clavesPreOrden.add("TA");
        clavesPreOrden.add("MK");
        clavesPreOrden.add("LP");
        clavesPreOrden.add("VB");

        List<String> valoresPreOrden = new ArrayList<>();
        valoresPreOrden.add("Meg");
        valoresPreOrden.add("Pepe");
        valoresPreOrden.add("Carlos");
        valoresPreOrden.add("Juan");
        valoresPreOrden.add("Pedro");
        valoresPreOrden.add("Jhon");
        valoresPreOrden.add("Smith");
        valoresPreOrden.add("Bart");
        valoresPreOrden.add("Homero");
        valoresPreOrden.add("Marge");
        valoresPreOrden.add("Lisa");
        System.out.println("Preguntas de 2 a 5 se veran reflejadas por la correcta compilacion de los demas ejemplos");
        
                
        /*
        1. Implemente un método que reciba en listas de parámetros las llaves 
        y valores de los recorridos en postorden e inorden respectivamente y que reconstruya el árbol binario original. Su método no debe usar el método insertar.
        */
        
        System.out.println("*Pregunta 1.-");
        
        arbolBusqueda2 = new ArbolBinarioBusqueda<>(clavesInOrden, valoresInOrden, clavesPostOrden, valoresPostOrden, false);
        
        System.out.println("Arbol Binario de Busqueda con Listas");
        
        System.out.println(arbolBusqueda2);
        

        //6. Para el árbol AVL implemente el método insertar
        
        System.out.println("*Pregunta 6. insertar en arbol AVL");
        
        avl.insertar(32, "CARLA");
        avl.insertar(20, "CARLA");
        avl.insertar(15, "CARLA");
        avl.insertar(52, "CARLA");
        avl.insertar(55, "CARLA");
        
        System.out.println("Arbol AVL");
        
        System.out.println(avl);
        
        //7. Para el árbol AVL implemente el método eliminar
        
        System.out.println("*Pregunta 7. eliminar en arbol AVL");
        
        avl.eliminar(55);
        
        System.out.println(avl);
        
        //8. Para el árbol B implemente el método insertar
        
        System.out.println("*Pregunta 8. insertar en arbol B");
        
        System.out.println("Arbol B insertando");
        
        arbolB = new ArbolB<>(4);
        arbolB.insertar(33, "Dani");
        arbolB.insertar(22, "Dani");
        arbolB.insertar(44, "Dani");
        arbolB.insertar(29, "Dani");
        arbolB.insertar(49, "Dani");
        arbolB.insertar(30, "Dani");
        
        System.out.println(arbolB);
        
        //9. Para el arbol B implemente el metodo eliminar
        
        System.out.println("*Pregunta 9. eliminar en arbol B");
        
        System.out.println("Arbol B eliminando");
        arbolB.eliminar(29);    
        
        System.out.println(arbolB);
        
        
        //10. para un árbol m-vias de búsqueda implemente el metodo insertar
        
        System.out.println("*Pregunta 10. insertar en arbol m-vias");
        
        System.out.println("Arbol M Vias insertando");
        
        arbolMvias.insertar(5, "David");
        arbolMvias.insertar(12, "David");
        arbolMvias.insertar(3, "David");
        arbolMvias.insertar(9, "David");
        arbolMvias.insertar(17, "David");
        
        System.out.println(arbolMvias);
        
        //11. para un árbol m-vias de búsqueda implemente el metodo eliminar
        System.out.println("*Pregunta 11. eliminar en arbol m-vias");
        
        System.out.println("Arbol M Vias eliminando");
        arbolMvias.eliminar(3);
        
        System.out.println(arbolMvias);
   
        //12. Implemente un método recursivo que retorne la cantidad de nodos 
        //que tienen un solo hijo no vació
        
        System.out.println("Arbol Binario de Busqueda a trabajar en 12,13,14,18");
        
        arbolBusqueda1.insertar(15, "Pedro");
        arbolBusqueda1.insertar(11, "Pedro");
        arbolBusqueda1.insertar(9,  "Pedro");
        arbolBusqueda1.insertar(13, "Pedro");
        arbolBusqueda1.insertar(8,  "Pedro");
        arbolBusqueda1.insertar(10, "Pedro");
        arbolBusqueda1.insertar(14, "Pedro");
        arbolBusqueda1.insertar(12, "Pedro");
        arbolBusqueda1.insertar(19, "Pedro");
        arbolBusqueda1.insertar(17, "Pedro");
        arbolBusqueda1.insertar(22, "Pedro");
        arbolBusqueda1.insertar(18, "Pedro");
        arbolBusqueda1.insertar(16, "Pedro");
        arbolBusqueda1.insertar(23, "Pedro");
        arbolBusqueda1.insertar(21, "Pedro");
        arbolBusqueda1.insertar(33, "Pedro");
        
        System.out.println(arbolBusqueda1);
        
        System.out.println("*Pregunta 12.-");
        
        System.out.println("Cantidad de nodos que tienen un solo hijo no vació: "+arbolBusqueda1.cantidadNodoUnSoloHijo());
        
        //13. Implemente un método iterativo con la lógica de un recorrido en 
        //inOrden que retorne el número de hijos vacios que tiene un árbol binario.
        
        System.out.println("*Pregunta 13.-");
        
        System.out.println("Número de hijos vacios que tiene un árbol binario: "+arbolBusqueda1.numeroHijosVacioInOrden());
        
        //14. Implemente un método privado que reciba un nodo binario de un árbol binario 
        //y que retorne cuál sería su predecesor inorden de la clave de dicho nodo.
        
        System.out.println("*Pregunta 14.-");
        
        System.out.println("Predecesor inorden de la clave de dicho nodo: "+arbolBusqueda1.predecesorInOrden());
        
        //15. Implemente un método que retorne verdadero si solo hay nodos 
        //completos en el nivel n de un árbol m vias. Falso en caso contrario.
        
        System.out.println("*Pregunta 15.- (con arbolmvias)");
        
        System.out.println("Verdadero si solo hay nodos completos en el nivel n de un árbol m vias. Falso en caso contrario: "+arbolMvias.nodosCompletosEnNivelN(4));
        
        //16.implemente una clase ArbolBinarioBusquedaEnteroCadena que usando como base el ArbolBinarioBusqueda 
        //ya no sea un arbol generico, si no un arbol binario de busqueda con claves enterar y valores cadena
        System.out.println("*Pregunta 16.-");
        
        arbolEnteroCadena1.insertar(12, "Carlos");
        arbolEnteroCadena1.insertar(10, "Carlos");
        arbolEnteroCadena1.insertar(15, "Carlos");
        
        System.out.println("ArbolBinarioBusquedaEnteroCadena");
        
        System.out.println(arbolEnteroCadena1);
        
        /*
        17. Para un árbol binario de búsqueda implemente un método que reciba 
        como parámetro otro árbol y que retorne verdadero si los arboles 
        son similares, falso en caso contrario.
        */
        System.out.println("*Pregunta 17.- (arbol m-vias");
        
        arbolMvias2.insertar(5, "David");
        arbolMvias2.insertar(12, "David");
        arbolMvias2.insertar(3, "David");
        arbolMvias2.insertar(9, "David");
        arbolMvias2.insertar(17, "David");
        
        System.out.println("Arbol M Vias2");
        
        System.out.println(arbolMvias2);
        
        System.out.println("Verdadero si los arboles son similares. Falso en caso contrario(árbol m vías): "+arbolMvias.esSimilar(arbolMvias2));
        
        
        
        System.out.println("*Pregunta 17.- (ArbolBinario)");
        
        System.out.println("Arbol Binario de Busqueda Comparable");
        arbolBusqueda3.insertar(15, "Pedro");
        arbolBusqueda3.insertar(11, "Pedro");
        arbolBusqueda3.insertar(9,  "Pedro");
        arbolBusqueda3.insertar(13, "Pedro");
        arbolBusqueda3.insertar(8,  "Pedro");
        arbolBusqueda3.insertar(10, "Pedro");
        arbolBusqueda3.insertar(14, "Pedro");
        arbolBusqueda3.insertar(12, "Pedro");
        arbolBusqueda3.insertar(19, "Pedro");
        arbolBusqueda3.insertar(17, "Pedro");
        arbolBusqueda3.insertar(22, "Pedro");
        arbolBusqueda3.insertar(18, "Pedro");
        arbolBusqueda3.insertar(16, "Pedro");
        arbolBusqueda3.insertar(23, "Pedro");
        arbolBusqueda3.insertar(21, "Pedro");
        arbolBusqueda3.insertar(33, "Pedro");
        System.out.println(arbolBusqueda3);
        
        System.out.println("Verdadero si los arboles son similares, falso en caso contrario(árbol binario de búsqueda): "+arbolBusqueda1.sonSimilares(arbolBusqueda3));
        
                /*
        18. Para un árbol binario de búsqueda implemente un método que reciba 
        como parámetro otro árbol y que retorne verdadero si los arboles 
        son similares, falso en caso contrario.
        */
        System.out.println("*Pregunta 18.-");
        
        System.out.println("Verdadero si los arboles son similares, falso en caso contrario(árbol binario de búsqueda): "+arbolBusqueda1.sonSimilares(arbolBusqueda3));
    }
}