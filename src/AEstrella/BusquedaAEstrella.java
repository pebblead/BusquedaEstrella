/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AEstrella;

import java.util.*;

public class BusquedaAEstrella {
    private Vector<Nodo> visitados;
    Nodo raiz;
    static Nodo meta;
    int totalNivel;
    int distanciaActual;
    
    // Constructor
    public BusquedaAEstrella(int[][] mI, int[][] mM){
        raiz = new Nodo(mI);
        meta = new Nodo(mM);
  //      Nodo test= new Nodo(mI);
        totalNivel = 1;
        distanciaActual = 0;
        visitados = new Vector<Nodo>();
        iniciaBusqueda(raiz, meta);
        System.out.println(raiz.toString());
        System.out.println(meta.toString());
        
  //              System.out.println(test.getValorH());
    }
    
    // Este método es el algoritmo de busqueda de A*
    public void iniciaBusqueda(Nodo raiz, Nodo meta){
        Queue<Nodo> cola = new LinkedList();
        cola.add(raiz);
        while(!cola.isEmpty()){
            Nodo temp = cola.poll();
            visitados.add(temp);
            if(!sonIguales(temp, meta)){
                //Add each child node’s estimated distance to current distance.
                //Insert the children of G which have not been previously visited into the Q
                //Sort Q by path length
            }
        }
        //return failure
    }
    
    // Este método verifica si dos nodos son iguales
    private boolean sonIguales(Nodo n, Nodo m){
        boolean resultado = true;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(n.getElemento()[i][j] != m.getElemento()[i][j]){
                    resultado = false;
                    break;
                }
            }
        }
        return resultado;
    }
    
    // Este método regresa el vector de nodos visitados
    public Vector getVisitados(){
        return visitados;
    }
}
