import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int K =sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(get(K,arr));

    }

    private static int get(int k,int[] arr) {

        if(getCount(arr)>k){
            return 0;
        }
        int[] arr1=arr;
        Arrays.sort(arr1);
        if(getCount(arr1)<arr1[0]){
            return getCount(arr1);
        }
        return k-getCount(arr1);
    }

    private static int getCount(int[] arr) {
        Map<Integer,Integer> t=new HashMap<>();
        for(int i:arr) t.put(i, t.containsKey(i)?t.get(i)+1:1);
        int count =0;
        int key=0;
        for(Map.Entry<Integer, Integer> e:t.entrySet()){
            if(e.getValue()>count){
                count=e.getValue();
                key=e.getKey();
            }
        }

        return count;
    }

}
