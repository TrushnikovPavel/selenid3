import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Objects;

public class PageObjectMvideo {
    private static PageObjectMvideo pageObjectMvideo;
    private final String productCardContainer = "//div[contains(@class, 'product-cards-layout__item')]";
    private final String starsContainer = "//span[contains(@class, 'stars-container')]";
    private final String productInfo = "//ul[contains(@class, 'product-feature-list')]";
    private final String productCheckOut = "//div[contains(@class, 'product-checkout')]";

    @FindBy(xpath = "//div[contains(@class, 'listing-view-switcher')]")
    private SelenideElement buttonList ;

    @FindBy(xpath = "(//mvid-plp-product-title[contains(@class, 'product-card--list__title')])")
    public List<SelenideElement> productCardName;

//    @FindBy(xpath = productCardContainer + "//a[contains(@class, 'product-title__text')]")   // "//div[contains(@class, 'product-title')]"
//    public SelenideElement productCardName ;
//    public final String nameObject = "Телевизор Haier 65 Smart TV MX ";
//    @FindBy(xpath = productCardContainer + "//a[contains(text(), '"+nameObject+"')]")   // "//div[contains(@class, 'product-title')]"
//    public SelenideElement productCardName ;
    //div[contains(@class, 'product-cards-layout__item')]//a[contains(text(), 'Телевизор Haier 65 Smart TV MX ')]

//     @FindBy(xpath = "//a[contains(text(), 'Телевизор Haier 65 Smart TV MX ')]")   // "//div[contains(@class, 'product-title')]"
//     public SelenideElement productCardName ;

    @FindBy(xpath = productCardContainer + "//span[contains(@class, 'product-rating__feedback')]")
    private SelenideElement productCardFeedback;

    @FindBy(xpath = productInfo)  //"//span[contains(@class, 'product-feature-list__name']"
    private SelenideElement productCardInformationList;

    private final String numberInformationString = "[3]";
    @FindBy(xpath = "("+productInfo+"//li[contains(@class, 'product-feature-list__item')]"+")"+numberInformationString)  //"//span[contains(@class, 'product-feature-list__name']"
    private SelenideElement productCardInformationString;

    @FindBy(xpath = productCardContainer + "//div[contains(@class, 'product-picture-overlay')]")
    private SelenideElement productCardStarsRaiting;

    @FindBy(xpath = starsContainer + "//span[contains(@class, 'value')]")
    private SelenideElement productCardImage;

    @FindBy(xpath = productCardContainer + "//div[contains(@class, 'badge__container')]")
    private SelenideElement productCardCredit;

    private final String numberCard ="[3]";
    public final String numberCardPrice = "[11]";
    @FindBy(xpath = "(" + productCardContainer + ")" + numberCardPrice + "//div[contains(@class, 'price-block')]") //price-block price__main-value
    public SelenideElement productCardPrice;

    @FindBy(xpath = productCardContainer + numberCard + "//span[contains(@class, 'price__sale-value')]")
    private SelenideElement productCardPriceSale;

    @FindBy(xpath = productCardContainer + "//div[contains(@class, 'mbonus-block__caption')]")
    private SelenideElement productCardPriceBonus;

    @FindBy(xpath = productCheckOut + "//button[contains(@class, 'button')]")
    public SelenideElement productCardAddToCart;

    @FindBy(xpath = productCheckOut + "//div [contains(@class, 'wishlist-button-block')]")
    public SelenideElement productCardAddToWishlist;

    @FindBy(xpath = productCheckOut + "//div [contains(@class, 'compare-button-block')]")
    public SelenideElement productCardAddToCompare;

    @FindBy(xpath = productCardContainer + "//span[contains(@class, 'mbonus-block__value')]")
    private SelenideElement productCardPriceBonusValue;

    @FindBy(xpath = productCardContainer + "//span[contains(@class, 'mbonus-block__text-label')]")
    private SelenideElement productCardPriceBonusLabel;


    public PageObjectMvideo() {
    }


//    @FindBy(xpath = ) //"//span[contains(@class, 'product-rating__feedback')]"
//    private SelenideElement productCardImage;


        public void swipe () {
            buttonList.click();
        }
    public static PageObjectMvideo getPageObjectMvideo() {
        if (Objects.isNull(pageObjectMvideo)) pageObjectMvideo = Selenide.page(new PageObjectMvideo());
        return pageObjectMvideo;
    }}


