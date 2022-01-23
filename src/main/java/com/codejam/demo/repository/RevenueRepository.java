package com.codejam.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codejam.demo.entity.Revenue;

public interface RevenueRepository extends JpaRepository<Revenue,Integer> {

}
