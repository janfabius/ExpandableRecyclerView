package com.example.expandablerecyclerview;

public class Model {


    private String title;
    private String rating;
    private String day;
    private String summary;
    private boolean expanded;

    public Model(String title, String rating, String day, String summary) {
        this.title = title;
        this.rating = rating;
        this.day = day;
        this.summary = summary;

        this.expanded = false;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }


    @Override
    public String toString() {
        return "Model{" +
                "title='" + title + '\'' +
                ", rating='" + rating + '\'' +
                ", day='" + day + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }





}
