package OOP_part_1;

public class Hogwarts {

    private String name;
    private String faculty;
    private int magicPower;
    private int apparitionDistance;

    public Hogwarts(String name, String faculty, int magicPower, int apparitionDistance) {
        this.name = name;
        this.faculty = faculty;
        this.magicPower = magicPower;
        this.apparitionDistance = apparitionDistance;
    }

     public void printStudent() {
        System.out.println(getName() + ", " + getFaculty()
                + ", cила магии: " + getMagicPower() + " баллов, трансгрессия: "
                + getApparitionDistance() + " баллов.");
    }
    public static void compare2Students(Hogwarts s1, Hogwarts s2) {
        if(s1.getMagicPower() > s2.getMagicPower()) {
            System.out.println(s1.getName() + " обладает большей силой магии, чем " + s2.getName());
        } else if (s1.getMagicPower() < s2.getMagicPower()) {
            System.out.println(s2.getName() + " обладает большей силой магии, чем " + s1.getName());
        } else {
            System.out.println(s1.getName() + " и " + s2.getName() + " равны по силе магии");
        }
        if(s1.getApparitionDistance() > s2.getApparitionDistance()) {
            System.out.println(s1.getName() + " обладает большей трансгрессией, чем " + s2.getName());
        } else if (s1.getApparitionDistance() < s2.getApparitionDistance()) {
            System.out.println(s2.getName() + " обладает большей трансгрессией, чем " + s1.getName());
        } else {
            System.out.println(s1.getName() + " и " + s2.getName() + " равны по трансгрессии");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getApparitionDistance() {
        return apparitionDistance;
    }

    public void setApparitionDistance(int apparitionDistance) {
        this.apparitionDistance = apparitionDistance;
    }
}

