package lambda;

@FunctionalInterface
public interface MyFunc<T> {
    T getValue(T t);
}
