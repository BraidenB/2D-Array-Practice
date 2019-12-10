import java.util.Scanner;

class worstMovie{
    public static void main (String[] args) {
        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };
                            
        System.out.println("The Worst Movie is Movie #" + worstMovie2018(ratings));
    }
    
    public static int worstMovie2018(int[][] ratings) { 
        double movie0 = 0;
        double movie1 = 0;
        double movie2 = 0;
        double movie3 = 0;
        
        for(int i = 0; i < ratings.length; i++) {
            for(int f = 0; f < ratings[i].length; f++) {
                if(f == 0) {
                    movie0 = movie0 + ratings[i][f];
                } else if(f == 1) {
                    movie1 = movie1 + ratings[i][f];
                } else if(f == 2) {
                    movie2 = movie2 + ratings[i][f];
                } else if(f == 3) {
                    movie3 = movie3 + ratings[i][f];
                }
            } 
        }
        
        if(movie0 < movie1 && movie0 < movie2 && movie0 < movie3) {
            return 0;
        } else if(movie1 < movie0 && movie1 < movie2 && movie1 < movie3) {
            return 1;
        } else if(movie2 < movie0 && movie2 < movie1 && movie2 < movie3) {
            return 2;
        } else if(movie3 < movie0 && movie3 < movie2 && movie3 < movie1) {
            return 1;
        }
        
        return -1;
    }
}