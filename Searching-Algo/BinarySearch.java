import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Score[] = {10,20,25,30,45,60,76};
    int target = sc.nextInt();
    int resultIndex = binary(Score, target);
    if(resultIndex == -1) {
        System.out.println("Cant find the target");
    } else {
        System.out.println(target + " is found at the index" + resultIndex);
    }

}

public static int binary(int []Score, int target) {
  int left =0;
  int right = Score.length - 1;
while(left <= right) {
  int mid = (left + right)/2;

  if(Score[mid] == target) {
    return mid;
  }
  if(Score[mid] < target) {
    left = mid + 1;
  } else {
    right = mid - 1;
  }
}
return -1;
}
}