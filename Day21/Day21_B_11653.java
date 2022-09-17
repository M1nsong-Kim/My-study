/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Day21_B_11653
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  7 */     Scanner sc = new Scanner(System.in);
/*    */ 
/*  9 */     int n = sc.nextInt();
/*    */ 
/* 11 */     for (int i = 2; i <= n; i++)
/*    */     {
/* 13 */       while (n % i == 0) {
/* 14 */         n /= i;
/* 15 */         System.out.println(i);
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\
 * Qualified Name:     codingtestAndAlgorithm.Day21_B_11653
 * JD-Core Version:    0.6.2
 */