package org.example.java_core;

import java.util.Objects;

public class Exam {
    int examId;
    String code;
    String title;
    CategoryQuestion categoryId;
    String duration;
    Account creatorId;
    String createDate;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Exam exam = (Exam) o;
        return examId == exam.examId && Objects.equals(title, exam.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(examId, code, title, categoryId, duration, creatorId, createDate);
    }
}
