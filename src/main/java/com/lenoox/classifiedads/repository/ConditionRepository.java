package com.lenoox.classifiedads.repository;


import com.lenoox.classifiedads.model.Condition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface ConditionRepository extends CrudRepository<Condition, Integer> {

    Condition findOneByName(String name);
    Optional<Condition> findByName(String name);
}
