package QuickSort;

import java.util.*;

public class QuickSortArr
{
    public static void quickSort(List<Integer> list)
    {
        if (list == null || list.size() <= 1)
        {
            return;
        }
        List<Integer> smaller = new LinkedList<>();
        List<Integer> equal = new LinkedList<>();
        List<Integer> greater = new LinkedList<>();

        int pivot = list.get(list.size()/2);
        for (int element : list) {
            if (element < pivot) {
                smaller.add(element);
            } else if (element == pivot) {
                equal.add(element);
            } else {
                greater.add(element);
            }
        }

        quickSort(smaller);
        quickSort(greater);

        list.clear();
        list.addAll(smaller);
        list.addAll(equal);
        list.addAll(greater);
    }
}
