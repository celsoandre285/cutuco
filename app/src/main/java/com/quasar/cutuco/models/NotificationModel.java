package com.quasar.cutuco.models;

import java.time.LocalDateTime;

public class NotificationModel {

    private String title;
    private String description;
    private LocalDateTime dateTime;
    private String urlImage;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
