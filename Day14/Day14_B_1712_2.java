/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStreamReader;
/*    */ import java.io.PrintStream;
/*    */ import java.util.StringTokenizer;
/*    */ 
/*    */ public class Day14_B_1712_2
/*    */ {
/*    */   public static void main(String[] args)
/*    */     throws IOException
/*    */   {
/* 11 */     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*    */ 
/* 13 */     StringTokenizer st = new StringTokenizer(br.readLine(), " ");
/* 14 */     int a = Integer.parseInt(st.nextToken());
/* 15 */     int b = Integer.parseInt(st.nextToken());
/* 16 */     int c = Integer.parseInt(st.nextToken());
/*    */ 
/* 18 */     long n = 0L;
/*    */ 
/* 20 */     if (b < c) {
/*    */       do
/* 22 */         n += 1L;
/* 23 */       while (a + b * n >= c * n);
/*    */     }
/*    */     else
/*    */     {
/* 27 */       n = -1L;
/* 28 */     }System.out.println(n);
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\
 * Qualified Name:     codingtestAndAlgorithm.Day14_B_1712_2
 * JD-Core Version:    0.6.2
 */