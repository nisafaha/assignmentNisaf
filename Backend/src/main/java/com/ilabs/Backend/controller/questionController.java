package com.ilabs.Backend.controller;

import com.ilabs.Backend.model.question;
import com.ilabs.Backend.service.questionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class questionController {

    @Autowired
    private questionService questionService;

    @GetMapping("/viewQuestions")
    public List<question> getAllRequests() {
        return questionService.getAllQuestions();
    }

    @PostMapping("/addQuestion")
    public ResponseEntity<question> createRequest(@RequestBody question question){
        question saveRequest = questionService.addQuestion(question);
        return new ResponseEntity<>(saveRequest, HttpStatus.OK);
    }

    @DeleteMapping("deleteQuestion/{id}")
    public String deleteQuestion(@PathVariable(value = "id") Integer identity) {
        return this.questionService.deleteQuestion(identity);
    }
}
