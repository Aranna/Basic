package pt.iefp.tis08;

import java.util.Scanner;

/**
 * Aplicação de ordenação de cinco números.
 * @author Rafael
 * @serial 20150909
 */
public class BasicSort {
    
    public static int[] BubbleSort( int [ ] num )
{
     int j;
     boolean flag = true;                                                           // set flag to true to begin first pass
     int temp;                                                                      //holding variable

     while ( flag )
     {
            flag= false;                                                            //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                   if ( num[ j ] < num[j+1] )                                       // change to > for ascending sort
                   {
                           temp = num[ j ];                                         //swap elements
                           num[ j ] = num[ j+1 ];
                           num[ j+1 ] = temp;
                          flag = true;                                              //shows a swap occurred 
                  }
            }
      }
     return num;
} 
    
    public static void main(String[] args) {
        
        int[] num = new int [5];
        
        System.out.println("Aplicação Sort'Grande");
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("K = ");
            num [0] = in.nextInt();
            
        System.out.print("W = ");
            num [1] = in.nextInt();
            
        System.out.print("X = ");
            num [2] = in.nextInt();
        
        System.out.print("Y = ");
            num [3] = in.nextInt();
        
        System.out.print("Z = ");
            num [4] = in.nextInt();
            
        int[] result = BubbleSort(num);
        
        for (int i=0; i<5; i++) {
        System.out.println(result[i]);
    }
    }
    }