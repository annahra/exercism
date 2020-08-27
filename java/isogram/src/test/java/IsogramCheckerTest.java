import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsogramCheckerTest {

    @Test
    public void testEmptyString() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram(""));
    }

    //("Remove to run test")
    @Test
    public void testLowercaseIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("isogram"));
    }

    //("Remove to run test")
    @Test
    public void testNotIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("eleven"));
    }

    //("Remove to run test")
    @Test
    public void testDuplicateEndAlphabet() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("zzyzx"));
    }

    //("Remove to run test")
    @Test
    public void testMediumLongIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("subdermatoglyphic"));
    }

    //("Remove to run test")
    @Test
    public void testCaseInsensitive() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("Alphabet"));
    }

    //("Remove to run test")
    @Test
    public void testDuplicatMixedCase() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("alphAbet"));
    }

    //("Remove to run test")
    @Test
    public void testIsogramWithHyphen() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("thumbscrew-japingly"));
    }

    //("Remove to run test")
    @Test
    public void testIsogramWithDuplicatedCharAfterHyphen() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("thumbscrew-jappingly"));
    }

    //("Remove to run test")
    @Test
    public void testIsogramWithDuplicatedHyphen() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("six-year-old"));
    }

    //("Remove to run test")
    @Test
    public void testMadeUpNameThatIsAnIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("Emily Jung Schwartzkopf"));
    }

    //("Remove to run test")
    @Test
    public void testDuplicatedCharacterInTheMiddleIsNotIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("accentor"));
    }

    //("Remove to run test")
    @Test
    public void testSameFirstAndLast() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("angola"));
    }

}
