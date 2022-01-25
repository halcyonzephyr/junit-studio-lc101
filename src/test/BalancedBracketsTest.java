package test;

import main.BalancedBrackets;
import org.junit.Test;

import static main.BalancedBrackets.hasBalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    //1
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    //2
    public void closedBrackThenMutltipleStrings(){
        assertTrue(hasBalancedBrackets("[]chumbawamba tubthumping emi records"));
    }

    @Test
    //3
    public void missingARightBracket() {
        assertFalse(hasBalancedBrackets("[Some String"));
    }

    @Test
    //4
    public void missingALeftBracket() {
        assertFalse(hasBalancedBrackets("Some String]"));
    }

    @Test
    //5
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    //6
    public void reversedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]hello["));
    }

    @Test
    //7
    public void reversedDoubleLeftBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]hello["));
    }

    @Test
    //8
    public void reversedDoubleRightBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]hello[["));
    }

    @Test
    //9
    public void nullReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    //10
    public void closedBracketThenOpenBracket(){
        assertFalse(hasBalancedBrackets("[something]["));
    }

    @Test
    //11
    public void openBracketThenClosedThenClosedBracket(){
        assertFalse(hasBalancedBrackets("[something]]"));
    }

    @Test
    //12
    public void doubleBracketsAssertsTrue(){
        assertTrue(hasBalancedBrackets("[hello][world]"));
    }

    @Test
    //13
    public void doubleNestedBracketsAssertsTrue(){
        assertTrue(hasBalancedBrackets("[[hello world]]"));
    }





}
