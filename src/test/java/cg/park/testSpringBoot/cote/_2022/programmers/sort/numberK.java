package cg.park.testSpringBoot.cote._2022.programmers.sort;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
public class numberK {

    public int center(int[] array, int[] command) {
        int[] sortArray = new int[command[1]+1 - command[0]];
        int cnt = 0;
        for (int i = command[0]; i < command[1]+1 - command[0]; i++) {
            sortArray[cnt] = array[i];
            cnt++;
        }
        Arrays.sort(sortArray);
        return sortArray[command[2]-1];
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = center(array, commands[i]);
        }
        return answer;
    }



    @Test
    public void print() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Arrays.stream(solution(array, commands)).forEach(System.out::println);
    }


//    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//
//        for(int i = 0; i < commands.length; ++i){
//
//            int[] temp = Arrays.copyOfRange(array,commands[i][0]-1, commands[i][1]);
//            Arrays.sort(temp);
//            answer[i] = temp[commands[i][2]-1];
//
//        }
//
//        return answer;
//    }
}
