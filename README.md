# Getting started
LeasePlan assignment

# Requirements (obligatory):
• Refactor the given project
• Make it run correctly on Gitlab CI
• Use BDD format: Cucumber/Gherkin
• Required framework: Java Serenity + Maven

## Get the code

Git:

    git clone https://github.com/usefultreasure/leaseplan
    cd leaseplan


## Use Maven

Open a command window and run:

    mvn clean verify

## Use Gradle

Open a command window and run:

    gradlew test 

## Viewing the reports

Both of the commands provided above will produce a Serenity test report in the `target/site/serenity` directory. Go take a look!

# Output command:
```
"C:\Program Files\Java\jdk-11\bin\java.exe" -Dmaven.multiModuleProjectDirectory=C:\leaseplan-example -Djansi.passthrough=true "-Dmaven.home=C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.2\plugins\maven\lib\maven3" "-Dclassworlds.conf=C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.2\plugins\maven\lib\maven3\bin\m2.conf" "-Dmaven.ext.class.path=C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.2\plugins\maven\lib\maven-event-listener.jar" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.2\lib\idea_rt.jar=53318:C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.2\plugins\maven\lib\maven3\boot\plexus-classworlds-2.6.0.jar;C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.2\plugins\maven\lib\maven3\boot\plexus-classworlds.license" org.codehaus.classworlds.Launcher -Didea.version=2023.1.2 install
[INFO] Scanning for projects...
[INFO]
[INFO] --------------< net.serenitybdd.starter:cucumber-starter >--------------
[INFO] Building Serenity BDD project using Cucumber 1.0.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/io/cucumber/messages/maven-metadata.xml
Downloaded from central: https://repo.maven.apache.org/maven2/io/cucumber/messages/maven-metadata.xml (2.4 kB at 7.8 kB/s)
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ cucumber-starter ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\leaseplan-example\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ cucumber-starter ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ cucumber-starter ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 3 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ cucumber-starter ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:3.0.0-M5:test (default-test) @ cucumber-starter ---
[INFO] Tests are skipped.
[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ cucumber-starter ---
[WARNING] JAR will be empty - no content was marked for inclusion!
[INFO]
[INFO] --- maven-failsafe-plugin:3.0.0-M5:integration-test (default) @ cucumber-starter ---
[INFO]
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
12:27:10.160 [main] INFO  i.c.core.plugin.SerenityReporter - Running feature from file:///C:/leaseplan-example/src/test/resources/features/search/post_product.feature

12:27:10.301 [main] INFO   -

-------------------------------------------------------------------------------------
     _______. _______ .______       _______ .__   __.  __  .___________.____    ____ 
    /       ||   ____||   _  \     |   ____||  \ |  | |  | |           |\   \  /   / 
|   (----`|  |__   |  |_)  |    |  |__   |   \|  | |  | `---|  |----` \   \/   /  
\   \    |   __|  |      /     |   __|  |  . `  | |  |     |  |       \_    _/   
.----)   |   |  |____ |  |\  \----.|  |____ |  |\   | |  |     |  |         |  |     
|_______/    |_______|| _| `._____||_______||__| \__| |__|     |__|         |__|

News and tutorials at http://www.serenity-bdd.info                                  
Documentation at https://wakaleo.gitbooks.io/the-serenity-book/content/             
Join the Serenity Community on Gitter: https://gitter.im/serenity-bdd/serenity-core
Serenity BDD Support and Training at http://serenity-bdd.info/#/trainingandsupport
-------------------------------------------------------------------------------------


12:27:10.301 [main] INFO   - Test Suite Started: Search for the product



3
Scenarios (
3 passed
)


6
Steps (
6 passed
)


0m
5.521s






12:27:15.737 [pool-2-thread-1] INFO  n.t.core.reports.ReportService - net.thucydides.core.reports.json.JSONTestOutcomeReporter@67110f71: Generating report for test outcome: Search for the product:

12:27:15.782 [pool-3-thread-1] INFO  n.t.core.reports.ReportService - net.thucydides.core.reports.html.HtmlAcceptanceTestReporter@2ff15f8c: Generating report for test outcome: Search for the product:

12:27:16.269 [main] INFO  i.c.core.plugin.SerenityReporter - Cleanup test resources for URI file:///C:/leaseplan-example/src/test/resources/features/search/post_product.feature

[INFO] Running Search for the product

Scenario:                                                                                 # src/test/resources/features/search/post_product.feature:8
12:27:10.420 [pool-2-thread-1] INFO  i.c.core.plugin.SerenityReporter - Running feature from file:///C:/leaseplan-example/src/test/resources/features/search/post_product.feature
12:27:10.505 [pool-2-thread-1] INFO   -
  _____   ___   ___   _____     ___   _____     _     ___   _____   ___   ___  
|_   _| | __| / __| |_   _|   / __| |_   _|   /_\   | _ \ |_   _| | __| |   \
| |   | _|  \__ \   | |     \__ \   | |    / _ \  |   /   | |   | _|  | |) |
|_|   |___| |___/   |_|     |___/   |_|   /_/ \_\ |_|_\   |_|   |___| |___/

(search-for-the-product;)
--------------------------------------------------------------------------------
12:27:10.505 [pool-2-thread-1] INFO  n.thucydides.core.model.TestOutcome - SetUserStory Search for the product
12:27:10.522 [pool-2-thread-1] INFO  n.thucydides.core.model.TestOutcome - SetUserStory Search for the product
When he calls endpoint "https://waarkoop-server.herokuapp.com/api/v1/search/demo/apple" # starter.stepdefinitions.SearchStepDefinitions.heCallsEndpoint(java.lang.String)
Then he sees the results displayed for "Apple"                                          # starter.stepdefinitions.SearchStepDefinitions.heSeesTheResultsDisplayedFor(java.lang.String)
12:27:14.680 [pool-2-thread-1] INFO   -
  _____   ___   ___   _____     ___     _     ___   ___   ___   ___  
|_   _| | __| / __| |_   _|   | _ \   /_\   / __| / __| | __| |   \
| |   | _|  \__ \   | |     |  _/  / _ \  \__ \ \__ \ | _|  | |) |
|_|   |___| |___/   |_|     |_|   /_/ \_\ |___/ |___/ |___| |___/


----------------------------------------------------------------------

Scenario:                                                                                  # src/test/resources/features/search/post_product.feature:12
12:27:14.680 [pool-2-thread-1] INFO  i.c.core.plugin.SerenityReporter - Running feature from file:///C:/leaseplan-example/src/test/resources/features/search/post_product.feature
When he calls endpoint "https://waarkoop-server.herokuapp.com/api/v1/search/demo/orange" # starter.stepdefinitions.SearchStepDefinitions.heCallsEndpoint(java.lang.String)
Then he sees the results displayed for "Mango"                                           # starter.stepdefinitions.SearchStepDefinitions.heSeesTheResultsDisplayedFor(java.lang.String)

Scenario:                                                                               # src/test/resources/features/search/post_product.feature:16
12:27:15.440 [pool-2-thread-1] INFO  i.c.core.plugin.SerenityReporter - Running feature from file:///C:/leaseplan-example/src/test/resources/features/search/post_product.feature
When he calls endpoint "https://waarkoop-server.herokuapp.com/api/v1/search/demo/car" # starter.stepdefinitions.SearchStepDefinitions.heCallsEndpoint(java.lang.String)
Then he does not see the results                                                      # starter.stepdefinitions.SearchStepDefinitions.he_Does_Not_See_The_Results()
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.336 s - in Search for the product
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO]
[INFO] --- serenity-maven-plugin:2.6.0:aggregate (serenity-reports) @ cucumber-starter ---
[INFO] Test results for 0 tests generated in 747 ms in directory: file:/C:/leaseplan-example/target/site/serenity/
[INFO] -----------------------------------------
[INFO]  SERENITY TESTS : SUCCESS
[INFO] -----------------------------------------
[INFO] | Tests executed         | 0
[INFO] | Tests passed           | 0
[INFO] | Tests failed           | 0
[INFO] | Tests with errors      | 0
[INFO] | Tests compromised      | 0
[INFO] | Tests pending          | 0
[INFO] | Tests ignored/skipped  | 0
[INFO] ------------------------ | --------------
[INFO] | Total Duration         | 000ms
[INFO] | Fastest test took      | 000ms
[INFO] | Slowest test took      | 000ms
[INFO] -----------------------------------------
[INFO]
[INFO] SERENITY REPORTS
[INFO]   - Full Report: file:///C:/leaseplan-example/target/site/serenity/index.html
[INFO]
[INFO] --- maven-failsafe-plugin:3.0.0-M5:verify (default) @ cucumber-starter ---
[INFO]
[INFO] --- maven-install-plugin:2.4:install (default-install) @ cucumber-starter ---
[INFO] Installing C:\leaseplan-example\target\cucumber-starter-1.0.0-SNAPSHOT.jar to C:\Users\w128206\.m2\repository\net\serenitybdd\starter\cucumber-starter\1.0.0-SNAPSHOT\cucumber-starter-1.0.0-SNAPSHOT.jar
[INFO] Installing C:\leaseplan-example\pom.xml to C:\Users\w128206\.m2\repository\net\serenitybdd\starter\cucumber-starter\1.0.0-SNAPSHOT\cucumber-starter-1.0.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  18.266 s
[INFO] Finished at: 2023-05-29T12:27:18+02:00
[INFO] ------------------------------------------------------------------------

Process finished with exit code 0
```

