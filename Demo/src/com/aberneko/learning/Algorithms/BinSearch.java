package com.aberneko.learning.Algorithms;

public class BinSearch {
    static void main() {
        int[] arr = {1, 43, 6, 76, 12, 23, 99, 45, 123, 545, 675, 234, 12, 4, 7, 65, 232, 56, 78, 454, 3, 5};
        System.out.println("Индекс найденого элемента по просьбе: " + BinarySearch(arr, 78));
    }

    public static int BinarySearch(int[] arr, int elem) {
        int index = -1;

        int low = arr[0];
        int end = arr.length - 1;

        while (low <= end) {

            int mid = low + ((end - low) / 2);

            if (arr[mid] < elem) {
                low = mid + 1;
            } else if (arr[mid] > elem) {
                end = mid - 1;
            } else if (arr[mid] == elem) {
                index = mid;
                break;
            }

        }

        return index;
    }
}
