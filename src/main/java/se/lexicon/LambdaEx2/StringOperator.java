package se.lexicon.LambdaEx2;


public class StringOperator implements DoStringStuff,DoIntegerStuff{
    @Override
    public String operate(String str1, String str2) {
        return str1.concat(str2);
    }

    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }

    public static void main(String[] args) {

        StringOperator fullString=new StringOperator();
        // There is 2 way to initialize, this is 1st way:-

        String firstName="Linda",lastName="Svensson";
        System.out.println(fullString.operate(firstName," " +lastName));

        //This is the second way:-
       System.out.println(fullString.operate( "Erik"," " +"Svensson"));


       //Creating an Anonymous Inner class:
        DoStringStuff getBiggestString=new  DoStringStuff() {
            @Override
            public String operate(String str1, String str2) {
                return str1.length()>=str2.length()? str1:str2;
            }
        };
        System.out.println(getBiggestString.operate("Lambda","Expression"));

        //Creating one more Annonymus Inner class:
        DoIntegerStuff getBiggestNumber=new DoIntegerStuff() {
            @Override
            public int calculate(int num1, int num2) {
                return num1*num2;
            }
        };
        System.out.println();
    }
}
