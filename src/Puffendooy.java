public class Puffendooy extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Puffendooy(String name, int magicPower, int transgressionDistance, int hardWork, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public int countScore() {
        return this.hardWork + this.loyalty + this.honesty;
    }

    public void printStudent() {
        System.out.println("Имя: " + this.getName());
        System.out.println("Факультет: Пуффендуй");
        System.out.println("Сила магии: " + this.getMagicPower());
        System.out.println("Расстояние трансгрессии: " + this.getTransgressionDistance());
        System.out.println("Трудолюбие: " + this.hardWork);
        System.out.println("Верность: " + this.loyalty);
        System.out.println("Честность: " + this.honesty);
    }
}
