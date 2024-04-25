import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 8, 6, 9, 4, 2, 3, 12}; // 1 2 3 4 6 8 9
        Arrays.sort(numbers);
        int position = binarySearch(numbers, 4);
        System.out.println(position);
    }

    public static int binarySearch(int[] array, int keyValue){ // O(log(n))
        int low = 0;
        int high = array.length - 1;
        while(low <= high){
            // пока не доберемся до единственного (результатного) элемента в массиве
            // или не переберем абсолютно весь массив
            int middle = low + (high - low) / 2;
            if(array[middle] == keyValue){
                return middle;
            }
            if(keyValue > array[middle]){
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }
}