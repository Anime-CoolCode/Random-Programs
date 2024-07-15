
/*
 * Targer to print 
 * *      *
 * **    **
 * ***  ***
 * ********
 * ********
 * ***  ***
 * **    **
 * *      *
 * 
 * using Loops
 */

class Patterns{
/*Quater 3
        for (int l = 1 ; l <= lines ; l ++  ){
            for (int r = 1 ; r <= lines  ;r++){
                if (r <= (lines - l+1)) {
                    System.out.print("* ");
                }
            }
            System.out.println( );
        }
 Quater 2
        for(int l = 1; l <= lines ; l++){
            for(int r = 1; r <= lines ; r++){
                if(r >= (lines-l+1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Hey");
 Quater 4
        for (int l = 1 ; l <= lines ; l ++  ){
            for (int r = 1 ; r <= lines  ;r++){
                if (r > (l-1)) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println( );
        }
    }
*/
    public static void main(String[] args){
        
        int lines = 9;

        
        for(int l = 1;l <= lines; l++){
            for(int r = 1; r <= lines ; r++){
                    
                    //Quater 1
                    if((r <= (lines/2)) && (l <= (lines/2))){
                        if (r <= l){
                            System.out.print("* ");
                        }else System.out.print("  ");
                    }
                    //Quater 2
                    else if((r > (lines/2)) && (l <= (lines/2))){
                        if(r >= (lines-l+1)){
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                    //Quater 3                              You were here
                    else if((r <= (lines/2)) && (l > (lines/2))){
                        if (r <= (lines - l+1)) {
                            System.out.print("* ");
                        }
                        else {
                            System.out.print("  ");
                        }
                    }
                    //Quater 4
                    else{
                        if (r > (l-1)) {
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                }
                System.out.println();
            }
        //}

    }
}