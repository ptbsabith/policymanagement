package com.example.policymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.policymanagement.model.Policy;
@Repository
public interface PolicyRepository extends JpaRepository<Policy ,Integer> {

}