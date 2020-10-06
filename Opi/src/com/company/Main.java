package com.company;

public class Main {

    public static void main(String[] args) {
        Gromad ivan = new Gromad();
        ivan.vivod();

        Gromad vika = new Gromad("Соколова", "Вікторія", 25);
        vika.vivod();

        Gromad vadik = new Gromad("Блаженко","Вадік", 37, "Завод ЗІЛ", "Привитий");
        vadik.vivod();

        Gromad yura = new Gromad("Олійник", "Юра", 67, "Журналіст", "Непривитий");
        yura.vivod();

        Gromad vanya = new Gromad();
        vanya.vivod();

        Gromad sasha = new Gromad("Власенко", "Олександра", 16, "Студент", "Привита");
        sasha.vivod();
        
    }
}
