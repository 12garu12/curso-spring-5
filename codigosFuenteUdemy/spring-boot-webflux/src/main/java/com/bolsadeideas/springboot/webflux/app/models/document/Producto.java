package com.bolsadeideas.springboot.webflux.app.models.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "productos")
public class Producto {

    @Id
    private String id;

    private String nombre;

    private Double precio;

    private Date createAt;

//  contructor vacio ******************************************************************************************************************************************************************************************************************

    public Producto(){

    }

//  contructor ******************************************************************************************************************************************************************************************************************

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


//  Metodos Getterss and Setters **********************************************************************************************************************************************************************************************


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
