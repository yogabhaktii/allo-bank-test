package com.allobank.allobackendtest.repository;

import com.allobank.allobackendtest.model.Caleg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CalegRepository extends JpaRepository<Caleg, Long> {
    List<Caleg> findByDapil(String dapil);
    List<Caleg> findByPartai(String partai);
    List<Caleg> findByDapilAndPartai(String dapil, String partai);


}
