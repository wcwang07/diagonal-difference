import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int a;
        a = in.nextInt();
        String str;
        
        List<Integer> list = new ArrayList<Integer>();
        
         in.nextLine();
        
        while(in.hasNext()){
           
            list.add(in.nextInt());
            
  
        }

        Integer[] intArr = list.toArray(new Integer[0]);
      
        //System.out.println(Arrays.toString(intArr));
        
        int[][]numbers= new int[a][a];
        int index=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(index%a<=a-1){
                    numbers[i][j]=intArr[index];
                    index++;
                }
                else{
                    break;
                }

        }}
        
        //compute primary diagonal
        int sum_primary_diagonal=0;
        int column=0;
        int row=a-1;
        for(int x=0;x<a;x++){
           sum_primary_diagonal+=numbers[column++][row--];
            }
        
        //compute secondary diagonal
        int sum_secondary_diagonal=0;
        column=0;
        row=0;
        for(int x=0;x<a;x++){
            sum_secondary_diagonal+=numbers[column++][row++];
        }
        System.out.println(Math.abs(sum_primary_diagonal-sum_secondary_diagonal)); 
     
        
    }}


