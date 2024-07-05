package java_10.inter04;

public class ExMain {

    public static void main(String[] args) {
        Queue shelfQueue = new BookShelf();
        shelfQueue.enQueue("1번");
        shelfQueue.enQueue("2번");
        shelfQueue.enQueue("3번");

        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
        System.out.println(shelfQueue.deQueue());
    }

}
