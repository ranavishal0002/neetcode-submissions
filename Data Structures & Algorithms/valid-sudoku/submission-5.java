class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[]rows = new HashSet[9];
        HashSet<Character>[]cols = new HashSet[9];
        HashSet<Character>[]boxes= new HashSet[9];

        //initialize the array of HashSet
        for(int i =0; i<9; i++){
                rows[i]= new HashSet<>();
                cols[i]= new HashSet<>();
                boxes[i]= new HashSet<>();
            }

            for(int row=0; row<9; row++){
                for(int col=0; col<9; col++){
                    char curr = board[row][col];

                    if( curr =='.'){
                        continue;
                    }

                    int box = (row/3)*3 + (col/3);

                    if(rows[row].contains(curr) || cols[col].contains(curr) || boxes[box].contains(curr)){
                        return false;
                    }

                    rows[row].add(curr);
                    cols[col].add(curr);
                    boxes[box].add(curr);
                }
            }
            return true;
    }
}
