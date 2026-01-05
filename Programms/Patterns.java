/* Pattern 18 : dout
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

*/

class patternimplementation {
  // size should be odd.
  static int n = 9, m = 5, size = 11;

  
/* pattern 1
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
*/
  static void show1() {
    System.out.println("\nPattern 1:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
  }

/* pattern 2
    * * * * *
    *       *
    *       *
    *       *
    * * * * *
*/
  static void show2() {
    System.out.println("\nPattern 2:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || j == 0 || j == n - 1 || i == n - 1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

/* pattern 3
    *
    * *
    * * *
    * * * *
    * * * * *
*/
  static void show3() {
    System.out.println("\nPattern 3:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  /* pattern 4
    * * * * *
    * * * *
    * * *
    * *
    *
*/
  static void show4() {
    System.out.println("\nPattern 4:");
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  /* pattern 5
            *
          * *
        * * * 
      * * * *
    * * * * *
*/
  static void show5() {
    System.out.println("\nPattern 5:");
    int s = n - 1;
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < n; j++) {
        if (j >= s) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      s--;
      System.out.println();
    }
  }

  /* pattern 6
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/
  static void show6() {
    System.out.println("\nPattern 6:");
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  /* pattern 7
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
*/
  static void show7() {
    System.out.println("\nPattern 7:");
    for (int i = n; i > 0; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  /* pattern 8
    1 
    2 3 
    4 5 6
    7 8 9 10
*/
  static void show8() {
    System.out.println("\nPattern 8:");
    int s = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        if(s<10){
          System.out.print("0"+s + " ");
        }
        else{
          System.out.print(s + " ");
        }
        s++;
      }
      System.out.println();
    }
  }

  /* pattern 9
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
*/
  static void show9() {
    System.out.println("\nPattern 9:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1 ");
        } else {
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
  }

  /* Pattern 10 
            * * * * *
          * * * * *
        * * * * *
      * * * * *
    * * * * *    
*/
  static void show10() {
    System.out.println("\nPattern 10:");
    int space = n - 1;
    for (int i = 0; i < n; i++) {
      for (int k = 0; k < space; k++) {
        System.out.print("  ");
      }
      for (int k = space; k < space + 5; k++) {
        System.out.print("* ");
      }
      System.out.println();
      space--;
    }
  }
  /* Patterns 11 
        1
       2 2
      3 3 3 
     4 4 4 4 
    5 5 5 5 5
*/

  static void show11() {
    System.out.println("\nPattern 11:");
    int space = n - 1;
    for (int i = 0; i < n; i++) {
      for (int k = 0; k < space; k++) {
        System.out.print(" ");
      }
      for (int k = space; k < space + (i + 1); k++) {
        // for(int t = i+1 ; t<=i+1 ; t++){
        System.out.print((i + 1) + " ");
        // }
      }
      System.out.println();
      space--;
    }
  }

  /* Pattern 12 
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
*/

  static void show12() {
    System.out.println("\nPattern 12:");
    int space = n - 1;

    for (int i = 0; i < n; i++) {
      int number = i + 1;
      for (int j = 0; j < space; j++) {
        System.out.print("  ");
      }
      for (int j = space; j < space + (i + 1); j++) {
        System.out.print(number + " ");
        number--;
        if (number == 0) {
          number = 1;
        }
      }
      for (int j = space + (i + 1); j < (space + (i + 1)) + i; j++) {
        number++;
        System.out.print(number + " ");
      }
      space--;
      System.out.println();
    }
  }

  // int rows = 5;
  //       int num = 1;
  //       for(int i=1 ; i<=rows; i++){
  //           int star = i;
  //           for(int j=1 ; j<=rows-i ; j++){
  //               System.out.print("  ");
  //           }
  //           for(int k=1 ; k<=i*2-1 ; k++){
  //               if(k < i){
  //                   System.out.print(star+" ");
  //                   star--;
  //               }
                
  //               else{
  //                   System.out.print(star+" ");
  //                   star++;
  //               }
                
  //           }
  //           System.out.println();
  //       }

  /* Pattern 13
    *               *
    * *           * *
    * * *       * * * 
    * * * *   * * * *
    * * * * * * * * *
    * * * *   * * * *
    * * *       * * *
    * *           * *
    *               *
*/

  static void show13() {
    System.out.println("\nPattern 13:");

    int numberofstar = 1;
    int space = size - 2;
    for (int i = 0; i < size; i++) {

      for (int j = 0; j < numberofstar; j++) {
        System.out.print("* ");
      }

      for (int j = 0; j < space; j++) {
        if (i == ((size + 1) / 2) - 1) {
          continue;
        }
        System.out.print("  ");
      }
      if (space >= 3 && i < ((size + 1) / 2)) {
        space = space - 2;
      } else if (space == -1) {
        space = 1;
      } else {
        space = space + 2;
      }

      for (int j = 0; j < numberofstar; j++) {
        if (i == ((size + 1) / 2) - 1 && j == 0) {
          continue;
        }
        System.out.print("* ");
      }
      if (i >= ((size + 1) / 2) - 1) {
        numberofstar--;
      } else {
        numberofstar++;
      }

      System.out.println();
    }
  }

  
/* Pattern 14
        *
      * * *  
    * * * * *
      * * *
        *
*/
  static void show14() {
    System.out.println("\nPattern 14:");
    int space = (size - 1) / 2;
    int numofstar = 1;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < space; j++) {
        System.out.print("  ");
      }
      if (i < (size - 1) / 2) {
        space--;
      } else {
        space++;
      }

      for (int j = 0; j < numofstar; j++) {
        System.out.print("* ");
      }
      if (i < (size - 1) / 2) {
        numofstar += 2;
      } else {
        numofstar -= 2;
      }

      System.out.println();
    }
  }

  /* Pattern 15
    * 
    * *
    *   *
    *     *
    *   *
    * *
    *
*/

  static void show15() {
    System.out.println("\nPattern 15:");
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < (size + 1) / 2; j++) {
        if (j == 0 || i == j || i + j == size - 1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  /* Pattern 16
    *           *
    * *       * *
    *   *   *   *
    *     *     *
    *   *   *   *
    * *       * *
    *           *
*/
  static void show16() {
    System.out.println("\nPattern 16:");
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if (j == 0 || j == size - 1 || i + j == (size - 1) || i == j) {
          System.out.print("* ");
        }

        else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }

  


/* Pattern 17
        *****
       *   *
      *   *
     *   *
    *****    
*/
  static void show17() {
    System.out.println("\nPattern 17:");
    int space = n - 1;
    int numofstar = n;
    ;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }
      space--;
      for (int j = 0; j < numofstar; j++) {
        if (i == 0 || i == n - 1) {
          System.out.print("*");
        } else {
          if (j == 0 || j == numofstar - 1) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }

  /* Pattern 19
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5

*/

  static void show19() {
    System.out.println("\nPattern 19:");
    {
      int space = n - 1;

      for (int i = 0; i < n; i++) {
        int num = 1;
        for (int j = 0; j < space; j++) {
          System.out.print(" ");
        }
        space--;
        for (int j = 0; j < i + 1; j++) {
          System.out.print(num + " ");
          num++;
        }
        System.out.println();
      }
    }
  }

  
/* Patter 20
    1 1 1 1 1
    2 2 2 2
    3 3 2
    4 4
    5

*/


  static void show20() {
    System.out.println("\nPattern 20:");
    int num = 1;
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print(num+" ");
      }
      System.out.println();
      num++;
    }
  }

  /* Pattern 21
        15 
      14 13 
    12 11 10 
   9  8  7  6 
  5  4  3  2  1

*/

  static void show21() {
    System.out.println("\nPattern 21:");
    int num = getnumber(n);
    int space = n - 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }
      space--;
      for (int j = 0; j < i + 1; j++) {
        if (num > 9) {
          System.out.print(num + " ");
        } else {
          System.out.print(num + "  ");
        }
        num--;
      }
      System.out.println();
    }
  }

  
/* Pattern 22
        *
       ***
      *****
     *******
    *********
     *******
      *****
       ***
        *
*/

  static int getnumber(int n) {
    int number = 0;
    for (int i = n; i > 0; i--) {
      number = number + n;
      n--;
    }
    return number;
  }

  static void show22() {
    System.out.println("\nPattern 22:");
    int numofstar = 1;
    int space = ((n - 1) / 2);
    for (int i = 0; i < n; i++) {

      for (int j = 0; j < space; j++) {
        System.out.print("  ");
      }

      for (int j = 0; j < numofstar; j++) {
        System.out.print("* ");
      }
      
      if (i >= (n - 1) / 2) {
        numofstar -= 2;
        space++;
      } else {
        numofstar += 2;
        space--;
      }
      System.out.println();
    }
  }

  
/* pattern 23
        1
       2 2
      3   3
     4     4
    555555555
*/

  static void show23() {
    System.out.println("\nPattern 23:");
    int space = n - 1;
    int numofrange = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < space; j++) {
        System.out.print(" ");
      }
      space--;
      for (int j = 0; j < numofrange; j++) {
        if (i == n - 1) {
          System.out.print(i + 1);
        } else {
          if (j == 0 || j == numofrange - 1) {
            System.out.print(i + 1);
          } else {
            System.out.print(" ");
          }
        }
      }
      numofrange += 2;
      System.out.println();
    }
  }

  /* Pattern 24
    1 
    2 3 
    4 5 6 
    7 8 9 10 
    11 12 13 14 15 
*/

  static void show24() {
    System.out.println("\nPattern 24:");
    int num = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i + 1; j++) {
        if(num < 10){
          System.out.print("0"+num + " ");
        }
        else{
          System.out.print(num + " ");
        }
        num++;
      }
      System.out.println();
    }
  }

  
/* Pattern 25
                    1 
                  1 2 1 
                1 2 3 2 1 
              1 2 3 4 3 2 1 
            1 2 3 4 5 4 3 2 1 
          1 2 3 4 5 6 5 4 3 2 1 
        1 2 3 4 5 6 7 6 5 4 3 2 1 
      1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
    1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 
      1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
        1 2 3 4 5 6 7 6 5 4 3 2 1 
          1 2 3 4 5 6 5 4 3 2 1 
            1 2 3 4 5 4 3 2 1 
              1 2 3 4 3 2 1 
                1 2 3 2 1 
                  1 2 1 
                    1 

*/
  static void show25() {
    System.out.println("\nPattern 25:");
    int space = (n - 1) / 2;
    int numofrange = 1;
    for (int i = 0; i < n; i++) {
      int num = 1;
      for (int j = 0; j < space; j++) {
        System.out.print("  ");
      }

      for (int j = 0; j < numofrange; j++) {
        System.out.print(num + " ");
        if (i <= (n - 1) / 2) {
          if (j >= i) {
            num--;
          } else {
            num++;
          }
        } else {
          if (j >= (n - i) - 1) {
            num--;
          } else {
            num++;
          }
        }
      }

      if (i >= (n - 1) / 2) {
        space++;
        numofrange -= 2;
      } else {
        space--;
        numofrange += 2;
      }
      System.out.println();

    }
  }

  
}

public class Patterns {
  public static void main(String[] args) {
    patternimplementation.show1();

    patternimplementation.show2();

    patternimplementation.show3();

    patternimplementation.show4();

    patternimplementation.show5();

    patternimplementation.show6();

    patternimplementation.show7();

    patternimplementation.show8();

    patternimplementation.show9();

    patternimplementation.show10();

    patternimplementation.show11();

    patternimplementation.show12();

    patternimplementation.show13();

    patternimplementation.show14();

    patternimplementation.show15();

    patternimplementation.show16();

    patternimplementation.show17();

    patternimplementation.show19();

    patternimplementation.show20();

    patternimplementation.show21();

    patternimplementation.show22();

    patternimplementation.show23();

    patternimplementation.show24();

    patternimplementation.show25();
  }
}
