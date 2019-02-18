package com.servepro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.servepro.util.OrderDetailsUtil;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetailsUtil, Integer> {

}
