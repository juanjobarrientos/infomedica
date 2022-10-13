/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.infomedica.model;

/**
 *
 * @author Jairo Jimenez
 */
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "historiales")

public class Historiales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_hs_pk")
    private int id_hspk;
    
    @JoinColumn(name = "id_ct_fk",referencedColumnName="id_ct")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private int id_ctfk;
    
    @Column(name = "motivoConsulta_hs")
    @NotNull(message = "El campo motivo consulta no puede estar null")
    @Size(min = 5,max = 50,message = "el motivo consulta solo se "
            + "permite un rango de 5 a 50 carateres")
    private String motivoConsulta;
    
    @Column(name = "antecedentes_hs")
    @NotNull(message = "El campo antecedentes no puede estar null")
    @Size(min = 5,max = 100,message = "los antecedentes solo se "
            + "permite un rango de 5 a 100 carateres")
    private String antecedentes;
    
    @Column(name = "condicionesPrev_hs")
    @NotNull(message = "El campo condiciones presvias no puede estar null")
    @Size(min = 5,max = 100,message = "Condiciones previas solo se "
            + "permite un rango de 5 a 100 carateres")
    private String condicionesPrev;
    
    @Column(name = "pesoPac_hs")
    @NotNull(message = "El campo peso paciente no puede estar null")
    private float pesoPac;
    
    @Column(name = "estaturaPac_hs")
    @NotNull(message = "El campo estatura paciente no puede estar null")
    private float estaturaPac;
    
    @Column(name = "ocupacionPac_hs")
    @NotNull(message = "El campo ocupacion paciente no puede estar null")
    @Size(min = 5,max = 20,message = "en ocupacion paciente solo se "
            + "permite un rango de 5 a 20 carateres")
    private String ocupacionPac;
    
    @Column(name = "observaciones_hs")
    @NotNull(message = "El campo observaciones no puede estar null")
    @Size(min = 5,max = 150,message = "en observaciones solo se "
            + "permite un rango de 5 a 150 carateres")
    private String observaciones;
    
    @Column(name = "medicamentos_hs")
    @NotNull(message = "El campo medicamentos no puede estar null")
    @Size(min = 5,max = 100,message = "en el campo medicamentos solo se "
            + "permite un rango de 5 a 100 carateres")
    private String medicamentos;

    public Historiales() {
    }

    public int getId_hspk() {
        return id_hspk;
    }

    public void setId_hspk(int id_hspk) {
        this.id_hspk = id_hspk;
    }

    public int getId_ctfk() {
        return id_ctfk;
    }

    public void setId_ctfk(int id_ctfk) {
        this.id_ctfk = id_ctfk;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getCondicionesPrev() {
        return condicionesPrev;
    }

    public void setCondicionesPrev(String condicionesPrev) {
        this.condicionesPrev = condicionesPrev;
    }

    public float getPesoPac() {
        return pesoPac;
    }

    public void setPesoPac(float pesoPac) {
        this.pesoPac = pesoPac;
    }

    public float getEstaturaPac() {
        return estaturaPac;
    }

    public void setEstaturaPac(float estaturaPac) {
        this.estaturaPac = estaturaPac;
    }

    public String getOcupacionPac() {
        return ocupacionPac;
    }

    public void setOcupacionPac(String ocupacionPac) {
        this.ocupacionPac = ocupacionPac;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }       
    
}
