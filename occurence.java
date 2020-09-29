/*
Write java program which accept N numbers from user and accept
one another number as NO , return index of last occurrence of that NO.
Input : N : 6
NO: 66
Elements : 85 66 3 66 93 88
Output : 3
Input : N : 6
NO: 93
Elements : 85 66 3 66 93 88
Output : 4
Input : N : 6
NO: 12
Elements : 85 11 3 15 11 111
Output : -1
*/
import java.lang.*;
import java.util.*;

class Number
{

    int Check(int arr[] , int iNo)
    {
        //filter
        if(arr == null)
        {

            return -1;

        }

        //updator
        // if(iNo < 0)
        // {
        //     iNo = -iNo;
        // }

        int j = 0;
        for( j = arr.length-1 ;  j >= 0 ; j--)
        {

            if( arr[j] == iNo )
            {

                   break;

            }

        }
        if(arr[j] != iNo)
        {       
                
            return -1;
                
        }
        else
        {
            return j;

        }
    }
} 




class Demo 
{
    public static void main(String arg[])
    {
        int iVal = 0;
        int iNo = 0;
        int i = 0;

        int iRet = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elemnts in the array :");
        iVal = sobj.nextInt();

        System.out.println("Enter the number whose index of last occurence is to be returned from the array : ");
        iNo = sobj.nextInt();

        if(iVal < 0)
        {
            
            iVal = -iVal;

        }

        //allocate/crate memory for the array

        int[] arr = new int[iVal];

        System.out.println("Enter the elements of the arrays: ");

        for(i = 0 ; i< arr.length ; i++)
        {
            
            arr[i] = sobj.nextInt();

        }
        //class object
        Number nobj = new Number();

        //call function

        iRet = nobj.Check(arr, iNo);

        if(iRet == -1)
        {
                
            System.out.println("Number is not present in the array ");

        }
        else
        {

            System.out.println("Number's  first occurence  in the array is at poition : " +iRet );

        }
    }
}
