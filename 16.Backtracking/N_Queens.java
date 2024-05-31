public class N_Queens {


    static int count =0 ;

    public static boolean isSafe(char board[][],int row , int col){

       
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal left up

        for(int i =row-1 ,  j = col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagonal right up

        for(int i = row-1 , j = col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }


    public static void nQueeens(char board[][], int row){

        //base

        if(row==board.length){
            printBoard(board);
            count++;
            
            return;
        }

        //column loop
        for(int j =0; j<board.length; j++){
            if(isSafe(board, row , j)){
                board[row][j]='Q';
                nQueeens(board, row+1);
                board[row][j] ='X';
            }
        }

    }

    public static void printBoard(char board[][]){
        System.out.println("______Chess Board_____");
        for(int i = 0; i<board.length;i++){
            for(int j = 0 ; j<board.length ; j++){
                System.out.print(board[i][j]+" ");

            }
            System.out.println();
        }
    }
    

    public static void main(String[] args){
        int n = 10;
        char board[][] = new char[n][n];
        //intialize
       

        for(int i = 0; i<n ;i++){
            for (int j =0 ; j<n ;j++){
                 board[i][j]='X';
            }
        }

        nQueeens(board, 0);
        System.out.println(count);
    }




}
