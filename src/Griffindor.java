import java.util.Objects;

public class Griffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int thePowerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, thePowerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Griffindor that = (Griffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }

    @Override
    public String toString() {
        return  "Griffindor: " + "Благородство =" + nobility +
                ", Честь =" + honor + ", Храбрость =" + bravery + ".\n";

    }

    // Метод для сравнения учеников Гриффиндора
    public static void compareGryffindors(Griffindor student1, Griffindor student2, Griffindor student3) {
        int score1 = student1.bravery + student1.honor + student1.nobility;
        int score2 = student2.bravery + student2.honor + student2.nobility;
        int score3 = student3.bravery + student3.honor + student3.nobility;

        if (score1 > score2 && score1 > score3) {
            System.out.println(student1.getName() + " - лучший ученик Гриффиндор.\n");
        } else if (score1 < score2 && score2 > score3) {
            System.out.println(student2.getName() + " - лучший ученик Гриффиндор.\n");
        } else if (score1 < score3 && score2 < score3) {
            System.out.println(student2.getName() + " - лучший ученик Гриффиндор.\n");
        } else {
            System.out.println("Both are equally good Gryffindors.");
        }
    }



}
