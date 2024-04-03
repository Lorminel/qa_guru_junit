package tests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
private SelenideElement currencySelector = $("div[data-selenium='currency-container-selected-currency']"),
        currencyPopUp = $("div[data-selenium='currency-popup']"),
        destinationInput = $("#textInput"),
        checkInBox = $("#check-in-box"),
        occupancyBox = $("div[data-element-name='occupancy-box'"),
        searchButton = $("button[data-selenium='searchButton']"),
        suggestedDestinationWrapper = $(".Searchbox__wrapper"),
        hamburgerMenuButton = $("button[data-selenium='header-hamburger-menu']"),
        currencyContainerHamburgerMenu = $("div[data-selenium='hamburger-menu-dropdown-container']")
            .$("div[data-selenium='currency-container-selected-currency']"),
        languageSelector = $("div[data-selenium='language-container-selected-language']"),
        languagePopUp = $("div[data-selenium='language-popup']");


    public MainPage openPage(){
        open("/");
        return this;
    }
    public MainPage selectCurrency(String currency){

        currencySelector.click();
        currencyPopUp.$(byText(currency)).closest("button").click();

        return this;
    }

    public MainPage selectDestination(String destination){
        destinationInput.setValue(destination);
        suggestedDestinationWrapper.$("li").click();
        return this;
    }

    public MainPage closeDateSelector(){
        checkInBox.click();
        return this;
    }

    public MainPage closeOccupancyBox(){
        occupancyBox.click();
        return this;
    }

    public MainPage pressSearch(){
        searchButton.click();
        return this;
    }

    public MainPage openHamburgerMenu(){
        hamburgerMenuButton.click();
        return this;
    }

    public MainPage selectLanguage(String language){
        languageSelector.click();
        languagePopUp.$(byText(language)).closest("button").click();
        return this;
    }

    public MainPage checkCurrencyName(String currency){
        currencySelector.shouldHave(text(currency));

        return this;
    }

    public MainPage checkCurrencyInHamburgerMenu(String currencyAbbreviation, String currencyName){
        currencyContainerHamburgerMenu.shouldHave(text(currencyAbbreviation + " " + currencyName));
        return this;
    }

}
