package com.me.springcore._1st_annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MemberType {

    @Value(value = "Java")
    private String title;
    @Value(value = "Java Standard Edition")
    private String details;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "MemberType{" +
                "title='" + title + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
