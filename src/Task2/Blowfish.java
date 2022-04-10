package Task2;

public class Blowfish extends Fish
{
    private String diameter;

    Blowfish()
    {
        super();
        diameter="-";
    }

    public Blowfish(String name,int age,int weight,String scaleColor, String diameter)
    {   super(name,age,weight,scaleColor);
        this.diameter=diameter;
    }

    public Blowfish(int age,String scaleColor,String diameter)
    {
        super(age,scaleColor);
        this.diameter=diameter;
    }


    //Special method
    public void Attack()
    {System.out.println("Blowfish has a poison inside the body");}

    @Override
    public void getVoice()
    {System.out.println("It cannot make sound");}

    @Override
    public void eat(String Food)
    {System.out.println("It eats "+Food);}

    public String getDiameter()
    {return diameter;}
    public void setDiameter(String diameter)
    {this.diameter=diameter;}

    @Override
    public String toString()
    {
        return "Dog{ breed = "+diameter+'\''+'}';
    }
}
