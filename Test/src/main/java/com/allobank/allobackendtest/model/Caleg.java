package com.allobank.allobackendtest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Caleg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nama;
    private String partai;
    private String dapil;
    private int nomorUrut;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPartai() {
        return partai;
    }

    public void setPartai(String partai) {
        this.partai = partai;
    }

    public String getDapil() {
        return dapil;
    }

    public void setDapil(String dapil) {
        this.dapil = dapil;
    }

    public int getNomorUrut() {
        return nomorUrut;
    }

    public void setNomorUrut(int nomorUrut) {
        this.nomorUrut = nomorUrut;
}



}
