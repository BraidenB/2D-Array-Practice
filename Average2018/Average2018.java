import java.util.Scanner; 

class Average2018 {
    public static void main (String[]args) {
        int[][] ratings = { {4,6,2,5},
                            {7,9,4,8},
                            {6,9,3,7} };
                            
        double avg = avgRating2018(ratings);
        System.out.println("The total average of all movie ratings is: " +avg);
    }
    
    public static double avgRating2018(int[][] ratings) {
        
        double total = 0;
        
        for(int i = 0; i < ratings.length; i++) {
            for(int f = 0; f < ratings[i].length; f++) {
                total = total + ratings[i][f];
            }
        }
        
        return total/12;
    }

}