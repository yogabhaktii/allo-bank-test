package com.allobank.allobackendtest.service;

import com.allobank.allobackendtest.model.Caleg;
import com.allobank.allobackendtest.repository.CalegRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalegServiceImpl implements CalegService {
   @Autowired
   private CalegRepository calegRepository;

   @Override
   public List<Caleg> getAllCalegs(String dapil, String partai, String sortBy) {
      if (dapil != null && partai != null) {
         return calegRepository.findByDapilAndPartai(dapil, partai);
      } else if (dapil != null) {
         return calegRepository.findByDapil(dapil);
      } else if (partai != null) {
         return calegRepository.findByPartai(partai);
      } else {
         return calegRepository.findAll(Sort.by(Sort.Direction.ASC, sortBy != null ? sortBy : "nomorUrut"));

      }
   }
}
