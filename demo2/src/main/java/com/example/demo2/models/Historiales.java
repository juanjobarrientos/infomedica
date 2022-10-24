package com.example.demo2.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "historiales")

public class Historiales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_hs_pk")
    private long id_hspk;
    
    private long id_ctfk;

    private String motivoConsulta;

    private String antecedentes;

    private String condicionesPrev;

    private Long pesoPac;

    private Long estaturaPac;

    private String ocupacionPac;

    private String observaciones;

    private String medicamentos;

    public Historiales() {
    }

    public long getId_hspk() {
        return id_hspk;
    }

    public void setId_hspk(long id_hspk) {
        this.id_hspk = id_hspk;
    }

    public long getId_ctfk() {
        return id_ctfk;
    }

    public void setId_ctfk(long id_ctfk) {
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

    public Long getPesoPac() {
        return pesoPac;
    }

    public void setPesoPac(Long pesoPac) {
        this.pesoPac = pesoPac;
    }

    public Long getEstaturaPac() {
        return estaturaPac;
    }

    public void setEstaturaPac(Long estaturaPac) {
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
