/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Day14_B_1712_3
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     Scanner sc = new Scanner(System.in);
/*    */ 
/* 10 */     int a = sc.nextInt();
/* 11 */     int b = sc.nextInt();
/* 12 */     int c = sc.nextInt();
/*    */ 
/* 14 */     int n = 0;
/* 15 */     if (b < c)
/* 16 */       n = a / (c - b) + 1;
/* 17 */     else n = -1;
/* 18 */     System.out.println(n);
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\
 * Qualified Name:     codingtestAndAlgorithm.Day14_B_1712_3
 * JD-Core Version:    0.6.2
 */