package com.moby.prisma.jmr.prismapractica.repositories;

import com.moby.prisma.jmr.prismapractica.models.entities.TechnologiesByCandidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechByCandRepository extends JpaRepository<TechnologiesByCandidate,Long> {
}
