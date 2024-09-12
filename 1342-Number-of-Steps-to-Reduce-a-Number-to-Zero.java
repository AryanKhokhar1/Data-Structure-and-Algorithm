class Solution {
    int number = 0;
    public int numberOfSteps(int num) {
        if(num == 0){
            return this.number;
        }

        if(num%2 != 0){
            this.number++;
            return numberOfSteps(num-1);
        }else{
            this.number++;
            return numberOfSteps(num/2);
        }
    }
}