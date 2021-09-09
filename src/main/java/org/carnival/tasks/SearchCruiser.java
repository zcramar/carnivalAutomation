package org.carnival.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import org.carnival.userinterfaces.LandingPage;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.carnival.userinterfaces.LandingPage.*;

public class SearchCruiser implements Task {

    private WebDriver hisBrowser;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LandingPage.SAIL_TO),
                WaitUntil.the(DESTINATION, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(LandingPage.DESTINATION),
                Click.on(DURATION),
                WaitUntil.the(DURATION, isVisible()).forNoMoreThan(3).seconds(),
                Click.on(TIME_PERIOD),
                Click.on(SEARCH_BUTTON));
    }

    public static SearchCruiser search (WebDriver hisBrowser){
        return instrumented(SearchCruiser.class, hisBrowser);
    }
}
