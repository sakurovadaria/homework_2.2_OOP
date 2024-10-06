import java.util.Objects;

public class Hufflepuff extends Hogwarts{
    private int hardWorking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int thePowerOfMagic, int transgressionDistance, int hardWorking, int loyalty, int honesty) {
        super(name, thePowerOfMagic, transgressionDistance);
        this.hardWorking = hardWorking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWorking() {
        return hardWorking;
    }

    public void setHardWorking(int hardWorking) {
        this.hardWorking = hardWorking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hufflepuff that = (Hufflepuff) o;
        return hardWorking == that.hardWorking && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hardWorking, loyalty, honesty);
    }

    @Override
    public String toString() {
        return "Hufflepuff: " + "Трудолюбие =" + hardWorking +
                ", Верность =" + loyalty + ", Честность =" + honesty + ".\n";
    }

    // Метод для сравнения учеников Пуффендуй
    public static void compareHufflepuff(Hufflepuff student1, Hufflepuff student2, Hufflepuff student3) {
        int score1 = student1.hardWorking + student1.loyalty + student1.honesty;
        int score2 = student2.hardWorking + student2.loyalty + student2.honesty;
        int score3 = student3.hardWorking + student3.loyalty + student3.honesty;

        if (score1 > score2 && score1 > score3) {
            System.out.println(student1.getName() + " - лучший ученик Пуффендуй.\n");
        } else if (score1 < score2 && score2 > score3) {
            System.out.println(student2.getName() + " - лучший ученик Пуффендуй.\n");
        } else if (score1 < score3 && score2 < score3) {
            System.out.println(student2.getName() + " - лучший ученик Пуффендуй.\n");
        } else {
            System.out.println("Both are equally good Hufflepuff.");
        }
    }
}
