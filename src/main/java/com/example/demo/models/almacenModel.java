package com.example.demo.models; 
import javax.persistence.*;


@Entity
@Table(name="empresa")
public class  almacenModel{

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int idempresa;

    private String nombre;
    private String ruc;
    private String direccion;
    private String estado;


    public int getIdempresa() {
        return this.idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

   public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getRuc() {
        return this.ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

    

}