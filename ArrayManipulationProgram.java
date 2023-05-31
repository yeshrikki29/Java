import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulationProgram {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)  {
        int[] array={5,6,3,9,11,85};
        boolean running =true;

        while(running) {
            System.out.println("Current Array: "+Arrays.toString(array));
            System.out.println("Select an operation to run:");
            System.out.println("1. Insert an element:");
            System.out.println("2. Delete an element");
            System.out.println("3. Sort the array");
            System.out.println("4. Linear Search");
            System.out.println("5. Binary Search");
            System.out.println("6.Exit");
            System.out.println("Enter your choice: ");


            int choice =sc.nextInt();
           // sc.nextLine();  //consumes newline character


            switch(choice)  {
                case 1:
                    InsertElement(array);
                    break;
                case 2:
                    DeleteElement(array);
                    break;
                case 3:
                    SortArray(array);
                    break;
                case 4:
                    LinearSearch(array);
                    break;
                case 5:
                    BinarySearch(array);
                    break;
                case 6:
                    running=false;
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
            System.out.println();
    }
    System.out.println("Program exited. Final Array: "+Arrays.toString(array));
}


private static void InsertElement(int[] array) {
    System.out.println("Enter the element to insert: ");
    int element = sc.nextInt();
    System.out.println("Enter the index where to insert: ");
    int index = sc.nextInt();

    if (index<0 || index>array.length)  {
        System.out.println("Invalid index. Element can't be inserted.");
        return;
    }

    //Shift elemets to make room for new element
    for(int i = array.length-1;i>index;i--) {
        array[i] = array[i-1];
    }

    //insert the element in the specified index
    array[index] = element;

    System.out.println("Element "+element+" inserted at index "+index);

}



private static void DeleteElement(int[] array) {
    System.out.print("Enter the index of element to be removed: ");
    int index = sc.nextInt();

    if(index<0 || index >=array.length) {
        System.out.println("Invalid index. Element can't be deleted.");
        return;
    }

    //shift elements to the left to fill tha gap left by the deleted element
    for(int i=index; i<array.length-1;i++)  {
        array[i] = array[i+1];
    }

    //set the last element to 0
    array[array.length-1]=0;

    System.out.println("Element at index "+index+" deleted.");

}


private static void SortArray(int[] array) {
    System.out.println("Select a sorting algorithm: ");
    System.out.println("1. Bubble Sort");
    System.out.println("Enter your choice: ");
    int choice = sc.nextInt();


    switch(choice) {
        case 1:
            BubbleSort(array);
            break;
        default:
            System.out.println("Invalid input. Sorting aborted.");

    }
    System.out.println("Array sorted successfully.");
}

    private static void BubbleSort(int[] array) {
        int n = array.length;

        for(int i =0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    //swap elements if they are in wrong order
                    int temp = array[j];
                    array[j]  = array[j=1];
                    array[j+1] =temp;
                }
            }
        }
    }


    private static void LinearSearch(int[] array) {
        System.out.print("Enter the element to search: ");
        int element = sc.nextInt();

        for (int i= 0; i<array.length; i++) {
             if (array[i] == element) {
                System.out.println("element "+element +" found at index "+i);
                return;
             }
        }
        System.out.println("Element "+element+"  not found in the array.");
    }


    private static void BinarySearch(int[] array) {
        System.out.print("Enter the element to be search: ");
        int element = sc.nextInt();

        int low=0;
        int high = array.length-1;

        while(low<=high)    {
            int mid =(low+high)/2;

            if(array[mid] == element) {
                System.out.println("Element "+element+" found at index "+mid);
                return;

            } else if (array[mid]< element) {
                low = mid +1;
            } else {
                high = mid-1;
            }
            }
            System.out.println("Element "+element+" not found in the array.");
        }
    }