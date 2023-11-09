package org.DarshanValaJavaTraining;

public class ExcetionHanding {

    public static void main(String[] args) {
        int[] nums = { 1,2,3,4,5};

        try{
            System.out.println(nums[0]);
            System.out.println(nums[nums.length+1]);
        }
        catch (NullPointerException e){
            System.out.println("Something went wrong: "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("Something went wrong:"+e.getMessage());
        }
        finally {
            System.out.println("This is end of your code");
        }
    }
}
