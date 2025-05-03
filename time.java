import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[1000001];
        int[] arr2 = new int[1000001];

        int index=0;
        int val=0;

        for(int i=0; i<n; i++){
            String a = sc.next();
            int b = sc.nextInt();
            if(a.equals("R")){
                for(int j=0; j<b;j++){
                    arr1[++index] = ++val;
                }
            }else{
                for(int j=0; j<b;j++){
                    arr1[++index] = --val;
                }
            }
        }
        index=0;
        val=0;
        for(int i=0; i<m; i++){
            String a = sc.next();
            int b = sc.nextInt();
            if(a.equals("R")){
                for(int j=0; j<b;j++){
                    arr2[++index] = ++val;
                }
            }else{
                for(int j=0; j<b;j++){
                    arr2[++index] = --val;
                }
            }
        }
       
        int result = -1;
        for(int i=1; i<=index; i++){
            if(arr1[i]==arr2[i]){
                result=i;
                break;
            }
        }

       
        System.out.println(result);
    }
}