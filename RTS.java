public class RTS {

    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 1, 10};
        printAboveBelow(nums, 1); // Should print "above: 3, below: 0"
        printAboveBelow(nums, 2); // Should print "above: 2, below: 2"
        printAboveBelow(nums, 6); // Should print "above: 1, below: 4"
        printAboveBelow(nums, 5); // Should print "above: 1, below: 3"
        printAboveBelow(nums, 10); // Should pring "above: 0, below 4"
        int[] emptyArray = {};
        printAboveBelow(emptyArray, 5);

        rotateCharacters("MyString", 2); // Should pring "ngMyStri"
        rotateCharacters("MyString", 5); // Should print "tringMyS"
        rotateCharacters("MyString", 6); // Should print "StringMy"
        rotateCharacters("MyString", 8); // Should print "MyString"
        rotateCharacters("MyString", 9); // Should return and print error message
        rotateCharacters("", 9); // Should return and print error message
        rotateCharacters(" ", 9); // Should return and print error message
    }

    /**
     * Question 1
     * Function: Method goes through array and prints out numbers above and below input
     * @param nums - Array that method will iterate through
     * @param input - Integer that will be used to check whether numbers in array are above or below
     */
    static void printAboveBelow(int[] nums, int input) {

        // Checks to see if nums array is empty and returns if so
        if (nums.length == 0) {
            System.out.println("Array of integers is empty!");
            return;
        }

        int above = 0; // Variable to store count above input
        int below = 0; // Variable to store count below input

        // Iterate through each number in nums array increment above or below depending on if number is above or below input
        for (int num: nums) {
            if (num > input) {
                above++;
            } else if (num < input) {
                below++;
            }
        }

        System.out.println("above: " + above + ", below: " + below);
    }

    /**
     * Question 2
     * Function: Method rotates characters in a string by a given input
     * @param str - String to be rotated
     * @param input - Amount to rotate characters in string by
     */
    static void rotateCharacters(String str, int input) {

        // Checks if rotation amount is larger than string size or if string is empty/blank before rotating
        if (str.isEmpty() || str.isBlank()) {
            System.out.println("String is blank or empty");
            return;
        } else if (input > str.length()) {
            System.out.println("Invalid rotation amount!");
            return;
        } 

        System.out.println(str.substring(str.length() - input) +  str.substring(0, str.length() - input)); // Prints overflow portion concatenated with original string up to overflow point
    }

    /**
     * Question 3
     * Answer: My favorite programming language, and the one I have the most experience with, is Java. 
     * I've spent some time using Python and C# for class assignments and have found the amount of
     * code needed to get certain things done is much less when compared to Java. If I could change anything
     * about the Java language it would be making the code more concise. For instance, reading a file in Java 
     * requires more code than in Python or C#
     */
}