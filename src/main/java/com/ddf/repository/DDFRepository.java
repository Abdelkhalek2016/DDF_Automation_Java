package com.ddf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ddf.entity.DDFDBEntity;

@Repository
public interface DDFRepository extends JpaRepository<DDFDBEntity, Long> {
	
	
	
	

}
