package com.cloudcom2024.store.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "qr_codes")
@Data
public class QRCode {
    @Id
    @GeneratedValue
    @Column(name = "qr_code_id")
    private Long profileImageID;
    
    @Column(name = "name")
    private String name;

    @Column(name = "file_path")
    private String filePath;
}
