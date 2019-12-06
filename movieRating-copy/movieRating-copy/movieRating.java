import java.util.Scanner; 

class movieRating {
    public static void main (String[]args) {
        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };
        
        double rating0 = movieAvgRating(ratings, 0);
        System.out.println("Movie zero's average rating: " + rating0);
        double rating1 = movieAvgRating(ratings, 1);
        System.out.println("Movie ones's average rating: " + rating1);
        double rating2 = movieAvgRating(ratings, 2);
        System.out.println("Movie two's average rating: " + rating2);
        double rating3 = movieAvgRating(ratings, 3);
        System.out.println("Movie two's average rating: " + rating3);
    }

    public static double movieAvgRating(int[][] ratings, int movie) {
        double total = 0;
        
        for(int i = 0; i < ratings.length; i++) {
            total = total + ratings[i][movie];
        }
        
        return total/(ratings.length);
    }
}