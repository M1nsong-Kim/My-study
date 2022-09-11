/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Day15_B_2292
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     Scanner sc = new Scanner(System.in);
/*    */ 
/* 10 */     int n = sc.nextInt();
/* 11 */     int count = 1;
/* 12 */     int range = 2;
/*    */ 
/* 14 */     if (n == 1) {
/* 15 */       System.out.println(1);
/*    */     } else {
/* 17 */       while (range <= n) {
/* 18 */         range += 6 * count;
/* 19 */         count++;
/* 20 */       }System.out.println(count);
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\
 * Qualified Name:     codingtestAndAlgorithm.Day15_B_2292
 * JD-Core Version:    0.6.2
 */