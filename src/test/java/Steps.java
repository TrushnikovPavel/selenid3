import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

public class Steps {

    private PageObjectMvideo pageObjectMvideo;
    private PageObjectPagination pageObjectPagination;
    private PageObjectFilter pageObjectFilter;

    public Steps() {
        pageObjectMvideo = PageObjectMvideo.getPageObjectMvideo();
        pageObjectPagination = PageObjectPagination.getPageObjectPagination();
        pageObjectFilter=PageObjectFilter.getPageObjectFilter();
    }

    public void clickOnRadiobutton(){
        pageObjectFilter.switcherFilter.click();
    }

    public void clickOnCheckbox(){
        pageObjectFilter.accordionFilterCheckBoxForClick.click();
    }

    public void searchProduct(String productName) {
        pageObjectMvideo.swipe();
        boolean isElementWasFound = false;
        var nextPageBtn = pageObjectPagination.PageButtonNext;

        while (!isElementWasFound && nextPageBtn.exists()) {
            var pageObjects = pageObjectMvideo.productCardName;
            while (pageObjects.size() != 24) {
                pageObjects.get(pageObjects.size() - 1).scrollIntoView(true);
            }

            isElementWasFound = pageObjects.stream()
                    .anyMatch(object -> {
                        var res = object.has(Condition.text(productName));
                        if (res) {
                            object.scrollIntoView(false);
                        }
                        return res;
                    });

            if (!isElementWasFound) {
                pageObjectPagination.PageButtonNext.click();
                Selenide.sleep(3000);
            }
        }
    }

}
