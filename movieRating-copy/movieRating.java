import java.util.Scanner; 

class movieRating {
    public static void main (String[]args) {
        int[][] ratings = { {4,6,2,5},{7,9,4,8},{6,9,3,7} };
        
        movieAvgRating(ratings, 0);
    }

    public static double movieAvgRating(int[][] ratings, int movie) {
        double total = 0;
        
        for(int i = 0; i < ratings.length; i++) {
            total = total + ratings[i][0];
        }
        
        System.out.println(total/(ratings.length));
        return total;
    }
}