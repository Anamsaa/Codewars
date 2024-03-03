package kyu_4.snail;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import static java.util.stream.Collectors.joining;

public class snail {
    @Test
    public void SnailTest1() {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        test(array, r);
    }
    
    public String int2dToString(int[][] a) {
        return Arrays.stream(a)
                     .map(row -> Arrays.toString(row))
                     .collect(joining("\n"));
    }

    public void test(int[][] array, int[] result) {
        String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
        System.out.println(text);
        Assert.assertArrayEquals(result, snails(array));
    }

    public static int[] snails(int[][] array) {
        int lengthtotal = array.length * array[0].length;
        int[] numarrays = new int[lengthtotal];
        
        int filaInicial = 0; 
        int filaFinal = array.length; 
        int colInicial = 0;
        int colFinal = array[0].length; 
        int index = 0; 
        while (index < lengthtotal) {
            for (int i = colInicial; i < colFinal && index < lengthtotal; i++) {
                numarrays[index] = array[filaInicial][i];
                index++;
            }
            for (int i = filaInicial + 1; i < filaFinal && index < lengthtotal; i++) {
                numarrays[index] = array[i][colFinal - 1];
                index++;
            }
            for (int i = colFinal - 2; i >= colInicial && index < lengthtotal; i--) {
                numarrays[index] = array[filaFinal - 1][i];
                index++;
            }
            for (int i = filaFinal - 2; i > filaInicial && index < lengthtotal; i--) {
                numarrays[index] = array[i][colInicial];
                index++;
            }
            filaInicial++; 
            filaFinal--; 
            colInicial++; 
            colFinal--; 
        }
        return numarrays;
    }
}