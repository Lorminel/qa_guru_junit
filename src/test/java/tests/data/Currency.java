package tests.data;

public enum Currency {
    RUB("₽", "Российский рубль"),
    USD("USD", "Доллар США"),
    EUR("€", "Евро");

    public final String abbreviation;
    public final String currencyFullName;

    Currency(String priceDisplay, String priceName) {
        this.abbreviation = priceDisplay;
        this.currencyFullName = priceName;
    }



}
