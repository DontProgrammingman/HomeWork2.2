public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String name, String secondName, int powerMagic, int distanceTransgression, int nobility,
                      int honour, int bravery){
        super(name, secondName, powerMagic, distanceTransgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    public String sravniGryffindor(Gryffindor another){
        int pointOneGryffindor = this.getNobility() + this.getHonour() + this.getBravery();
        int pointTwoGryffindor = another.getNobility() + another.getHonour() + another.getBravery();
        if(pointTwoGryffindor > pointOneGryffindor)
            return another.getName() + " лучше слизерин чем " + this.getName();
        else if(pointTwoGryffindor < pointOneGryffindor)
            return another.getName() + " лучше слизерин чем " + this.getName();
        else
            return "Они ровны";
    }

    @Override
    public String toString(){
        return "Имя: " + this.getName() + "\n" +
                "Фамилия: " + this.getSecondName() + "\n" +
                "Благородство: " + this.getNobility() + "\n" +
                "Честь: " + this.getHonour() + "\n" +
                "Храбрость: " + this.getBravery() + "\n";
    }
}
