package ProgrammingSkills;

public class CountOddNumbers {

    /**
     * 
     * Finding the total count of ODD numbers
     * in effecient way, without using loop
     * and printing the result
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(" Count : " + countNumbers(3, 7));
    }

    /**
     * 
     * Used to calculate the total counts of the ODD
     * The formula used here is :
     * Check whether the given low or high is even
     * if anyone is even then the formula is : ((Difference of Low and High) / 2) +
     * 1
     * OrElse return ((high-low) / 2)
     * 
     * @param low
     * @param high
     * @return
     * 
     */
    public static int countNumbers(int low, int high) {
        return ((low % 2 != 0) || (high % 2 != 0)) ? ((high - low) / 2) + 1 : ((high - low) / 2);
    }

}
