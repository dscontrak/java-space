import java.util.*;

public class Main {
    // https://www.java67.com/2016/05/fibonacci-series-in-java-using-recursion.html
    public static void main(String[] args) {
        final int n = 7;
        myFibonnaci(n);
        myFibonnaciLists(n);       

    }

    public static void myFibonnaciLists (int n){
        List<Integer> values = new ArrayList<>(List.of(1,1));
        int index = 0;

        while(index < (n - 1)){            
            if(index >= 1){
                values.add(values.get( index - 1 ) + values.get(index));
            }            
            index++;
        }

        System.out.println(values);

    }

    public static void myFibonnaci(int n){
        int index = 1;        
        int[] values = new int[]{1,1};
        while(index < n ){            
            if(index == 1){
                System.out.println(values[0]);    
            }else{
                int  aux = values[0];
                values[0] = values[1];
                values[1] = aux + values[0];
            }
            
            System.out.println(values[1]);                        
            index++;

        }
    }
}