public class ImageProxy implements IImage {
    private String fileName;
    Image image = null;
    
    public ImageProxy(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    public void loadFromDisk() {
        System.out.println("loading " + fileName);
    }

    @Override
    public void display() {
        if (image == null) {
            image = new Image(fileName);
        }
        image.display();
    }

    public void setFilename(String fileName) {
        this.fileName = fileName;
    }

    public String getFilename() {
        return fileName;
    }
}