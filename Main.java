import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    int[][] grid = new int[4][3];    //How to creat a 2D array. It has 4 rows and 3 columns.


    for (int r = 0; r < grid.length; r++)
    {
      for (int c = 0; c < grid[0].length; c++)
      {
        grid[r][c] = (r * c);
      }
    }

    for (int r = 0; r < grid.length; r++)
    {
      for (int c = 0; c < grid[0].length; c++)
      {
        System.out.print (grid[r][c] + "\t");
      }
    System.out.println();
    }




    //String Array.
    
    String[][] grades = new String[6][3];    //6 classes with three grades.

    for (int r = 0; r < grades.length; r++)      //Collecting values.
    {
      System.out.println("Enter grades for hour " + (r + 1) + ".");
      for (int c = 0; c < grades[0].length; c++)
      {
        grade[r][c] = scan.nextLine();
       // System.out.print (grades[r][c] + "\t");
      }
    System.out.println();
    }

    for (String[] array: grades)    //Printing the 2d array. Remember this the array name you gave it needs to be in the second array.
    {
      for (String element: array)
        {
          System.out.println(element + " ");
        }
      System.out.println();
    }


    
  }
}