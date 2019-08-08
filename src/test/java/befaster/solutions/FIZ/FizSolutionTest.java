package befaster.solutions.FIZ;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class FizSolutionTest {

  private FizzBuzzSolution fizz;

  @Before
  public void setUp() {
    fizz = new FizzBuzzSolution();
  }

  @Test
  public void fizz() {

    assertThat(fizz.fizzBuzz(13), equalTo("fizz"));
    assertThat(fizz.fizzBuzz(21), equalTo("fizz"));
    assertThat(fizz.fizzBuzz(58), equalTo("buzz"));
    assertThat(fizz.fizzBuzz(25), equalTo("buzz fake deluxe"));
    assertThat(fizz.fizzBuzz(50), equalTo("buzz deluxe"));
    assertThat(fizz.fizzBuzz(300), equalTo("fizz buzz deluxe"));
    assertThat(fizz.fizzBuzz(45), equalTo("fizz buzz fake deluxe"));
    assertThat(fizz.fizzBuzz(105), equalTo("fizz buzz fake deluxe"));
    assertThat(fizz.fizzBuzz(4), equalTo("4"));
  }


}
