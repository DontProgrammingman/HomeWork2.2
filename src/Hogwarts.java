public class Hogwarts {
    private String name;
    private String secondName;
    private int powerMagic;
    private int distanceTransgression;

    public Hogwarts(String name, String secondName, int powerMagic, int distanceTransgression){
        this.powerMagic = powerMagic;
        this.distanceTransgression = distanceTransgression;
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public String getSecondName() {
        return secondName;
    }

    public String HogwartssravniStudent(Hogwarts student){
        int pointSlytherin = this.getPowerMagic() + this.getDistanceTransgression();
        int pointHufflepuff = student.getPowerMagic() + student.getDistanceTransgression();
        if(pointSlytherin < pointHufflepuff)
            return "Победил " + student.getName() + " " + student.getSecondName();
        else if (pointSlytherin > pointHufflepuff)
            return "Победил " + this.getName() + " " + this.getSecondName();
        else
            return "Они равны";
    }
}
