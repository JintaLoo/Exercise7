package Task2;

public class Fish extends Animal
{
    private String scaleColor;

    public  Fish()
    {
        super();
        scaleColor="-";
    }

    public Fish(String name,int age,int weight, String scaleColor)
    {
        super(name,age,weight);
        this.scaleColor=scaleColor;
    }

    public Fish(int age,String scaleColor)
    {
        super(age);
        this.scaleColor=scaleColor;
    }


    //Special method
    public void Lives()
    {System.out.println("Fish can not survive on the surface");}

    @Override
    public void getVoice()
    {System.out.println("Fish is not making sound");}

    @Override
    public void eat(String Food)
    {System.out.println("It eats" + Food);}

    public String getScaleColor()
    {return scaleColor;}
    public void setScaleColor(String scaleColor)
    {this.scaleColor=scaleColor;}

    @Override
    public String toString()
    {
        return "Fish{ Scale-color = "+scaleColor+'\''+'}';
    }
}
