// https://www.codewars.com/kata/578aa45ee9fd15ff4600090d
// Task
// You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.

// Examples
// [7, 1]  =>  [1, 7]
// [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
// [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]  =>  [1, 8, 3, 6, 5, 4, 7, 2, 9, 0]

package kyu_6.sort_the_odd;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
    
        for (int i = 0; i < array.length - 1; i++){
          for (int j = i + 1; j < array.length; j++){
            if (array[i] > array[j] && array[j] % 2 != 0 && array[i] % 2 != 0){
              int aux = array[j]; 
              array[j] = array[i]; 
              array[i] = aux;
            }
          }
        }
        return array;
      }
}
