import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class FizzbuzzTest {

    @Before
    public void before() throws Exception {
        elements = new Fizzbuzz().elements();
    }

    @Test
    public void shouldReturn100Elements() throws Exception {
        assertThat(elements.size()).isEqualTo(100);
    }

    @Test
    public void shouldReturn1For1() throws Exception {
        assertThat(fizzBuzzOf(1)).isEqualTo("1");
    }

    @Test
    public void shouldReturnFizzFor3() throws Exception {
        assertThat(fizzBuzzOf(3)).isEqualTo("fizz");
    }

    @Test
    public void shouldReturnBuzzFor5() throws Exception {
        assertThat(fizzBuzzOf(5)).isEqualTo("buzz");
    }

    @Test
    public void shouldReturnFizzbuzzFor15() throws Exception {
        assertThat(fizzBuzzOf(15)).isEqualTo("fizzbuzz");
    }

    private String fizzBuzzOf(int number) {
        return elements.get(number - 1);
    }

    private List<String> elements;
}
