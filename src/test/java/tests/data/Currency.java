package tests.data;

public enum Currency {
    RUB("₽", "Российский рубль"),
    USD("USD", "Доллар США"),
    EUR("€", "Евро");

    private final String abbreviation;
    private final String currencyFullName;

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCurrencyFullName() {
        return currencyFullName;
    }

    Currency(String priceDisplay, String priceName) {
        this.abbreviation = priceDisplay;
        this.currencyFullName = priceName;
    }



}
