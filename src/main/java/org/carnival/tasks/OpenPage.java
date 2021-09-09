package org.carnival.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import org.carnival.userinterfaces.LandingPage;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenPage implements Task {

    private WebDriver hisBrowser;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(Open.url("https://www.carnival.com/"),
                Click.on(LandingPage.COOKIE),
                Click.on(LandingPage.DISCOUNT_OFFER));
    }

    public static OpenPage open (WebDriver hisBrowser){
        return instrumented(OpenPage.class, hisBrowser);
    }
}
