package stopcu.main;

import stopcu.sort.Sort;
import stopcu.sort.methods.ESortMethodType;

public class Main {

    public static void main(String[] args) {
        
        Integer[] array = {22,27,16,2,18,6};

        Sort sort = new Sort(array);
        sort.sort(ESortMethodType.INSERTION);

    }

}