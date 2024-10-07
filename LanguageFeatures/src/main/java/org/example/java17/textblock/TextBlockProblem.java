package org.example.java17.textblock;

public class TextBlockProblem {
    /*You are creating a system that needs to display information about products, such as Books and Electronics.
    Use text blocks to display product details in a structured format, and use pattern matching with instanceof to extract details about the product.
     */

    public static void main(String[] args) {

        Product graphQL = new Book("Building APIs with GraphQL Federation: A Spring Boot and DGS Approach", "Santhosh Krishnan", 52.00);
        Product keyBoardBook = new Book("How To Play Keyboard: A Complete Guide for Absolute Beginners", " Ben Parker", 12.00);

        Product keyBoard = new Electronic("76 keys: Provides more range and is closer to a full-sized keyboard (88 keys). " +
                "If you're planning to progress in your skills or play more complex pieces later, this might be a better long-term investment.", 76.00);

        System.out.println(getProdInfo (graphQL));
        System.out.println(getProdInfo (keyBoard));

        System.out.println("*------------------*");
        System.out.println(getProdInfoSwitch (keyBoardBook));
        System.out.println(getProdInfoSwitch (keyBoard));

    }

    private static String getProdInfo(Product product) {

        String prodInfo = "";

        if (product instanceof Book book) {
            prodInfo = "Title : %s  Author : %s  Price : %f ".formatted( book.title(), book.author(),  book.price());
        }else if (product instanceof Electronic ele) {
            prodInfo = "Product : %s Price : %f".formatted( ele.prodInfo(), ele.price());
        }

        return prodInfo;
    }

    private static String getProdInfoSwitch(Product product) {

        String prodInfo = "";

        switch (product){
            case Book book -> {
                prodInfo = """
                        Title : %s
                        Author : %s
                        Price : %f
                        """.formatted(book.title(), book.author(), book.price());
            }

            default -> throw new IllegalStateException("Unexpected value: " + product);
        }

        return prodInfo;
    }
}
