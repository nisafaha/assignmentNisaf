package com.ilabs.Backend.model;

import jakarta.persistence.*;
@Entity
@Table(name = "question")
public class question {

    @Id
    @Column(name = "question_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer questionId;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "status")
    private String status;

    public question() {
    }

    public question(Integer questionId, String name, String nic, String status) {
        this.questionId = questionId;
        this.name = name;
        this.category = nic;
        this.status = status;
    }

    public question(String name, String nic, String status) {
        this.name = name;
        this.category = nic;
        this.status = status;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getStatus() {
        return status;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
