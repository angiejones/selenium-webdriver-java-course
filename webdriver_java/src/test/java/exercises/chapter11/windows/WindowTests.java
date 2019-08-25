package exercises.chapter11.windows;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class WindowTests extends BaseTests {

    @Test
    public void testWindowTabs(){
        var buttonPage = homePage.clickDynamicLoading().rightClickOnExample2Link();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");
    }
}