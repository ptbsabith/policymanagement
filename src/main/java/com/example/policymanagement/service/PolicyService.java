package com.example.policymanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.policymanagement.model.Policy;
import com.example.policymanagement.repository.PolicyRepository;

@Service
public class PolicyService {

	@Autowired
	PolicyRepository policyRepository;

	public List<Policy> getAllPolicy(){
		List<Policy>policy=new ArrayList<Policy>();
		policyRepository.findAll().forEach(policies-> policy.add(policies));
		return policy;
	}
	
	public Policy getPolicyById(int id){
		return policyRepository.findById(id).get();
	}
	
	public void createPolicy(Policy policy) {
		policyRepository.save(policy);
	}
	
	public void deletePolicy(Policy policy) {
		policyRepository.delete(policy);
	}
	
	public void updatePolicy(Policy policy) {
		policyRepository.save(policy);
	}
	
}
