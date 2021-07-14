package Greedy;

// { Driver Code Starts

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnacksack {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}// } Driver Code Ends


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n)
    {
        Arrays.sort(arr,new MyCompare());
        for(Item i1:arr)
        {
            System.out.println(i1.weight+" "+i1.value);
        }
        double v=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i].weight<=W)
            {
                W-=arr[i].weight;
                v+=arr[i].value;
            }
            else
            {
                v+=W/arr[i].weight*arr[i].value;
                break;
            }
        }
        return v;
    }
}
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }

}
class MyCompare implements Comparator<Item>
{
    public int compare(Item i1,Item i2)
    {
        return (i1.value*i2.weight)-(i1.weight*i2.value);
    }
}
