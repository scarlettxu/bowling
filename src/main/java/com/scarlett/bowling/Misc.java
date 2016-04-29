package com.scarlett.bowling;

import sun.tools.java.ScannerInputReader;

import java.util.Scanner;

/**
 * Created by scarlettxu on 16-4-6.
 */
public class Misc {

    public static void printN1(int N){
        for (int i=1;i<=N;i++){
            System.out.print(i);
        }
    }

    /*递归需要占用大量的空间*/
    public static void printN2(int N){
        if (N>0){
            printN2(N-1);
            System.out.printf("%1$-2d",N);
        }
    }

    public static double plus1(int n, double a[], double x){
        double p = a[0];
        for (int i=1;i<=n;i++){
            p = p+a[i]*Math.pow(x,i);
        }
        return p;
    }

/*乘除法所用的时间远大于加减法,看时间复杂度主要看乘除法的次数,加减法可以忽略不计*/
    public static double plus2(int n,double a[],double x){
        double p=a[n];
        for (int i=n;i>0;i--){
            p=a[i-1]+x*p;
        }
        return p;
    }

    public static void maxSubseqSum(int a[],int n){
        int thisSum = 0;
        int maxSum =0;
        for (int i=0;i<n;i++){
            thisSum +=a[i];
            if (thisSum>maxSum) maxSum = thisSum;
            else if (thisSum<0) thisSum=0;
        }
        System.out.print(maxSum);
    }

//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int F = scanner.nextInt();
//        int C = (int)(5.0/9*(F-32));
//        scanner.close();
//        System.out.println(C);
//    }


//    public static void main(String[] args){
//        Scanner scanner =  new Scanner(System.in);
//        int type = scanner.nextInt();
//        switch (type){
//            case 1:
//                System.out.print(1);break;
//            case 2:
//                System.out.print(2);break;
//            case 3:
//                System.out.print(3);break;
//            case 4:
//                System.out.print(4);break;
//            case 5:
//                System.out.print(5);break;
//        }
//    }

//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int BJT = scanner.nextInt();
//        int h = BJT/100;
//        int m = BJT%100;
//        if (h>23 || m>59) System.out.println("Invalid input");
//        int UTCH = h-8;
//        if (UTCH < 0 ) UTCH+=24;
//        int UTC = UTCH*100+m;
//        System.out.println(UTC);
//    }

//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int signal = scanner.nextInt();
//        int R = signal/10;
//        int S = signal%10;
//        String readable = "";
//        switch (R){
//            case 1: readable="Unreadable";
//                break;
//            case 2: readable = "Barely readable, occasional words distinguishable";
//                break;
//            case 3: readable = "Readable with considerable difficulty";
//                break;
//            case 4: readable ="Readable with practically no difficulty";
//                break;
//            case 5: readable ="Perfectly readable";
//                break;
//            default: readable="Unreadable";
//                break;
//        }
//        String strenth = "";
//        switch (S){
//            case 1: strenth = "Faint signals, barely perceptible";
//                break;
//            case 2: strenth ="Very weak signals";
//                break;
//            case 3: strenth="Weak signals";
//                break;
//            case 4: strenth="Fair signals";
//                break;
//            case 5: strenth="Fairly good signals";
//                break;
//            case 6: strenth="Good signals";
//                break;
//            case 7: strenth="Moderately strong signals";
//                break;
//            case 8: strenth="Strong signals";
//                break;
//            case 9: strenth="Extremely strong signals";
//                break;
//            default: strenth="Faint signals, barely perceptible";
//                break;
//        }
//
//        System.out.println(strenth+", "+readable.toLowerCase()+".");
//    }
//
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int balance = 0;
//        while (true){
//            System.out.print("请投币:");
//            int amount = scanner.nextInt();
//            balance = balance+amount;
//            if (balance>=10) {
//                System.out.println("票价10元,出票成功");
//                int change = balance - 10;
//                System.out.println("找零:" + change);
//                balance = 0;
//            }
//        }
//    }

//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//        int count = 0;
//        do {
//            input = input/10;
//            count++;
//
//        }while (input>0);
//        System.out.println("count="+count);
//    }

//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int count = scanner.nextInt();
//        do {
//            System.out.println(count);
//            count--;
//        }while (count>0);
//        System.out.println("count: "+count);
//    }

//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        int count =0;
//        int input =0;
//        double divide = 0.0;
//        do {
//            input = scanner.nextInt();
//            if (input != -1) {
//                sum +=input;
//                count ++;
//            }
//        }while (input !=-1);
//        if (count>0){
//            divide = (double) sum/count;
//        }
//        System.out.println(divide);
//    }

//    public static void main(String[] args){
//        int number = (int)(Math.random()*100+1);
//        int count =0;
//        Scanner scanner = new Scanner(System.in);
//        int guess =0;
//        do {
//            guess = scanner.nextInt();
//            count++;
//            if (guess>number) System.out.println("大了");
//            if (guess<number) System.out.println("小了");
//        }while (guess!=number);
//        if (guess==number) System.out.println("恭喜你,猜对了!猜了 "+count+"次");
//    }

//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int mod = 0;
//        int result = 0;
//        do {
//            mod = number%10;
//            number = number/10;
//            result = result*10+mod;
//        } while (number>0);
//        System.out.println(result);
//    }

//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        double sum = 0.0;
//        int sign = 1;
//        for (int i=1;i<=n;i++,sign=-sign){
//            sum += sign*1.0/i;
//        }
//        System.out.println(sum);
//        System.out.printf("%.2f",sum);
//    }


//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
////        int factor =1;
////        for (int i=2;i<=b&&i<=a;i++){
////            if (a%i==0&&b%i==0) factor = i;
////        }
////        System.out.println(factor);
//        while (b!=0) {
//            int r = a%b;
//            a = b;
//            b = r;
//        }
//        System.out.println(a);
//    }

//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int number = 0;
//        int oddCount = 0;
//        int evenCount = 0;
//        do {
//            number = in.nextInt();
//            if (number != -1) {
//                if (number % 2 == 1) oddCount++;
//                else evenCount++;
//            }
//        }while (number != -1);
//        System.out.print(oddCount+" "+evenCount);
//    }

//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int number = in.nextInt();
//        int result = 0;
//        int mod = 0;
//        int count = 1;
//
//        while (number>0&&number<=100000) {
//            mod = number % 10;
//            if (mod % 2 == count % 2) {
//                result +=Math.pow(2,count-1);
//            }
//            number = number / 10;
//            count++;
//        }
//        System.out.println(result);
//    }
//
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int count =1;
//        int sum = 0;
//        for (int i=2;count<=m;i++){
//            if (isPrime(i)){
//                if (count>=n) sum+=i;
//                count++;
//            }
//        }
//        System.out.println(sum);
//    }
//    private static boolean isPrime(int n){
//        boolean isPrime = true;
//        for (int i=2;i<Math.sqrt(n)+1;i++){
//            if (n!=2&&n%i==0) {
//                isPrime = false;
//                break;
//            }
//        }
//        return isPrime;
//    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        String result="";
        int digit =0;
        int abs = Math.abs(number);
        while (abs>0){
            digit = abs%10;
            abs = abs/10;
            result=pinyin(digit)+" "+result;
        }
        if (number<0) result="fu "+result;
        if (number==0) result="ling";
        System.out.println(result.trim());
    }

    private static String pinyin(int n){
        String pinyin="";
        switch (n){
            case 0: pinyin="ling";
                break;
            case 1: pinyin="yi";
                break;
            case 2: pinyin="er";
                break;
            case 3: pinyin="san";
                break;
            case 4: pinyin="si";
                break;
            case 5: pinyin="wu";
                break;
            case 6: pinyin="liu";
                break;
            case 7: pinyin="qi";
                break;
            case 8:pinyin="ba";
                break;
            case 9:pinyin="jiu";
                break;
        }
        return pinyin;
    }
}

