package stopcu.sort;

import java.util.Arrays;

import stopcu.sort.methods.ESortMethodType;
import stopcu.sort.methods.Insertion;
import stopcu.sort.methods.Merge;

public class Sort {
    
    private final Integer[] sourceArray;

    public Sort(Integer[] sourceArray) {
        
        this.sourceArray = Arrays.copyOf(sourceArray, sourceArray.length);

    }

    public Integer[] sort(ESortMethodType sortMethodType){

        switch (sortMethodType) {
            case INSERTION:
                return Insertion.getInstance().sort(sourceArray);
            case MERGE:
                return Merge.getInstance().sort(sourceArray);
            default:
                return Insertion.getInstance().sort(sourceArray);
        }
    }

}
