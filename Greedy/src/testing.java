// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

public class testing
{
    public static void main (String[] args) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //testcases
        int t = Integer.parseInt(br.readLine().trim());

        while(t-- > 0)
        {
            String inputLine[] = br.readLine().trim().split(" ");
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            int start[] = new int[n];
            int end[] = new int[n];

            //adding elements to arrays start and end
            inputLine = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for(int i= 0; i < n; i++)
                end[i] = Integer.parseInt(inputLine[i]);

            //function call
            System.out.println(new Solution().activitySelection(start, end, n));
        }
    }
}

// } Driver Code Ends




class Solution
{
    //Function to find the maximum number of activities that can
    //be performed by a single person.
    public static int activitySelection(int start[], int end[], int n)
    {
        Activity arr[]=new Activity[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=new Activity(start[i],end[i]);
        }
        Arrays.sort(arr,new MyCompare());
        int c=1;

        for(int i=1;i<n;i++)
        {
            if(arr[i-1].end<arr[i].start)
                c+=1;
        }
        return c;
    }
}
class Activity {
    int start;
    int end;

    Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
class MyCompare implements Comparator<Activity>
{
    @Override
    public int compare(Activity a1,Activity a2)
    {
        return a1.end-a2.end;
    }
}