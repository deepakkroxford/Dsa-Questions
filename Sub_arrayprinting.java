import java.util.Scanner;
public class Sub_arrayprinting {
    public static void main(String[] args) {
        
      int arr[]={1,2,3,1,1,1,1,4,2,3};
       
      for(int i =0;i<arr.length;i++)
      {
        for(int j =i;j<arr.length;j++)
        {
          
            for(int k =i;k<=j;k++)
            {
                System.out.println(arr[k]);
            }   
            System.out.println();    
            
        }
      }
      
        
        

    }
}
