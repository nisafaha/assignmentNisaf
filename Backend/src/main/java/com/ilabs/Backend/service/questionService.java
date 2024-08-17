package com.ilabs.Backend.service;

import com.ilabs.Backend.model.question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ilabs.Backend.repository.questionRepository;

import java.util.List;

@Service
public class questionService {

    @Autowired
    private questionRepository questionRepository;

    public question addQuestion(question Question) {
        return questionRepository.save(Question);
    }

    public List<question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public String deleteQuestion (Integer id){
        this.questionRepository.deleteById(id);
        return "Successfully Deleted";
    }

}
