package com.allobank.allobackendtest.controller;


import com.allobank.allobackendtest.model.Caleg;
import com.allobank.allobackendtest.model.Dapil;
import com.allobank.allobackendtest.service.CalegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Pemilu")
public class PemiluController {

    @Autowired
    private CalegService calegService;

    @GetMapping("/api/caleg")
    public List<Caleg> getCaleg(
            @RequestParam(required = false) String dapil,
            @RequestParam(required = false) String partai,
            @RequestParam(required = false, defaultValue = "nomorUrut") String sortBy) {
        return calegService.getAllCalegs(dapil, partai, sortBy);
    }

}
