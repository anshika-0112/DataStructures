package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class RearrangeCharacters {
    String Rearrange(String s) {
        PriorityQueue<Key> pq = new PriorityQueue<>(new KeyComparator());
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[((int) s.charAt(i)) - 97] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                Key k=new Key((char)(i+97),arr[i]);
                pq.add(k);
            }
        }
        Key prev=new Key('#',-1);
        String res="";
        while(pq.size()!=0)
        {
            Key k1=pq.poll();
            System.out.println(k1.ch+" "+k1.freq);
            res+=k1.ch;
            k1.freq-=1;
            if(prev.freq>0)
            {
                pq.add(prev);
            }
            prev=k1;
        }
        return res;
    }

    public static void main(String[] args) {
        RearrangeCharacters obj=new RearrangeCharacters();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans=obj.Rearrange(s);
        if(s.length()==ans.length())
        {
            System.out.println(ans);
        }
        else
        {
            System.out.println("Cannot be arranged");
        }

    }
}

    class Key {
        char ch;
        int freq;

        Key(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }

    class KeyComparator implements Comparator<Key> {

        public int compare(Key k1, Key k2) {
            if (k1.freq < k2.freq)
                return 1;
            else if (k1.freq > k2.freq)
                return -1;
            return 0;
        }
    }
