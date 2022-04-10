import java.io.*;

class Person
{
    String surnameKanisorn55477, firstnameKanisorn55477, streetKanisorn55477, zipCodeKanisorn55477, cityKanisorn55477;
    public void initialize() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Surname = ");
        surnameKanisorn55477= br.readLine();
        System.out.println("Enter Firstname = ");
        firstnameKanisorn55477= br.readLine();
        System.out.println("Enter Street = ");
        streetKanisorn55477= br.readLine();
        System.out.println("Enter Zipcode = ");
        zipCodeKanisorn55477= br.readLine();
        System.out.println("Enter City = ");
        cityKanisorn55477= br.readLine();
    }

    public void print()
    {
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Surname = "+surnameKanisorn55477);
        System.out.println("Firstname = "+firstnameKanisorn55477);
        System.out.println("Street = "+streetKanisorn55477);
        System.out.println("Zipcode = "+zipCodeKanisorn55477);
        System.out.println("City = "+cityKanisorn55477);
    }
}

class Staff extends Person
{
    String educationKanisorn55477,positionKanisorn55477;
    void initialize1() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Education =");
        educationKanisorn55477= br.readLine();
        System.out.println("Enter Position =");
        positionKanisorn55477= br.readLine();
        initialize();
    }
    void print1()
    {
        print();
        System.out.println("Education ="+educationKanisorn55477);
        System.out.println("Position ="+positionKanisorn55477);
    }
}

public class Task1
{
    public static void main(String[] args) throws IOException
    {
        Staff s=new Staff();
        s.initialize1();
        s.print1();
    }
}
