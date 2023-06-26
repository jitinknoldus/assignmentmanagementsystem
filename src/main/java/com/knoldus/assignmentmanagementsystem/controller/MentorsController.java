package com.knoldus.assignmentmanagementsystem.controller;

import com.knoldus.assignmentmanagementsystem.model.Intern;
import com.knoldus.assignmentmanagementsystem.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MentorsController {

    @Autowired
    InternService internService;

    @GetMapping("/allmentors")
    public ResponseEntity<List<Intern>> getAllMentors(){
        return ResponseEntity.ok(internService.getAllInterns());
    }

    @PostMapping("/addmentor")
    public ResponseEntity<String> addMentor(@RequestBody Intern intern) {
        return ResponseEntity.ok(internService.addIntern(intern));
    }

    @GetMapping("/mentor/{id}")
    public ResponseEntity<Optional<Intern>> findMentorById(@PathVariable Long id){
        return ResponseEntity.ok(internService.getInternById(id));
    }

    @PutMapping("/updatementor/{id}")
    public ResponseEntity<String> updateMentor(@PathVariable Long id, @RequestBody Intern intern){
        return ResponseEntity.ok(internService.updateIntern(id,intern));
    }

    @DeleteMapping("/deletementor/{id}")
    public ResponseEntity<String> deleteMentor(@PathVariable Long id){
        return ResponseEntity.ok(internService.removeIntern(id));
    }

}
