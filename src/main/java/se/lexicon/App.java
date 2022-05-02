package se.lexicon;

import se.lexicon.LambdaEx1.Action;
import se.lexicon.LambdaEx1.Conditional;
import se.lexicon.LambdaEx1.Product;

import java.util.ArrayList;
import java.util.List;


public class App {

    public static void process(List<Product> productList, Conditional conditional, Action action) {

        for (Product product : productList) {
            if (conditional.test(product)) {
                action.execute(product);
            }
        }
    }

    static Conditional filterByStock = p -> p.getStock() == 0;
    static Conditional filterByName = p -> p.getProductName().startsWith("B");
    static Conditional filterByPrice = p -> p.getPrice() > 100 && p.getPrice() < 150;
    static Conditional increasePrice=p -> p.getStock()<10 && p.getStock() >0 ;

    static Action print = p -> System.out.println(p);

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Refrigerator", 100d, 102));
        productList.add(new Product("LG TV", 185d, 0));
        productList.add(new Product("Oven", 170d, 122));
        productList.add(new Product("Microwave", 200d, 112));
        productList.add(new Product("Refrigerator", 700d, 132));
        productList.add(new Product("TV", 150d, 0));

//Print out all Products that have stock value of 0.
        process(productList, filterByStock, print);
        System.out.println("--------------------------------------------------");

// out the productName of all the Products that starts with B.
        process(productList, filterByName, print);
        System.out.println("--------------------------------------------------");
// Print out all Products that have price above 100 AND lower than 150
        process(productList, filterByPrice, print);
        //Increase the price of all Products that have a stock value of less than 10 AND above 0 by 50%
    }

}

