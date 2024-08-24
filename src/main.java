//1. WAP TO FIND THE LARGEST ELEMENT FROM THE ARRAY IN JAVA.

public class main
{
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50};

        int max = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        System.out.println("The Largest Element In The Array Is : " + max);
    }
}


//4.WAP TO FIND THE SUM OF EVEN NUMBERS FROM 1 TO N USING RECURSION.

public class main {
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println("Sum Of Even Numbers From 1 To " + n + " is : " + sumOfEvenNumbers(n));
    }

    public static int sumOfEvenNumbers(int n)
    {
        if (n <= 0)
        {
            return 0;
        }
        else if (n % 2 == 0) {
            return n + sumOfEvenNumbers(n - 1);
        }
        else
        {
            return n + sumOfEvenNumbers(n - 1);
        }
    }
}

//5.WAP TO CREATE PATTERN AS MENTIONED BELOW IMAGE. HOLLOW PYRAMID SATR PATTERN

public class main {
    public static void main(String[] args)
    {
        System.out.print("        *  ");
        for (int i = 7; i >= 1; i--)
        {
            for (int j = 1; j <=i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <2; j++)
            {
                if(i==7)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            for (int j = 6; j >=i; j--)
            {
                System.out.print("  ");
            }
            for (int j = 1; j <2; j++)
            {
                if(i==7)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int j = 1; j <7; j++)
        {
            System.out.print("*  ");
        }
    }
}
