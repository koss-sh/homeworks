package OOP_part_1;

public class Slytherin extends Hogwarts {

    private int cunningness;
    private int decisiveness;
    private int ambitiousness;
    private int ingenuity;
    private int powerPassion;

    public Slytherin(String name, String faculty, int magicPower, int apparitionDistance, int cunningness,
                     int decisiveness, int ambitiousness, int ingenuity, int powerPassion) {
        super(name, faculty, magicPower, apparitionDistance);
        this.cunningness = cunningness;
        this.decisiveness = decisiveness;
        this.ambitiousness = ambitiousness;
        this.ingenuity = ingenuity;
        this.powerPassion = powerPassion;
    }

    public int getCunningness() {
        return cunningness;
    }

    public void setCunningness(int cunningness) {
        this.cunningness = cunningness;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public void setAmbitiousness(int ambitiousness) {
        this.ambitiousness = ambitiousness;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getPowerPassion() {
        return powerPassion;
    }

    public void setPowerPassion(int powerPassion) {
        this.powerPassion = powerPassion;
    }

    public static void printStudent (Slytherin student) {
        System.out.println(student.getName() + ", " + student.getFaculty()
                + ", cила магии: " + student.getMagicPower()
                + " баллов, трансгрессия: " + student.getApparitionDistance()
                + " баллов, хитрость: " + student.getCunningness() + " баллов, решительность: " +
                student.getDecisiveness() + " баллов, амбициозность: " + student.getAmbitiousness()
                + " баллов, находчивость: " + student.getIngenuity() + " баллов, жажда власти: "
                + student.getPowerPassion() + " баллов");
    }
    public static void compare2Slytherins (Slytherin s1, Slytherin s2) {
        int sum1 = s1.getCunningness() + s1.getDecisiveness() + s1.getAmbitiousness()
                + s1.getIngenuity() + s1.getPowerPassion();
        int sum2 = s2.getCunningness() + s2.getDecisiveness() + s2.getAmbitiousness()
                + s2.getIngenuity() + s2.getPowerPassion();
        if(sum1 > sum2) {
            System.out.println(s1.getName() + " лучший " + s1.getFaculty() + ", чем " + s2.getName());
        } else if (sum1 < sum2) {
            System.out.println(s2.getName() + " лучший " + s1.getFaculty() + ", чем " + s1.getName());
        } else {
            System.out.println(s1.getName() + " и " + s2.getName() + " равны");
        }
    }
}