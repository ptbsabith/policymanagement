package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import policy.Policy;

public interface PolicyRepository extends JpaRepository<Policy ,Long> {

}
