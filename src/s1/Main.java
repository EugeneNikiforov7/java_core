package s1;

/**
 * Main. Основной класс приложения.
 * Основное назначение: вывод результата четырех арифметических действий.
 * Способы взаимодействия: ввести вручную цифровые аргументы.
 */

import s1.other.Decorator;
import s1.other.MathClass;

public class Main {
    /**
     * Точка входа в программу. С нее всегда все начинается.
     *
     * @param args стандартные аргументы командной строки.
     */
    public static void main(String[] args) {
        int result = MathClass.add(2, 2);
        System.out.println(Decorator.decorate(result));
        result = MathClass.sub(2, 2);
        System.out.println(Decorator.decorate(result));
        result = MathClass.mul(2, 2);
        System.out.println(Decorator.decorate(result));
        result = MathClass.div(2, 2);
        System.out.println(Decorator.decorate(result));
    }
}
