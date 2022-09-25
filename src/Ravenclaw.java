public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreative;

    public Ravenclaw(String name, String secondName, int powerMagic, int distanceTransgression, int smart,
                     int wise, int witty, int fullOfCreative){
        super(name, secondName, powerMagic, distanceTransgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreative = fullOfCreative;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreative() {
        return fullOfCreative;
    }

    public String sravniRavenclaw(Ravenclaw another){
        int pointOneRavenclaw = this.getSmart() + this.getWise() + this.getWitty() + this.getFullOfCreative();
        int pointTwoRavenclaw = another.getSmart() + another.getWise() + another.getWitty() + another.getFullOfCreative();
        if(pointTwoRavenclaw > pointOneRavenclaw)
            return another.getName() + " лучше слизерин чем " + this.getName();
        else if(pointTwoRavenclaw < pointOneRavenclaw)
            return another.getName() + " лучше слизерин чем " + this.getName();
        else
            return "Они ровны";
    }

    @Override
    public String toString(){
        return "Имя: " + this.getName() + "\n" +
                "Фамилия: " + this.getSecondName() + "\n" +
                "Ум: " + this.getSmart() + "\n" +
                "Мудрость: " + this.getWise() + "\n" +
                "Остроумны: " + this.getWitty() + "\n" +
                "Творчество: " + this.getFullOfCreative() + "\n";
    }
}
