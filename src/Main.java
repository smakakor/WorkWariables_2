public class Main {
    public static void main(String[] args) {
        //Зданание 1
        System.out.println("Задание 1");
        byte one = 1;
        System.out.println("Значение переменной one с типом byte равно " + one);
        short two = 2;
        System.out.println("Значение переменной two с типом byte равно " + two);
        int free = 3;
        System.out.println("Значение переменной freeс типом byte равно " + free);
        long four = 4L;
        System.out.println("Значение переменной four с типом byte равно " + four);
        float five = 5.0f;
        System.out.println("Значение переменной five с типом byte равно " + five);
        double six = 6.0;
        System.out.println("Значение переменной six с типом byte равно " + six);

        //Задание 2
        System.out.println("Задание 2");
        float number_1 = 27.12f;
        System.out.println(number_1);
        long number_2 = 987_678_965_549L;
        System.out.println(number_2);
        double number =2.786;
        System.out.println(number);
        boolean big = false;
        System.out.println(big);
        short number_3 = 569;
        System.out.println(number_3);
        short number_4 = -159;
        System.out.println(number_4);
        short number_5 = 27897;
        System.out.println(number_5);
        byte number_6 = 67;
        System.out.println(number_6);

        //Задание 3
        System.out.println("Задание 3");
        byte teacher_1 = 23;
        byte teacher_2 = 27;
        byte teacher_3 = 30;
        short paper = 480;
        int student = teacher_1 + teacher_2 + teacher_3;
        int paperStudent = paper / student;
        System.out.println("Каждый ученик получит по " + paperStudent +" листов бумаги");

        //Задание 4
        System.out.println("Задание 4");
        byte bottles = 16;
        int time = 2;
        bottles /= time;  // Количество бутылок за 1 минуту
        System.out.println("Количество бутылок за 1 минуту равно "+ bottles +" штук");
        time = 20;
        int totalBottle = bottles * time;
        System.out.println("За 20 минут машина произвела бутылок " + totalBottle + " штук");
        time = 24 * 60; // Количество минут в одном дне
        totalBottle = bottles * time;
        System.out.println("За 1 день машина произвела бутылок " + totalBottle + " штук");
        time *= 3; // Количество минут в 3 днях
        totalBottle = bottles * time;
        System.out.println("За 3 дня машина произвела бутылок " + totalBottle + " штук");
        time *= 10; // Количество минут в месяце
        totalBottle = bottles * time;
        System.out.println("За месяц машина произвела бутылок " + totalBottle + " штук");

        //Задание 5
        System.out.println("Задание 5");
        byte totalBanks = 120; // Всего банок нужно
        byte whiteBanks = 2;
        byte brownBanks = 4;
        int forOneClass = whiteBanks + brownBanks; // Количество банок на 1 класс
        int totalClasses = totalBanks / forOneClass; // Количество клаасов
        int totalWhiteBanks = whiteBanks * totalClasses; // Всего нужно белой красаски
        int totalBrownBanks = brownBanks * totalClasses; // Всего  нужно коричневой краски
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteBanks + " банок белой краски и "
                + totalBrownBanks + " банок коричневой краски");

        //Задание 6
        System.out.println("Задание 6");
        byte banana = 5;  // Количество баннанов
        byte gramsForBanana = 80; // Количество грам в одном банане
        short milk = 200; // Количество молока в мл
        byte gramsForMilk = 105; // Количество грам в 100 мл молока
        int amountMilk = milk / 100;
        byte iceCream = 2; // Количество брекетов мороженого
        byte gramsForIceCream = 100; // Количсетво грамм в одном бректе мороженого
        byte eggs = 4; // Количество яиц
        byte gramsForEggs = 70; // Количество грамм в одном яйце
        int totalGrams = (banana * gramsForBanana) + (amountMilk * gramsForMilk) +
                (iceCream * gramsForIceCream) + (eggs * gramsForEggs); // Всего грамов в коктеле
        System.out.println("В коктеле " + totalGrams + " грам или же " + (totalGrams/1000f) + " кг" );

        //Задание 7
        System.out.println("Задание 7");
        byte wightSportsMen = 7; // Нужно сбросить (кг)
        short diet_1 = 250; // Теряет каждый день по первой диете (гр)
        short diet_2 = 500; // Теряет каждый день по второй диете (гр)
        int dayDiet_1 = (wightSportsMen * 1000) / diet_1; // Понадобится дней для первой диете
        int dayDiet_2 = (wightSportsMen * 1000) / diet_2; // Понадобится дней для второй диете
        int day = (dayDiet_1+dayDiet_2)/2;
        System.out.println("Для первой диеты понадобится " + dayDiet_1 + " дней, а для второй диеты "
                + dayDiet_2 + " дней, а если в среднем " + day + "дней");

        //Задание 8
        System.out.println("Задание 8");
        int maha = 67_760;  // Получает на данный момент
        int denis = 83_690;  // Получает на данный момент
        int kris = 76_230;  // Получает на данный момент
        int mahaYears = maha * 12;
        int denisYears = denis * 12;
        int krisYears = kris * 12;
        maha *= 1.1; // Получает с повышение зп на 10% от текущей
        denis *= 1.1; // Получает с повышение зп на 10% от текущей
        kris *= 1.1; // Получает с повышение зп на 10% от текущей
        double mahaYears10 = mahaYears * 1.1f;
        double denisYears10 = mahaYears *  1.1f;
        double krisYears10 = mahaYears * 1.1f;
        System.out.println("Маша теперь получает " + maha + " рублей. Годовой доход вырос на " + (mahaYears10 % mahaYears) + " рублей");
        System.out.println("Маша теперь получает " + denis + " рублей. Годовой доход вырос на " + (denisYears10 % denisYears) + " рублей");
        System.out.println("Маша теперь получает " + kris + " рублей. Годовой доход вырос на " + (krisYears10 % krisYears) + " рублей");

    }
}