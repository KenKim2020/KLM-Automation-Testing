package org.frb.phil.test.bdd.runner;


@CucumberOptions(
        features = "src/test/resources/org.frb.phil.test.bdd/stepDefinitions",
        tags = "@employeeLogin",
        plugin = "io.gameta.allure.cucumber7jvm.AllureCucumber7Jvm",
        dryRun = false
)
public class runner {
}
