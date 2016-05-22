package ru.qatools.school.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by onodee on 21.05.2016.
 * Класс описание страницы приложения
 */
public class MainScreen {

    @AndroidFindBy(id = "ru.yandex.metro:id/tv_from_name")
    private MobileElement from_name;

    @AndroidFindBy(id = "ru.yandex.metro:id/tv_to_name")
    private MobileElement to_name;

    @AndroidFindBy(id = "ru.yandex.metro:id/tv_time")
    private MobileElement arrivialTime;

    public MainScreen(WebDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), MainScreen.class);
    }

    public MobileElement getFrom() {
        return from_name;
    }

    public MobileElement getTo() {
        return to_name;
    }

    public MobileElement getArrivialTime() {
        return arrivialTime;
    }
}
