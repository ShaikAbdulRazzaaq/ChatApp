package com.projects.chatapp;

public class ChatModelClass  {
    private String message;
    private String name;
    private String imageUrl;

    public ChatModelClass() {
    }

    public ChatModelClass(String message, String name, String imageUrl) {
        this.message = message;
        this.name = name;
        this.imageUrl = imageUrl;
    }

   public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
