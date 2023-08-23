package QuickSort;

public class QuickSortLowHigh
{
    public static void qsort(int[] arr)
    {
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr,low,high);
    }

    private static void quickSort(int[] arr,int low,int high)
    {
        // Быстрая сортировка из интернета, отличается от книжной быстрой сортировки
        //завершить,если массив пуст или уже нечего делить
        if (arr.length == 0 || low >= high)
        {
            return;
        }

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        int border = arr[middle];

        //разделияем на подмассивы и меняем местами
        int i = low;
        int j = high;

        while (i <= j)
        {
            while (arr[i] < border)
            {
                i++;
            }
            while (arr[j] > border)
            {
                j--;
            }
            if (i <= j)
            {
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }
        }
        //рекурсия для сортировки левой и правой части
        if (low < j)
        {
            quickSort(arr,low,j);
        }
        if (high > i)
        {
            quickSort(arr,i,high);
        }
    }
}
