/*    */ package codingtestAndAlgorithm;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public class Day_13_B_1316
/*    */ {
/*    */   public static void main(String[] args)
/*    */   {
/*  8 */     Scanner sc = new Scanner(System.in);
/*    */ 
/* 10 */     int n = sc.nextInt();
/* 11 */     int count = 0;
/*    */ 
/* 13 */     for (int i = 0; i < n; i++) {
/* 14 */       String s = sc.next();
/* 15 */       boolean[] check = new boolean[26];
/* 16 */       boolean group = true;
/*    */ 
/* 18 */       for (int j = 0; j < s.length(); j++)
/*    */       {
/* 20 */         if (check[(s.charAt(j) - 'a')] != 0) {
/* 21 */           if (s.charAt(j) != s.charAt(j - 1)) {
/* 22 */             group = false;
/* 23 */             break;
/*    */           }
/*    */         }
/* 26 */         else check[(s.charAt(j) - 'a')] = true;
/*    */       }
/*    */ 
/* 29 */       if (group) count++;
/*    */     }
/* 31 */     System.out.println(count);
/*    */   }
/*    */ }

/* Location:           D:\코딩\eclipse workspace\first\bin\
 * Qualified Name:     codingtestAndAlgorithm.Day_13_B_1316
 * JD-Core Version:    0.6.2
 */