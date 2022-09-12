/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Day15_B_2292_2
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     Scanner sc = new Scanner(System.in);
/*    */ 
/* 10 */     int n = sc.nextInt();
/*    */ 
/* 12 */     int count = 1;
/* 13 */     int range = 2;
/*    */ 
/* 15 */     if (n == 1) {
/* 16 */       System.out.println(1);
/*    */     } else {
/* 18 */       while (range <= n) {
/* 19 */         range += 6 * count;
/* 20 */         count++;
/* 21 */       }System.out.println(count);
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\
 * Qualified Name:     codingtestAndAlgorithm.Day15_B_2292_2
 * JD-Core Version:    0.6.2
 */