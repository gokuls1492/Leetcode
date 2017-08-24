/*Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

A partially filled sudoku which is valid.
*/

class sudokuSolver {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> hashSet = new HashSet<Character>();
        
        //Traverse each row
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.')
                    continue;
                if(hashSet.contains(board[i][j]))
                    return false;
                
                hashSet.add(board[i][j]);
            }
            hashSet.clear();
        }
        
        //Traverse each column
        for(int j=0; j<9; j++){
            for(int i=0; i<9; i++){
                if(board[i][j] == '.')
                    continue;
                if(hashSet.contains(board[i][j]))
                    return false;
                
                hashSet.add(board[i][j]);
            }
            hashSet.clear();
        }
        
        //Traverse each block
        for(int block=0; block<9; block++){
            for(int i=block/3*3; i<block/3*3 + 3; i++){
                for(int j=block%3*3; j<block%3*3 + 3; j++){
                    if(board[i][j] == '.')
                        continue;
                    if(hashSet.contains(board[i][j]))
                        return false;
                
                    hashSet.add(board[i][j]);
                }
            }
            hashSet.clear();
        }
        return true;
    }
}


