package com.vti.entity;

public class Answer {
    private int answerId;
    private String content;
    private Question questionId;
    private boolean isCorrect;

    public int getAnswerId() {
        return answerId;
    }

    public String getContent() {
        return content;
    }

    public Question getQuestionId() {
        return questionId;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setQuestionId(Question questionId) {
        this.questionId = questionId;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

}
