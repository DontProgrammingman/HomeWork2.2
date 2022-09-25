public class Main {
    public static void main(String[] args) {
        Slytherin drakoMalfoe = new Slytherin("Драко", "Малфой", 5, 3, 12,
                17, 20, 50, 37);
        Gryffindor harryPotter = new Gryffindor("Гарри", "Поттер", 7, 15, 3,
                14, 17);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона", "Грейнджер", 5, 14,
                5, 5, 6);
        Gryffindor ronWeasley = new Gryffindor("Рон", "Уизли", 10, 3, 3,
                6, 5);
        Slytherin grahamMontagu = new Slytherin("Грэхэм", "Монтегю", 10, 5, 21,
                4, 2, 10, 5);
        Slytherin gregoryGoyle = new Slytherin("Грегори", "Гойл", 1, 16, 2,
                5, 9, 3, 54);
        Hufflepuff zachariahSmith = new Hufflepuff("Захария", "Смит", 19, 19, 20,
                3, 19);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик", "Диггори", 19, 1, 54,
                90, 1);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин", "Финч-Флетчли", 3, 5,
                19, 2, 4);
        Ravenclaw zhouChang = new Ravenclaw("Чжоу", "Чанг", 39, 1, 65, 2,
                1, 4);
        Ravenclaw padmaPatil = new Ravenclaw("Падма", "Патил", 1, 1, 5, 1,
                4, 5);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус", "Белби", 1, 4, 5, 1,
                2, 5);
        System.out.println(drakoMalfoe);
        System.out.println(drakoMalfoe.HogwartssravniStudent(harryPotter));
        System.out.println(drakoMalfoe.sravniSletherin(gregoryGoyle));
    }
}