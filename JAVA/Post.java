package org.example;

public abstract class  Post {
    protected String username;
    protected int likes;

    public Post(String username) {
        this.username = username;
        this.likes = 0;
    }

    public void like() {
       likes++;
    }

    public  abstract  void display(); {

    }
}



