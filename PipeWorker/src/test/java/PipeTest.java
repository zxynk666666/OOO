import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PipeTest {
    @Test
    public void should1MEquals1M() {
        assertEquals(new M(1), new M(1));
    }

    @Test
    public void should1CMEquals1CM() {
        assertEquals(new CM(1), new CM(1));
    }

    @Test
    public void should1MMEquals1MM() {
        assertEquals(new MM(1), new MM(1));
    }

    @Test
    public void should1CMEquals10MM() {
        assertEquals(new CM(1), new MM(10));
    }

    @Test
    public void should1MEquals1000MM() {
        assertEquals(new M(1), new MM(1000));
    }

    @Test
    public void should1MEquals100CM() {
        assertEquals(new M(1), new CM(100));
    }

//    1MM+1MM=2MM
//    1MM*2=2MM
//    2MM/1=2MM
//    2MM-1MM=1MM
    @Test
    public void shouldGet2MMWhen1MMAdd1MM() {
        assertEquals(new MM(1).add(new MM(1)),(new MM(2)));


//        new Length(length, unit)
    }

    @Test
    public void shouldGet2MMWhen1MMTimes2() {
        assertEquals(new MM(1).times(2), new MM(2));
    }


    @Test
    public void shouldGet2MMWhen2MMDividedBy1() {
        assertEquals(new MM(2).divideBy(1), new MM(2));
    }


    @Test
    public void shouldGet1MMWhenMinus1MM() {
        assertEquals(new MM(2).minus(new MM(1)), new MM(1));
    }

//    1M+1M=2M
//    1M*2=2M
//    2M/1=2M
//    2M-1M=1M
    @Test
    public void shouldGet2MWhen1MAdd1M() {
        assertEquals(new M(1).add(new M(1)), new M(2));
    }

//1M*2 + 4CM/2 + 1MM == 2021MM
    @Test
    public void shouldGet2021MMWhen1MTimes2And4CMDivideBy2AndAdd1MM() {
        assertEquals(new M(1).times(2).add(new CM(4).divideBy(2)).add(new MM(1)), new MM(2021));
    }
}
