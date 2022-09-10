/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Day14_B_1712
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     Scanner sc = new Scanner(System.in);
/*    */ 
/* 10 */     int a = sc.nextInt();
/* 11 */     int b = sc.nextInt();
/* 12 */     int c = sc.nextInt();
/*    */ 
/* 14 */     long n = 0L;
/*    */ 
/* 16 */     if (b < c) {
/*    */       do
/* 18 */         n += 1L;
/* 19 */       while (a + b * n >= c * n);
/*    */     }
/*    */     else
/*    */     {
/* 23 */       n = -1L;
/* 24 */     }System.out.println(n);
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\
 * Qualified Name:     codingtestAndAlgorithm.Day14_B_1712
 * JD-Core Version:    0.6.2
 */