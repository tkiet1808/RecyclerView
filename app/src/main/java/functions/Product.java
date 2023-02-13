package functions;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private int image;

    public Product(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

}
