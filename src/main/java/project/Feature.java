package project;

public class Feature {

    /**
     * band(int numOf, int numTo)
     * Данный метод позволяет генерировать случайные числа в определенном диапазоне
     * Где диапазон задается от numOf
     * До numTo
     */

    public static int band(int numOf, int numTo) {

        return numOf + (int) (Math.random() * numTo); // Генерация 1-го числа

    }
}
