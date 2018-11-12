import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;

public class MyCodeInsightTest extends LightCodeInsightFixtureTestCase {

  @Override
  protected String getTestDataPath() {
    return "testData";
  }

  public void testAnnotatorCrash() {
    myFixture.configureByFiles("AnnotatorCrashTestData.java");
    myFixture.checkHighlighting(false, true, false, false);
  }
}
