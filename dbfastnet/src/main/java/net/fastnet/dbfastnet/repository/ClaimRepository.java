package net.fastnet.dbfastnet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.fastnet.dbfastnet.entities.Claim;

public interface ClaimRepository extends JpaRepository<Claim,Integer> {

}