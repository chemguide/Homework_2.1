public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public int countScore() {
        return this.nobility + this.honor + this.bravery;
    }

    public void printStudent() {
        System.out.println("Имя: " + this.getName());
        System.out.println("Факультет: Гриффиндор");
        System.out.println("Сила магии: " + this.getMagicPower());
        System.out.println("Расстояние трансгрессии: " + this.getTransgressionDistance());
        System.out.println("Благородство: " + this.nobility);
        System.out.println("Честь: " + this.honor);
        System.out.println("Храбрость: " + this.bravery);
    }
}
