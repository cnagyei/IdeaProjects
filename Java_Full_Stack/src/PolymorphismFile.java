import java.awt.*;

class MainFile {
    public static void main(String[] args) {
        File img = new ImageFile("/path/to/file/img.png", 480, 640, new byte[2]);

        System.out.println(img.fullName);
        img.printFileInfo();
    }
}

class File {
    protected String fullName;

    public File(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    protected void printFileInfo() {
        String info = this.getFileInfo(); // polyphormic behaviour - dynamic method dispatching
        System.out.println(info);
    }
    protected String getFileInfo() {
        return "File: " + fullName;
    }

}

class ImageFile extends File {
    protected int width;
    protected int height;
    protected byte[] content;

    public ImageFile(String fullName, int width, int height, byte[] content) {
        super(fullName);
        this.width = width;
        this.height = height;
        this.content = content;
    }

    public int  getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public String getFileInfo() {
        return String.format("Image: %s, width: %d, height: %d", fullName, width, height);
    }
}