public class MoreRecursionHelper {

    /** Converts a decimal number to binary representation recursively. */
    public int toBinary(int toConvert) {
        // Base case: if toConvert is 0, return 0
        if (toConvert == 0) {
            return 0;
        }

        // Recursive case: get the binary digits by dividing by 2 and using modulo to get the remainder
        return toConvert % 2 + 10 * toBinary(toConvert / 2);
    }

    /** Calculates the total number of blocks in a pyramid with a given number of rows. */
    public int pyramidTotal(int rows) {
        // Base case: a pyramid with 1 row has 1 block
        if (rows == 1) {
            return 1;
        }
        
        // Recursive case: total blocks is the current row plus the blocks in all previous rows
        return rows + pyramidTotal(rows - 1);
    }

    /** Generates and prints all combinations of characters in a given string. */
    public void combinations(String str, int index, String currStr) {
        // Base case: if we've processed all characters, print the current combination
        if (index == str.length()) {
            System.out.println(currStr);
            return;
        }

        // Recursive case: include the current character in the combination
        combinations(str, index + 1, currStr + str.charAt(index));

        // Recursive case: exclude the current character from the combination
        combinations(str, index + 1, currStr);
    }
}
