package ru.andreyTw.designPatternsTestGround.prototype;

public class Program {
    public static void main(String[] args) {
        Picture pictureOriginal = new Picture("Black box", 768, 1024);

        System.out.println(pictureOriginal);

        Picture pictureCopyOne = (Picture) pictureOriginal.duplicate();
        System.out.println(pictureCopyOne);

        PictureFactory factory = new PictureFactory(pictureOriginal);
        Picture pictureCopyTwo = factory.duplicatePicture();
        System.out.println(pictureCopyTwo);
    }
}
