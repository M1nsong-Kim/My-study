/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Day15_B_1193_2
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     Scanner sc = new Scanner(System.in);
/*    */ 
/* 10 */     int x = sc.nextInt();
/* 11 */     int n = 0;
/* 12 */     int last = 0;
/*    */ 
/* 14 */     int top = 0;
/* 15 */     int bottom = 0;
/*    */ 
/* 17 */     while (last < x) {
/* 18 */       n++;
/* 19 */       last = n * (n + 1) / 2;
/*    */     }
/*    */ 
/* 22 */     if (n % 2 != 0) {
/* 23 */       top = last - x + 1;
/* 24 */       bottom = n - last + x;
/*    */     } else {
/* 26 */       top = n - last + x;
/* 27 */       bottom = last - x + 1;
/*    */     }
/* 29 */     System.out.println(top + "/" + bottom);
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\
 * Qualified Name:     codingtestAndAlgorithm.Day15_B_1193_2
 * JD-Core Version:    0.6.2
 */