import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr_index[] = new int[arr_size];
      for(int index = 0; index <= arr_size-1; index++)
      {
        arr_index[index] = in.nextInt();
      }
      int search_elem1 = in.nextInt();
      int search_elem2 = in.nextInt();
      int elem_index1 = -1;
      int elem_index2 = -1;
      for(int index = 0; index <=arr_size-1; index++)
      {
        if(search_elem1 == arr_index[index])
          elem_index1 = index;
        if(search_elem2 == arr_index[index])
          elem_index2 = index;
      }
      System.out.println(elem_index1);
      System.out.println(elem_index2);
      
      // Type your code here
    }
}