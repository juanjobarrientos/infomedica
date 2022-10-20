package com.example.demo.dao;

import com.example.demo.models.Citas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitasDao extends JpaRepository<Citas, Long> {
    
}
