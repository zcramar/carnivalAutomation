package org.carnival.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.carnival.userinterfaces.ResultsPage;
import org.carnival.utils.Utilities;

import java.util.List;

public class PriceFilter implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        List<String> valuePrices = Text.of(ResultsPage.RESULT_PRICE).viewedBy(actor).asList();
        List<String> limitValues = Text.of(ResultsPage.MIN_POINTER_PRICE_FILTER_VALUE).viewedBy(actor).asList();
        return Utilities.isPriceWithinRange(valuePrices, limitValues.get(0), limitValues.get(1));
    }

    public static PriceFilter displayed(){
        return new PriceFilter();
    }
}
