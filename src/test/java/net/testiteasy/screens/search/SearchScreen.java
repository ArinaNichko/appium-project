package net.testiteasy.screens.search;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.testiteasy.utils.variables.OSType;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static net.testiteasy.utils.parameters.TestDataParams.testConfig;

@SuppressWarnings("unused")
public class SearchScreen {

  private final By SKIP_BUTTON = By.id("Skip");

  @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Explore\"]")
  @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Explore\"]")
  private SelenideElement EXPLORE_ICON;

  @AndroidFindBy(xpath = "//*[contains(@text, 'Search…')]")
  @iOSXCUITFindBy(xpath = "//XCUIElementTypeSearchField[@name=\"Search Wikipedia\"]")
  private SelenideElement SEARCH_WIKIPEDIA_FIELD;

  @AndroidFindBy(xpath = "//*[contains(@resource-id, 'org.wikipedia:id/page_list_item_description')]")
  private SelenideElement FIRST_LINK;


  public void waitForMainContainerToAppear() {
    if (testConfig().getOSType() == OSType.IOS) {
      if ($(SKIP_BUTTON).is(Condition.visible)) {
        $(SKIP_BUTTON).click();
      }
    }

    EXPLORE_ICON.shouldBe(Condition.visible);
  }

  public void clickOnSearchField() {
    SEARCH_WIKIPEDIA_FIELD.shouldBe(Condition.visible).click();
  }

  public void typeOnSearchLine(String keyword) {
    SEARCH_WIKIPEDIA_FIELD.shouldBe(Condition.visible).sendKeys(keyword);
  }

  public void clickOnFirstLink() {
    FIRST_LINK.shouldBe(Condition.visible).click();


  }

  public String getTextFromFirstLink() {

    return FIRST_LINK.getAttribute("text");
  }
}
