class Patterns{
    public static void main(String[] args){

        int lines = 5;
        int rows = 10;

        for(int l = 1; l<=lines ; l++){
            for (int r = 0; r < l ;r++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}