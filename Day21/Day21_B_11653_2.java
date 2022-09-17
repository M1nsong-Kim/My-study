/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStreamReader;
/*    */ import java.io.PrintStream;
/*    */ 
/*    */ public class Day21_B_11653_2
/*    */ {
/*    */   public static void main(String[] args)
/*    */     throws IOException
/*    */   {
/* 10 */     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*    */ 
/* 12 */     int n = Integer.parseInt(br.readLine());
/*    */ 
/* 14 */     for (int i = 2; i <= n; i++)
/*    */     {
/* 16 */       while (n % i == 0) {
/* 17 */         n /= i;
/* 18 */         System.out.println(i);
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\
 * Qualified Name:     codingtestAndAlgorithm.Day21_B_11653_2
 * JD-Core Version:    0.6.2
 */