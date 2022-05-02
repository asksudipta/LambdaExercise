package se.lexicon.LambdaEx1;
@FunctionalInterface
public interface Action {
    <product> void execute(product p);
}
