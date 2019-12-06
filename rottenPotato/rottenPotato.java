import java.util.Scanner; 

class rottenPotato {
    public static void main (String[]args) {
        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };
        
        double reviewer0 = reviewerAvgRating(ratings, 0);
        System.out.println("Reviewer 0 Average Rating is: " + reviewer0);
        double reviewer1 = reviewerAvgRating(ratings, 1);
        System.out.println("Reviewer 1 Average Rating is: " + reviewer1);
        double reviewer2 = reviewerAvgRating(ratings, 2);
        System.out.println("Reviewer 2 Average Rating is: " + reviewer2);
    }
    
    public static double reviewerAvgRating(int[][] ratings, int reviewer) {
        double review = 0;;
        
        for(int i = 0; i < ratings[0].length; i++) {
            review = review + ratings[reviewer][i];
        }
        
        return (review/4);
    }
}
