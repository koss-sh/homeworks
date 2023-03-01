package OOP_part_1;

import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Gryffindor potter = new Gryffindor ("Гарри Поттер", "Гриффиндорец", RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101));

        Gryffindor granger = new Gryffindor("Гермиона Грейнджер", "Гриффиндорец", RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101));
        Gryffindor weasley = new Gryffindor("Рон Уизли", "Гриффиндорец", RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101));

        Hufflepuff smith = new Hufflepuff("Захария Смит", "Пуффендуец", RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101));

        Hufflepuff diggory = new Hufflepuff("Седрик Диггори", "Пуффендуец", RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101));
        Hufflepuff fletchtley = new Hufflepuff("Джастин Финч-Флетчли", "Пуффендуец", RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101));

        Ravenclaw chang = new Ravenclaw("Чжоу Чанг", "Когтевранец", RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101), RANDOM.nextInt(101));

        Ravenclaw patil = new Ravenclaw("Падма Патил", "Когтевранец", RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101), RANDOM.nextInt(101));
        Ravenclaw belby = new Ravenclaw("Маркус Белби", "Когтевранец", RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101), RANDOM.nextInt(101));
        Slytherin malfoy = new Slytherin("Драко Малфой", "Слизеринец", RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101), RANDOM.nextInt(101),
                RANDOM.nextInt());

        Slytherin montague = new Slytherin("Грэхэм Монтегю", "Слизеринец", RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101), RANDOM.nextInt(101),
                RANDOM.nextInt());
        Slytherin goyle = new Slytherin("Грегори Гойл", "Слизеринец", RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101),
                RANDOM.nextInt(101), RANDOM.nextInt(101), RANDOM.nextInt(101),
                RANDOM.nextInt());

        Gryffindor.printStudent(potter);
        Gryffindor.printStudent(granger);
        Gryffindor.printStudent(weasley);
        Gryffindor.compare2Gryffindors(granger, weasley);
        Slytherin.printStudent(goyle);
        Slytherin.printStudent(malfoy);
        Slytherin.compare2Slytherins(goyle, malfoy);
        Hogwarts.compare2Students(potter,goyle);
    }
}



