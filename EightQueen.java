package january16;

import javax.sound.midi.Sequence;

public class EightQueen {
    public static void main(String[] args) {
        EightQueen_Map board = new EightQueen_Map();
        PlayEightQueen myPlay = new PlayEightQueen();
        myPlay.play(board,0,0,0);
    }
}
class  EightQueen_Map{
    int[][] map = new int[8][8];
}
class PlayEightQueen{
    int setSum;
    public void play(EightQueen_Map thisMap,int x,int y,int setNum){
        EightQueen_Map newMap = copyBoard(thisMap);
        if (thisMap.map[y][x] == 0) {
            detect(thisMap, y, x);
            thisMap.map[y][x] = 2;
            if (++setNum == 8) {
                setSum++;
                System.out.println("第" + setSum + "种解法");
                printTheBoard(thisMap);
                return;
            }
            if (y<7) play(thisMap,0,y+1,setNum);
            if (x<7) play(newMap,x+1,y,setNum-1);
        } else if (x==7) {
                return;
        }else
            play(newMap,x+1,y,setNum);
    }
    public void detect(EightQueen_Map thisMap,int i,int j){
        for(int k=0;k<8;k++){
            thisMap.map[i][k]=1;
            thisMap.map[k][j]=1;
            if(i-k>=0&&j-k>=0&&i-k<8&&j-k<8)thisMap.map[i-k][j-k]=1;
            if(i-k>=0&&j+k>=0&&i-k<8&&j+k<8)thisMap.map[i-k][j+k]=1;
            if(i+k>=0&&j-k>=0&&i+k<8&&j-k<8)thisMap.map[i+k][j-k]=1;
            if(i+k>=0&&j+k>=0&&i+k<8&&j+k<8)thisMap.map[i+k][j+k]=1;
        }
    }
    public void printTheBoard(EightQueen_Map thisMap){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(thisMap.map[i][j]==2)
                    System.out.print('X');
                else
                    System.out.print('O');
            }
            System.out.print('\n');
        }
        System.out.println("====================");
    }
    public EightQueen_Map copyBoard(EightQueen_Map thisMap){
        EightQueen_Map newMap = new EightQueen_Map();
        for(int i=0;i<8;i++) {
            for (int j = 0; j < 8; j++){
                newMap.map[i][j] = thisMap.map[i][j];
            }
        }
        return newMap;
    }
}