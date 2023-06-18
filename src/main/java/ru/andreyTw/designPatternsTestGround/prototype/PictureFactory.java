package ru.andreyTw.designPatternsTestGround.prototype;

public class PictureFactory {
    Picture picture;

    public PictureFactory(Picture picture) {
        this.picture = picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    Picture duplicatePicture() {
        return (Picture) picture.duplicate();
    }
}
