package com.example.model;

import java.util.List;

/**
 * Question model class representing a quiz question
 * Each question contains the question text, options, and correct answer
 */
public class Question {
    private String questionId;
    private String questionText;
    private List<String> options; // List of 4 options
    private String correctAnswer;

    // Default constructor
    public Question() {
    }

    // Parameterized constructor
    public Question(String questionId, String questionText, List<String> options, String correctAnswer) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    // Getters and Setters
    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId='" + questionId + '\'' +
                ", questionText='" + questionText + '\'' +
                ", options=" + options +
                ", correctAnswer='" + correctAnswer + '\'' +
                '}';
    }
}
