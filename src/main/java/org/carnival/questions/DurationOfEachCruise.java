package org.carnival.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.carnival.userinterfaces.ResultsPage;
import org.carnival.utils.Utilities;
import java.util.List;
import java.util.function.Predicate;

public class DurationOfEachCruise implements Question<Boolean> {

    Predicate<String> pred =  Utilities::checkCruiseDurations;

    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> valueList = Text.of(ResultsPage.RESULT_DAY_DURATION).viewedBy(actor).asList();
        return valueList.stream().allMatch(pred);
    }

    public static DurationOfEachCruise displayed() {
        return new DurationOfEachCruise();
    }
}

