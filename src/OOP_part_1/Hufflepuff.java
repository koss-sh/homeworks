package OOP_part_1;

public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int fidelity;
    private int honesty;

    public Hufflepuff(String name, String faculty, int magicPower, int apparitionDistance,
                      int diligence, int fidelity, int honesty) {
        super(name, faculty, magicPower, apparitionDistance);
        this.diligence = diligence;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getFidelity() {
        return fidelity;
    }

    public void setFidelity(int fidelity) {
        this.fidelity = fidelity;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public static void printStudent (Hufflepuff student) {
        System.out.println(student.getName() + ", " + student.getFaculty()
                + ", cила магии: " + student.getMagicPower()
                + " баллов, трансгрессия: " + student.getApparitionDistance()
                + " баллов, трудолюбие: " + student.getDiligence() + " баллов, верность: " +
                student.getFidelity() + " баллов, честность: " + student.getHonesty() + " баллов");
    }
    public static void compare2Hufflepuffs (Hufflepuff s1, Hufflepuff s2) {
        int sum1 = s1.getDiligence() + s1.getFidelity() + s1.getHonesty();
        int sum2 = s2.getDiligence() + s2.getFidelity() + s2.getHonesty();
        if(sum1 > sum2) {
            System.out.println(s1.getName() + " лучший " + s1.getFaculty() + ", чем " + s2.getName());
        } else if (sum1 < sum2) {
            System.out.println(s2.getName() + " лучший " + s1.getFaculty() + ", чем " + s1.getName());
        } else {
            System.out.println(s1.getName() + " и " + s2.getName() + " равны");
        }
    }
}