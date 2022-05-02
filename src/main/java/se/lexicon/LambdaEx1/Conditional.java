package se.lexicon.LambdaEx1;

@FunctionalInterface
public interface Conditional<product> {
    boolean test(product p);
}
