package com.java.CrudOperations.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.CrudOperations.models.Client;





public interface ClientRepository extends JpaRepository<Client, Integer>{
	
	public Client findByEmail(String email);
	
	

}
