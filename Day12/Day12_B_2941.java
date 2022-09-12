/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Day12_B_2941
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     Scanner sc = new Scanner(System.in);
/*    */ 
/* 10 */     String[] change = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
/*    */ 
/* 12 */     String s = sc.next();
/*    */ 
/* 14 */     for (int i = 0; i < 8; i++) {
/* 15 */       if (s.contains(change[i]))
/* 16 */         s = s.replace(change[i], "@");
/*    */     }
/* 18 */     System.out.println(s.length());
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\
 * Qualified Name:     codingtestAndAlgorithm.Day12_B_2941
 * JD-Core Version:    0.6.2
 */