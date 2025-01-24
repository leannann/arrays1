import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Task 1
        int[] firstArray = new int[]{1, 2, 3};
        double[] secondArray = {1.57, 7.654, 9.986};
        char[] thirdArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        // Task 2
        System.out.println("Задача 2");
        for (int i = 0; i < firstArray.length; i++){
            if (i == firstArray.length - 1){
                System.out.println(firstArray[i]);
                break;
            }
            System.out.print(firstArray[i] + ", ");
        }
        for (int i = 0; i < secondArray.length; i++){
            if (i == secondArray.length - 1){
                System.out.println(secondArray[i]);
                break;
            }
            System.out.print(secondArray[i] + ", ");
        }
        for (int i = 0; i < thirdArray.length; i++){
            if (i == thirdArray.length - 1){
                System.out.println(thirdArray[i]);
                break;
            }
            System.out.print(thirdArray[i] + ", ");
        }
        // Task 3
        System.out.println("Задача 3");
        for (int i = firstArray.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.println(firstArray[i]);
                break;
            }
            System.out.print(firstArray[i] + ", ");
        }
        for (int i = secondArray.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.println(secondArray[i]);
                break;
            }
            System.out.print(secondArray[i] + ", ");
        }
        for (int i = thirdArray.length - 1; i >= 0; i--){
            if (i == 0){
                System.out.println(thirdArray[i]);
                break;
            }
            System.out.print(thirdArray[i] + ", ");
        }
        // Task 4
        System.out.println("Задача 4");
        for (int i = 0; i < firstArray.length; i++){
            if (firstArray[i] % 2 != 0) {
                firstArray[i]++;
            }
        }
        System.out.println(Arrays.toString(firstArray));
    }
}