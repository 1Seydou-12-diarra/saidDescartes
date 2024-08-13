package com.association.association.repository;

import com.association.association.entity.Adhesion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdhesionRepository extends JpaRepository<Adhesion, Long> {}

