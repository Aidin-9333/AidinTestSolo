import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ProgramTest1 {

        @Test
        public void test1() {
            assertEquals(360, Eda_Bit_Aidin.convert(6));
        }

        @Test
        public void test2() {
            assertEquals(240, Eda_Bit_Aidin.convert(4));
        }

        @Test
        public void test3() {
            assertEquals(480, Eda_Bit_Aidin.convert(8));
        }

        @Test
        public void test4() {
            assertEquals(3600, Eda_Bit_Aidin.convert(60));
        }

}
