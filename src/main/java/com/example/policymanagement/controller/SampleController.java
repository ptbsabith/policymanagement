package com.example.policymanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.policymanagement.model.Policy;
import com.example.policymanagement.repository.PolicyRepository;
@RestController
public class SampleController {	
	
		@Autowired
		PolicyRepository policyRepo;

		@RequestMapping("/")
		public String home() {
			return "started the web";
		}

		@GetMapping("/getAllvalue")
		public List<Policy> getAllvalue() {
			return policyRepo.findAll();
		}

		@GetMapping("/getvalue/{id}")
		public Optional<Policy> getById(@PathVariable("id") int id) {
			return policyRepo.findById(id);
		}

		@PutMapping("/addPolicy")
		public Policy addPolicy(@RequestBody Policy policy) {
			policyRepo.save(policy);
			return policy;
		}

		@PostMapping("/updateValue")
		public Policy upadetById(@RequestBody Policy policy) {
			policyRepo.save(policy);
			return policy;
		}

		@DeleteMapping("/deletevalue/{id}")
		public void deleteValueById(@PathVariable("id") int id) {
			/*
			 * Policy pol=policyRepo.getOne(id); policyRepo.delete(pol);
			 */
			policyRepo.deleteById(id);
		}
}
