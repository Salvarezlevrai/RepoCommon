package org.example;

class PhotoPost extends Post {
    private String filename;
    private String caption;

    public PhotoPost(String username, String filename, String caption) {
        super(username); // On transmet le username au constructeur de Post
        this.filename = filename;
        this.caption = caption;
    }

    @Override
    public void display() {
        System.out.println("  [Photo]: " + filename);
        System.out.println("  Caption: " + caption);
    }
}
