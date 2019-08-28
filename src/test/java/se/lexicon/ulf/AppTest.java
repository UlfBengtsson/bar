package se.lexicon.ulf;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void isAdult_True()
    {
        //Arrange
        int age = 18;

        //Act
        boolean result = App.isAdult(age);

        //Assert
        assertTrue( result );
    }

    @Test
    public void isAdult_False()
    {
        //Arrange
        int age = 17;

        //Act
        boolean result = App.isAdult(age);

        //Assert
        assertFalse( result );
    }

    @Test
    public void buyAlcohol_True()
    {
        //Arrange
        int age = 20;

        //Act
        boolean result = App.buyAlcohol(age);

        //Assert
        assertTrue( result );
    }

    @Test
    public void buyAlcohol_False()
    {
        //Arrange
        int age = 17;

        //Act
        boolean result = App.buyAlcohol(age);

        //Assert
        assertFalse( result );
    }

    @Test
    public void howStrongIsDrink_AlcoholFree() {
        //Arrange
        double volume = 0.0;

        //Act
        String result = App.howStrongIsDrink(volume);

        //Assert
        assertEquals("Alcohol free", result);
    }

    @Test
    public void howStrongIsDrink_Not_AlcoholFree() {
        //Arrange
        double volume = 10.0;

        //Act
        String result = App.howStrongIsDrink(volume);

        //Assert
        assertNotEquals("Alcohol free", result);
    }
}
