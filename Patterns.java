class Patterns{
    public static void main(String[] args){

        int lines = 10;
        int rows = 10;

        for(int l = 0; l<lines ; l++){
            for (int r = 0; r < rows ;r++){
                if((l == 0)||(l==(lines-1))){
                    System.out.print("* ");
                }else{
                    if((r==0)||(r==(rows-1))){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}