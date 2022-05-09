package se.lexicon.LambdaEx2;

/*Its a functional Interface which contain 1 abstract method.
*It has any number of default and static method
*A functional interface can be marked with a special annotation to
check that it is a functional interface.That is @functionalInterface
 */
@FunctionalInterface
public interface DoStringStuff {
    //This implementation has 2 input string and return a string.
    String operate(String str1, String str2);
}
