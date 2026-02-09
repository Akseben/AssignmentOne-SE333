# Assignment One

## Definitions:
- On-point: the boundary value where the condition just holds (true).
- Off-point: the nearest value just outside the boundary (false).
- When equality is involved, there are usually two off-points (one on each side).

## Part One
1. A game has the condition: numberOfPoints <= 570. Perform boundary analysis. What are the on/off points? 
Choose one and justify.  
    A. On = 570, Off = 571   <--  
    B. On = 571, Off = 570   
    C. On = 570, Off = 569   
    D. On = 569, Off = 570  

A is the correct answer because the on-point value 570 is equal to 570 (the right-hand of the equality), and no number 
higher would fulfill the condition. 571 is the off condition because it is the first whole number that fails to satisfy
the condition of being less than or equal to 570.  

2. Perform boundary analysis on x==10. What are the on/off points? Explain briefly

The on point for x==10 is 10 because it is the only value that satisfies the conditional, while 9 and 11 are the off
points because they are the two values just before and after the value of the on point.  

3. Postal codes in some imaginary countries are always composed of four numbers and two
   letters, given assumed boundaries and based on what you as a tester assume about the program, what other corner or
   boundary cases can you come up with? Describe these cases and how they may exercise the
   program based on your assumptions

One border/boundary case I can come up with regards the numerical side. It is important to test values like 999 and 4001
to ensure that the boundaries set are working, this also includes testing values 1000 and 4000 to ensure the boundaries 
were set accurately. As well, the string side needs to be checked too by including inputs such
as "BC" or "MN" where one character is valid and the other isn't. Also, for the characters, there should be test cases
to check for non-alphabetical characters in the string such as operators and grammatical symbols, or anything unicode.
Another corner case to check for is lowercase characters. Is the boundary set case-sensitive or can it accept both lower
and uppercase values? These cases can help exercise the program because it can either reveal ambiguities in the assumed
boundaries or show that they do not match the specification provided.  

## Part Two

1. Understand the requirements  
A. Identify the method: The method is add(), public static List<Integer> add(List<Integer> left, List<Integer> right)  
B. Identify the inputs: There are two inputs, "left" and "right" that are both Integer Lists of the left and right 
numbers respectively.  
C. Identify the outputs: The function returns a LinkedList of Integers called result, this linked list is meant to be a
list of all digits in the resulting sum.  
D. Identify the behavior: The function takes two numbers in the form of Lists and adds them together, returning the
result as a linked list of each digit in the answer.  
2. Identify input partition and boundary for each parameter:  
A. Individual Input: Empty List, null List, List of length 1, a List of length greater than 1, a List with an element
containing more than one digit  
B. Input Combination: [left and right lists contain one element each, left and right lists contain multiple elements
each, left list contains one element and right list contains multiple, left list contains multiple elements and the
right list only contains one, both lists are null, both lists are empty, left list contains elements and right list
is null, left list contains elements and right list is empty, left list is null and right list contains elements, left
list is empty and right list contains elements]  
C. Output: Empty LinkedList, LinkedList with one element, LinkedList with multiple elements, null 

Note: Code and all answers for part two above are also in the NumberUtilsTest.java file

## Part Three

1. Does the program have a bug? After conducting many tests based on input combinations, I couldn't find any bugs in
the method.
2. If yes, describe the bug by describing the expected behavior (with reference to your
   spec/assumptions) vs actual behavior?
The tests did not produce any bugs, based on the various inputs the results all matched the expected values. As seen
in the code, the tests did account for null values, empty lists, as well as invalid element entries. Testing regular
values also netted no unexpected behavior. Overall, after attempting inputs that would clearly fail and test boundaries,
no bugs were detected.


Note: No collaborators were involved in the completion of this homework assignment.