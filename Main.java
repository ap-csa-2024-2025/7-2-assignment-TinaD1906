import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Integer X = new Integer(5);
    Integer Y = new Integer(10);

    int z = X.intValue() + Y.intValue();
    
    
    
    ArrayList<Integer> foo = new ArrayList<Integer>();
    foo.add(new Integer(1));
    foo.add(new Integer(2));

    
    
    
    int[] jennys = {1, 2, 3, 4, 5, 6, 7}
    for (i=0; i<jennys.length;i++)
    {
      System.out.println(jennys[i]);
    }



    Scanner sc = new Scanner(System.in);
    String input = "";
    
    while (!input.equals("STOP"))
    {
      System.out.println("infinite loop! replace with your code");
    }
  }

  // Problem 2 - HighestNum
  public static int highestNum(ArrayList<Integer> arr)
  {
    int max = Integer.MIN_VALUE;  // arr.get(0);
    for (int i = 0; i < arr.size(); i++)
    {
      if (arr.get(i).intValue()>max)
      {
        max = arr.get(i).intValue();
      }
    }
    return max;
  }

  // Problem 3 - getEvens
  public static ArrayList<Integer> getEvens(final ArrayList<Integer> arr)
  {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    for (Integer N : arr)
    {
      if (N.intValue() % 2 == 0)
      {
        ans.add(N);
      }
    }
    return ans;
  }
}
