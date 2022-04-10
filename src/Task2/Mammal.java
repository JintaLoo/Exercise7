package Task2;

public class Mammal extends Animal
{
    private String order;

    public Mammal()
    {
        super();
        order="-";
    }
    public Mammal(String name,int age,int weight, String order)
    {
        super(name,age,weight);
        this.order=order;
    }
    public Mammal(int age,String order)
    {
        super(age);
        this.order=order;
    }

    //Special method
    public void drinkMilk()
    {System.out.println("Si Si");}

    @Override
    public void getVoice()
    {System.out.println("Mammal is making sound");}

    @Override
    public void eat(String Food)
    {System.out.println("It eats" + Food);}

    public String getOrder()
    {return order;}
    public void setWeight(String order)
    {this.order=order;}

    @Override
    public String toString()
    {
        return "Mammal{ Order = "+order+'\''+'}';
    }
}
