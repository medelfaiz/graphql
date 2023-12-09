package com.xproce.inventoryservice.dao.repository;

import com.xproce.inventoryservice.dao.entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepository extends JpaRepository<Creator,Integer> {
}
