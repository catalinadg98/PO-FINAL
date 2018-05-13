package com.company;

public class ArticuloPerecedero {
    public String nombre;
    public String clave;
    public String descripcion;
    public String precio;
    public String fecha;

    public ArticuloPerecedero(){
        nombre="";
        clave="";
        descripcion="";
        precio="";
        fecha="";
    }
    public ArticuloPerecedero(String n, String c, String d, String p, String f) {
        nombre = n;
        clave = c;
        descripcion = d;
        precio = p;
        fecha = f;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getClave(){
        return clave;
    }
    public void setClave(String clave){
        this.clave=clave;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    public String getPrecio(){
        return precio;
    }
    public void setPrecio(String precio){
        this.precio=precio;
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    @Override
    public  String toString(){
        return "Nombre: "+nombre+", Clave: "+clave+", Descripcion: "+descripcion+", Precio: "+precio+", Fecha: "+fecha+"\n";
    }
}
