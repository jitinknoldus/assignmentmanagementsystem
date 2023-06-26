package com.knoldus.assignmentmanagementsystem.service.impl;

import com.knoldus.assignmentmanagementsystem.dao.InternRepository;
import com.knoldus.assignmentmanagementsystem.model.Intern;
import com.knoldus.assignmentmanagementsystem.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class InternServiceImpl implements InternService {

    @Autowired
    InternRepository internRepository;

    @Override
    public List<Intern> getAllInterns() {
        return internRepository.findAll();
    }

    @Override
    public String addIntern(Intern intern) {
        internRepository.save(intern);
        return "Intern record added successfully";
    }

    @Override
    public Optional<Intern> getInternById(Long id) {
        Optional<Intern> intern;
        intern = internRepository.findById(id);
        return intern ;
    }

    @Override
    public String updateIntern(Long id, Intern intern) {
        if(internRepository.existsById(id)){
            internRepository.save(intern);
            return "Intern record updated successfully";
        }
        else{
            return "Record not found";
        }
    }

    @Override
    public String removeIntern(Long id) {
        internRepository.deleteById(id);
        return "Record deleted Successfully";
    }
}
