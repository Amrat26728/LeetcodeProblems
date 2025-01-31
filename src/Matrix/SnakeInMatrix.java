package Matrix;

import java.util.List;

// problem
// https://leetcode.com/problems/snake-in-matrix/

public class SnakeInMatrix {

    public int finalPositionOfSnake(int n, List<String> commands) {
        int ansPos = 0;
        for(String command: commands){
            if (command.equals("Right")){
                ansPos += 1;
            }else if(command.equals("Left")){
                ansPos -= 1;
            }else if(command.equals("Up")){
                ansPos -= n;
            }else{
                ansPos += n;
            }
        }
        return ansPos;
    }

}
