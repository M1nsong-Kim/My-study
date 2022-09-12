/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Day16_B_10250
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     Scanner sc = new Scanner(System.in);
/*    */ 
/* 10 */     int t = sc.nextInt();
/*    */ 
/* 13 */     for (int i = 0; i < t; i++)
/*    */     {
/* 15 */       int h = sc.nextInt();
/* 16 */       int w = sc.nextInt();
/* 17 */       int n = sc.nextInt();
/*    */ 
/* 19 */       if (n % h == 0)
/* 20 */         System.out.println(h * 100 + n / h);
/*    */       else
/* 22 */         System.out.println(n % h * 100 + n / h + 1);
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\codingtestAndAlgorithm\Day16\
 * Qualified Name:     codingtestAndAlgorithm.Day16_B_10250
 * JD-Core Version:    0.6.2
 */