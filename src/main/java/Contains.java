

public class Contains {

    /**
     * This method should search an array to see if that array contains some value.
     * You will need to use a for loop to check every value of the array to see if it matches the target value.
     *
     * @param arr array to be manipulated.
     * @param target the value that the method should be searching for.
     * @return true if arr contains target, false otherwise.
     */
    public boolean arrayContains(int[] arr, int target){
       // Loop through every index in the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches our target
            if (arr[i] == target) {
                return true; // Found it! Exit the method early.
            }
        }
        
        // If the loop finishes, it means we never hit 'return true'
        return false;
    }
}