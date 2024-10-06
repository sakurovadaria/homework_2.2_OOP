public class Main {
    public static void main(String[] args) {

        Griffindor[] griffindors = {
                new Griffindor("Гарри Поттер", 5, 50, 5, 5, 6),
                new Griffindor("Гермиона Грейнджер", 8, 80, 6, 4, 8),
                new Griffindor("Рон Уизли", 5, 40, 6, 7, 4),
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", 5, 60, 5, 4, 6, 4, 2),
                new Slytherin("Грэхем Монтегю", 3, 20, 4, 3, 4, 5, 3),
                new Slytherin("Грегори Гойл", 4, 30, 3, 2, 4, 2, 1),
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", 8, 50, 7, 6, 4),
                new Hufflepuff("Седрик Диггори", 7, 85, 5, 7, 8),
                new Hufflepuff("Джастин Финч-Флетчли", 6, 70, 4, 6, 4)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 6, 55, 4, 6, 4, 3),
                new Ravenclaw("Падма Патил", 5, 50, 5, 4, 3, 7),
                new Ravenclaw("Маркус Белби", 4, 60, 7, 6, 3, 2)
        };


        Hogwarts[] students = new Hogwarts[griffindors.length + slytherins.length + hufflepuffs.length + ravenclaws.length];

        int index = 0;
        for (Hogwarts student : griffindors) {
            students[index++] = student;
        }

        for (Hogwarts student : slytherins) {
            students[index++] = student;
        }

        for (Hogwarts student : hufflepuffs) {
            students[index++] = student;
        }

        for (Hogwarts student : ravenclaws) {
            students[index++] = student;
        }

        System.out.println("Студенты Хогвартса: ");
        for (Hogwarts student : students) {
            System.out.print(student.getName() + ", Мощь Магии: " + student.getThePowerOfMagic() +
                    ", Расстояние трансгрессии: " + student.getTransgressionDistance()+ ", Факультет - " + student);
        }
        System.out.println();

        Griffindor.compareGryffindors(griffindors[0], griffindors[1], griffindors[2]);
        Slytherin.compareSlytherin(slytherins[0], slytherins[1],slytherins[2]);
        Hufflepuff.compareHufflepuff(hufflepuffs[0], hufflepuffs[1], hufflepuffs[2]);
        Ravenclaw.compareRavenclaw(ravenclaws[0], ravenclaws[1], ravenclaws[2]);
        Hogwarts.compareHogwartsStudents(students[5], students[8]);

    }
}