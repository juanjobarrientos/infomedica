/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.infomedicas.infomedicas.Model;

/**
 *
 * @author Jairo Jimenez
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "historiales")

public class Historiales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_hs_pk")
    private int id_hspk;
    
    @JoinColumn(name = "id_ct_fk",referencedColumnName="id_ct")
    private long id_ctfk;
    
    @Column(name = "motivoConsulta_hs")
    private String motivoConsulta;
    
    @Column(name = "antecedentes_hs")
    private String antecedentes;
    
    @Column(name = "condicionesPrev_hs")
    private String condicionesPrev;
    
    @Column(name = "pesoPac_hs")
    private float pesoPac;
    
    @Column(name = "estaturaPac_hs")
    private float estaturaPac;
    
    @Column(name = "ocupacionPac_hs")
    private String ocupacionPac;
    
    @Column(name = "observaciones_hs")
    private String observaciones;
    
    @Column(name = "medicamentos_hs")
    private String medicamentos;

    public Historiales() {
    }

    public long getId_hspk() {
        return id_hspk;
    }

    public void setId_hspk(int id_hspk) {
        this.id_hspk = id_hspk;
    }

    public long getId_ctfk() {
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
