@FunctionalInterface
public interface Consumator<E> {
    void accept(E e);
}