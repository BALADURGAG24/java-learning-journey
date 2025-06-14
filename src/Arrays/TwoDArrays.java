package Arrays;

public class TwoDArrays {
    public static void main(String[] args){

        String[] fruits = {"apple", "banana", "mango", "orange", "grape"};
        String[] vegetables = {"carrot", "broccoli", "spinach", "potato", "cucumber"};
        String[] meats = {"chicken", "beef", "pork", "lamb", "turkey"};

        String [][] groceries = {fruits, vegetables, meats};

        String [][] groceriess = {{"apple", "banana", "mango", "orange", "grape"},
                                  {"carrot", "broccoli", "spinach", "potato", "cucumber"},
                                  {"chicken", "beef", "pork", "lamb", "turkey"}};

        groceriess[1][0]="celery";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }

        System.out.println();

        for(String[] foods : groceriess){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
