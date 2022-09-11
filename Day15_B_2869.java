/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Day15_B_2869
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     Scanner sc = new Scanner(System.in);
/*    */ 
/* 10 */     int a = sc.nextInt();
/* 11 */     int b = sc.nextInt();
/* 12 */     int v = sc.nextInt();
/*    */ 
/* 14 */     int day = (v - b) / (a - b);
/*    */ 
/* 16 */     if ((v - b) % (a - b) != 0) {
/* 17 */       day++;
/*    */     }
/* 19 */     System.out.println(day);
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\
 * Qualified Name:     codingtestAndAlgorithm.Day15_B_2869
 * JD-Core Version:    0.6.2
 */