package org.example;


class MessagePost2 extends Post {
    private String message;

    public MessagePost2(String username, String message) {
        super(username);
        this.message = message;
    }

    @Override
    public void display() {
        System.out.println("Message: " + message);
    }
}
