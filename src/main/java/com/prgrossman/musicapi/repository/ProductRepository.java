package com.prgrossman.musicapi.repository;

import com.prgrossman.musicapi.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {


}
