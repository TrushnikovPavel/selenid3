import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class PageObjectPagination {
    private static PageObjectPagination pageObjectPagination;
    private final String bottomControls = "//div[contains(@class, 'bottom-controls ')]";

    @FindBy(xpath = bottomControls + "//a[contains(@class, 'rotate180')]")
    private SelenideElement numberPageBack;

    private final String numberPage ="[1]";// номер страницы 1-9, в []
    @FindBy(xpath =  "(" +"+//li[contains(@class, 'page-item') and contains(@class, 'ng-star-inserted')]"+")"+numberPage)
    private SelenideElement numberPageButton;

    //после перехода на 5-ую страницу, второй элемент превращается в eclips и 8-ой. Только 2-ой Eclips появляется при последних 4-ёх страницах.
    @FindBy(xpath = "//li[contains(@class, 'page-item--ellipsis')]")
    private SelenideElement numberPageButtonEllipsis;

    @FindBy(xpath = "//a[contains(@class, 'page-link') and contains(@class, 'icon') and contains(@class, 'ng-star-inserted')]")
    public SelenideElement PageButtonNext;

    @FindBy(xpath = "//mvid-dropdown[contains(@icontype, 'chevron_down')]")
    private SelenideElement PageShowDropDownButton;

    private final String numberDropDownString ="[1]"; //от 1 до 5
    @FindBy(xpath = "("+ "//div[contains(@class, 'dropdown__option')]"+")"+numberDropDownString)
    private SelenideElement StringNumberDropDownButton;


    public static PageObjectPagination getPageObjectPagination() {
        if (Objects.isNull(pageObjectPagination)) pageObjectPagination = Selenide.page(new PageObjectPagination());
        return pageObjectPagination;
    }






}
