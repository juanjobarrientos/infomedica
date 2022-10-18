/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.infomedica.DAO;

import com.infomedica.model.Historiales;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author JUAN_JO
 */
public interface HistorialesDAO extends JpaRepository<Historiales, Long> {
    
}
