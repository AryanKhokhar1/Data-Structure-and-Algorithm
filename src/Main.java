class Main {
    static boolean checkequal(int[] nums){
        System.out.println("incheck()");
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1] != nums[i]){
                return false;
            }
        }
        return true;
    }
    static int[][] least_number_indexes(int[] nums){
        int[] a = new int[2];
        int[] b = new int[2];
        a[1] = Integer.MAX_VALUE;
        b[1] = Integer.MAX_VALUE;
        a[0] = -1;
        b[0] = -1;
        for(int i =0; i<nums.length; i++){
            if(nums[i] <= a[1]){
                b[0] = a[0];
                a[0] = i;
                b[1] = a[1];
                a[1] = nums[i];
            }else if(nums[i] != a[1] && nums[i] < b[1]){
                b[1] = nums[i];
                b[0] = i;
            }
        }
//        System.out.println(a[1]);
//        System.out.println(b[1]);
        return new int[][]{a,b};
    }
    public static void main(String[] args){
        int nums[] = {1,2};
        int answer = 0;
        System.out.println("Array = "+nums);
        int[][] arr = least_number_indexes(nums);
        System.out.println(arr[0][0]+" = "+arr[0][1]);
        System.out.println(arr[1][0]+" = "+arr[1][1]);
        nums[arr[0][0]] += 1;
        nums[arr[1][0]] += 1;
        for(int ele: nums){
            System.out.print(ele+",");
        }


        arr = least_number_indexes(nums);
        System.out.println();
        System.out.println(arr[0][0]+" = "+arr[0][1]);
        System.out.println(arr[1][0]+" = "+arr[1][1]);
        nums[arr[0][0]] += 1;
        nums[arr[1][0]] += 1;
        for(int ele: nums){
            System.out.print(ele+",");
        }

        arr = least_number_indexes(nums);
        System.out.println();
        System.out.println(arr[0][0]+" = "+arr[0][1]);
        System.out.println(arr[1][0]+" = "+arr[1][1]);
        nums[arr[0][0]] += 1;
        nums[arr[1][0]] += 1;
        for(int ele: nums){
            System.out.print(ele+",");
        }


//        arr = least_number_indexes(nums);
//        System.out.println(arr[0][0]+" = "+arr[0][1]);
//        System.out.println(arr[1][0]+" = "+arr[1][1]);
//        nums[arr[0][0]] += 1;
//        nums[arr[1][0]] += 1;
//        for(int ele: nums){
//            System.out.print(ele+",");
//        }
//        while(checkequal(nums) == false){
//            System.out.println(checkequal(nums));
//            int[][] arr = least_number_indexes(nums);
//            nums[arr[0][0]] += 1;
//            nums[arr[1][0]] += 1;
//            answer++;
//            System.out.println(answer);
//        }
//        System.out.println("Number of moves = "+answer);
    }
}