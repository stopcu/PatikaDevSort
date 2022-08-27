package stopcu.sort.methods;

import java.util.Arrays;
import java.util.Objects;

public class Insertion implements ISort{

private static Insertion instance = null;

    private Insertion() {
    }

    public static Insertion getInstance(){

        return Objects.isNull(instance) ? instance = new Insertion() : instance; 

    }

    @Override
    public Integer[] sort(Integer[] sourceArray) {
        
        System.out.println("Source Array: " + Arrays.toString(sourceArray));

        System.out.println("1. Iterations:");

        Integer[] resultArray = Arrays.copyOf(sourceArray, sourceArray.length);

        for (int firstLoopIndex = 0 ; firstLoopIndex < resultArray.length; firstLoopIndex++) {
            
            int firstNumber = resultArray[firstLoopIndex];

            int minNumber = firstNumber;
            int minNumberIndex = firstLoopIndex;

            for (int secondLoopIndex = firstLoopIndex + 1 ; secondLoopIndex < resultArray.length; secondLoopIndex++) {
            
                int secondNumber = resultArray[secondLoopIndex];

                if (secondNumber < minNumber) {

                    minNumber = secondNumber;
                    minNumberIndex = secondLoopIndex;

                }
            }

            resultArray[firstLoopIndex] = minNumber;
            resultArray[minNumberIndex] = firstNumber;

            System.out.println("    " +(firstLoopIndex + 1) + ". " + Arrays.toString(resultArray));

        }

        System.out.println("2. Big-O: O(n^2)");

        return resultArray;
    }

}