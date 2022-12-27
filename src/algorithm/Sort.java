package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        for(int j=1;j<array.length-1;j++){
            int curr= j;
            int i = 0;
            j = i;
            double[] a = new double[0];
            while(j>0 && curr<a[j-1]){
                a[j]=a[j-1];
                j--;
            }
            a[j]=curr;
        }



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here

        int n = list.length;
        // defining variable temp to store required value
        int temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(list[j-1] > list[j]){
                    //swap values
                    temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }
            }
        }
        
        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here

        public int [] mergeSort(int [] array){
            int [] list = array;

            if(list == null)
            {
                //return;
            }
            if(list.length > 1)
            {

                int mid = list.length / 2;


                int[] left = new int[mid];
                for(int i = 0; i < mid; i++)
                {
                    left[i] = list[i];
                }

                // Split right part
                int[] right = new int[list.length - mid];
                for(int i = mid; i < list.length; i++)
                {
                    right[i - mid] = list[i];
                }
                mergeSort(left);
                mergeSort(right);

                int i = 0;
                int j = 0;
                int k = 0;

                // Merge left and right arrays
                while(i < left.length && j < right.length)
                {
                    if(left[i] < right[j])
                    {
                        list[k] = left[i];
                        i++;
                    }
                    else
                    {
                        list[k] = right[j];
                        j++;
                    }
                    k++;
                }
                // Collect remaining elements
                while(i < left.length)
                {
                    list[k] = left[i];
                    i++;
                    k++;
                }
                while(j < right.length)
                {
                    list[k] = right[j];
                    j++;
                    k++;
                }
            }


            return list;
        }

        // supportive partition function for quicksort
        static int partition(int array[], int low, int high)
        {
            // highest value
            int pivot = array[high];

            // index of smaller element
            int i = (low - 1);
            for (int j = low; j <= high - 1; j++) {
                // If current element is smaller than or
                // equal to pivot
                if (array[j] <= pivot) {
                    i++;

                    // swap array[i] and array[j]
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            // swap array[i+1] and array[high] (or pivot)
            int temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            return i + 1;

    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
            // fetching length, lower limit and upper limit of index
            int n = list.length;
            int h = n-1;
            int l = 0;
            // Create an auxiliary stack
            int[] stack = new int[h - l + 1];

            // initialize top of stack
            int top = -1;

            // push initial values of l and h to stack
            stack[++top] = l;
            stack[++top] = h;

            // Keep popping from stack while is not empty
            while (top >= 0) {
                // Pop h and l
                h = stack[top--];
                l = stack[top--];

                // Set pivot element at its correct position
                // in sorted array
                int p = partition(list, l, h);

                // If there are elements on left side of pivot,
                // then push left side to stack
                if (p - 1 > l) {
                    stack[++top] = l;
                    stack[++top] = p - 1;
                }

                // If there are elements on right side of pivot,
                // then push right side to stack
                if (p + 1 < h) {
                    stack[++top] = p + 1;
                    stack[++top] = h;
                }
            }


            return list;
        }

        // supportive function for heapSort, buildMaxHeap
        // generate max heap from array
        static void buildMaxHeap(int array[])
        {
            // fetching length from list
            int n = array.length;
            for (int i = 1; i < n; i++)
            {
                // if child is bigger than parent
                if (array[i] > array[(i - 1) / 2])
                {
                    int j = i;

                    // swap child and parent until
                    // parent is smaller
                    while (array[j] > array[(j - 1) / 2])
                    {
                        int temp = array[j];
                        array[j]=array[(j - 1) / 2];
                        array[(j - 1) / 2] = temp;

                        j = (j - 1) / 2;
                    }
                }
            }
        }
        

    }
    
    public static int [] heapSort(int[] array){
        int [] list = array;
        //implement here

        buildMaxHeap(list);
        // fetching length of list
        int n = list.length;
        int temp;

        for (int i = n - 1; i > 0; i--)
        {

            temp = list[0];
            list[0]=list[i];
            list[i] = temp;


            int j = 0, index;

            do
            {
                index = (2 * j + 1);

                if (index < (i - 1) && list[index] < list[index + 1])
                    index++;


                if (index < i && list[j] < list[index]){
                    temp = list[j];
                    list[j]=list[index];
                    list[index] = temp;
                }

                j = index;

            } while (index < i);
        }


        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    // Driver program
    public static void main(String args[])
    {
        int arr[] = {10, 20, 15, 17, 9, 21};
        int n = arr.length;

        System.out.print("Given array: ");
        printSortedArray(arr);

        int[] ints = heapSort(arr);

        System.out.print("Sorted array: ");
        printSortedArray(arr);
    }


    public void mergeSort(int[] array, int i, int i1) {
    }

    public void quickSort(int[] array, int i, int i1) {
    }
}
