package com.knoldus.assignmentmanagementsystem.service;

import com.knoldus.assignmentmanagementsystem.model.Intern;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface InternService {

    public List<Intern> getAllInterns();

    public String addIntern(Intern intern);

    public Optional<Intern> getInternById(Long id);

    public String removeIntern(Long id);

    public String updateIntern(Long id, Intern intern);

}
