/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStreamReader;
/*    */ import java.io.PrintStream;
/*    */ import java.util.StringTokenizer;
/*    */ 
/*    */ public class Day15_B_2869_2
/*    */ {
/*    */   public static void main(String[] args)
/*    */     throws IOException
/*    */   {
/* 11 */     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*    */ 
/* 13 */     StringTokenizer st = new StringTokenizer(br.readLine(), " ");
/*    */ 
/* 15 */     int a = Integer.parseInt(st.nextToken());
/* 16 */     int b = Integer.parseInt(st.nextToken());
/* 17 */     int v = Integer.parseInt(st.nextToken());
/*    */ 
/* 19 */     int day = (v - b) / (a - b);
/*    */ 
/* 21 */     if ((v - b) % (a - b) != 0)
/* 22 */       day++;
/* 23 */     System.out.println(day);
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\
 * Qualified Name:     codingtestAndAlgorithm.Day15_B_2869_2
 * JD-Core Version:    0.6.2
 */