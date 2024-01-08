package com.ensa.notifications.repos;

import com.ensa.notifications.models.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  CoursRepo extends JpaRepository<Cours, String> {
}
