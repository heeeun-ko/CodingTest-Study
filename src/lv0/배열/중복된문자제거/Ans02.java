package lv0.배열.중복된문자제거;

import java.util.stream.Collectors;

public class Ans02 {
    public static void main(String[] args) {
        String my_string = "people";
        System.out.println(solution(my_string));
    }
    
    public static String solution(String my_string) {
        return my_string.chars()
                .mapToObj(Character::toString)
                .distinct()
                .collect(Collectors.joining());
    }
}
