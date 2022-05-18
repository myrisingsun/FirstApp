package com.kpaharev;

import jdk.swing.interop.SwingInterOpUtils;

public class FirstApp {

    public static void main(String[] args) {
        // void - метод ничего не возвращает наружу

        char two = '2'; // = оператор присвоения
        boolean booleanNumber = false; // true or false, причем false  - значение по умолчанию
        byte aByte = 10; //хранит целое число от -128 до 127 и занимает 1 байт
        short aShort = 1400; //хранит целое число от -32768 до 32767 и занимает 2 байта (0 относится к положительному диапазону)
        int aInt = 40; //хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
        long aLong = 9360; //хранит целое число от +/- девяти квинтиллионов и занимает 8 байт
        long aLong_ = 123L; //литерал

        /* Любой целочисленный литерал по умолчанию имеет тип int. Если его значение выходит за пределы присваиваемой переменной, происходит ошибка компиляции.
        При использовании типа long необходимо в конце ставить символ L, обозначающий этот тип:*/

        float aFloat = 16.1F; // число с плавающей точкой (не предоставляют точности при вычислениях
        double aDouble = 100.3;
        char aLetter = 92; // 97 по счёту символ в таблице Unicode
        int x = 100;
        int y = 101;

        // + сложение
        // - вычитание
        // * умножение
        // / деление (целочисленное!)
        // % взятие остатка от деления

        // логические операторы
        // & и (&&)
        // | или (||)
        // ! Отрицание
        // != не равно
        // == равно
        // instanceof проверка типа данных
        // > больше
        // >= больше или равно
        // < меньше
        // <= меньше или равно

        String aString = "Привет всем в этом чате!"; // белый цвет показывает, что это не примитивный тип данных, данные будут храниться как объект. По умолчанию значение null (пустое место, не 0).
        String aString0 = new String("Тест");
        char[] array = new char[]{'a', 'b', 'c'}; // одномерный массив
        //char[][] array1 = new char [][] {{'a','c','g'}};// двумерный массив - 1 массив из 1 элемента (первые скобки) и 2 массив из 3 элементов
        System.out.println(array);
        //System.out.println(array1);

        System.out.println(aString);
        System.out.println("aByte+" + "aInt=" + plus(aByte, aInt));
        System.out.println("aLong-" + "aShort=" + minus((int) aLong, aShort));
        System.out.println("aByte*" + "aShort=" + multi(aByte, aShort));
        System.out.println("aLong/" + "aInt=" + share((int) aLong, aInt));
        System.out.println("aLong-" + "(aLong+" + "aShort)=" + left((int) aLong, aShort));
        //System.out.println("aByte -" + "aLong = " + minus((int) aByte, aLong));

        int maxValue = getMaxIntValue(); // Записать в переменную maxValue результата того, что вернул метод getMaxIntValue
        System.out.println(maxValue); // вывод на экран переменную в котрой возвращен результат метода getMaxIntValue
        delic(x,y);
    }

    static int plus(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int multi(int a, int b) {
        return a * b;
    }

    static int share(int a, int b) {
        return a / b;
    }

    static int left(int a, int b) {
        return a % b;
    }

    static int getMaxIntValue() {
        return Integer.MAX_VALUE; // вернуть максимальное значение Int
    }


    static void delic(int x, int y) {
        if (x > y) {
            System.out.println("x > y");
        }
        else {
            System.out.println("x < y");
        }
    }
}

