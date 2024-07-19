import java.sql.SQLOutput;

public class checkElement2d {

    int findPosition(int[][] matrix ,int first, int last, int target){
        int mid = first+ (last - first)/2;
        if(first > last){
            return -1;
        }

//        System.out.println("Mid: "+mid+"\nFirst: "+first+"\nLast: "+last);
        if(matrix[mid/matrix[0].length][mid%matrix[0].length] == target){
            return mid;
        }else if(matrix[mid/matrix.length][mid%matrix.length]>target){
            return findPosition(matrix,first,mid-1,target);
        }else{
            return findPosition(matrix,mid+1,last,target);
        }
    }

    public static void main(String[] args) {
        checkElement2d obj = new checkElement2d();
        int[][] arr = new int[][]{{1,3,5},{7,11,19},{23,27,31},{44,51,60}};
        int ans = obj.findPosition(arr,0,(arr.length*arr[0].length)-1,1);
        System.out.printf("Position of %d element int the array: %d",31,ans);
    }
}
