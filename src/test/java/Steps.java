public class Steps {
private PageObjectMvideo pageObjectMvideo;
private PageObjectPagination pageObjectPagination;
private PageObjectFilter pageObjectFilter;
public Steps() {
pageObjectFilter=PageObjectFilter.getPageObjectFilter();
}
public void clickOnRadiobutton(){
    pageObjectFilter.switcherFilter.click();
}
public void clickOnCheckbox(){
        pageObjectFilter.accordionFilterCheckBox.click();
    }
}
