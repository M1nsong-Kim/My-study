/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Day20_B_2581
/*    */ {
/*    */   public static boolean[] prime;
/*    */ 
/*    */   public static void main(String[] args)
/*    */   {
/* 11 */     Scanner in = new Scanner(System.in);
/*    */ 
/* 13 */     int M = in.nextInt();
/* 14 */     int N = in.nextInt();
/*    */ 
/* 16 */     prime = new boolean[N + 1];
/* 17 */     get_prime();
/*    */ 
/* 21 */     int sum = 0;
/* 22 */     int min = 2147483647;
/* 23 */     for (int i = M; i <= N; i++) {
/* 24 */       if (prime[i] == 0) {
/* 25 */         sum += i;
/* 26 */         if (min == 2147483647) {
/* 27 */           min = i;
/*    */         }
/*    */       }
/*    */     }
/*    */ 
/* 32 */     if (sum == 0) {
/* 33 */       System.out.println(-1);
/*    */     }
/*    */     else {
/* 36 */       System.out.println(sum);
/* 37 */       System.out.println(min);
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void get_prime()
/*    */   {
/* 45 */     prime[0] = true;
/* 46 */     prime[1] = true;
/*    */ 
/* 48 */     for (int i = 2; i <= Math.sqrt(prime.length); i++)
/* 49 */       for (int j = i * i; j < prime.length; j += i)
/* 50 */         prime[j] = true;
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\
 * Qualified Name:     codingtestAndAlgorithm.Day20_B_2581
 * JD-Core Version:    0.6.2
 */