package cmd;
    import Skills.Skills;
    import java.util.Scanner;
public class kek {
    private Scanner input;
    private Skills Skills;

    public void responseForCDM() {
        while(true) {
            String messageFromCMD = input.nextLine();
            StringBuilder answer = new StringBuilder("");
            String[] messageWords = messageFromCMD.split(" ");
            if (messageWords[0].charAt(0) == '/') {
                if(messageWords.length == 1){
                    answer.append(Skills.useCommand(String.valueOf(messageWords)));
                } else{
                    // реализовать передачу остальных слов из запроса в метод useCommand
                    continue;
                }
            }else {
                answer.append(Skills.toDefaultAnswer());
            }

            System.out.println(answer);
        }
    }
}