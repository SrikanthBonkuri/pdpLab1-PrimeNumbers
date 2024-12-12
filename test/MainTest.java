import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void primeNumbersTest(){

        int primeNumbers[] = Primenumbers.GeneratePrimeNumbers(5);
        int array[] = {1, 2, 3, 5, 7};
        int expectedSum = 18;
        assertEquals(array.length, primeNumbers.length);
        long sum = 0;
        for(int i=0; i<primeNumbers.length; i++){
            assertEquals(array[i], primeNumbers[i]);
            sum = sum + primeNumbers[i];
        }
        assertEquals(expectedSum, sum);
        int primeSum = Primenumbers.SumNumbers(primeNumbers);
        assertEquals(primeSum, sum);

        primeNumbers = Primenumbers.GeneratePrimeNumbers(10);
        primeSum = Primenumbers.SumNumbers(primeNumbers);
        assertEquals(10, primeNumbers.length);
        sum = 0;
        for(int i=0; i<primeNumbers.length; i++){
            sum = sum + primeNumbers[i];
        }
        assertEquals(101, sum);
        assertEquals(sum, primeSum);

        primeNumbers = Primenumbers.GeneratePrimeNumbers(1);
        assertNotEquals(2, primeNumbers.length);
        array = new int[]{1};
        expectedSum = 1;
        sum = 0;
        for(int i=0; i<primeNumbers.length; i++){
            assertEquals(array[i], primeNumbers[i]);
            sum = sum + primeNumbers[i];
        }
        assertEquals(1, sum);
        primeSum = Primenumbers.SumNumbers(primeNumbers);
        assertEquals(expectedSum, primeSum);

        primeNumbers = Primenumbers.GeneratePrimeNumbers(2);
        assertEquals(2, primeNumbers.length);
        array = new int[]{1, 2};
        expectedSum = 3;
        sum = 0;
        for(int i=0; i<primeNumbers.length; i++){
            assertEquals(array[i], primeNumbers[i]);
            sum = sum + primeNumbers[i];
        }
        assertNotEquals(expectedSum-1, sum);
        primeSum = Primenumbers.SumNumbers(primeNumbers);
        assertEquals(expectedSum, primeSum);

        primeNumbers = Primenumbers.GeneratePrimeNumbers(21);
        assertEquals(21, primeNumbers.length);
        sum = 0;
        for(int i=0; i<primeNumbers.length; i++){
            sum = sum + primeNumbers[i];
        }
        assertEquals(640, sum);

        primeNumbers = Primenumbers.GeneratePrimeNumbers(27);
        assertNotEquals(0, primeNumbers.length);
        assertEquals(27, primeNumbers.length);
        expectedSum = 1162;
        sum = 0;
        for(int i=0; i<primeNumbers.length; i++){
            sum = sum + primeNumbers[i];
        }
        assertNotEquals(1160, sum);
        primeSum = Primenumbers.SumNumbers(primeNumbers);
        assertEquals(expectedSum, primeSum);

        primeNumbers = Primenumbers.GeneratePrimeNumbers(1000);
        assertNotEquals(100, primeNumbers.length);
        sum = 0;
        for(int i=0; i<primeNumbers.length; i++){
            sum = sum + primeNumbers[i];
        }
        primeSum = Primenumbers.SumNumbers(primeNumbers);
        assertEquals(primeSum, sum);
    }
}

