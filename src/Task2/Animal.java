package Task2;

abstract class Animal
{
    private String name;
    private int age,weight;

    public Animal()
    {
        age=weight=0;
        name="-";
    }

    public Animal(String name,int age,int weight)
    {
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    public Animal(int age)
    {this.age=age;}
    public abstract void eat(String Food);
    public abstract void getVoice();

    public String getName()
    {return name;}
    public void setName(String name)
    {this.name=name;}
    public int getAge()
    {return age;}
    public void setAge(int age)
    {this.age=age;}
    public int getWeight()
    {return weight;}
    public void setWeight(int weight)
    {this.weight=weight;}
}
