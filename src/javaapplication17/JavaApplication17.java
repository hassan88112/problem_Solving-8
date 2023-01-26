
package javaapplication17;

import java.util.Scanner;


public class JavaApplication17 {

    
    public static void main(String[] args) {
       
         int num1,num2;
        int arr[]={0,0,0,0,0,0,0};
        
        
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int q=input.nextInt();
        for(int i=0; i<q ;i++){
         num1=input.nextInt();
         num2=input.nextInt();
         if(num1 == 1){
         
         arr[num2]= ++arr[num2];
         }else{
             System.out.println(arr[num2]);
         }
        
        
        }
    }
    
}
