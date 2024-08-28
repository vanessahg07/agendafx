package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    public String nombre;
    public Categoria categoria;
    private List<Contacto> contactos = new ArrayList<>();


    public Grupo(String nombre, Categoria categoria, List<Contacto> contactos) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.contactos = contactos ;
    }

    

    public Grupo() {
    }



    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Categoria getCategoria() {
        return categoria;
    }


    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }



    public List<Contacto> getContactos() {
        return contactos;
    }


    public void agregarContacto(Contacto contacto) {
        this.contactos.add(contacto);
    }



    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }




    



   
    
    

}
