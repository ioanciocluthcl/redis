package com.demo.redis.repo;

import com.demo.redis.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, String> {
}
