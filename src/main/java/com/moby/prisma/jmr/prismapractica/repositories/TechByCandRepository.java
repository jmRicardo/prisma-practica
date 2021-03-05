package com.moby.prisma.jmr.prismapractica.repositories;

import com.moby.prisma.jmr.prismapractica.models.entities.TechnologiesByCandidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TechByCandRepository extends JpaRepository<TechnologiesByCandidate,Long> {

    List<TechnologiesByCandidate> getTechnologiesByCandidate_IdAndTechnology_Name(long id, String name);

    List<TechnologiesByCandidate> getTechnologiesByCandidate_Id(long id);

    List<TechnologiesByCandidate> getTechnologiesByTechnology_Name(String name);
}
