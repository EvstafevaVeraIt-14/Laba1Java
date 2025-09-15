import java.util.Scanner;
import java.util.Random;
public class ProceduralProgramming {
    //Методы
    public int SumLastNums(int x) { //задание 1.2 сумма двух последний цифр числа
        int n = (x % 10) + ((x / 10) % 10);
        return Math.abs(n);
    }

    public boolean isPositive (int x){ //задание 1.4 определение положительности числа
        return (x>=0);
    }

    public boolean isUpperCase(char x){ //задание 1.6 определие заглавной буквы
        return x >= 'A' && x <= 'Z';
    }

    public boolean isDivisor(int a, int b){ //задание 1.8 определение возможности деления
        return ((a % b == 0) || (b % a == 0));
    }

    public int lastNumSum(int a, int b){ //задание 1.10 сложение разрядов единиц у двух чисел
        return Math.abs(a % 10) + Math.abs(b % 10);
    }

    //Условия
    public double safeDiv (int x, int y) { //задание 2.2 безопасное деление
        if (y==0){
            return 0;
        }
        return (double) x/y;
    }

    public String makeDecision (int x, int y) { //задание 2.4 строка сравнения
        if (x > y){
            return x + " > " + y;
        }
        else if (x < y) {
            return x + " < " + y;
        }
        else {
            return x + " == " + y;
        }
    }

    public boolean sum3 (int x, int y, int z) { // задание 2.6 тройная сумма
        if (x + y == z) {
            return true;
        }
        else if (x + z == y) {
            return true;
        }
        else if (y + z == x) {
            return true;
        }
        return false;
    }

    public String age (int x) { // задание 2.8 возраст
        if ((x % 10 == 1 ) && (x != 11)){
            return "год";
        }
        else if (((x % 10 == 2 ) && (x != 12)) || ((x % 10 == 3 ) && (x != 13)) || ((x % 10 == 4 ) && (x != 14))){
            return "года";
        }
        else {
            return "лет";
        }
    }

    public void printDays (String x) { // задание 2.10 вывод дней недели
        switch (x.toLowerCase()) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }

    // Циклы
    public String reverseListNums (int x) { // задание 3.2 числа наоборот ( отсчет от числа до нуля)
        String result = "";
        if (x < 0) {
            for (int i = 0; i >= x; i--) {
                result += i;
                if (i <= 0) {
                    result += " ";
                }
            }
        }
        else {
            for (int i = x; i >= 0; i--) {
                result += i;
                if (i > 0) {
                    result += " ";
                }
            }
        }
        return result;
    }

    public int pow (int x, int y) { // задание 3.4 степень числа
        int result = 1;
        if (y < 0) {
            for (int i = 0; i > y; i--) {
                result /=x;
            }
        }
        else {
            for (int i = 0; i < y; i++) {
                result *=x;
            }
        }
        return result;
    }

    public boolean equalNum (int x) { // задание 3.6 одинаковость всех цифр в числе
        if (x < 10 && x > -10) {
            return true;
        }
        int num = Math.abs(x);
        int firstDigit = num % 10;
        while (num > 0) {
            if (num % 10 != firstDigit) {
                return false;
            }
            num /=10;
        }
        return true;
    }

    public void leftTriangle (int x) { // задание 3.8 левосторонний треугольник
        String str = "";
        for (int i = 1; i <= x; i++) {
            str += "*";
            System.out.println(str);
        }
    }

    public void guessGame() { // задание 3.10 угадывание цифры
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int num = random.nextInt(10); // Число от 0 до 9
        int attempts = 0;
        while (true) {
            System.out.print("Введите число от 0 до 9: ");
            String input = scanner.nextLine().trim();

            try {
                int userNum = Integer.parseInt(input);
                attempts++;

                if (userNum < 0 || userNum > 9) {
                    System.out.println("Недопустимый ввод. Число должно быть от 0 до 9.");
                    continue;
                }

                if (userNum == num) {
                    System.out.println("Вы угадали!");
                    break;
                }
                else {
                    System.out.println("Вы не угадали, попробуйте еще раз.");
                }

            }
            catch (NumberFormatException e) {
                System.out.println("Недопустимый ввод. Введите целое число от 0 до 9.");
            }
        }

        // Правильное склонение слова "попытка"
        String attemptWord;
        if (attempts % 10 == 1 && attempts % 100 != 11) {
            attemptWord = "попытку";
        }
        else if (attempts % 10 >= 2 && attempts % 10 <= 4 && (attempts % 100 < 10 || attempts % 100 >= 20)) {
            attemptWord = "попытки";
        }
        else {
            attemptWord = "попыток";
        }

        System.out.println("Вы отгадали число за " + attempts + " " + attemptWord);
    }

    //Массивы
    public int findLast (int[] arr, int x) { // задание 4.2 поиск последнего вхождения
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public int[]add (int[] arr, int x, int pos) { // задание 4.4 добавление элемента по позиции
        if (pos < 0 || pos > arr.length) {
            return arr;
        }
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            newArray[i] = arr[i];
        }
        newArray[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }
        return newArray;
    }

    public void reverse (int[] arr) { // задание 4.6 реверс массива
        int left = 0;
        int right = arr.length - 1;
        int temp;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public int[] concat (int[] arr1,int[] arr2) { //задание 4.8 объединение
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    public int[] deleteNegative (int[] arr) { // задание 4.10 удаление отрицательных эл-тов
        int countPositive = 0;
        for (int num : arr) {
            if (num >= 0) {
                countPositive++;
            }
        }
        int[] result = new int[countPositive];
        int index = 0;
        for (int num : arr) {
            if (num >= 0) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }

}

