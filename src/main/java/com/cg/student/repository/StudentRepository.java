package com.cg.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.student.domain.People;

@Repository
public interface StudentRepository extends JpaRepository<People, Long> {

}
