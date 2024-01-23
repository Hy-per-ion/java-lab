package exp9;


class Test extends Thread
{
    private Thread t;
    private final String tname;
    Test(String msg)
    {
        tname = msg;
        System.out.println("Creating Thread: "+ tname);
    }
    public void run()
    {
        System.out.println("Running Thread: "+tname);
        try {
            for (int i=0;i<5;i++)
            {
                System.out.println("Thread: "+tname+", "+i);
                Thread.sleep(50);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Exception in thread: "+tname);
        }
        System.out.println(tname+" Continue...");
    }
    public void start()
    {
        System.out.println("Start method "+tname);
        if(t==null)
        {
            t = new Thread(this,tname);
            t.start();
        }
    }
}
public class Multi {
    public static void main(String[] args) {
        Test t1 = new Test("First Thread");
        t1.start();
        Test t2 = new Test("Second Thread");
        t2.start();
    }
}
