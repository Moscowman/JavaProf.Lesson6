package Lesson6;

import java.util.Arrays;

public class Lesson6 {
    static int[] arrayAfter4 (int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                return Arrays.copyOfRange(array, i + 1, array.length);
            }
        }
        throw new RuntimeException("В массиве нет четверок");
    }

    static boolean checkArrayFor1And4(int[] array) {
        boolean has1 = false;
        boolean has4 = false;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value != 1 && value != 4) {
                return false;
            }
            if (value == 1) {
                has1 = true;
            }
            if (value == 4) {
                has4 = true;
            }
        }
        return has1 && has4;
    }

}
