package SelectionSort;

public class SelectionSort
{
    public static int[] selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int index = minIndex(arr,i);

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }
    private static int minIndex(int[] arr,int start)
    {
        int min = start;
        for (int i = start; i < arr.length; i++)
        {
            if (arr[i] < arr[min])
            {
                min = i;
            }
        }
        return min;
    }
}
