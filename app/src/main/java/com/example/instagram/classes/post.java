package com.example.instagram.classes;

public class post {
    private int img;

    private int profilepicture;

    private String username;

    public post(int img, int user_profile, String username) {
        this.img = img;
        this.profilepicture = user_profile;
        this.username = username;
    }


    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getProfilepicture() {
        return profilepicture;
    }

    public void setProfilepicture(int profilepicture) {
        this.profilepicture = profilepicture;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
