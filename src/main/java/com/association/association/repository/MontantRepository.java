package com.association.association.repository;

import com.association.association.entity.Montant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MontantRepository extends JpaRepository<Montant, Long> {}
