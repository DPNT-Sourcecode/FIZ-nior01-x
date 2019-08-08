package befaster.solutions.HLO;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class HelloSolutionTest {

  private HelloSolution hello;

  @Before
  public void setUp() {
    hello = new HelloSolution();
  }

  @Test
  public void hello() {
    assertThat(hello.hello("Foo"), equalTo("Hello, Foo!"));
  }


}
