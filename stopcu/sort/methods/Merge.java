package stopcu.sort.methods;

import java.util.Arrays;
import java.util.Objects;

public class Merge implements ISort {

    private static Merge instance = null;

    private Merge() {
    }

    public static Merge getInstance() {

        return Objects.isNull(instance) ? instance = new Merge() : instance;

    }

    @Override
    public Integer[] sort(Integer[] array) {

        Integer[] resultArray = Arrays.copyOf(array, array.length);

        mergeSort(resultArray, array.length);

        System.out.println(Arrays.toString(resultArray));

        return null;
    }

    private void mergeSort(Integer[] array, int length) {

        if (length < 2) {
            return;
        }

        int leftLenght = length / 2;
        int rightLenght = length - leftLenght;

        Integer[] left = new Integer[leftLenght];
        Integer[] right = new Integer[rightLenght];

        for (int i = 0; i < leftLenght; i++) {
            left[i] = array[i];
        }

        for (int i = leftLenght; i < length; i++) {
            right[i - leftLenght] = array[i];
        }

        mergeSort(left, leftLenght);
        mergeSort(right, rightLenght);

        merge(array, left, right, leftLenght, rightLenght);

    }

    private void merge(Integer[] array, Integer[] left, Integer[] right, int leftLenght, int rightLenght) {

        int i = 0, j = 0, k = 0;
        while (i < leftLenght && j < rightLenght) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < leftLenght) {
            array[k++] = left[i++];
        }
        while (j < rightLenght) {
            array[k++] = right[j++];
        }

    }

}
