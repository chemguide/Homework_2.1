public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizerin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public int countScore() {
        return this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
    }

    public void compareInFaculty(Slizerin one, Slizerin two) {
        if (one.countScore() > two.countScore()) {
            System.out.println(one.getName() + " лучший слизеринец, чем " + two.getName());
        } else {
            System.out.println(two.getName() + " лучший слизеринец, чем " + one.getName());
        }
    }

    public void printStudent() {
        System.out.println("Имя: " + this.getName());
        System.out.println("Факультет: Слизерин");
        System.out.println("Сила магии: " + this.getMagicPower());
        System.out.println("Расстояние трансгрессии: " + this.getTransgressionDistance());
        System.out.println("Хитрость: " + this.cunning);
        System.out.println("Решительность: " + this.determination);
        System.out.println("Амбициозность: " + this.ambition);
        System.out.println("Находчивость: " + this.resourcefulness);
        System.out.println("Жажда власти " + this.lustForPower);
    }
}
