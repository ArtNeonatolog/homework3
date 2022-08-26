public class Main {
    public static void main(String[] args) {
        int a = 120000;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 120;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 32000;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 486890768L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 1.456789f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 2.4567890987;
        System.out.println("Значение переменной f с типом double равно " + f);


        float one = 27.12f;
        long two = 987678965549L;
        byte three = 2;
        short four = 786;
        boolean five = false;
        int six = 569;
        short seven = -159;
        int eight = 27897;
        byte nine = 67;


        byte teacherOne = 23;
        byte teacherTwo = 27;
        byte teacherThree = 30;
        int generalStudents = teacherOne + teacherTwo + teacherThree;
        int generalPapers = 480;
        int oneStudent = generalPapers / generalStudents;
        System.out.println("На каждого ученика рассчитано " + oneStudent + " листов бумаги");


        byte bottles = 16;
        byte time1 = 2;
        int bottlesOneMinute = bottles / time1;
        byte time2 = 20;
        int bottlesTwentyMinute = bottlesOneMinute * time2;
        System.out.println("За " + time2 + " минут " + "машина произвела бутылок " + bottlesTwentyMinute + " штук");
        short time3 = 24 * 60;
        int bottlesDay = bottlesOneMinute * time3;
        System.out.println("За сутки машина произвела бутылок " + bottlesDay + " штук");
        short time4 = 24 * 60 * 3;
        int bottlesThreeDays = bottlesOneMinute * time4;
        System.out.println("За 3 дня машина произвела бутылок " + bottlesThreeDays + " штук");
        int time5 = 24 * 60 * 30;
        int bottlesMonth = bottlesOneMinute * time5;
        System.out.println("За месяц машина произвела бутылок " + bottlesMonth + " штук");


        byte whitePaintForOneClass = 2;
        byte brownPaintForOneClass = 4;
        byte paintsForSchool = 120;
        int generalPaintForOneClass = whitePaintForOneClass + brownPaintForOneClass;
        int classesSchool = paintsForSchool / generalPaintForOneClass;
        int whitePaintBuy = classesSchool * whitePaintForOneClass;
        int brownPaintBuy = classesSchool * brownPaintForOneClass;
        System.out.println("В школе, где " + classesSchool + " классов, нужно " + whitePaintBuy + " банок белой краски и " + brownPaintBuy + " банок коричневой краски");


        byte bananas = 5;
        byte weightOneBanana = 80;
        int generalWeightBananas = bananas * weightOneBanana;
        short milk100Ml = 2;
        byte weightMilk100Ml = 105;
        int generalWeightMilk = milk100Ml * weightMilk100Ml;
        byte iceCream = 2;
        byte weightOneIceCream = 100;
        int generalWeightIceCream = iceCream * weightOneIceCream;
        byte eggs = 4;
        byte weightEgg = 70;
        int generalWeightEggs = eggs * weightEgg;
        float generalWeightBreakfast = generalWeightBananas + generalWeightMilk + generalWeightIceCream + generalWeightEggs;
        short oneKilogram = 1000;
        float weightBreakfastInKilograms = generalWeightBreakfast / 1000;
        System.out.println("Общий вес спорт-завтрака " + weightBreakfastInKilograms + " килограмм");


        short lossWeightNeedKg = 7;
        System.out.println("Спортсмену нужно сбросить " + lossWeightNeedKg + " килограмм");
        int lossWeightNeedGram = lossWeightNeedKg * oneKilogram;
        System.out.println("Это " + lossWeightNeedGram + " грамм");
        short lossWeightPerDay1 = 250;
        int lossWeightDays1 = lossWeightNeedGram / lossWeightPerDay1;
        System.out.println("Если спортсмен каждый день будет худеть на " + lossWeightPerDay1 + " грамм, то,чтобы сбросить 7 кг ему понадобится " + lossWeightDays1 + " дней");
        short lossWeightPerDay2 = 500;
        int lossWeightDays2 = lossWeightNeedGram / lossWeightPerDay2;
        System.out.println("Если спортсмен каждый день будет худеть на " + lossWeightPerDay2 + " грамм, то,чтобы сбросить 7 кг ему понадобится " + lossWeightDays2 + " дней");
        int lossWeightPerDaySum = lossWeightPerDay1 + lossWeightPerDay2;
        float lossWeightPerDayAverage = lossWeightPerDaySum / 2;
        float lossWeightDaysAverage = lossWeightNeedGram / lossWeightPerDayAverage;
        System.out.println("В среднем спортсмену понадобится " + lossWeightDaysAverage + " дней,чтобы сбросить 7 кг");


        int salaryMasha = 67760;
        System.out.println("Маша получала " + salaryMasha + " рублей в месяц");
        int salaryMashaGrowth = salaryMasha / 100 * 110;
        System.out.println("Маша получает теперь " + salaryMashaGrowth + " рублей в месяц");
        int salaryYearMasha = salaryMasha * 12;
        int salaryYearMashaGrowth = salaryMashaGrowth * 12;
        int differentSalaryYearMasha = salaryYearMashaGrowth - salaryYearMasha;
        System.out.println("Годовой доход Маши вырос на " + differentSalaryYearMasha + " рублей");

        int salaryDenis = 83690;
        System.out.println("Денис получал " + salaryDenis + " рублей в месяц");
        int salaryDenisGrowth = salaryDenis / 100 * 110;
        System.out.println("Денис получает теперь " + salaryDenisGrowth + " рублей в месяц");
        int salaryYearDenis = salaryDenis * 12;
        int salaryYearDenisGrowth = salaryDenisGrowth * 12;
        int differentSalaryYearDenis = salaryYearDenisGrowth - salaryYearDenis;
        System.out.println("Годовой доход Дениса вырос на " + differentSalaryYearDenis + " рублей");

        int salaryKristina = 76230;
        System.out.println("Кристина получала " + salaryKristina + " рублей в месяц");
        int salaryKristinaGrowth = salaryKristina / 100 * 110;
        System.out.println("Кристина получает теперь " + salaryKristinaGrowth + " рублей в месяц");
        int salaryYearKristina = salaryKristina * 12;
        int salaryYearKristinaGrowth = salaryKristinaGrowth * 12;
        int differentSalaryYearKristina = salaryYearKristinaGrowth - salaryYearKristina;
        System.out.println("Годовой доход Кристины вырос на " + differentSalaryYearKristina + " рублей");





















    }
}