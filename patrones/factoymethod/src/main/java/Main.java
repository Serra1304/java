import creators.CoinEURCreator;
import creators.CoinUSDCreator;
import factory.CoinCreator;

public class Main {
    public static void main(String[] args) {
        CoinCreator eur = new CoinEURCreator();
        CoinCreator usd = new CoinUSDCreator();

        eur.getPrice();
        usd.getPrice();

    }
}
