package com.example.demo.dao;

import com.example.demo.models.Historiales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistorialesDao extends JpaRepository<Historiales, Long>  {
    
}
