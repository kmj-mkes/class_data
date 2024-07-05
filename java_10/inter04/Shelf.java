package java_10.inter04;

import java.util.ArrayList;

public class Shelf {
    protected ArrayList<String> shelf;

    public Shelf() {
        this.shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf() {
        return this.shelf;
    }

    public int getCount() {
        return this.shelf.size();
    }
}
