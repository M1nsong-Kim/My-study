/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Day19_B_1978
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     Scanner sc = new Scanner(System.in);
/*    */ 
/* 10 */     int n = sc.nextInt();
/* 11 */     int count = 0;
/*    */ 
/* 13 */     for (int i = 0; i < n; i++) {
/* 14 */       boolean isPrime = true;
/*    */ 
/* 16 */       int num = sc.nextInt();
/*    */ 
/* 18 */       if (num != 1)
/*    */       {
/* 22 */         for (int j = 2; j <= Math.sqrt(num); j++) {
/* 23 */           if (num % j == 0) {
/* 24 */             isPrime = false;
/* 25 */             break;
/*    */           }
/*    */         }
/* 28 */         if (isPrime)
/* 29 */           count++; 
/*    */       }
/*    */     }
/* 31 */     System.out.println(count);
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\
 * Qualified Name:     codingtestAndAlgorithm.Day19_B_1978
 * JD-Core Version:    0.6.2
 */