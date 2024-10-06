import java.util.Objects;

public class Ravenclaw extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creative;

    public Ravenclaw(String name, int thePowerOfMagic, int transgressionDistance, int mind, int wisdom, int wit, int creative) {
        super(name, thePowerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return mind == ravenclaw.mind && wisdom == ravenclaw.wisdom && wit == ravenclaw.wit && creative == ravenclaw.creative;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mind, wisdom, wit, creative);
    }

    @Override
    public String toString() {
        return "Ravenclaw: " + "Ум =" + mind + ", Мудрость =" + wisdom +
                ", Остроумие =" + wit + ", Творчество =" + creative + ".\n";
    }

    public static void compareRavenclaw(Ravenclaw student1, Ravenclaw student2, Ravenclaw student3) {
        int score1 = student1.mind + student1.wisdom + student1.wit + student1.creative;
        int score2 = student2.mind + student2.wisdom + student2.wit + student2.creative;
        int score3 = student3.mind + student3.wisdom + student3.wit + student3.creative;


        if (score1 > score2 && score1 > score3) {
            System.out.println(student1.getName() + " - лучший ученик Когтевран.\n");
        } else if (score1 < score2 && score2 > score3) {
            System.out.println(student2.getName() + " - лучший ученик Когтевран.\n");
        } else if (score1 < score3 && score2 < score3) {
            System.out.println(student2.getName() + " - лучший ученик Когтевран.\n");
        } else {
            System.out.println("Both are equally good Ravenclaw.");
        }
    }
}
