public class Demo{
  public static void printLoop(int n){
    for (int i = 1; i <= n; i++){
      for (int v = 0; v <= n - i; v++){
        System.out.print(i);
      }
      System.out.println();
    }
  }
  public static void main(String[] args){
    if (args.length == 0){
      printLoop(5);
    }
    else{
      printLoop(Integer.parseInt(args[0]));
    }
  }
}
