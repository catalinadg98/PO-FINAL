package com.company;

import com.company.Elemento;

public class ListaArticulo <T> {
    Elemento<T> inicio, pivote;
    int nelementos;

    public ListaArticulo(){
        inicio=pivote=null;
        nelementos= 0;
    }
    public ListaArticulo(Elemento<T> objeto){
        inicio= pivote= objeto;
        nelementos = 1;
    }
    public void insertar(Elemento objeto){
        if(nelementos==0) {
            inicio = pivote = objeto;
        }else{
            objeto.siguiente= inicio;
            pivote=inicio = objeto;
        }
        nelementos ++;
    }
    public String recorrer(){
        String datos="";
        pivote=inicio;
        for(int i=0; i<nelementos; i++){
           datos += pivote.attrG.toString();
           pivote=pivote.siguiente;
        }
        return datos;
    }
    public void eliminar(){
        inicio=inicio.siguiente;
        nelementos--;
        if (nelementos==0){
            inicio = pivote = null;
        }
    }
    }
