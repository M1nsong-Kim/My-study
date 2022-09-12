/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Day16_B_2775
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     Scanner sc = new Scanner(System.in);
/*    */ 
/* 10 */     int[][] apt = new int[15][15];
/*    */ 
/* 12 */     for (int i = 0; i < 15; i++) {
/* 13 */       apt[i][1] = 1;
/* 14 */       apt[0][i] = i;
/*    */     }
/*    */ 
/* 17 */     for (int i = 1; i < 15; i++)
/*    */     {
/* 19 */       for (int j = 2; j < 15; j++) {
/* 20 */         apt[i][j] = (apt[i][(j - 1)] + apt[(i - 1)][j]);
/*    */       }
/*    */     }
/*    */ 
/* 24 */     int t = sc.nextInt();
/*    */ 
/* 26 */     for (int i = 0; i < t; i++) {
/* 27 */       int k = sc.nextInt();
/* 28 */       int n = sc.nextInt();
/*    */ 
/* 30 */       System.out.println(apt[k][n]);
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\codingtestAndAlgorithm\Day16\
 * Qualified Name:     codingtestAndAlgorithm.Day16_B_2775
 * JD-Core Version:    0.6.2
 */