package se.indpro.repository;

import java.util.List;

import se.indpro.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}