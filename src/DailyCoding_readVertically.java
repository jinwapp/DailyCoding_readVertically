// 문제: 문자열을 요소로 갖는 배열을 입력받아 문자열을 세로로 읽었을 때의 문자열을 리턴해야 합니다.
// 주의사항:
// 각 문자열의 길이는 다양합니다.
// 각 문자의 위치를 행, 열로 나타낼 경우, 비어있는 (행, 열)은 무시합니다.
// 입출력 예시:
//String[] input = new String[]{
//        "hello",
//        "wolrd",
//        };
//        String output = readVertically(input);
//        System.out.println(output); // --> "hweolllrod"
//
//        input = new String[]{
//        "hi",
//        "wolrd",
//        };
//        output = readVertically(input);
//        System.out.println(output); // --> "hwiolrd"

import java.util.Arrays;

public class DailyCoding_readVertically {

    public static void main(String[] args) {

        String[] arr = {"aaa", "bbbb", "ccccc"};

        int max = 0;

        for (int i=0; i < arr.length; i++){
            if(arr[i].length() > max){
                max = arr[i].length();
                System.out.println(max);
            }
        }

        String[] temp = new String[max];

        for (int i = 0; i < arr.length; i++){
            String str = arr[i];

            for (int j = 0 ; j < str.length() ; j++){
                if (temp[j] == null){
                    temp[j] = Character.toString(str.charAt(j));
                    System.out.println(Arrays.toString(temp));
                } else {
                    temp[j] = temp[j] + str.charAt(j);
                    System.out.println(Arrays.toString(temp));
                }
            }
        }
        String result = "";
        for (int i = 0; i < temp.length; i++){
            result += temp[i];
            System.out.println(result);
        }
    }
}
