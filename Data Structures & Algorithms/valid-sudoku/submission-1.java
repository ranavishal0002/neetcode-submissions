class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Chartacter>[]rows = new HashSet[9];
        HashSet<Chartacter>[]cols = new HashSet[9];
        HashSet<Chartacter>[]boxes = new HashSet[9];

        //initialise Hashset
        for(int i=0; i<9; i++){
            rows[i]= new HashSet<>();
            cols[i]= new HashSet<>();
            boxes[i]= new HashSet<>();
        }

        //traverse the grid/board 
        for(int row=0; row<9; row++){
            for(int col; col<9; col++){

                char curr = board[row][col];

                // as we don't need to validate empty cell
                if(curr == '.'){
                    continue
                }
                int box = (row/3)*3 +(col/3);

                if(rows[row].contains(curr) || cols[col].contains(curr) || boxes[box].contains(curr)){
                    return false;
                }
                // else we need to add the no. in the set respectively
                rows[row].add(curr);
                rows[row].add(curr);
            }
        }
    }
}
