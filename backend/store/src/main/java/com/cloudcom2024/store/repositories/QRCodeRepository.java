package com.cloudcom2024.store.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cloudcom2024.store.models.QRCode;

@Repository
public interface QRCodeRepository extends CrudRepository<QRCode, Long> {
    Optional<QRCode> findImageByName(String Imagename);
}
