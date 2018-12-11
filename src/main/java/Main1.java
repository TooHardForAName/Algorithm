package src;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(new Main1().get(str));

    }
    public  int get(String str){
        int sum =0;
        int max=0;
        char []chars = str.toCharArray();
        int [] arr = new int[256];
        for(int i=0;i<chars.length;i++){
            arr[chars[i]]++;
        }

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                max=arr[i];
            }
        }
        int maxOne=0;
        int secondOne=0;
        int secondMax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                maxOne=i;
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && i!=maxOne){
                if(arr[i]>secondMax){
                    secondMax=arr[i];
                    secondOne=i;
                }
            }
        }
        arr[maxOne]+=arr[secondOne];
        arr[secondOne]=0;

        for(int j=0;j<arr.length;j++){
            sum+=arr[j]*arr[j];
        }

        return sum;
    }

}
