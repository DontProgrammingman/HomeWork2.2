public class Hufflepuff extends Hogwarts{
    private int industrious;
    private int devotees;
    private int honest;

    public Hufflepuff(String name, String secondName, int powerMagic, int distanceTransgression, int industrious,
                      int devotees, int honest){
        super(name, secondName, powerMagic, distanceTransgression);
        this.industrious = industrious;
        this.devotees = devotees;
        this.honest = honest;
    }

    public int getIndustrious() {
        return industrious;
    }

    public int getDevotees() {
        return devotees;
    }

    public int getHonest() {
        return honest;
    }

    public void setIndustrious(int industrious) {
        this.industrious = industrious;
    }

    public void setDevotees(int devotees) {
        this.devotees = devotees;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public String sravniHufflepuff(Hufflepuff another){
        int pointOneHufflepuff = this.getIndustrious() + this.getDevotees() + this.getHonest();
        int pointTwoHufflepuff = another.getIndustrious() + another.getDevotees() + another.getHonest();
        if(pointTwoHufflepuff > pointOneHufflepuff)
            return another.getName() + " лучше слизерин чем " + this.getName();
        else if(pointTwoHufflepuff < pointOneHufflepuff)
            return another.getName() + " лучше слизерин чем " + this.getName();
        else
            return "Они ровны";
    }

    @Override
    public String toString(){
        return "Имя: " + this.getName() + "\n" +
                "Фамилия: " + this.getSecondName() + "\n" +
                "Трудолюбие: " + this.getIndustrious() + "\n" +
                "Верность: " + this.getDevotees() + "\n" +
                "Честность: " + this.getHonest() + "\n";
    }
}
