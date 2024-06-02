public class Main {
    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Гарри Поттер", 23, 42, 65, 23, 100);
        Griffindor hermy = new Griffindor("Гермиона Грейнджер", 45, 13, 56, 61, 76);
        Griffindor rohn = new Griffindor("Рон Уизли", 34, 12, 4, 56, 98);
        Slizerin drako = new Slizerin("Драко Малфой", 23, 56, 87, 90, 43, 23, 100);
        Slizerin grah = new Slizerin("Грэхэм Монтегю", 23, 12, 67, 23, 56, 98, 43);
        Slizerin greg = new Slizerin("Грегори Гойл", 54, 17, 82, 26, 83, 24, 56);
        Puffendooy zahar = new Puffendooy("Захария Смит", 82, 26, 83, 24, 56);
        Puffendooy diggor = new Puffendooy("Седрик Диггори", 68, 1, 51, 98, 45);
        Puffendooy just = new Puffendooy("Джастин Финч-Флетчли", 92, 12, 46, 80, 23);
        Kogtewran chang = new Kogtewran("Чжоу Чанг", 91, 46, 92, 25, 85, 32);
        Kogtewran padme = new Kogtewran("Падма Патил", 36, 49, 90, 28, 27, 56);
        Kogtewran markus = new Kogtewran("Маркус Белби", 27, 17, 47, 91, 83, 71);
        greg.printStudent();
        harry.printStudent();
        diggor.printStudent();
        markus.printStudent();
        harry.compareInFaculty(hermy);
        harry.compareInFaculty(drako);
        grah.compareInFaculty(drako);
        zahar.compareInFaculty(just);
        markus.compareInFaculty(chang);
        rohn.compareInGeneral(padme);
    }
}