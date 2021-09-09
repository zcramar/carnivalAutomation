package org.carnival.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import static org.carnival.userinterfaces.ResultsPage.RESULT_GRID;


public class ResultGridStatus implements Question <Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(RESULT_GRID).viewedBy(actor).asBoolean();
    }

    public static Question<Boolean> validateGrid(){
        return new ResultGridStatus();
    }

}
