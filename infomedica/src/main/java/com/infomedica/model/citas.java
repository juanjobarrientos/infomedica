package com.infomedica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Citas {

	@Id 
        @Column (name= "id_ct")
        @GeneratedValue(strategy = GenerationType.AUTO)
	private long id_ct; 
        
	@Column 
	private String direccion_ct; 
	
	@Column 
	private String  fecha_ct;
	
	@Column 
	private String hora_ct;
	
	@Column 
	private int edadPac_ct; 
	
	@Column 
	private String nombrePac_ct; 
	
	@Column 
	private String pesoPac_ct;
	
	@Column 
	private String sexoPac_ct;

    public long getId_ct() {
        return id_ct;
    }

    public void setId_ct(long id_ct) {
        this.id_ct = id_ct;
    }

    public String getDireccion_ct() {
        return direccion_ct;
    }

    public void setDireccion_ct(String direccion_ct) {
        this.direccion_ct = direccion_ct;
    }

    public String getFecha_ct() {
        return fecha_ct;
    }

    public void setFecha_ct(String fecha_ct) {
        this.fecha_ct = fecha_ct;
    }

    public String getHora_ct() {
        return hora_ct;
    }

    public void setHora_ct(String hora_ct) {
        this.hora_ct = hora_ct;
    }

    public int getEdadPac_ct() {
        return edadPac_ct;
    }

    public void setEdadPac_ct(int edadPac_ct) {
        this.edadPac_ct = edadPac_ct;
    }

    public String getNombrePac_ct() {
        return nombrePac_ct;
    }

    public void setNombrePac_ct(String nombrePac_ct) {
        this.nombrePac_ct = nombrePac_ct;
    }

    public String getPesoPac_ct() {
        return pesoPac_ct;
    }

    public void setPesoPac_ct(String pesoPac_ct) {
        this.pesoPac_ct = pesoPac_ct;
    }

    public String getSexoPac_ct() {
        return sexoPac_ct;
    }

    public void setSexoPac_ct(String sexoPac_ct) {
        this.sexoPac_ct = sexoPac_ct;
    }
        
}
