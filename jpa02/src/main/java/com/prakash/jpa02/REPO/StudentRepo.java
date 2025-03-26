package com.prakash.jpa02.REPO;

import com.prakash.jpa02.ENTITY.student;
import org. springframework. data. jpa. repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<student,Integer> {
}
