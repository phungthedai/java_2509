package com.vti.entity.day_5_java.Ex1.Qs1;

import java.util.ArrayList;

public class New implements INews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate = 0;
    private  ArrayList<Integer> rates;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public New(String title, String publishDate, String author, String content) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println(
                "Title: " + title + "\n" +
                "PublishDate: " + publishDate + "\n" +
                "Author :" + author + "\n" +
                "Content :" + content + "\n" +
                "AverageRate: " + averageRate
        );
    }

    @Override
    public float calculate() {
        float sum = 0;
        for (Integer rate : rates) {
            sum += rate;
        }
        this.averageRate = (float) sum / rates.size();
        return (float) sum / rates.size();
    }
}
