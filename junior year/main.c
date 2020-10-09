// to do:
//  1) Print out an empty chessboard at the beginning
//(2) Display the Table of Accessibility Numbers at the beginning
//(3) After each successful placement, show the status of the chessboard. That is, indicate the
//sequence of steps that was used to visit all the positions on the board. For each board
//position, display the step at which the position was visited (i.e. 1, 2, 3, …, 64).
//Your program can stop after finding and displaying one valid sequence of moves.
//

#include <stdio.h>

int board[8][8];
int isValid(int, int);
void printSol(void);
void mov(void);
int solve(int, int, int, int[8], int[8]);

int main(int argc, const char * argv[]){
    printf("Starting board:\n");
    printSol();
    printf("Begin:\n");
    mov();
    return 0;
}

int isValid(int r, int c){
    if(r >= 0 && r < 8 && c >= 0 && c < 8 && board[r][c] == 0){
        return 1;
    }
    else
        return 0;
}

void printSol(){
    for(int i = 0; i < 8; i++){
        for(int k = 0; k < 8; k++){
            printf("%d ", board[i][k]);
        }
        printf("\n");
    }
}

void mov(){
    int hori[8] = {2, 1, -1, -2, -2, -1, 1, 2};
    int vert[8] = {1, 2, 2, 1, -1, -2, -2, -1};
    
    board[0][0] = 1;
    solve(0,0,1,hori,vert);
    if(solve(0,0,1,hori,vert) == 0)
    {
        printf("This solution wont work.\n");
    }
    else{
        printSol();
    }
}

int solve(int row, int col, int movNum, int hori[], int vert[]){
    int newR, newC;
    if(movNum >= 64){
        return 1;
    }
    
    for(int i = 0; i < 8; i++){
        newR = row + hori[i];
        newC = col + vert[i];
        
        if(isValid(newR, newC)){
            board[newR][newC] = movNum;
            if(solve(newR, newC, movNum+1,hori,vert) == 1){
                printSol();
                printf("\n");
                return 1;
            }
            else{
                board[newR][newC] = 0;
            }
        }
    }
    
    return 0;
}




