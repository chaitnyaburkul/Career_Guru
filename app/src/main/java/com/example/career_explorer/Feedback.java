package com.example.career_explorer;

public class Feedback
{
    private String id;
    private String text;

    public Feedback() {
        // Default constructor required for Firebase
    }

    public Feedback(String id, String text) {
        this.id = id;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
