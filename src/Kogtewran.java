public class Kogtewran extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtewran(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public int countScore() {
        return this.intelligence + this.wisdom + this.wit + this.creativity;
    }

    public void printStudent() {
        System.out.println("Имя: " + this.getName());
        System.out.println("Факультет: Когтевран");
        System.out.println("Сила магии: " + this.getMagicPower());
        System.out.println("Расстояние трансгрессии: " + this.getTransgressionDistance());
        System.out.println("Ум: " + this.intelligence);
        System.out.println("Мудрость: " + this.wisdom);
        System.out.println("Остроумие: " + this.wit);
        System.out.println("Творчество: " + this.creativity);
    }
}
