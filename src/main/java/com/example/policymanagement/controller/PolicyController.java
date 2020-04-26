/*
 * package com.example.policymanagement.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.PutMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.example.policymanagement.model.Policy; import
 * com.example.policymanagement.service.PolicyService;
 * 
 * @RestController
 * 
 * @RequestMapping public class PolicyController {
 * 
 * @Autowired private PolicyService service;
 * 
 * @GetMapping("/policy") List <Policy> getAllPolicy() { return
 * service.getAllPolicy(); }
 * 
 * @GetMapping("policy/{id}") public Policy getPolicy(@PathVariable("id") int
 * id) { return service.getPolicyById(id); }
 * 
 * @PostMapping("/policy") private int createPolicy(@RequestBody Policy policy)
 * { service.createPolicy(policy); return policy.getId(); }
 * 
 * @PutMapping("/policy") Policy updatePolicy(@RequestBody Policy newPolicy) {
 * service.updatePolicy(newPolicy); return newPolicy; }
 * 
 * 
 * }
 */