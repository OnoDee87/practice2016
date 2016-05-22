package ru.qatools.school.steps.mobilesteps;

import org.openqa.selenium.WebDriver;
import ru.qatools.school.screens.MainScreen;
import ru.qatools.school.screens.SelectStationScreen;

import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.hasText;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by onodee on 21.05.2016.
 */
public class MobileSteps {

    private WebDriver driver;

    public MobileSteps(WebDriver driver) {
        this.driver = driver;
    }

    public void shouldSeeTravelTime(String time){
        assertThat(onMainScreen().getArrivialTime(), hasText(greaterThan(time)));
    }

    public MainScreen onMainScreen() {
        return new MainScreen(driver);
    }

    public SelectStationScreen onSelectStationScreen() {
        return new SelectStationScreen(driver);
    }
}
