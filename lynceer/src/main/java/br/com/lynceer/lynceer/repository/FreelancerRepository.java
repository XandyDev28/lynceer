package br.com.lynceer.lynceer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lynceer.lynceer.entity.Freelancer;

public interface FreelancerRepository extends JpaRepository<Freelancer, Integer> {

    
}