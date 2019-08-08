package befaster.solutions.FIZ;

import java.util.ArrayList;

public class FizzBuzzSolution {

  public String fizzBuzz(Integer number) {
    String numberStr = number.toString();

    ArrayList<String> response = new ArrayList<>();

    if (number % 3 == 0 || numberStr.contains("3")) {
      response.add("fizz");
    }

    if (number % 5 == 0 || numberStr.contains("5")) {
      response.add("buzz");
    }

    if ((number % 3 == 0 && numberStr.contains("3")) || (number % 5 == 0 && numberStr.contains("5"))) {
      if (number % 2 == 0) {
        response.add("deluxe");
      } else {
        response.add("fake deluxe");
      }
    }

    return (response.isEmpty()) ? number.toString() : String.join(" ", response);
  }

}
