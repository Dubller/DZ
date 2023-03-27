package DZ13_1.FunkcionalMethod;

@FunctionalInterface
public interface FunctionalMethod<T, R>{
    R paste(T t);
}
