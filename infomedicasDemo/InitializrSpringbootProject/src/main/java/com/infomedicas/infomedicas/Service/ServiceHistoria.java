/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.infomedicas.infomedicas.Service;

import com.infomedicas.infomedicas.Model.Historiales;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public interface ServiceHistoria {
    List<Historiales> getListaHistoriales();
    Historiales crearHistoriales(Historiales historial);
    Historiales ActualizarHistoriales(Historiales historial);
    Boolean EliminarHistoriales(Long id);
    
}
