package org.example.java_core;

import java.util.Objects;

public class ExamQuestion {
    Exam examId;
    Question questionId;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ExamQuestion that = (ExamQuestion) o;
        return Objects.equals(examId, that.examId) && Objects.equals(questionId, that.questionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examId, questionId);
    }
}
