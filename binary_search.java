class binary_search{
  public static void main(String[] args) {
    int array_range = 1024;
    int array[] = new int[array_range];
    int item_to_search = 1024;
    int low = 0, mid, guess, i;
    int high = array_range-1;

    for (i=0; i<array_range; i++){
      array[i] = i + 1;
    }

    while (low <= high){
      mid = (low + high)/2;
      guess = array[mid];
      System.out.println(guess);

      if (guess == item_to_search){
        System.out.println("Item is: " + array[mid]);
        break;
      }

      if (guess < item_to_search)
        low = mid + 1;

      else
        high = mid - 1;
    }
  }
}
