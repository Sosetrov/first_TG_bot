package cmd;
    import Skills.proficiency;
    import java.util.Scanner;
public class kek {
    private Scanner input;
    private Skills proficiency;
    private String NameOne;
    private String NameTwo;

    public kek(String NameOne, String NameTwo) {
        this.firstName = NameOne;
        this.lastName = NameTwo;
        Skills = new proficiency();
        input = new Scanner(System.in);
    }

    public void responseForCDM() {
        while(true) {
            String messageFromCMD = input.nextLine();
            JSONObject info;
            StringBuilder answer = new StringBuilder("");
            String[] messageWords = messageFromCMD.split(" ");
            if (messageWords[0].charAt(0) == '/') {
                if(messageWords.length == 1){
                    String userTextMessage = Skills.formatCommandFromTelegram(messageWords[0]);
                    answer.append(Skills.useCommand(userTextMessage));
                } else{
                    // реализовать передачу остальных слов из запроса в метод useCommand
                    continue;
                }
            }else {
                info = Skills.getInfo(NameOne, NameTwo);
                answer.append(Skills.toAnswer(messageFromCMD, info));
            }

            System.out.println(answer);
        }
    }
}