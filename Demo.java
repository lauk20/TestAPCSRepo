public class Demo{

  public static String arrToString(int[] arr){
    String result = "{";

    for (int i = 0; i < arr.length; i++){
      result = result + String.valueOf(arr[i]);
      if (i != arr.length - 1){
        result = result + ", ";
      }
    }
    result = result + "}";

    return result;
  }

  public static String arrayDeepToString(int[][] arr){
    String result = "{";

    for (int i = 0; i < arr.length; i++){
      result = result + arrToString(arr[i]);
      if (i != arr.length - 1){
        result = result + ", ";
      }
    }
    result = result + "}";

    return result;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue){
    int[][] newArray = new int[rows][cols];

    for (int i = 0; i < rows; i++){
      for (int j = 0; j < cols; j++){
        newArray[i][j] = (int)(Math.random() * (maxValue + 1));
      }
    }

    return newArray;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
    int[][] newArray = new int[rows][];

    for (int i = 0; i < rows; i++){
      newArray[i] = create2DArray(1, (int)(Math.random() * (cols + 1)), maxValue)[0];
    }

    return newArray;
  }

  public static void printLoop(int n){
   for (int i = 1; i <= n; i++){
     for (int v = 0; v <= n - i; v++){
       System.out.print(i);
     }
     System.out.println();
   }
 }

  public static void main(String[] args){
    int[] a = {1, 2};
    int[] b = {1, 2, 3};
    int[] c = {1, 2, 3, 4};
    int[] d = {1, 2, 3 ,4 ,5};
    int[] e = {1, 2, 3, 4, 5, 6};
    int[][] test = new int[5][];

    test[0] = a;
    test[1] = b;
    test[2] = c;
    test[3] = d;
    test[4] = e;

    System.out.println(arrToString(e));
    System.out.println(arrayDeepToString(test));
    System.out.println(arrayDeepToString(create2DArray(6, 2, 3)));
    System.out.println(arrayDeepToString(create2DArrayRandomized(6, 4, 4)));
    System.out.println(arrayDeepToString(create2DArrayRandomized(4,10,100)));
    System.out.println(arrayDeepToString(create2DArrayRandomized(2,10,1)));
    printLoop(5);
  }
}
