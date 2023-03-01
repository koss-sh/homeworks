package OOP_part_1;

import java.io.PrintStream;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String faculty, int magicPower, int apparitionDistance, int nobility, int honor, int bravery) {
        super(name, faculty, magicPower, apparitionDistance);
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
    public static void printStudent (Gryffindor student) {
        System.out.println(student.getName() + ", " + student.getFaculty()
                + ", cила магии: " + student.getMagicPower()
                + " баллов, трансгрессия: " + student.getApparitionDistance()
                + " баллов, благородство: " + student.getNobility() + " баллов, честь: " + student.getHonor()
                + " баллов, храбрость: " + student.getBravery() + " баллов");
    }
    public static void compare2Gryffindors (Gryffindor s1, Gryffindor s2) {
        int sum1 = s1.getNobility() + s1.getHonor() + s1.getBravery();
        int sum2 = s2.getNobility() + s2.getHonor() + s2.getBravery();
        if(sum1 > sum2) {
            System.out.println(s1.getName() + " лучший " + s1.getFaculty() + ", чем " + s2.getName());
        } else if (sum1 < sum2) {
            System.out.println(s2.getName() + " лучший " + s1.getFaculty() + ", чем " + s1.getName());
        } else {
            System.out.println(s1.getName() + " и " + s2.getName() + " равны");
        }
    }

}

