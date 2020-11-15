import extramile.RecursionEx;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecursionExTest {
    RecursionEx recursion;

    @BeforeEach
    void Setup() {//GIVEN
        recursion = new RecursionEx();
    }


    @Test
    @DisplayName("WHEN getSum method is callend THEN return the sum of first n emelents")
    void getSum() {
        //WHEN
        int sum = recursion.getSum(5);

        //THEN
        assertThat(sum).isEqualTo(15);

    }

    @Test
    @DisplayName("WHEN getSumOfEven method is callend THEN return the sum of even of  first n elements")
    void getSumOfEven() {
        //WHEN
        int sum = recursion.getSumOfEven(9);

        //THEN
        assertThat(sum).isEqualTo(20);

    }

    @Test
    @DisplayName("WHEN reverse method is called THEN return a reversed string from parameter")
    void reverseTest() {

        String str = recursion.reverse("raul");

        assertThat(str).isEqualTo("luar");
    }

    @Test
    @DisplayName("palindrome using reverse method")
    void palindromeTest() {
        String word = "ara";
        String reverse = recursion.reverse(word);
        assertThat(reverse).isEqualTo(word);
    }

    @Test
    @DisplayName("WHEN sumOfDigits method is callend THEN return the sum of number's digits")
    void sumOfDigitsTest() {
        //WHEN
        int sum = recursion.sumOfDigits(124);

        //THEN
        assertThat(sum).isEqualTo(7);

    }
}
