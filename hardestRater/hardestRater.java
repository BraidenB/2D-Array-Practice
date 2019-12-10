import java.util.Scanner;

class hardestRater{
    public static void main (String[] args) {
        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };
                            
        System.out.println("The Hardest Rater is: " + hardestRater2018(ratings));
    }
    
    public static double hardestRater2018(int[][] ratings) {
        
        int rater1 = 0;
        int rater2 = 0;
        int rater3 = 0;
        
        for(int i = 0; i < ratings.length; i++) {
            for(int f = 0; f < ratings[i].length; f++) {
                if(i == 0) {
                    rater1 = rater1 + ratings[i][f];
                } else if(i == 1) {
                    rater2 = rater2 + ratings[i][f];
                } else if(i == 2) {
                    rater3 = rater3 + ratings[i][f];
                }
            }
        }
        
        if(rater1 < rater2 && rater1 < rater3) {
          return 0;  
        } else if(rater2 < rater1 && rater2 < rater3) {
          return 1; 
        } else if(rater3 < rater1 && rater3 < rater2) {
          return 2;
        }
        
        return -1;
    }
}
