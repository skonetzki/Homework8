import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver 
{
	public static void main(String args[])
	{
		
		static void sortOnName(string args[])
		{
			ArrayList<BibleBook> theBooks = new ArrayList<BibleBook>();
			String term = input.nextLine();
			for(int i=0; i< theBooks.size(); i++))
			{
				int compareValue = i.compareTo(i + 1); 
                if compareValue < 0)
                    {
					String temp = theBooks[i];
					theBooks[i] = thebooks [i+1];
					theBooks[i+1] = temp;
					}
			}
		}


    }


    //take in the array list. 
    //go through array list comparing one to another
    //if compare returns less than 0, switch string locations in new array list
    //otherwise continue





    static void sortOnChapter(int theBooks[])
    {
        //take in "getNumber_of_chapters"
        //sort them by size
     
        int n = theBooks.size(); 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (theBooks[j] > theBooks[j+1]) 
                { 
                    // swap arr[j+1] and arr[j] 
                    int temp2 = theBooks[j]; 
                    theBooks[j] = theBooks[j+1]; 
                    theBooks[j+1] = temp2; 
                } 
    } 



    public static void display()
    {
		sortOnName zebra = new sortOnName
		zebra.sortOnName(theBooks)
		System.out.println("Sorted by book"); 
        zebra.printArray(theBooks);

		sortOnChapter fish = new sortOnChapter();  
        fish.sortOnChapter(theBooks); 
        System.out.println("Sorted by Chapter"); 
        fish.printArray(theBooks); 
    }
}