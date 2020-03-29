package com.lenoox.classifiedads.repository;

import com.lenoox.classifiedads.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
