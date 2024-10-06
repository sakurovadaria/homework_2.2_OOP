import java.util.Objects;

public class Hogwarts {
    private String name;
    private int thePowerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, int thePowerOfMagic, int transgressionDistance) {
        this.name = name;
        this.thePowerOfMagic = thePowerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public void setThePowerOfMagic(int thePowerOfMagic) {
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return thePowerOfMagic == hogwarts.thePowerOfMagic && transgressionDistance == hogwarts.transgressionDistance && Objects.equals(name, hogwarts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, thePowerOfMagic, transgressionDistance);
    }

    @Override
    public String toString() {
        return "Студент Hogwarts: " + name + ", Магическая мощь =" + thePowerOfMagic +
                ", Расстояние трансгрессии =" + transgressionDistance + ".";
    }

    public static void compareHogwartsStudents(Hogwarts student1, Hogwarts student2) {
        int score1 = student1.thePowerOfMagic + student1.transgressionDistance;
        int score2 = student2.thePowerOfMagic + student2.transgressionDistance;

        if (score1 > score2) {
            System.out.println(student1.getName() + " - лучший ученик, чем " + student2.getName() + "\n");
        } else if (score1 < score2) {
            System.out.println(student2.getName() + " - лучший ученик, чем " + student1.getName() + "\n");
        } else {
            System.out.println("Both are equally good Hogwarts.");
        }
    }
}
