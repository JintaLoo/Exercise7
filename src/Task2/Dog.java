package Task2;

public class Dog extends Mammal
{
    private String breed;

    Dog()
    {
        super();
        breed="-";
    }

    public Dog(String name,int age,int weight, String type,String breed)
    {   super(name,age,weight,type);
        this.breed=breed;
    }

    public Dog(int age,String type,String breed)
    {
        super(age, type);
        this.breed=breed;
    }

    //Special method
    public void aport()
    {System.out.println("The dog is retrieving");}

    @Override
    public void drinkMilk()
    {System.out.println("The dog is drinking milk");}

    @Override
    public void getVoice()
    {System.out.println("The dog is barking");}

    @Override
    public void eat(String Food)
    {System.out.println("It eats "+Food);}

    public String getBreed()
    {return breed;}
    public void setBreed(String breed)
    {this.breed=breed;}

    @Override
    public String toString()
    {
        return "Dog{ breed = "+breed+'\''+'}';
    }
}
