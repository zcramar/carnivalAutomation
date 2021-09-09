package org.carnival.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SearchCruiser.feature",
        glue = "org/carnival/stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class SearchCruiserRunner {
}
