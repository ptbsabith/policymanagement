package controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import policy.Policy;
import repository.PolicyRepository;

@RestController
public class PolicyController {

	private PolicyRepository repository;
	
@PostMapping
Policy createPolicy(@RequestBody Policy newPolicy) {
	return repository.save(newPolicy);
}

@PutMapping
Policy updatePolicy(Policy policy) {
	return repository.save(policy);
}
@GetMapping
List <Policy> listPolicy() {
	return repository.findAll();
}
}
