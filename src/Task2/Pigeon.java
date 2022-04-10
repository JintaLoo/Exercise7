package Task2;

public class Pigeon extends Bird
{
    private String spices;

    public Pigeon()
    {
        super();
        spices="-";
    }

    public Pigeon(String name,int age,int weight,String featherColor, String spices)
    {   super(name,age,weight,featherColor);
        this.spices=spices;
    }

    public Pigeon(int age,String featherColor,String spices)
    {
        super(age,featherColor);
        this.spices=spices;
    }

    //Special method
    public void longTimeAGo()
    {System.out.println("The Pigeons used to transport the letter");}

    @Override
    public void getVoice()
    {System.out.println("The Pigeons make a prolonged cooing sound");}

    @Override
    public void eat(String Food)
    {System.out.println("It eats" + Food);}

    public String getSpices()
    {return spices;}
    public void setSpices(String spices)
    {this.spices=spices;}

    @Override
    public String toString()
    {
        return "Fish{ Spices = "+spices+'\''+'}';
    }

}
