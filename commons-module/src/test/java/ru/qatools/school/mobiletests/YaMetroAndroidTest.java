package ru.qatools.school.mobiletests;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import ru.qatools.school.rules.MobileDriverRule;
import ru.qatools.school.steps.mobilesteps.MobileSteps;

/**
 * Created by onodee on 21.05.2016.
 */
public class YaMetroAndroidTest {

    private MobileSteps mobileSteps;

    @Rule
    public MobileDriverRule mobileDriverRule = new MobileDriverRule();

    @Before
    public void initSteps() {
        mobileSteps = new MobileSteps(mobileDriverRule.getDriver());
    }

    @Test
    public void shouldSeeTravelTime() {
        mobileSteps.onMainScreen().getFrom().click();
        mobileSteps.onSelectStationScreen().inputStation("Arbatskaya").tapSelect();
        mobileSteps.onMainScreen().getTo().click();
        mobileSteps.onSelectStationScreen().inputStation("Borisovo").tapSelect();
        mobileSteps.shouldSeeTravelTime("10");
    }
}
