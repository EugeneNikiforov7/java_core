package s1.other;

/**
 * еще один класс приложения
 */

public class MathClass {
    /**
     * Функция суммирования двух чисел
     *
     * @param a1 первое слагаемое
     * @param a2 второе слагаемое
     * @return сумма a1 и a2 без проверки на переполнение переменной.
     */
    public static int add(int a1, int a2){
        return a1 + a2;
    }

    /**
     * Функция умножения двух чисел.
     * @param a1 первый множитель
     * @param a2 второй множитель
     * @return произведение a1 и a2 без проверки на переполнение переменной.
     */
    public static int mul(int a1, int a2){
        return a1 * a2;
    }

    /**
     * Функция вычитания двух чисел.
     * @param a1 уменьшаемое
     * @param a2 вычитаемое
     * @return разность a1 и a2 без проверки на переполнение переменной.
     */

    public static int sub(int a1, int a2){
        return a1 - a2;
    }

    /**
     * Функция деления двух чисел.
     * @param a1 делимое
     * @param a2 делитель
     * @return частное a1 и a2 без проверки на переполнение переменной.
     */

    public static int div(int a1, int a2){
        return a1 / a2;
    }
}
