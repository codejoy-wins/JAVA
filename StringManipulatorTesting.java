public class StringManipulatorTesting {
    public static void main(String[] args){
        StringManipulator temp = new StringManipulator();
        String answer = temp.trimAndConcat("      hey    ", "    world    ");
        System.out.println(answer);
        //2nd
        Integer answer2 = temp.getIndexOrNull("hey", 'y');
        System.out.println(answer2);
        // 2nd part 2
        Integer answer3 = temp.getIndexOrNull("hey", 'z');
        System.out.println(answer3);
        //3
        Integer answerr3 = temp.getIndexOrNull("hello elf", "lf");
        System.out.println(answerr3);
        //3 part 2
        Integer answerrr3 = temp.getIndexOrNull("Hey max", "water");
        System.out.println(answerrr3);
        //4th !
        String answer4 = temp.concatSubstring("string1", 4, 6, "mon");
        System.out.println(answer4);
        // 4th again
        String answer4_4 = temp.concatSubstring("charcoal", 0, 4, "izard");
        System.out.println(answer4_4);
    }
}

