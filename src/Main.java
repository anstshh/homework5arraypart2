public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        // Задание 1.

        int[] newArray = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum = sum + newArray[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        //Задание 2.

        int[] arrayValue = generateRandomArray();
        int max = arrayValue[0];
        int min = arrayValue[0];
        for (int j : arrayValue) {
            if (j > max)
                max = j;
            if (j < min)
                min = j;
        }
        System.out.println(" Максимальная сумма трат за день составила " + max + " рублей ");
        System.out.println(" Минимальная сумма трат за день составила " + min + " рублей ");

        // Задание 3.

        double average = 0;
        int sumAll = 0;
        for (int s = 0; s < newArray.length; s++) {
            sumAll = sumAll + newArray[s];
            average = sumAll / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //Задание 4.

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char[] fullName = new char[reverseFullName.length];
        for (char i = 0; i < reverseFullName.length; i++) {
            fullName[reverseFullName.length - 1 - i] = reverseFullName[i];
        }
        reverseFullName = fullName;
        System.out.println(reverseFullName);


    }


}

























