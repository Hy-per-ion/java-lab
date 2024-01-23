package exp1;

import java.util.Scanner;

public class Ebill {
    public static void main(String[] args) {
        Cdata ob = new Cdata();
        ob.get();
        ob.calc();
        ob.display();
    }
}

class Cdata
{
    Scanner in = new Scanner(System.in);
    Scanner ins = new Scanner(System.in);
    String cname,type;
    int bn;
    double units,cur,prev,total;
    void get()
    {
        System.out.println("Enter the consumer bill number: ");
        bn = in.nextInt();
        System.out.println("Enter the consumer name: ");
        cname = ins.nextLine();
        System.out.println("Select 'd' or 'D' for Domestic and 'c' or 'C' for Commercial: ");
        type = ins.nextLine();
        System.out.println("Enter the previous month readings: ");
        prev = in.nextDouble();
        System.out.println("Enter the current month readings: ");
        cur =in.nextDouble();
    }
    void calc()
    {
        units = cur - prev;
        if(type.equals("d") || type.equals("D"))
        {
            if(units<=100)
            {
                total = 1 * units;
            }
            else if (units>100 && units<=200)
            {
                total = 2.50 * units;
            }
            else if (units>200 && units<=500)
            {
                total = 4 * units;
            }
            else
            {
                total = 6 *units;
            }
        }
        else if (type.equals("c")||type.equals("C"))
        {
            if(units<=100)
            {
                total = 2 * units;
            }
            else if (units>100 && units<=200)
            {
                total = 4.50 * units;
            }
            else if (units>200 && units<=500)
            {
                total = 6 * units;
            }
            else
            {
                total = 7 *units;
            }
        }
    }
    void display()
    {
        System.out.println("Consumer bill number: "+bn);
        System.out.println("Consumer name: "+cname);
        if(type.equals("d") || type.equals("D"))
        {
            System.out.println("Type - Domestic");
        }
        else if (type.equals("c")||type.equals("C"))
        {
            System.out.println("Type - Commercial");
        }
        System.out.println("Previous month readings: "+prev);
        System.out.println("Current month readings: "+cur);
        System.out.println("Total units consumed: "+units);
        System.out.println("Total Bill: "+total);
    }
}