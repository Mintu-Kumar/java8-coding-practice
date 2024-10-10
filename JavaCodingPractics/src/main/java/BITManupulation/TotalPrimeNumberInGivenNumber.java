package BITManupulation;

import java.util.Arrays;

public class TotalPrimeNumberInGivenNumber {

    /**
     * hme ek number diya hua hai or batana h iss number tak kitne prime h isme
     * example  12 =  2,3,5,7,11
     */

    static boolean[]  seiveOfEratoSthenes(int n){

        boolean isPrime[] =  new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0] =  false;
        isPrime[1] =  false;

        for(int i =2; i*i<=n;i++){

            for(int j=2*i;j<n;j+=i){
                isPrime[j] =  false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args){
//        boolean[] res = seiveOfEratoSthenes(20);
//       for(int i=0;i<20;i++)
//            System.out.println(i+"="+res[i]);

//       int g = gcd(24,60);
//        System.out.println(g);

        System.out.println(fastPower(3,5));
    }

    static int fastPower(int a, int b){
         int res = 1;
        while(b>0){
            if((b&1) !=0)
                res =  res*a;

            a =  a*a;
            b =  b>>1;
        }
        return  res;
    }

    static int gcd(int a, int b){

        if(b==0)
            return a;

        return gcd(b,a%b);
    }
}
