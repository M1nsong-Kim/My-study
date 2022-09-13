/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Day17_B_2839
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     Scanner sc = new Scanner(System.in);
/*    */ 
/* 10 */     int n = sc.nextInt();
/*    */ 
/* 12 */     int answer = 0;
/*    */     do
/*    */     {
/* 15 */       if (n % 5 == 0) {
/* 16 */         answer += n / 5;
/* 17 */         System.out.println(answer);
/* 18 */         break;
/*    */       }
/* 20 */       n -= 3;
/* 21 */       answer++;
/*    */     }
/*    */ 
/* 24 */     while (n >= 0);
/* 25 */     System.out.println(-1);
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\codingtestAndAlgorithm\Day17\
 * Qualified Name:     codingtestAndAlgorithm.Day17_B_2839
 * JD-Core Version:    0.6.2
 */