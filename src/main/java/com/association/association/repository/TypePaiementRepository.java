package com.association.association.repository;

import com.association.association.entity.TypePaiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypePaiementRepository extends JpaRepository<TypePaiement, Long> {}

