package org.carnival.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.carnival.userinterfaces.ResultsPage;
import org.carnival.utils.Utilities;

import java.util.List;

public class PricesSorted implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> valuePrices = Text.of(ResultsPage.RESULT_PRICE).viewedBy(actor).asList();
        return Utilities.isSortedInIncreasingOrder(valuePrices);
    }

    public static PricesSorted displayed() {
        return new PricesSorted();
    }
}
