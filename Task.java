import java.util.Scanner;
//     public static void main(String[] args) {
//         System.out.print("Hello, My name is Lajesha.");
//     }
// }

//2
// public class Task{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter number:");
//         int a=sc.nextInt();
//         System.out.println("Enter number:");
//         int b=sc.nextInt();
//         int sum=a+b;
//         int diff=a-b;
//         int prod=a*b;
//         int quo=a/b;
//         System.out.printf("Sum=%d Difference=%d Product=%d Quotient=%d1",sum,diff,prod,quo);
//     }
// }

//3
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number");
//         int a=sc.nextInt();
//         if (a>0){
//             System.out.print("Positive.");
//         }
//         else if(a<0){
//             System.out.print("Negative.");
//         }
//         else if(a==0){
//             System.out.print("Zero.");
//         }
//         sc.close();
//     }
// }

//4
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a number:");
//         int a=sc.nextInt();
//         if (a%5==0 && a%11==0){
//             System.out.print("Divisible.");
//         }
//         else{
//             System.out.print("Undivisible.");
//         }
//         sc.close();
//     }
// }

//5
// public class Task{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a numnber:");
//         int a=sc.nextInt();
//         System.out.print("Enter a numnber:");
//         int b=sc.nextInt();
//         System.out.print("Enter a numnber:");
//         int c=sc.nextInt();
//         if (a>b && a>c){
//             System.out.printf("Greatest:%d",a);
//         }
//         else if (b>a && b>c){
//             System.out.printf("Greatest:%d",b);
//         }
//         else if (c>a && c>b){
//             System.out.printf("Greatest:%d",c);
//         }
//         sc.close();
//     }
// }

//6
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter a number:");
//         int a=sc.nextInt();
//         if (a%2==0){
//             System.out.print("Even.");
//         }
//         else{
//             System.out.print("Odd.");
//         }
//         sc.close();
//     }
// }

//7
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter age:");
//         int a=sc.nextInt();
//         if (a>18){
//             System.out.print("Can vote.");
//         }
//         else{
//             System.out.print("Cant vote.");
//         }
//         sc.close();
//     }
// }

//8
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter:");
//         String a=sc.nextLine();
//         String b=a.toLowerCase();
//         if (b=="a" || b=="e" || b=="i" || b=="o" || b=="u"){
//             System.out.print("Vowel.");
//         }
//         else{
//             System.out.print("Consonant.");
//         }
//         sc.close();
//     }
// }

//9
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter marks:");
//         int a=sc.nextInt();
//         System.out.print("Enter marks:");
//         int b=sc.nextInt();
//         System.out.print("Enter marks:");
//         int c=sc.nextInt();
//         System.out.print("Enter marks:");
//         int d=sc.nextInt();
//         System.out.print("Enter marks:");
//         int e=sc.nextInt();
//         int total=a+b+c+d+e;
//         float percent = ((float) total / 500) * 100;
//         System.out.printf("Total=%d \nPrecentage=%f\n",total,percent);
//         if(percent>=90 && percent<=100){
//             System.out.println("Grade:A+");
//         }
//         else if(percent>=80 && percent<90){
//             System.out.println("Grade:A");
//         }
//         else if(percent>=70 && percent<80){
//             System.out.println("Grade:B+");
//         }
//         else if(percent>=60 && percent<70){
//             System.out.println("Grade:B");
//         }
//         else if(percent>=50 && percent<60){
//             System.out.println("Grade:C+");
//         }
//         else if(percent>=40 && percent<50){
//             System.out.println("Grade:C");
//         }
//         else{
//             System.out.println("Fail.");
//         }
//         sc.close();
//     }
// }

//10
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter year:");
//         int a=sc.nextInt();
//         if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
//             System.out.println(a + " is a leap year.");
//         } else {
//             System.out.println(a + " is not a leap year.");
//         }
//         sc.close();
//     }
// }

//11
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number:");
//         int a=sc.nextInt();
//         int i=2;
//         int b=0;
//         while (i!=a-1){
//             if(a%i==0){
//                 b=b+1;
//             }
//             i+=1;
//         }
//         if(b>0){
//             System.out.print("Not Prime.");
//         }
//         else{
//             System.out.print("Prime.");
//         }
//         sc.close();
//     }
// }

//12
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number:");
//         int a=sc.nextInt();
//         for(int i=1;i<=10;i++){
//             int b=a*i;
//             System.out.print(a+"*"+i+"="+b+"\n");
//         }
//         sc.close();
//     }
// }

//13
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number:");
//         int a=sc.nextInt();
//         int b=0;
//         for(int i=1;i<=a;i++){
//             b=b+i;
//         }
//         System.out.print(b+"\n");
//         sc.close();
//     }
// }

//14
// public class Task{
//     public static void main(String[] args) {
//         for(int i=1;i<=100;i++){
//             if(i%2==0){
//                 System.out.print(i+"\n");
//             }
//         }
//     }
// }

//15
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number:");
//         int a=sc.nextInt();
//         int b=1;
//         for(int i=1;i<=a;i++){
//             b=b*i;
//         }
//         System.out.print(b);
//         sc.close();
//     }
// }

//16
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number:");
//         int a=sc.nextInt();
//         System.out.print("Enter number:");
//         int b=sc.nextInt();
//         System.out.print("Enter operation:");
//         char operator=sc.next().charAt(0);
//        switch(operator){
//         case '+':
//                 System.out.println("Result: " + (a + b));
//                 break;
//             case '-':
//                 System.out.println("Result: " + (a - b));
//                 break;
//             case '*':
//                 System.out.println("Result: " + (a * b));
//                 break;
//             case '/':
//                 System.out.println("Result: " + (a / b));
//                 break;
//             default:
//                 System.out.println("Invalid operator.");
//         }sc.close();
//     }
// }
      
//17
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number:");
//         int a=sc.nextInt();
//        switch(a){
//             case 1:
//                 System.out.println("Sunday");
//                 break;
//             case 2:
//                 System.out.println("Monday");
//                 break;
//             case 3:
//                 System.out.println("Tuesday");
//                 break;
//             case 4:
//                 System.out.println("Wednesday");
//                 break;
//             case 5:
//                 System.out.println("Thursday");
//                 break;
//             case 6:
//                 System.out.println("Friday");
//                 break;
//             case 7:
//                 System.out.println("Saturday");
//                 break;
//             default:
//                 System.out.println("Error");
//         }sc.close();
//     }
// }

//18
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number:");
//         int a=sc.nextInt();
//        switch(a){
//             case 1:
//                 System.out.println("January=31 days");
//                 break;
//             case 2:
//                 System.out.println("February=28 days");
//                 break;
//             case 3:
//                 System.out.println("March=31 days");
//                 break;
//             case 4:
//                 System.out.println("April=30 days");
//                 break;
//             case 5:
//                 System.out.println("May=31 days");
//                 break;
//             case 6:
//                 System.out.println("June=30 days");
//                 break;
//             case 7:
//                 System.out.println("July=31 days");
//                 break;
//             case 8:
//                 System.out.println("August=31 days");
//                 break;
//             case 9:
//                 System.out.println("September=30 days");
//                 break;
//             case 10:
//                 System.out.println("October=31 days");
//                 break;
//             case 11:
//                 System.out.println("November=30 days");
//                 break;
//             case 12:
//                 System.out.println("December=31 days");
//                 break;
//             default:
//                 System.out.println("Error");
//         }sc.close();
//     }
// }

//19
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter char:");
//         char operator=sc.next().charAt(0);
//        switch(operator){
//             case 'a':
//                 System.out.println("Vowel.");
//                 break;
//             case 'e':
//                 System.out.println("Vowel.");
//                 break;
//             case 'i':
//                 System.out.println("Vowel.");
//                 break;
//             case 'o':
//                 System.out.println("Vowel.");
//                 break;
//             case 'u':
//                 System.out.println("Vowel.");
//                 break;
//             default:
//                 System.out.println("Not vowel.");
//         }sc.close();
//     }
// }

//20
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number:");
//         int a=sc.nextInt();
//         int b=0;
//         for (int i = 1; i <= a / 2; i++) {
//             if (i * i == a) {
//                 b=b+1;
//                 break;
//             }
//         }
//         if (b==1){
//             System.out.println("It is a perfect square.");
//         }
//         else{
//             System.out.println("It isnt a perfect square.");
//         }
//         sc.close();
//     }
// }

//21
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number:");
//         int a=sc.nextInt();
//         int b=0;
//         while (a>0){
//             int c=a%10;
//             b+=c;
//             a/=10;
//         }
//         System.out.print("Sum="+b);
//         sc.close();
//     }
// } 

//22
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number:");
//         int a=sc.nextInt();
//         int b=0;
//         while (a>0){
//             int c=a%10;
//             b=b*10+c;
//             a/=10;
//         }
//         System.out.print("Reverse="+b);
//         sc.close();
//     }
// } 

//23
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number:");
//         int a=sc.nextInt();
//         int check=a;
//         int b=0;
//         while (a>0){
//             int c=a%10;
//             b=b*10+c;
//             a/=10;
//         }
//         if (check==b){
//             System.out.print("Palindrome.");
//         }
//         else{
//             System.out.print("Not palindrome.");
//         }
//         sc.close();
//     }
// }

//24
// public class Task{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number of terms: ");
//         int n = sc.nextInt();
//         int a = 0, b = 1;
//         System.out.print("Fibonacci Series: ");
//         for (int i = 1; i <= n; i++) {
//             System.out.print(a + " ");
//             int next = a + b;
//             a = b;
//             b = next;
//         }
//         sc.close();
//     }
// }

//25
public class Task{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int a=sc.nextInt();
        int b=0;
        while (a>0){
            a/=10;
            b=b+1;
        }
        System.out.print("No.of Digits="+b);
        sc.close();
    }
}