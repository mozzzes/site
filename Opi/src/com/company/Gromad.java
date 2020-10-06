package com.company;

public class Gromad {
    String priz;
    String name;
    int age;
    String mwor;
    String nache;

    Gromad()
    {
        priz = "Іванов";
        name = "Іван";
        age = 00;
        mwor = "Непрацює";
        nache = "Непривитий";
    }

    Gromad(String p, String n, int a)
    {
        priz = p;
        name = n;
        age = a;
        mwor = "Непрацює";
        nache = "Непривитий";
    }
    Gromad(String p, String n, int a, String m, String c)
    {
        priz = p;
        name = n;
        age = a;
        mwor = m;
        nache = c;
    }
    void vivod(){
        System.out.println("  Прізвище: " + priz);
        System.out.println("  Ім'я: " + name);
        System.out.println("  Вік: " + age);
        System.out.println("  Місце роботи: " + mwor);
        System.out.println("  Наявність прививки: " + nache);
        System.out.println("     ");
    }
}
