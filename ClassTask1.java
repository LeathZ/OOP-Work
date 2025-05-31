import java.util.Arrays;
import java.util.Scanner;
public class ClassTask1 {

    public static void avg(){
        int sum=0;
        int[] array1=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<array1.length;i++){
            System.out.print("Enter:");
            int a=sc.nextInt();
            array1[i]=a;
            sum+=a;
        }
        int avg=sum/array1.length;
        System.out.println(avg);
        sc.close();
    }
    
    public static void find(){
        int[] array1={1,2,3,4};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value:");
        int val=sc.nextInt();
        for(int i=0;i<array1.length;i++){
            if(array1[i]==val){
                System.out.println("The array contains the value.");
                break;
            }
        }
    }

    public static void maxmin(){
        int[] array1={3,4,5,6};
        int max=array1[0];
        int min=array1[0];
        for(int i=0;i<array1.length;i++){
            if(array1[i]>max){
                max=array1[i];
            }
        }
        for(int i=0;i<array1.length;i++){
            if(array1[i]<min){
                min=array1[i];
            }
        }
        System.out.println("Max="+max+" Min="+min);
    }

    public static void reverse(){
        int[] array1={3,4,5,6};
        for (int i = 0; i < array1.length / 2; i++) {
            int temp = array1[i];
            array1[i] = array1[array1.length - i - 1];
            array1[array1.length - i - 1] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(array1));
    }

    public static void TwoXThree(){
        int[][] array1=new int[2][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1[i].length;j++){
                System.out.print("Enter number:");
                array1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
    }

    public static void main(String[] args){
        // avg();
        // find();
        // maxmin();
        // reverse();

        TwoXThree();
    }
}
