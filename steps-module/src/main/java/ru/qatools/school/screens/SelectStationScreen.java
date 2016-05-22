package ru.qatools.school.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by onodee on 21.05.2016.
 */
public class SelectStationScreen {

    @AndroidFindBy(id = "ru.yandex.metro:id/filterTextId")
    private MobileElement filterTextId;

    @AndroidFindBy(className = "android.widget.TextView")
    private List<MobileElement> searchResult;

    public SelectStationScreen(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), SelectStationScreen.class);
    }

    public SelectStationScreen inputStation(String name) {
        filterTextId.sendKeys(name);
        return this;
    }

    public void tapSelect() {
        searchResult.get(0).click();
    }
}
