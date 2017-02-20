import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        HashMap<String, String> hM=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String key;
        String value;
        for(int i=0; i<n; i++){
            key=sc.next();
            value=sc.next();
            hM.put(key, value);
        }
        n=sc.nextInt();
        for(int i=0; i<n; i++){
            key=sc.next();
            if(hM.get(key)!=null){
                System.out.println(hM.get(key));
                hM.remove(key);
            }else System.out.println("null");
        }
        System.out.println(hM.size());
    }
}