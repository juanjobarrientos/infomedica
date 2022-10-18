/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.infomedica.DAO;

import com.infomedica.model.Citas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitasDAO extends JpaRepository<Citas, Long> {
    
}
