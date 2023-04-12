package com.cg.matrimonysite.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.matrimonysite.entity.Manager;

@Repository
public interface ManagerRepository extends CrudRepository<Manager, Integer> {

	Optional<Manager> findBysubMonth(int subMonth);

	Optional<Manager> findBysubYear(int subYear);

}
