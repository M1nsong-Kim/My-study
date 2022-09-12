/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Day12_B_2941_2
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     Scanner sc = new Scanner(System.in);
/*    */ 
/* 10 */     String[] change = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
/* 11 */     String s = sc.next();
/*    */ 
/* 13 */     for (int i = 0; i < change.length; i++) {
/* 14 */       if (s.contains(change[i]))
/* 15 */         s = s.replace(change[i], "@");
/*    */     }
/* 17 */     System.out.println(s.length());
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\
 * Qualified Name:     codingtestAndAlgorithm.Day12_B_2941_2
 * JD-Core Version:    0.6.2
 */