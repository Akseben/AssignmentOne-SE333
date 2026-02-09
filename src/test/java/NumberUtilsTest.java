
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class NumberUtilsTest {
    /*
1. Understand the requirements
    A. Identify the method: The method is add(), public static List<Integer> add(List<Integer> left, List<Integer> right)
    B. Identify the inputs: There are two inputs, "left" and "right" that are both Integer Lists of the left and right
        numbers respectively.
    C. Identify the outputs: The function returns a LinkedList of Integers called result, this linked list is meant to be a
        list of all digits in the resulting sum.
    D. Identify the behavior: The function takes two numbers in the form of Lists and adds them together, returning the
        result as a linked list of each digit in the answer as elements.
2. Identify input partition and boundary for each parameter:
    A. Individual Input: Empty List, null List, List of length 1, a List of length greater than 1, a List with an element
        containing more than one digit
    B. Input Combination: [left and right lists contain one element each, left and right lists contain multiple elements
        each, left list contains one element and right list contains multiple, left list contains multiple elements and the
        right list only contains one, both lists are null, both lists are empty, left list contains elements and right list
        is null, left list contains elements and right list is empty, left list is null and right list contains elements, left
        list is empty and right list contains elements]
    C. Output: Empty LinkedList, LinkedList with one element, LinkedList with multiple elements, null
     */
@Tag("specification")
@Test
    void testAdd() {
//  Arranging

    List<Integer> left = new ArrayList<>();
    List<Integer> right = new ArrayList<>();
    List<Integer> result;
    List<Integer> expected = new ArrayList<>();

//  Acting and Asserting

    //lists each contain one element
    left.add(6);
    right.add(3);

    expected.add(9);

    result = NumberUtils.add(left, right);
    assertEquals(expected, result);

    left.clear();
    right.clear();
    expected.clear();

    //lists each contain multiple elements
    left.add(3);
    left.add(1);
    right.add(2);
    right.add(6);

    expected.add(5);
    expected.add(7);

    result = NumberUtils.add(left, right);
    assertEquals(expected, result);

    left.clear();
    right.clear();
    expected.clear();

    //left list contains one element, right contains multiple
    left.add(7);
    right.add(1);
    right.add(6);

    expected.add(2);
    expected.add(3);

    result = NumberUtils.add(left, right);
    assertEquals(expected, result);

    left.clear();
    right.clear();
    expected.clear();

    //left list contains multiple elements, right contains one
    left.add(7);
    left.add(4);
    right.add(4);

    expected.add(7);
    expected.add(8);

    result = NumberUtils.add(left, right);
    assertEquals(expected, result);

    left.clear();
    right.clear();
    expected.clear();

    //A list contains an element with multiple digits
    left.add(63);
    right.add(2);

    assertThrows(IllegalArgumentException.class, () -> NumberUtils.add(left, right));

    left.clear();
    right.clear();

    //both lists are empty
    result = NumberUtils.add(left, right);
    assertEquals(expected, result);

    left.clear();
    right.clear();
    expected.clear();

    //left list is empty, right contains elements
    right.add(4);
    right.add(7);

    expected.add(4);
    expected.add(7);

    result = NumberUtils.add(left, right);
    assertEquals(expected, result);

    left.clear();
    right.clear();
    expected.clear();

    //left list has elements, right is empty
    left.add(1);
    left.add(1);
    left.add(7);

    expected.add(1);
    expected.add(1);
    expected.add(7);

    result = NumberUtils.add(left, right);
    assertEquals(expected, result);

    left.clear();
    right.clear();
    expected.clear();

    //left list has elements, right is null
    left.add(1);
    left.add(1);
    left.add(7);

    expected.add(1);
    expected.add(1);
    expected.add(7);

    result = NumberUtils.add(left, null);
    assertNull(result);

    left.clear();
    expected.clear();

    //left list has elements, right is null
    right.add(3);
    right.add(4);
    right.add(3);

    expected.add(3);
    expected.add(4);
    expected.add(3);

    result = NumberUtils.add(null, right);
    assertNull(result);

    right.clear();
    expected.clear();

    //both lists are null
    result = NumberUtils.add(null, null);
    assertNull(result);

    }

@Tag("structural")
@Test
    void structuralTestAdd(){

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> result;
        List<Integer> expected = new ArrayList<>();

//Right list contains an element with multiple digits
        left.add(2);
        right.add(14);

        assertThrows(java.lang.IllegalArgumentException.class, () -> NumberUtils.add(left, right));

        left.clear();
        right.clear();

//Left list contains a negative element
        left.add(-5);
        right.add(1);

        assertThrows(java.lang.IllegalArgumentException.class, () -> NumberUtils.add(left, right));

        left.clear();
        right.clear();

//Right list contains a negative element
        left.add(5);
        right.add(-1);

        assertThrows(java.lang.IllegalArgumentException.class, () -> NumberUtils.add(left, right));

        left.clear();
        right.clear();

//Adding two numbers that create a new digit (i.e. going from 3 digit numbers to 4 digit result)
        left.add(5);
        left.add(3);
        left.add(2);
        right.add(6);
        right.add(8);
        right.add(9);

        expected.add(1);
        expected.add(2);
        expected.add(2);
        expected.add(1);

        result = NumberUtils.add(left, right);
        assertEquals(expected, result);

        left.clear();
        right.clear();
        expected.clear();

//Checking that leading zeros are cleared
    left.add(0);
    left.add(2);
    right.add(6);

    expected.add(8);


    result = NumberUtils.add(left, right);
    assertEquals(expected, result);

    left.clear();
    right.clear();
    expected.clear();
    }
}
