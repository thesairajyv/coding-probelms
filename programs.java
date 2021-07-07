/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win10
 */
//fibonaci series without using the recurssion 
/*
public class javapoint {
    
    public static void main(String... arg ){
    int n1=0;
    int n2=1;
    int n3,i,count=10;
    for(i=2;i<count;++i){
        n3=n1+n2;
        System.out.println(" "+n3);
        n1=n2;
        n2=n3;
        
    }
    }
    
}
*/
//program for fibonaci using recursion
/*
public class javapoint{
    static int n1=0,n2=1,n3=0;
    static void printfibonaci(int count){
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            printfibonaci(count-1);
            
        }
    }
    public static void main(String... arg)
    {
      int  count=10;
      System.out.print(n1+" "+n2);
      printfibonaci(count-2);
        
     
               }
}*/

//program to check whether number is a prime or not
/*
public class javapoint {
    static void checkPrime(int n){
        int i,m=0,flag=0;
       m=n/2;
        if(n==0||n==1)
        {
            System.out.println(n+"is not primt number");
            
        }
        else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+"is not prime number");
                    flag=1;
                    break;
                            
                }
            }
            if(flag==0){
                System.out.println(n+"is prime number");
            }
        }
    }
    public static void main(String... arg)
    {
       checkPrime(1);
       checkPrime(3);
       checkPrime(17);
    }
}*/
//program to find the number whether a prime or not using the looping
/*
import java.math.BigInteger;
import java.util.Scanner;
public class javapoint{
    
    public static void main(String... arg){
        Scanner s=new Scanner(System.in);
        System.out.print("ener a number");
        int n=s.nextInt();
        if(isPrime(n)){
            System.out.println(n+"is a primie number");
            
        }else {
            System.out.println(n+ "is not a prime number");
            
        }
        }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
            
        }
        for(int i=2;i< Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        
        return true;
    }
}*/
//program to find the number of prime numbers between 2 numbers
/*import java.util.Scanner;
public class javapoint{
    public static void main(String... arg){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number");
     
        int start= s.nextInt();
        System.out.println("enter the end number");
        int end= s.nextInt();
        System.out.println("list of prime numbers betweem"+start+ "and"+end );
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
         }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        
    }
        return true;
    }
}
*/

//program to check whether the number is pallidrom or not
/*
import java.util.Scanner;
public class javapoint{
    public static void main(String... arg){
        int r,sum=0,temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int n= s.nextInt();
        temp=n;
        while(n>0){
          r=n%10;  
        sum=(sum*10)+r;
        n=n/10;
        }
        if(temp==sum){
            System.out.println("number is pallindrom");
            
        }
        else{
            System.out.println("number is not a palindrom");
        }
    }
}
*/
//program to check whether the string is palindrom 
/*
import java.util.Scanner; 
public class javapoint{
     public static void main(String... arg)
     {
         String original,reverse=""; //objects of string class
         Scanner s=new Scanner(System.in);
         System.out.println("enter the string to be checked");
    original=s.nextLine();
    int length=original.length();
    for(int i =length-1;i>1;i--){
      reverse=reverse+original.charAt(i);
      if(original.equals(reverse)){
          System.out.println("enetered string is pallindrom");
          
      }
      else {
          System.out.println("entered string is not pallindrom");
      }
    }
     }
 }
*/
//program for foctorial identification
/*
public class javapoint{
    public static void main(String... arg)
    {
     int i, fact=1;
     int number=5;
     for(i=1;i<=number;i++){
        fact=fact*i;
    }
     System.out.println("factorrial value of 5 is"+fact);
    }
}
*/
//factotial using recursion
/*
public class javapoint{
    static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return(n*factorial(n-1));
        }
    }
    public static void main(String... arg)
    {
        int i,fact=1;
        int number=4;
        fact=factorial(number);
        System.out.println("Factorial of "+number+"is"+fact);
        
    }
}
*/

//program to check whether the number is a armstrong number or not
/*
public class javapoint {
    public static void main(String... arg){
        int c=0, temp,a;
        int n=153;
        temp=n;
        while(n>0){
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c){
            System.out.println("armstrong number");
            
        }
        else{
            System.out.println("not armstrong");
        }
           
    }
}
*/
// program to generate otp with specified range using the random function
/*
import java.util.Scanner;
public class javapoint{
    public static void main(String... arg){
        int min, max;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the max and min number in which the random number has to be generated");
        min=s.nextInt();
        max=s.nextInt();
       System.out.println("Random value of type double between "+min+" to "+max+ ":");
       double randomnumber=Math.random( )*(max-min+1)+min;
       int b=(int)Math.random();
       //random number will always double hence type casting is really important to get the whole number
       System.out.println("general whole number generated is "+b);
       System.out.println(randomnumber);
       int wholeno =(int)randomnumber;
       System.out.println(wholeno);
       
}
*/
//rendom number generation by creating the object to the random class
/*
import java.util.Random;
public class javapoint
{
    public static void main(String... arg){
        //creating object for random class
        Random r=new Random();
        //generates the integer btwn 0to 49
        int x=r.nextInt(50);
        //number between 0to 999
        int y=r.nextInt(1000);
        System.out.println("two integers genrated is"+x+" "+y);
        double a=r.nextDouble();
        System.out.println("double number is generateda"+a);
        float f=r.nextFloat();
        System.out.println("floating number is"+f);
        long l=r.nextLong();
        System.out.println("long random number"+l);
        boolean m=r.nextBoolean();
        System.out.println("boolean value is"+m);
          }
}
*/
//using the threadLocalRandom class
//importing the thr,,adloacal random class from concurrnet package
/*
import java.util.concurrent.ThreadLocalRandom;
public class javapoint{
    public static void main(String... arg){
        //generating the interfer random
        int a=ThreadLocalRandom.current().nextInt();
        System.out.println( "genrated interger type random number"+a);
    //generating the double type random
        double d=ThreadLocalRandom.current().nextDouble();
        System.out.println("generated double number"+d);
        //GENRATING THE boolean type random
        boolean b=ThreadLocalRandom.current().nextBoolean();
        System.out.println("boolean value"+b);
        
    }
}
*/
//generating the number betwwen numbersimport java.util.Random;   
/*public class RandomNumberExample5   
{   
public static void main(String[] args)   
{   
randomInts(5);  
randomInts(9, 50, 90);  
//getStreamOfRandomInts(30, 50);  
}   
//method that generates a stream of integers having size 5  
public static void randomInts(int num)   
{  
Random random = new Random();  
random.ints(num).forEach(System.out::println);  
}  
//method that generates a stream of 9 integers between 50 to 90  
public static void randomInts(int num, int origin, int bound)   
{  
Random random1 = new Random();  
random1.ints(num, origin, bound).forEach(System.out::println);  
}  
}  
}
*/
//printing the star 
/*
public class javapoint {
   
    
public static void main(String args[])   
{   
//i for rows and j for columns      
//row denotes the number of rows you want to print  
    int i, j, row=6;   
//outer loop for rows  
for(i=0; i<row; i++)   
{   
//inner loop for columns  
for(j=0; j<=i; j++)   
{   
//prints stars   
System.out.print("* ");   
}   
//throws the cursor in a new line after printing each line  
System.out.println();   
} 
   
    }
}
*/
//star triangle in reverse
/*
public class javapoint {
    public static void main(String... arg){
       //i for rows and j for columns      
//row denotes the number of rows you want to print  
int i, j, row = 6;       
//Outer loop work for rows  
for (i=0; i<row; i++)   
{  
//inner loop work for space      
for (j=2*(row-i); j>=0; j--)         
{  
//prints space between two stars      
System.out.print(" ");   
}   
//inner loop for columns  
for (j=0; j<=i; j++ )   
{   
//prints star      
System.out.print("* ");   
}   
//throws the cursor in a new line after printing each line  
System.out.println();   
}   
    }
}
*/
//progra for pritig the pyramid
/*
public class javapoint{
    

public static void main(String... arg){

    int i, j, row=6;
    for(i=0;i<row;i++){
        for(j=row-i;j>1;j--){
            System.out.print(" ");
        }
        for(j=0;j<i;j++){
           System.out.print("*");
        }
        System.out.println( );
    }
}
}
*/
//program to print the asci value of different charecters
/*
public class javapoint{
    public static void main(String... arg){
        for(int i=0;i<=255;i++){
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);
        }
    }
}*/
//copying the elements of one array into the another array
/*
public class javapoint
{
    public static void main(String... arg){
        
  int [] arr1 = new int [] {1, 2, 3, 4, 5};     
         //Create another array arr2 with size of arr1    
        int arr2[] = new int[arr1.length];    
        //Copying all elements of one array into another    
        for (int i = 0; i < arr1.length; i++) {     
            arr2[i] = arr1[i];   
             //System.out.print(arr1[i] + " "); 
              //System.out.print(arr1[i] + " ");    
        }      
        
         //Displaying elements of array arr1     
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr1.length; i++) {     
           System.out.print(arr1[i] + " ");    
        }     
            
        System.out.println();    
            
        //Displaying elements of array arr2     
        System.out.println("Elements of new array: ");    
        for (int i = 0; i < arr2.length; i++) {     
           System.out.print(arr2[i] + " ");    
        }     
        
}
}*/
// checing the frequency of each charecter in  an array
/*
public class javapoint {
    public static void main( String... arg){
      //Initialize array  
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
        //Array fr will store frequencies of element  
        int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  //reencountering value will not be considereed
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
         //Displays the frequency of each element present in array  
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  
    }}  
    
*/
//my own code to take the values
/*
import java.util.Scanner;
public class javapoint{
    public static void main(String... arg)
    {
        int [] arr=new int[100];
        Scanner s= new Scanner(System.in);
        System.out.println("enter the array of integers of lenght 10");
        for(int i=0;i<10;i++){
            System.out.println("enter the array element number"+i);
            arr[i]=s.nextInt();
        }
        int [] str=new int[100];
        int count=0, visited=-1;
        for(int i=0;i<arr.length;i++){
            count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                    
                    str[j]=visited;
                    
                }
              
            }
            if(str[i]!=visited){
                str[i]=count;
            }
        }
      System.out.println("----------------------------------------");
      System.out.println("element | frequency");
      System.out.println("-----------------------------------------");
      for(int i=0;i<str.length;i++){
          if(str[i]!=visited){
              System.out.println("    "+arr[i]+"    "+str[i]);
          }
      }
      System.out.println("-----------------------------------------");
    }
}*/
//program to shift the array by n values
/*
import java.util.Scanner;
public class javapoint{
    public static void main(String... arg){
        int[] arr=new int[]{1,2,3,4,5,6};
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number of times to be shifted");
        int n=s.nextInt();
        //printing the original array
            System.out.print("original array");

        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i]);
        }
       
        for(int i=0;i<n;i++){
            int first=arr[0];
             int j;
            for(j=0;j<arr.length-1;j++){
                //shofted the array
                arr[j]=arr[j+1];
            }
            // adding the first element to the last place
            arr[j]=first;
        }
 System.out.println("the sifted array");
        for(int i=0;i<arr.length;i++){
            
        
       System.out.println(arr[i]);
               }
    }
}*/
// printing the reverse of an array
/*
public class javapoint{
    public static void main(String... arg){
       int [] arr=new int[]{1,2,3,4,5,6};
       System.out.println("original array");
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]);
       }
       System.out.println();
       System.out.println("reverse array");{
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
    }
}
*/
// finding the largest number in an array
/*
public class javapoint{
    public static void main(String... arg){
        int [] arr=new int[]{55,88,99,77};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        
    }
        System.out.println("maximum number is"+max);
    }
}*/
//smallest number
/*
public class javapoint{
    public static void main(String... arg){
        int [] arr=new int[]{55,88,99,77};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        
    }
        System.out.println("maximum number is"+min);
    }
}*/
//sum of elements in an array
/*
public class javapoint{
    public static void main(String... arg){
        int [] arr=new int[]{55,88,99,77};
        int sum=0;
        for(int i=1;i<arr.length;i++){
           sum=sum+arr[i];
            }
        
    
        System.out.println("sum of elements in array is"+sum);
    }
}*/

//decresed sorting of an array
/*
public class javapoint{
    public static void main(String... arg){
        int[] arr=new int[]{5,2,8,7,9,1};
        System.out.println("original array before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j])
                //for decrese sorting arr[i]<arr[j]
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
                
        }
        System.out.println("sorted array is");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}*/
//removing the duplicate elements in array
/*
public class javapoint
{
    public static int removeduplicate(int arr[] , int n){
      if(n==0||n==1){
          return n;
      } 
      int [] temp=new int[n];
      int j=0;
      for(int i=0;i<n-1;i++){
          if(arr[i]!=arr[i+1]){
              temp[j++]=arr[i];
          }
      }
      temp[j++]=arr[n-1];
      //changing the original array
      for(int i=0;i<j;j++){
          arr[i]=temp[i];
      }
      return j;
    }
    public static void main(String... arg){
        int arr[] = {10,20,20,30,30,40,50,50};  
        int length = arr.length;  
       length=removeduplicate(arr,length);
       for(int i=0;i<length;i++){
           System.out.println(arr[i]);
       }
        
    }
}*/
/*
public class javapoint{
    public static void main(String... arg){
        int[ ] arr=new int[]{1,2,2,5,6,4,5,6,5,8,7,9,2};
    System.out.println("printing the original array");
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]);
     }   
     System.out.println( );
     //removing the duplicates
     int l=arr.length;
     for(int i=0;i<l-1;i++){
        for(int j=i+1;j<l;j++){
            if(arr[i]==arr[j]){
                arr[j]=arr[l-1];
                l--;
            }
        }
    }
     System.out.println("result array");
     for(int i=0;i<l;i++){
         System.out.print(arr[i]);
     }
    
    }
}*/
/*
public class javapoint{
    public enum Days{ mon,tue,wed };
    public static void main(String... arg){
        for(Days d: Days.values()){
            Days[] d2=Days.values();
            System.out.println( d2[2]);
        }
    }
}*/

//addition of two matrix
/*
public class javapoint{
    public static void main(String... arg){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum[][]=new int[3][3];
       for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
sum[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
System.out.print(sum[i][j]+" ");    
}   
System.out.println();
    }
            
        }
    }
*/
//program to find whehther the matrix is identity matrix or not
/*
public class javapoint{
public static void main(String... arg){
int a[][]={
    {1,0,0},
    {0,1,0},
    {0,0,1}
};
boolean flag=true;
// code to find the number of rows and colums in a mtrix
int rows=a.length;
int colums= a[0].length;
 if(rows!=colums){
     System.out.println("squre matrix must contain same no rows and columns");       
         }
 for(int i=0;i<rows;i++){
     for(int j=0;j<colums;j++){
         if(i==j&&a[i][j]!=1){
              flag=false;
              break;
             
         }
         if(i!=j&&a[i][j]!=0){
             flag=false;
             break;
         }
     }
     
 }
 if(flag){
     System.out.println("matrix is a identity matrix");
 }
 else{
     System.out.println("matrix is not a identity matrix");
 }

}}*/
//program to check whether the matrix are same are not
/*
public class javapoint   
{    
    public static void main(String[] args) {    
        int row1, col1, row2, col2;    
        boolean flag = true;    
            
        //Initialize matrix a    
        int a[][] = {       
                        {1, 2, 3},    
                        {8, 4, 6},    
                        {4, 5, 7}    
                    };    
              
          //Initialize matrix b    
        int b[][] = {       
                        {1, 2, 3},    
                        {8, 4,6 },    
                        {4, 5, 7}    
            };    
              
        //Calculates the number of rows and columns present in the first matrix    
    
          row1 = a.length;    
        col1 = a[0].length;    
            
        //Calculates the number of rows and columns present in the second matrix    
    
          row2 = b.length;    
        col2 = b[0].length;    
            
        //Checks if dimensions of both the matrices are equal    
        if(row1 != row2 || col1 != col2){    
            System.out.println("Matrices are not equal");    
        }    
        else {    
            for(int i = 0; i < row1; i++){    
                for(int j = 0; j < col1; j++){    
                  if(a[i][j] != b[i][j]){    
                      flag = false;    
                      break;    
                  }    
                }    
            }    
                
            if(flag)    
                System.out.println("Matrices are equal");    
            else    
                System.out.println("Matrices are not equal");    
        }    
    }    
} */
//program to find the matrix lower diagnol elements
/*
public class javapoint{
    public static void main(String... arg){
        int a[][]={
            {00,01,02},
            {10,11,12},
            {20,21,22}
        };
        boolean flag=true;
        int rows=a.length;
        int columns=a[0].length;
        if(rows!=columns){
            flag=false;
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(j>i){
                    
                    System.out.print("0");
                }else
                System.out.print(a[i][j]+" " );
            }
            System.out.println();
        }
    }
}*/
//program to find the number of even and odd numbers in a mmatrix
/*
public class javapoint{
    public static void main(String... arg){
        int a[][]={
            {2,5,6,7,8,9},
            {5,6,7,8,9,7,7},
            {8,9,2,68,7,6,3,9,8}
        };
        int evencount=0,oddcount=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]%2==0){
                    evencount++;
                }
                else{
                    oddcount++;
                }
            }
            
        }
        System.out.println("frequency of odd numbers"+evencount+" "+"frequency of odd numbers"+oddcount);
    }
}*/
//sum of rows and columns in a matrix
/*
public class javapoint  
{    
    public static void main(String[] args) {    
        int rows, cols, sumRow, sumCol;    
            
        //Initialize matrix a    
        int a[][] = {       
                        {1, 2, 3},    
                        {4, 5, 6},    
                        {7, 8, 9}    
                    };    
              
          //Calculates number of rows and columns present in given matrix    
          rows = a.length;    
        cols = a[0].length;    
            
        //Calculates sum of each row of given matrix    
        for(int i = 0; i < rows; i++){    
            sumRow = 0;    
            for(int j = 0; j < cols; j++){    
              sumRow = sumRow + a[i][j];    
            }    
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
        }    
            
        //Calculates sum of each column of given matrix    
        for(int i = 0; i < cols; i++){    
            sumCol = 0;    
            for(int j = 0; j < rows; j++){    
              sumCol = sumCol + a[j][i];    
            }    
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
        }    
    }    
}
*/
/*
public class javapoint
{
    public static void main(String... arg){
        int a[][]={
            {0,1,2,0,0,3,0},
            {0,0,2,0,0,0,0},
            {0,2,1,0,0,0,3}
        };
        int count=0;
        int row=a.length;
        int column=a[0].length;
        int size=row*column;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(a[i][j]==0){
                    count++;
                }
            }
        }
        if(count>size/2){
            System.out.println("given matrix is a sparse matrix");
        }
        else{
            System.out.println("given matrix is not a sparse matrix");
                    }
    }
}
*/
/*
interface Printable{}  
class A implements Printable{  
public void a(){System.out.println("a method");}  
}  
class B implements Printable{  
public void b(){System.out.println("b method");}  
}  
  
class Call{  
void invoke(Printable p){//upcasting  
if(p instanceof A){  
A a=(A)p;//Downcasting   
a.a();  
}  
if(p instanceof B){  
B b=(B)p;//Downcasting   
b.b();  
}  
  
}  
}//end of Call class  
  
class Test4{  
public static void main(String args[]){  
Printable p=new B();  
Call c=new Call();  
c.invoke(p);  
}  
}  
*/














