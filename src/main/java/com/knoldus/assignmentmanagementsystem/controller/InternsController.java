package com.knoldus.assignmentmanagementsystem.controller;

import com.knoldus.assignmentmanagementsystem.model.Intern;
import com.knoldus.assignmentmanagementsystem.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/api/")
public class InternsController {

    @Autowired
    InternService internService;

    @GetMapping("/allinterns")
    public ResponseEntity<List<Intern>> getAllInterns(){
        return ResponseEntity.ok(internService.getAllInterns());
    }

    @PostMapping("/addintern")
    public ResponseEntity<String> addIntern(@RequestBody Intern intern) {
        return ResponseEntity.ok(internService.addIntern(intern));
    }

    @GetMapping("/intern/{id}")
    public ResponseEntity<Optional<Intern>> findInternById(@PathVariable Long id){
        return ResponseEntity.ok(internService.getInternById(id));
    }

    @PutMapping("/updateintern/{id}")
    public ResponseEntity<String> updateIntern(@PathVariable Long id, @RequestBody Intern intern){
        return ResponseEntity.ok(internService.updateIntern(id,intern));
    }

    @DeleteMapping("/deleteintern/{id}")
    public ResponseEntity<String> deleteIntern(@PathVariable Long id){
        return ResponseEntity.ok(internService.removeIntern(id));
    }
}
