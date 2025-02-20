package br.com.lynceer.lynceer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lynceer.lynceer.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

} 
