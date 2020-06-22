public class Stock {
    // Static Class variables.

    static String symbol = "ORCL";
    static String name = "Oracle Corporation";
    
    /* 
        Hardcoded waarden voor je instance variabelen best vermijden.
        Maak in de app gewoon een Stock obj aan en set deze waarden.
        Daarvoor zal je setter methodes nodig hebben.
    */
    static double previousClosingPrice = 34.5;
    static double currentPrice = 34.34;
    // Je hebt hier een variabele waar je de return value van getPercentageChange zou kunnen opslaan.
    // Die zou je kunnen afprinten met een toString methode van je object in plaats van sysouts in de methodes te steken.
    static double pricePercentageChange;

    // Create new instance of stock, prints out the corresponding class variables.
    /*
        Hou je entity klassen clean clean clean!
        Deze methode heet createNewStock, maar doet ook nog andere dingen.
        Een nieuwe stock object creëren is de verantwoordelijkheid van een constructor.
    */
    public static void createNewStock() {
        Stock s = new Stock();

        // Prints out all the variable's at once.
        System.out.println("The current selected TICKER: " + symbol);
        System.out.println("The current selected Stock Name: " + name);
        System.out.println("Previous closing price for this stock recorded at: " + previousClosingPrice);
        System.out.println("Current Price for this stock recorded at: " + currentPrice);
    }

    //  Method to calculate the percentage change between current and previous prices.
    /*
        Als je een methode get... noemt dan kan die best het percentage teruggeven als return value.
        Printen in deze methode maakt dat deze onbruikbaar is voor reuse, volgende keer dat je hem misschien nodig hebt
        is die sysout irrelevant.
        Single responsibility!
    */
    public static void getPercentageChange(){
        pricePercentageChange = 100 * (currentPrice - previousClosingPrice) / previousClosingPrice;
        System.out.println("The percentage change between previous and current prices equals: " + pricePercentageChange + " %");
    }
}
