public class Stock {
    // Static Class variables.

    static String symbol = "ORCL";
    static String name = "Oracle Corporation";
    static double previousClosingPrice = 34.5;
    static double currentPrice = 34.34;
    static double pricePercentageChange;

    // Create new instance of stock, prints out the corresponding class variables.
    public static void createNewStock() {
        Stock s = new Stock();

        // Prints out all the variable's at once.
        System.out.println("The current selected TICKER: " + symbol);
        System.out.println("The current selected Stock Name: " + name);
        System.out.println("Previous closing price for this stock recorded at: " + previousClosingPrice);
        System.out.println("Current Price for this stock recorded at: " + currentPrice);
    }

    //  Method to calculate the percentage change between current and previous prices.
    public static void getPercentageChange(){
        pricePercentageChange = 100 * (currentPrice - previousClosingPrice) / previousClosingPrice;
        System.out.println("The percentage change between previous and current prices equals: " + pricePercentageChange + " %");
    }
}
