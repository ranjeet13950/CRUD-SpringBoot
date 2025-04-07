package com.CRUDPROJECT.CRUDPRO.Repository;

import com.CRUDPROJECT.CRUDPRO.Models.Marvel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperHero extends JpaRepository<Marvel,Integer> {
}
