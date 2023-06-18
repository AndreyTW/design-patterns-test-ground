package ru.andreyTw.designPatternsTestGround.prototype;

public class Picture implements Duplicatable{
    private String name;
    private int height;
    private int width;

    public Picture(String name, int height, int width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public Object duplicate() {
        return new Picture(name, height, width);
    }

    @Override
    public String toString() {
        return "Picture{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
