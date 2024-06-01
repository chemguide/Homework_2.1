public abstract class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return this.name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public abstract int countScore();

    public void compareInGeneral(Hogwarts student) {
        if (this.magicPower > student.magicPower) {
            System.out.println(this.name + " обладает большей мощностью магии, чем " + student.name);
        } else {
            System.out.println(student.name + " обладает большей мощностью магии, чем " + this.name);
        }
        if (this.transgressionDistance > student.transgressionDistance) {
            System.out.println(this.name + " обладает большим расстоянием трансгрессии, чем " + student.name);
        } else {
            System.out.println(student.name + " обладает большим расстоянием трансгрессии, чем " + this.name);
        }

    }

    public void compareInFaculty(Hogwarts student) {
        if (this.getClass() != student.getClass()) {
            System.out.println(this.name + " и " + student.getName() + " - студенты из разных факультетов!");
            return;
        }
        String faculty = this.getClass().toString().substring(6);
        if (this.countScore() > student.countScore()) {
            System.out.println(this.getName() + " лучший " + faculty + "'ец, чем " + student.getName());
        } else {
            System.out.println(student.getName() + " лучший " + faculty + "'ец, чем " + this.getName());
        }
    }
}
