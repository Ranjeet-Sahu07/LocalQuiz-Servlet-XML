package com.example.model;

import java.util.List;

/**
 * Quiz model class representing a quiz with multiple questions
 * Data is loaded from quizzes.xml
 */
public class Quiz {
    private String quizId;
    private String subject;
    private String topic;
    private int duration; // in minutes
    private List<Question> questions;

    // Default constructor
    public Quiz() {
    }

    // Parameterized constructor
    public Quiz(String quizId, String subject, String topic, int duration, List<Question> questions) {
        this.quizId = quizId;
        this.subject = subject;
        this.topic = topic;
        this.duration = duration;
        this.questions = questions;
    }

    // Getters and Setters
    public String getQuizId() {
        return quizId;
    }

    public void setQuizId(String quizId) {
        this.quizId = quizId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "quizId='" + quizId + '\'' +
                ", subject='" + subject + '\'' +
                ", topic='" + topic + '\'' +
                ", duration=" + duration +
                ", questions=" + questions.size() +
                '}';
    }
}
