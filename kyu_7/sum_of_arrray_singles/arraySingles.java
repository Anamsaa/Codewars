package kyu_7.sum_of_arrray_singles;
// Link: https://www.codewars.com/kata/59f11118a5e129e591000134/java
// In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. Your task will be to return the sum of the numbers that occur only once.
// For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15. Every other number occurs twice.
// More examples in the test cases.
// Good luck!

public class arraySingles {
    public static int repeats(int [] arr){
        //Inicializo una variable para guardar la suma de los numeros NO repetidos
        int sumArray = 0; 

        //Utilizo el bubble sort para ordenar los elementos del array 
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
            if (arr[j] > arr[j + 1]){
                int aux = arr[j]; 
                arr[j] = arr[j + 1];
                arr[j + 1] = aux;
            }
            }
        }
        
        //Iterar sobre el array ordenado 
        for (int i = 0; i < arr.length; i++){ //Limitador
            //Comparo cada elemento del array con el anterior y con el siguiente
            if ((i == 0 || arr[i] != arr[i - 1]) && (i == arr.length - 1 || arr[i] != arr[i + 1])){
                sumArray += arr[i]; 
            }
        }
        return sumArray; 
    }
}
