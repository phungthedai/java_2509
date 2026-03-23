package com.vti.entity;

public class Question {
    private int questionId;
    private String content;
    private CategoryQuestion categoryId;
    private TypeQuestion typeId;
    private Account creatorId;
    private String createDate;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CategoryQuestion getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(CategoryQuestion categoryId) {
        this.categoryId = categoryId;
    }

    public TypeQuestion getTypeId() {
        return typeId;
    }

    public void setTypeId(TypeQuestion typeId) {
        this.typeId = typeId;
    }

    public Account getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Account creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", content='" + content + '\'' +
                ", categoryId=" + categoryId +
                ", typeId=" + typeId +
                ", creatorId=" + creatorId +
                ", createDate='" + createDate + '\'' +
                '}';
    }

    public Question(int questionId, String content, String createDate) {
        this.createDate = createDate;
        this.content = content;
        this.questionId = questionId;
    }
}
