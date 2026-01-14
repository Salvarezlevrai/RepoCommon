package org.example;

class MessagePost extends Post {
    private String message;

    public MessagePost(String username, String message) {
        super(username);
        this.message = message;
    }

    @Override
    public void display()  {
        System.out.println( "Nom : " + username + ", nombres de likes :" + likes);
        System.out.println("Message: " + message);
    }
}
