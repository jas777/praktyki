package com.labseven.jas777;

public class ExerciseTwo {

    public static void main(String[] args) {

        Bakery bakery = new Bakery("Oliwska 12C", Size.SMALL, new String[]{
                "Bagietka",
                "Kajzerka",
                "Pączek",
                "Kremówka papieska",
                "Kremówka niepapieska"
        });

        Bookshop bookshop = new Bookshop("Reja 25", Size.HUGE, new String[]{
                "Ogniem i Mieczem",
                "Krzyżacy",
                "Karmazynowy Przypływ",
                "Harry Potter",
                "Twilight: Saga"
        });

        System.out.println(bakery.getInformation());
        System.out.println();
        System.out.println(bookshop.getInformation());

    }

}
