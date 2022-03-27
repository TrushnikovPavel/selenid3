import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class PageObjectFilter {
    public static PageObjectFilter pageObjectFilter;
    private final String filterContainer = "//div[contains(@class, 'filter-container')]";
//    @FindBy(xpath = filterContainer + "//accordion__title")// accordion__container, switcher-block
    private final String minPrice ="//input[contains(@name, 'minPrice')]";
    private final String maxPrice ="//input[contains(@name, 'maxPrice')]";
    //input[contains(@name, 'minPrice')]

    public final String numberAccordionFilter = "[5]";
    @FindBy(xpath = "(" + filterContainer + "//mvid-accordion"+ ")"+numberAccordionFilter)
    private SelenideElement accordionFilter;

    public final String numberSwitcherFilter = "[5]";
    @FindBy(xpath = "("+filterContainer + "//mvid-switcher"+")"+numberSwitcherFilter)
    public SelenideElement switcherFilter;

    public final String accordionFilterCheckBoxNumber = "[5]";
    @FindBy(xpath = "("+"("+filterContainer + "//mvid-switcher"+")"+numberAccordionFilter+ "//div[contains(@class, 'checkbox-wrap')])"+")"+ accordionFilterCheckBoxNumber)
    public SelenideElement accordionFilterCheckBox;

    @FindBy(xpath = "("+filterContainer + "//mvid-switcher"+")"+numberAccordionFilter+"//input[contains(@class, 'input__field')]")
    public SelenideElement accordionFilterCheckBoxSearcherField;

    @FindBy(xpath = "("+filterContainer + "//mvid-switcher"+")"+numberAccordionFilter+"//mvid-icon[contains(@class, 'input__search-icon')]")
    public SelenideElement accordionFilterCheckBoxSearcherButton;

    @FindBy(xpath = "(" + filterContainer + "//mvid-accordion"+ ")"+numberAccordionFilter+"//div[contains(@class,'range')]")
    public SelenideElement accordionFilterPriceSearchRange;

    @FindBy(xpath = "(" + filterContainer + "//mvid-accordion"+ ")"+numberAccordionFilter+"//div[contains(@class,'range')]"+minPrice)
    private SelenideElement accordionFilterPriceMin;

    @FindBy(xpath = "(" + filterContainer + "//mvid-accordion"+ ")"+numberAccordionFilter+"//div[contains(@class,'range')]"+maxPrice)
    private SelenideElement accordionFilterPriceMax;

    public PageObjectFilter() {
    }
    public static PageObjectFilter getPageObjectFilter() {
        if (Objects.isNull(pageObjectFilter)) pageObjectFilter = Selenide.page(new PageObjectFilter());
        return pageObjectFilter;
    }

    //div[contains(@class,'range')]



}
