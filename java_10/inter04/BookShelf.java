package java_10.inter04;

public class BookShelf extends Shelf implements Queue {
    @Override
    public void enQueue(String title) {
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        if( getSize() <= 0) {
            return "큐가 비었습니다.";
        }
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        return getCount();
    }
}
