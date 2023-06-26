package com.knoldus.assignmentmanagementsystem.dao;

import com.knoldus.assignmentmanagementsystem.model.Intern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternRepository extends JpaRepository<Intern,Long > {
}
