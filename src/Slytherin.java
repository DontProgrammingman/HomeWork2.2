public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String secondName, int powerMagic, int distanceTransgression, int cunning,
                     int determination, int ambition, int resourcefulness, int lustForPower){
        super(name, secondName, powerMagic, distanceTransgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public String sravniSletherin(Slytherin another){
        int pointOneSlytherim = this.getAmbition() + this.getCunning() + this.getDetermination() + this.getLustForPower()
                + this.getResourcefulness();
        int pointTwoSlytherin = another.getAmbition() + another.getCunning() + another.getDetermination() + another.getLustForPower()
                + another.getResourcefulness();
        if(pointTwoSlytherin > pointOneSlytherim)
            return another.getName() + " лучше слизерин чем " + this.getName();
        else if(pointTwoSlytherin < pointOneSlytherim)
            return another.getName() + " лучше слизерин чем " + this.getName();
        else
            return "Они ровны";
    }

    @Override
    public String toString(){
        return
                "Имя: " + this.getName() + '\n' +
                "Фамилия: " + this.getSecondName() + '\n' +
                "Хитрость: " + this.getCunning() + '\n' +
                "Решительность: " + this.getDetermination() + '\n' +
                "Амбитиозность: " + this.getAmbition() + '\n' +
                "Находчивость: " + this.getResourcefulness() + '\n' +
                "Жажда власти: " + this.getLustForPower() + "\n";
    }
}
