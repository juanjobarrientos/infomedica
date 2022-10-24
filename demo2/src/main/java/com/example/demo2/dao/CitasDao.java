package com.example.demo2.dao;

import com.example.demo2.models.Citas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitasDao extends JpaRepository<Citas, Long> {
    
}
