package com.allobank.allobackendtest.service;

import com.allobank.allobackendtest.model.Caleg;

import java.util.List;

public interface CalegService {
    List<Caleg> getAllCalegs(String dapil, String partai, String sortBy);

}
