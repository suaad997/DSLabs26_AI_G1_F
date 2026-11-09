package Array;

import java.util.Scanner;

public class Arrayss {
    Scanner scanner =new Scanner(System.in);

public void traverSal(int []a){
    for(int i=0; i<a.length;i++)
        System.out.println("Index["+i+"]="+a[i]);
}
public void revers_traverSal(int []a){
        for(int i=a.length-1; i>=0;i--)
            System.out.println("Index["+i+"]="+a[i]);
    }
public void  traverSal2(int []a){
    for(int e: a)
            System.out.println(e);

}

public void input(int []a){
    System.out.println("Enter "+a.length+" elements:");
    for(int i=0; i<a.length;i++)
        a[i]=scanner.nextInt();
}


}
