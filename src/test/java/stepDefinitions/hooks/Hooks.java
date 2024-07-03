package stepDefinitions.hooks;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import util.TakeScreenshot;

import java.util.UUID;


public class Hooks {

        @AfterStep
        public void takeScreenshot(Scenario scenario) {
                TakeScreenshot.takeScreenshot(scenario);
        }


}
