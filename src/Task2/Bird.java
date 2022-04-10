package Task2;

public class Bird extends Animal
{
    private String featherColor;

    public Bird()
    {
        super();
        featherColor="-";
    }

    public Bird(String name,int age,int weight, String featherColor)
    {
        super(name,age,weight);
        this.featherColor=featherColor;
    }

    public Bird(int age,String featherColor)
    {
        super(age);
        this.featherColor=featherColor;
    }
    //Special method
    public void Rest()
    {System.out.println("Bird can not sleep while flying");}

    @Override
    public void getVoice()
    {System.out.println("Bird is making good voice");}

    @Override
    public void eat(String Food)
    {System.out.println("It eats" + Food);}

    public String getFeatherColor()
    {return featherColor;}
    public void setFeatherColor(String featherColor)
    {this.featherColor=featherColor;}

    @Override
    public String toString()
    {
        return "Bird{ FeatherColor = "+featherColor+'\''+'}';
    }
}
