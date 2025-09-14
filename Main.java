import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ProceduralProgramming program = new ProceduralProgramming();
        System.out.println("\nПрограмма к лабораторной 1: 'Процедурное программирование'\n");
        boolean run = true;
        int choice;
        while(run){
            System.out.println("Выберите номер задания:");
            System.out.println("1 - 1.2: сложение двух последних цифр числа");
            System.out.println("2 - 1.4: определение положительности числа");
            System.out.println("3 - 1.6: определение заглавной буквы");
            System.out.println("4 - 1.8: определение возможности деления");
            System.out.println("5 - 1.10: сложение разряда единиц у чисел");
            System.out.println("6 - 2.2: безопасное деление");
            System.out.println("7 - 2.4: строка сравнения");
            System.out.println("8 - 2.6: тройная сумма");
            System.out.println("9 - 2.8: возраст (год, года, лет)");
            System.out.println("10 - 2.10: вывод дней недели");
            System.out.println("11 - 3.2: числа наоборот (отсчёт от числа до нуля)");
            System.out.println("12 - 3.4: возведение в степень числа");
            System.out.println("13 - 3.6: проверка одинаковости всех цифр в числе");
            System.out.println("14 - 3.8: левосторонний треугольник");
            System.out.println("15 - 3.10: угадайка цифры от 0 до 9");
            System.out.println("16 - 4.2: поиск последнего вхождения эл-та");
            System.out.println("17 - 4.4: добавление эл-та по позиции в массив");
            System.out.println("18 - 4.6: реверс массива");
            System.out.println("19 - 4.8: объединение двух массивов");
            System.out.println("20 - 4.10: удаление отрицательных эл-тов");
            System.out.println("0 - выход из программы");
            System.out.print("Ваш выбор: ");
            if (scanner.hasNextInt()){
                choice = scanner.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println("\nСложение двух последних цифр числа");
                        int num = 0;
                        boolean validInput = false;
                        while (!validInput){
                            System.out.print("Введите целое число (минимум 2 разряда): ");
                            if (scanner.hasNextInt()) {
                                num = scanner.nextInt();
                                if (Math.abs(num) >= 10){
                                    validInput = true;
                                }
                                else {
                                    System.out.println("Недопустимый ввод. Число должно содержать минимум 2 разряда.");
                                }
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        int result = program.SumLastNums(num);
                        System.out.println("Сумма двух последних цифр числа " + num + " равна " + result);
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 2: {
                        System.out.println("\nОпределение положительности числа");
                        int num2 = 0;
                        boolean validInput2 = false;
                        while(!validInput2){
                            System.out.print("Введите целое число: ");
                            if (scanner.hasNextInt()) {
                                num2 = scanner.nextInt();
                                validInput2 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        boolean result2 = program.isPositive(num2);
                        System.out.println("Число " + num2 + " положительное - " + result2);
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 3: {
                        System.out.println("\nОпределение заглавной буквы");
                        char x = ' ';
                        boolean validInput3 = false;
                        String input;
                        if (scanner.hasNextLine()){
                            scanner.nextLine();
                        }
                        while (!validInput3) {
                            System.out.print("Введите символ: ");
                            input = scanner.nextLine();
                            if (input.length() == 1) {
                                x = input.charAt(0);
                                validInput3 = true;
                            }
                            else {
                                System.out.println("Недопустимый ввод.");
                            }
                        }
                        boolean result3 = program.isUpperCase(x);
                        System.out.println("Символ '" + x + "' является большой буквой - " + result3);
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 4:{
                        System.out.println("\nОпределение возможности деления");
                        int a = 0;
                        int b = 0;
                        boolean validInput41 = false;
                        boolean validInput42 = false;
                        while(!validInput41){
                            System.out.print("Введите целое число a: ");
                            if (scanner.hasNextInt()) {
                                a = scanner.nextInt();
                                validInput41 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        while(!validInput42){
                            System.out.print("Введите целое число b: ");
                            if (scanner.hasNextInt()) {
                                b = scanner.nextInt();
                                if (a==0 && b==0){
                                    System.out.println("Хотя бы одно число не должно равняться 0");
                                }
                                else{
                                    validInput42 = true;
                                }
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        boolean result4 = program.isDivisor(a, b);
                        System.out.println("Числa " + a + " и " + b + " являются делимым и делителем - " + result4);
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 5:{
                        System.out.println("\nСложение разряда единиц у чисел");
                        int a = 0;
                        int b = 0;
                        boolean validInput51 = false;
                        boolean validInput52 = false;
                        while(!validInput51){
                            System.out.print("Введите целое число a: ");
                            if (scanner.hasNextInt()) {
                                a = scanner.nextInt();
                                validInput51 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        while(!validInput52){
                            System.out.print("Введите целое число b: ");
                            if (scanner.hasNextInt()) {
                                b = scanner.nextInt();
                                validInput52 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        int result5 = program.lastNumSum(a, b);
                        System.out.println("Сумма разряда единиц " + a + " и " + b + " равна " + result5);
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 6: {
                        System.out.println("\nБезопасное деление");
                        int a = 0;
                        int b = 0;
                        boolean validInput61 = false;
                        boolean validInput62 = false;
                        while(!validInput61){
                            System.out.print("Введите целое число a: ");
                            if (scanner.hasNextInt()) {
                                a = scanner.nextInt();
                                validInput61 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        while(!validInput62){
                            System.out.print("Введите целое число b: ");
                            if (scanner.hasNextInt()) {
                                b = scanner.nextInt();
                                validInput62 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        double result6 = program.safeDiv(a, b);
                        System.out.println("Результат: " + a + " / " + b + " = " + result6);
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 7: {
                        System.out.println("\nСтрока сравнения");
                        int a = 0;
                        int b = 0;
                        boolean validInput71 = false;
                        boolean validInput72 = false;
                        while(!validInput71){
                            System.out.print("Введите целое число a: ");
                            if (scanner.hasNextInt()) {
                                a = scanner.nextInt();
                                validInput71 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        while(!validInput72){
                            System.out.print("Введите целое число b: ");
                            if (scanner.hasNextInt()) {
                                b = scanner.nextInt();
                                validInput72 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        String result7 = program.makeDecision(a, b);
                        System.out.println("Результат: "  + result7);
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 8: {
                        System.out.println("\nТройная сумма");
                        int a = 0;
                        int b = 0;
                        int c = 0;
                        boolean validInput81 = false;
                        boolean validInput82 = false;
                        boolean validInput83 = false;
                        while(!validInput81){
                            System.out.print("Введите целое число a: ");
                            if (scanner.hasNextInt()) {
                                a = scanner.nextInt();
                                validInput81 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        while(!validInput82){
                            System.out.print("Введите целое число b: ");
                            if (scanner.hasNextInt()) {
                                b = scanner.nextInt();
                                validInput82 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        while(!validInput83){
                            System.out.print("Введите целое число a: ");
                            if (scanner.hasNextInt()) {
                                c = scanner.nextInt();
                                validInput83 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        boolean result8 = program.sum3(a, b, c);
                        System.out.println("Сумма двух слагаемых из трёх: " + a + ", "+ b + ", " + c + " равна третьему - "  + result8);
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 9: {
                        System.out.println("\nВозраст");
                        int num = 0;
                        boolean validInput9 = false;
                        while (!validInput9){
                            System.out.print("Введите количество полных лет: ");
                            if (scanner.hasNextInt()) {
                                num = scanner.nextInt();
                                if (num >= 0){
                                    validInput9 = true;
                                }
                                else {
                                    System.out.println("Недопустимый ввод. Возраст не может быть отрицательным.");
                                }
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        String result9 = program.age(num);
                        System.out.println("Результат: " + num + " " + result9);
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 10: {
                        System.out.println("\nВывод дней недели");
                        if (scanner.hasNextLine()) {
                            scanner.nextLine();
                        }
                        System.out.print("Введите день недели: ");
                        String day = scanner.nextLine().trim();
                        System.out.println("Результат: ");
                        program.printDays(day);
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 11: {
                        System.out.println("\nЧисла наоборот (отсчёт от числа до нуля)");
                        int num = 0;
                        boolean validInput11 = false;
                        while (!validInput11){
                            System.out.print("Введите целое число: ");
                            if (scanner.hasNextInt()) {
                                num = scanner.nextInt();
                                validInput11 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        String result11 = program.reverseListNums(num);
                        System.out.println("Результат: " + result11);
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 12: {
                        System.out.println("\nВозведение в степень");
                        int a = 0;
                        int b = 0;
                        boolean validInput121 = false;
                        boolean validInput122 = false;
                        while(!validInput121){
                            System.out.print("Введите целое число, возводимое в степень: ");
                            if (scanner.hasNextInt()) {
                                a = scanner.nextInt();
                                validInput121 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        while(!validInput122){
                            System.out.print("Введите степень (целое число): ");
                            if (scanner.hasNextInt()) {
                                b = scanner.nextInt();
                                validInput122 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        int result12 = program.pow(a, b);
                        System.out.println("Число " + a + " в степени числа " + b + " равно " + result12);
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 13: {
                        System.out.println("\nПроверка одинаковости цифр в числе");
                        int num = 0;
                        boolean validInput13 = false;
                        while(!validInput13){
                            System.out.print("Введите целое число: ");
                            if (scanner.hasNextInt()) {
                                num = scanner.nextInt();
                                validInput13 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        boolean result13 = program.equalNum(num);
                        System.out.println("Число " + num + " состоит из одинаковых цифр - " + result13);
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 14: {
                        System.out.println("\nЛевосторонний треугольник");
                        int num = 0;
                        boolean validInput14 = false;
                        while (!validInput14){
                            System.out.print("Введите высоту треугольника: ");
                            if (scanner.hasNextInt()) {
                                num = scanner.nextInt();
                                if (num >= 0){
                                    validInput14 = true;
                                }
                                else {
                                    System.out.println("Недопустимый ввод. Высота не может быть отрицательной.");
                                }
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        System.out.println("Результат: ");
                        program.leftTriangle(num);
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 15: {
                        System.out.println("\nУгадайка");
                        program.guessGame();
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 16: {
                        System.out.println("\nНахождение последнего вхождения");
                        int size = 0;
                        boolean validInput161 = false;
                        while (!validInput161){
                            System.out.print("Введите размер массива: ");
                            if (scanner.hasNextInt()) {
                                size = scanner.nextInt();
                                if (size >= 0){
                                    validInput161 = true;
                                }
                                else {
                                    System.out.println("Недопустимый ввод. Размер не может быть отрицательным.");
                                }
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        int[] array = new int[size];
                        System.out.println("Введите " + size + " элементов массива:");
                        if (scanner.hasNextLine()) {
                            scanner.nextLine();
                        }
                        for (int i = 0; i < size; i++) {
                            while (true) {
                                System.out.print("Элемент " + (i + 1) + ": ");
                                String input = scanner.nextLine().trim();
                                try {
                                    array[i] = Integer.parseInt(input); //из строки в число
                                    break;
                                }
                                catch (NumberFormatException e) { //автоматическая проверка ввода
                                    System.out.println("Недопустимый ввод. Введите целое число.");
                                }
                            }
                        }
                        int num = 0;
                        boolean validInput16 = false;
                        while (!validInput16){
                            System.out.print("Введите значение для поиска: ");
                            if (scanner.hasNextInt()) {
                                num = scanner.nextInt();
                                validInput16 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        int result = program.findLast(array, num);
                        System.out.print("Массив: [");
                        for (int i = 0; i < array.length; i++) {
                            System.out.print(array[i]);
                            if (i < array.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println("]");
                        System.out.println("Искомое число: " + num);

                        if (result != -1) {
                            System.out.println("Индекс последнего вхождения: " + result);
                        } else {
                            System.out.println("Число не найдено в массиве");
                        }
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 17: {
                        System.out.println("\nДобавление эл-та по позиции в массив");
                        int size = 0;
                        boolean validInput171 = false;
                        while (!validInput171){
                            System.out.print("Введите размер массива: ");
                            if (scanner.hasNextInt()) {
                                size = scanner.nextInt();
                                if (size >= 0){
                                    validInput171 = true;
                                }
                                else {
                                    System.out.println("Недопустимый ввод. Размер не может быть отрицательным.");
                                }
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        int[] array = new int[size];
                        System.out.println("Введите " + size + " элементов массива:");
                        if (scanner.hasNextLine()) {
                            scanner.nextLine();
                        }
                        for (int i = 0; i < size; i++) {
                            while (true) {
                                System.out.print("Элемент " + (i + 1) + ": ");
                                String input = scanner.nextLine().trim();
                                try {
                                    array[i] = Integer.parseInt(input); //из строки в число
                                    break;
                                }
                                catch (NumberFormatException e) { //автоматическая проверка ввода
                                    System.out.println("Недопустимый ввод. Введите целое число.");
                                }
                            }
                        }
                        int x = 0;
                        boolean validInput17 = false;
                        while (!validInput17){
                            System.out.print("Введите значение для добавления: ");
                            if (scanner.hasNextInt()) {
                                x = scanner.nextInt();
                                validInput17 = true;
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        int pos = 0;
                        boolean validInput172 = false;
                        while (!validInput172){
                            System.out.print("Введите позицию для добавления: ");
                            if (scanner.hasNextInt()) {
                                pos = scanner.nextInt();
                                if (pos <= size && pos >= 0 ){
                                    validInput172 = true;
                                }
                                else {
                                    System.out.println("Недопустимая позиция для данного массива.");
                                }
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        System.out.print("Изначальный массив: [");
                        for (int i = 0; i < array.length; i++) {
                            System.out.print(array[i]);
                            if (i < array.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println("]");
                        System.out.println("Добавляемое число: " + x);
                        int[] resultArray = program.add(array, x, pos);
                        System.out.print("Преобразованный массив: [");
                        for (int i = 0; i < resultArray.length; i++) {
                            System.out.print(resultArray[i]);
                            if (i < resultArray.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println("]");

                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 18: {
                        System.out.println("\nРеверс массива");
                        int size = 0;
                        boolean validInput18 = false;
                        while (!validInput18){
                            System.out.print("Введите размер массива: ");
                            if (scanner.hasNextInt()) {
                                size = scanner.nextInt();
                                if (size >= 0){
                                    validInput18 = true;
                                }
                                else {
                                    System.out.println("Недопустимый ввод. Размер не может быть отрицательным.");
                                }
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        int[] array = new int[size];
                        System.out.println("Введите " + size + " элементов массива:");
                        if (scanner.hasNextLine()) {
                            scanner.nextLine();
                        }
                        for (int i = 0; i < size; i++) {
                            while (true) {
                                System.out.print("Элемент " + (i + 1) + ": ");
                                String input = scanner.nextLine().trim();
                                try {
                                    array[i] = Integer.parseInt(input); //из строки в число
                                    break;
                                }
                                catch (NumberFormatException e) { //автоматическая проверка ввода
                                    System.out.println("Недопустимый ввод. Введите целое число.");
                                }
                            }
                        }
                        System.out.print("Изначальный массив: [");
                        for (int i = 0; i < array.length; i++) {
                            System.out.print(array[i]);
                            if (i < array.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println("]");
                        program.reverse(array);
                        System.out.print("Преобразованный массив: [");
                        for (int i = 0; i < array.length; i++) {
                            System.out.print(array[i]);
                            if (i < array.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println("]");

                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 19: {
                        System.out.println("\nОбъединение двух массивов");
                        int size1 = 0;
                        boolean validInput191 = false;
                        while (!validInput191){
                            System.out.print("Введите размер первого массива: ");
                            if (scanner.hasNextInt()) {
                                size1 = scanner.nextInt();
                                if (size1 >= 0){
                                    validInput191 = true;
                                }
                                else {
                                    System.out.println("Недопустимый ввод. Размер не может быть отрицательным.");
                                }
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        int[] array1 = new int[size1];
                        System.out.println("Введите " + size1 + " элементов первого массива:");
                        if (scanner.hasNextLine()) {
                            scanner.nextLine();
                        }
                        for (int i = 0; i < size1; i++) {
                            while (true) {
                                System.out.print("Элемент " + (i + 1) + ": ");
                                String input = scanner.nextLine().trim();
                                try {
                                    array1[i] = Integer.parseInt(input); //из строки в число
                                    break;
                                }
                                catch (NumberFormatException e) { //автоматическая проверка ввода
                                    System.out.println("Недопустимый ввод. Введите целое число.");
                                }
                            }
                        }
                        int size2 = 0;
                        boolean validInput192 = false;
                        while (!validInput192){
                            System.out.print("Введите размер второго массива: ");
                            if (scanner.hasNextInt()) {
                                size2 = scanner.nextInt();
                                if (size2 >= 0){
                                    validInput192 = true;
                                }
                                else {
                                    System.out.println("Недопустимый ввод. Размер не может быть отрицательным.");
                                }
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        int[] array2 = new int[size2];
                        System.out.println("Введите " + size2 + " элементов второго массива:");
                        if (scanner.hasNextLine()) {
                            scanner.nextLine();
                        }
                        for (int i = 0; i < size2; i++) {
                            while (true) {
                                System.out.print("Элемент " + (i + 1) + ": ");
                                String input = scanner.nextLine().trim();
                                try {
                                    array2[i] = Integer.parseInt(input); //из строки в число
                                    break;
                                }
                                catch (NumberFormatException e) { //автоматическая проверка ввода
                                    System.out.println("Недопустимый ввод. Введите целое число.");
                                }
                            }
                        }
                        System.out.print("Изначальный первый массив: [");
                        for (int i = 0; i < array1.length; i++) {
                            System.out.print(array1[i]);
                            if (i < array1.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println("]");
                        System.out.print("Изначальный второй массив: [");
                        for (int i = 0; i < array2.length; i++) {
                            System.out.print(array2[i]);
                            if (i < array2.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println("]");
                        int [] result19 = program.concat(array1, array2);
                        System.out.print("Массив объединения: [");
                        for (int i = 0; i < result19.length; i++) {
                            System.out.print(result19[i]);
                            if (i < result19.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println("]");
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 20: {
                        System.out.println("\nУдаление отрицательных эл-тов");
                        int size = 0;
                        boolean validInput20 = false;
                        while (!validInput20){
                            System.out.print("Введите размер массива: ");
                            if (scanner.hasNextInt()) {
                                size = scanner.nextInt();
                                if (size >= 0){
                                    validInput20 = true;
                                }
                                else {
                                    System.out.println("Недопустимый ввод. Размер не может быть отрицательным.");
                                }
                            }
                            else {
                                System.out.println("Недопустимой ввод.");
                                scanner.next();
                            }
                        }
                        int[] array = new int[size];
                        System.out.println("Введите " + size + " элементов массива:");
                        if (scanner.hasNextLine()) {
                            scanner.nextLine();
                        }
                        for (int i = 0; i < size; i++) {
                            while (true) {
                                System.out.print("Элемент " + (i + 1) + ": ");
                                String input = scanner.nextLine().trim();
                                try {
                                    array[i] = Integer.parseInt(input); //из строки в число
                                    break;
                                }
                                catch (NumberFormatException e) { //автоматическая проверка ввода
                                    System.out.println("Недопустимый ввод. Введите целое число.");
                                }
                            }
                        }
                        System.out.print("Изначальный массив: [");
                        for (int i = 0; i < array.length; i++) {
                            System.out.print(array[i]);
                            if (i < array.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println("]");
                        int [] result20 = program.deleteNegative(array);
                        System.out.print("Массив объединения: [");
                        for (int i = 0; i < result20.length; i++) {
                            System.out.print(result20[i]);
                            if (i < result20.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println("]");
                        System.out.println("----------------------------------------------------------------------------------\n");
                        break;
                    }
                    case 0: {
                        System.out.println("\nВыход из программы.");
                        run = false;
                        break;
                    }
                    default:
                        System.out.println("\nНедопустимый выбор.\n"); break;
                }
            }
            else {
                System.out.println("\nНедопустимый выбор.\n");
                scanner.next();

            }
        }
        System.out.println("Программа завершена.");
        scanner.close();

    }
}
