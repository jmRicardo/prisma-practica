package com.moby.prisma.jmr.prismapractica.repositories;

import com.moby.prisma.jmr.prismapractica.models.entities.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Long> {
}
