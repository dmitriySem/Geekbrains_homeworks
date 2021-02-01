import java.util.Arrays;

public class HomeWork_2 {

    public static void main(String[] args) {

//        1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0;

//        int[] massive_1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
//        System.out.println("Массив до замены:");
//        System.out.println(Arrays.toString(massive_1));
//        for (int i = 0; i < massive_1.length; i++) {
//            if (massive_1[i] == 0) {
//                massive_1[i] = 1;
//            } else {
//                massive_1[i] = 0;
//            }
//        }
//        System.out.println("Массив после замены:");
//        System.out.println(Arrays.toString(massive_1));


//        2. Задать пустой целочисленный массив размером 8.
//        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
//        int [] massive_2 = new int[8];
//        for (int i = 1; i < massive_2.length; i++) {
//            massive_2[i] = massive_2[i-1]+3;
//        }
//        System.out.println(Arrays.toString(massive_2));

//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//        пройти по нему циклом, и числа меньшие 6 умножить на 2;
//        int[] massive_3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        System.out.println(Arrays.toString(massive_3));
//        for (int i = 0; i < massive_3.length; i++) {
//            if (massive_3[i]<6){
//                massive_3[i] = massive_3[i]*2;
//            }
//        }
//        System.out.println(Arrays.toString(massive_3));

//        4. Создать квадратный двумерный целочисленный массив
//        (количество строк и столбцов одинаковое) и с помощью
//        цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] massive2D_1 = new int[5][5];
        for (int i = 0; i <massive2D_1.length ; i++) {
            massive2D_1[i][i] = 1;
        }
        for (int i = 0; i < massive2D_1.length; i++) {
            System.out.println(Arrays.toString(massive2D_1[i]));
        }


    }
}
