package OOP_part_1;

public class Ravenclaw extends Hogwarts {

    private int intelligence;
    private  int wisdom;
    private int humor;
    private int creativity;

    public Ravenclaw(String name, String faculty, int magicPower, int apparitionDistance,
                     int intelligence, int wisdom, int humor, int creativity) {
        super(name, faculty, magicPower, apparitionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.humor = humor;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getHumor() {
        return humor;
    }

    public void setHumor(int humor) {
        this.humor = humor;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public static void printStudent (Ravenclaw student) {
        System.out.println(student.getName() + ", " + student.getFaculty()
                + ", cила магии: " + student.getMagicPower()
                + " баллов, трансгрессия: " + student.getApparitionDistance()
                + " баллов, ум: " + student.getIntelligence() + " баллов, мудрость: " +
                student.getWisdom() + " баллов, остроумие: " + student.getHumor()
                + " баллов, креативность: " + student.getCreativity() + " баллов");
    }
    public static void compare2Ravenclaws (Ravenclaw s1, Ravenclaw s2) {
        int sum1 = s1.getIntelligence() + s1.getWisdom() + s1.getHumor() + s1.getCreativity();
        int sum2 = s2.getIntelligence() + s2.getWisdom() + s2.getHumor() + s2.getCreativity();
        if(sum1 > sum2) {
            System.out.println(s1.getName() + " лучший " + s1.getFaculty() + ", чем " + s2.getName());
        } else if (sum1 < sum2) {
            System.out.println(s2.getName() + " лучший " + s1.getFaculty() + ", чем " + s1.getName());
        } else {
            System.out.println(s1.getName() + " и " + s2.getName() + " равны");
        }
    }
}