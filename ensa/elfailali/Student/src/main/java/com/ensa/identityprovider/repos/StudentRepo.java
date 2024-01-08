package com.ensa.identityprovider.repos;

import com.ensa.identityprovider.models.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student, String> {
//    Optional<S> findByEmail(String username);
}
