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
        System.out.println(name + ", " + faculty
                + ", cила магии: " + magicPower + " баллов, трансгрессия: "
                + apparitionDistance + " баллов.");
    }
    public static void compare2Students(Hogwarts s1, Hogwarts s2) {
        if(s1.magicPower > s2.magicPower) {
            System.out.println(s1.name + " обладает большей силой магии, чем " + s2.name);
        } else if (s1.magicPower < s2.magicPower) {
            System.out.println(s2.name + " обладает большей силой магии, чем " + s1.getName());
        } else {
            System.out.println(s1.name + " и " + s2.name + " равны по силе магии");
        }
        if(s1.apparitionDistance > s2.apparitionDistance) {
            System.out.println(s1.name + " обладает большей трансгрессией, чем " + s2.name);
        } else if (s1.apparitionDistance < s2.apparitionDistance) {
            System.out.println(s2.name + " обладает большей трансгрессией, чем " + s1.name);
        } else {
            System.out.println(s1.name + " и " + s2.name + " равны по трансгрессии");
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

