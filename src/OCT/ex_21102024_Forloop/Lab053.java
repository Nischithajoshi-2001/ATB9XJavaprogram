package OCT.ex_21102024_Forloop;

public class Lab053
{
    public static void main(String[] args)
    {
        for (int i=0; i<=50; i++)
        {
            if (i==5)
            {
                continue;//Skip below code ,move to top
            }

            System.out.println(i);
        }

    }
}
