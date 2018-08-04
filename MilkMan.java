/* package codechef; // don't place package name! */

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MilkMan
{
        public static void main (String[] args) throws java.lang.Exception
        {
                BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
                int test_case = Integer.parseInt(user.readLine());
                int[] bottles = {10,7,5,1};
                int[] result = new int[test_case];
                int milk,lts,btl,j;
        for(int i=0; i<test_case;i++)           
        {
            milk = Integer.parseInt(user.readLine());
            j=0;
            btl=0;
            while(milk>0)
            {
                lts   = milk/bottles[j];
                milk -= bottles[j]*lts;
                j++;
                btl += lts;
            }
            result[i] = btl;
        }
        for(int i=0;i<test_case;i++)
            System.out.println(result[i]);
        }
}