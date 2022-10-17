/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.infomedicas.infomedicas.Servicelempl;

import com.infomedicas.infomedicas.Dao.HistoriaDao;
import com.infomedicas.infomedicas.Model.Historiales;
import com.infomedicas.infomedicas.Service.ServiceHistoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiseHistorialmpl  implements ServiceHistoria{

    @Autowired
    private HistoriaDao getDao;
    
    @Override
    public List<Historiales> getListaHistoriales() {
        return getDao.findAll();
           }
    
    @Override
    public Historiales crearHistoriales(Historiales historial) {
        if(historial != null){
            return getDao.save(historial);     
    }
        return null;

    
    
    }
//    editar hsiatorial de paciente
   
    @Override
    public Historiales ActualizarHistoriales(Historiales historial) {
         if (historial != null && historial.getId_hspk() != 0) {
            Historiales historialBD = getDao.getReferenceById(historial.getId_hspk());
            if (historialBD != null) {
                historialBD.setMotivoConsulta(historial.getMotivoConsulta());
                historialBD.setAntecedentes(historial.getAntecedentes());
                historialBD.setCondicionesPrev(historial.getCondicionesPrev());
                historialBD.setPesoPac(historial.getPesoPac());
                historialBD.setEstaturaPac(historial.getEstaturaPac());
                historialBD.setOcupacionPac(historial.getOcupacionPac());
                historialBD.setObservaciones(historial.getObservaciones());
                historialBD.setMedicamentos(historial.getMedicamentos());
                return getDao.save(historialBD);
            }
        }
        return null;
    }
//    eliminar historial 

    @Override
    public Boolean EliminarHistoriales(Long id) {
         if(id != null && id != 0){
            Historiales historialBD = getDao.getReferenceById(id);
            if(historialBD  != null){
                getDao.deleteById(id);
                 return true;
            }
          }
           return false;
    }
  
}
