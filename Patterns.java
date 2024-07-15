
/*
 * Targer to print 
 *     *****
 *    *****
 *   *****
 *  *****
 * *****
 * 
 * using Loops
 */

class Patterns{
    public static void main(String[] args){
        
        int lines = 5;

        
        for(int l = 1;l <= lines; l++){
            for(int r = 1; r <= (lines+(lines-1)) ; r++){
              if(r <= (lines-l) || ((l+r) >= (lines+lines+1))){
                System.out.print(" ");
              }else{
                System.out.print("*");
              }
            }
            System.out.println();
        }

    }
}