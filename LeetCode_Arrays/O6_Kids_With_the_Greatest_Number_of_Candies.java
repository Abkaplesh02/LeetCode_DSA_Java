//1431. Kids With the Greatest Number of Candies
//
//        There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
//
//        Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
//
//        Note that multiple kids can have the greatest number of candies.


class Solution {
   public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int Great=0;
       for(int i=0;i<candies.length;i++){
           Great=Math.max(candies[i],Great);
       }
       ArrayList<Boolean> List=new ArrayList<>();
       for(int i=0;i<candies.length;i++){
           if(extraCandies+candies[i]>=Great){
               List.add(true);
           }
           else{
               List.add(false);
           }
       }

       return List;

   }
}