package java_10.inter03;

public interface Buy {
    void buy();

    default void order() { System.out.println("판매 주문"); }
}

