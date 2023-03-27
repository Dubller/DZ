package FunkcionalMethod;

@FunctionalInterface
public interface FunctionalMethod<T, R>{
    R paste(T t);
}
