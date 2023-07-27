
package ex12;
import java.util.*;
import java.lang.*;

public class Ex12 {
int getcount(int arr[],int n){
    int count =0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[j-1]>=arr[j])
                break;
            ++count;
        }
    }
    return count;
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ex12 e=new Ex12();
        int arr[]={1,2,4,4,5};
        //int n=sizeof(arr) / sizeof(arr[0]);
        int n= arr.length;
        int num1=e.getcount(arr,n);
        System.out.println("number of increasing array"+num1);
    }
    
}
