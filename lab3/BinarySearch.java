import java.util.Scanner;

public class BinarySearch {

public static int binarySearch(int[] arr, int target) {
    int left = 0; 
    int right = arr.length - 1; 

    while (left <= right) { 
        int mid = left + (right - left) / 2; 

            if (arr[mid] == target) {
                return mid; 
            }
        else if (arr[mid] < target) { 
            left = mid + 1; 
        } 
        else { 
            right = mid - 1; 
        }
    }

    return -1; 
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Введите длину массива: ");
    int length = sc.nextInt();

    int[] arr = new int[length];

    System.out.println("Введите элементы массива:");
    for (int i = 0; i < length; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.print("Введите целевое значение: ");
    int target = sc.nextInt();

    int result = binarySearch(arr, target);

    if (result == -1) {
        System.out.println("Целевое значение не найдено");
    } 
    else {
        System.out.println("Целевое значение найдено на позиции " + result);
    }
}
}