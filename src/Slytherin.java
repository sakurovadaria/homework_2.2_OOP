import java.util.Objects;

public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int thePowerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, thePowerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && thirstForPower == slytherin.thirstForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, resourcefulness, thirstForPower);
    }

    @Override
    public String toString() {
        return "Slytherin: " + "Хитрость =" + cunning + ", Решительность ="
                + determination + ", Амбициозность =" + ambition + ", Находчивость ="
                + resourcefulness + ", Жажда власти =" + thirstForPower + ".\n";
    }


    // Метод для сравнения учеников Слизерина
    public static void compareSlytherin(Slytherin student1, Slytherin student2, Slytherin student3) {
        int score1 = student1.cunning + student1.ambition + student1.resourcefulness + student1.thirstForPower + student1.determination;
        int score2 = student2.cunning + student2.ambition + student2.resourcefulness + student2.thirstForPower + student2.determination;
        int score3 = student3.cunning + student3.ambition + student3.resourcefulness + student3.thirstForPower + student3.determination;

        if (score1 > score2 && score1 > score3) {
            System.out.println(student1.getName() + " - лучший ученик Слизерин.\n");
        } else if (score1 < score2 && score2 > score3) {
            System.out.println(student2.getName() + " - лучший ученик Слизерин.\n");
        } else if (score1 < score3 && score2 < score3) {
            System.out.println(student2.getName() + " - лучший ученик Слизерин.\n");
        } else {
            System.out.println("Both are equally good Slytherin.");
        }
    }
}
