package ra.lession.advance1.config;

import java.util.Scanner;

public class Config {
    public static Scanner scanner(){
        return new Scanner(System.in);
    }

    public static void drawMenu() {
        String title = "MAIN MENU";
        String line = "╠═════════════════════════════════════╣";
        String[] options = {
                "1. 📁 Open File",
                "2. ✏️ Edit Text",
                "3. 🖨️ Print Document",
                "4. 📂 Manage Files",
                "5. 🔄 Refresh",
                "0. ❌ Exit"
        };

        int maxOptionLength = 0;
        for (String option : options) {
            if (option.length() > maxOptionLength) {
                maxOptionLength = option.length();
            }
        }

        String menuTitle = "║" + centerText(title, line.length() - 2) + "║";
        System.out.println("╔═════════════════════════════════════╗");
        System.out.println(menuTitle);
        System.out.println(line);

        for (String option : options) {
            String formattedOption = formatOption(option, maxOptionLength, line.length());
            System.out.println(formattedOption);
        }

        System.out.println("╚═════════════════════════════════════╝");
        System.out.println("Please enter your choice: ");
    }

    public static String centerText(String text, int totalLength) {
        int padding = (totalLength - text.length()) / 2;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < padding; i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(text);
        for (int i = 0; i < padding; i++) {
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    public static String formatOption(String option, int maxOptionLength, int lineLength) {
        int padding = (lineLength - maxOptionLength - 4) / 2; // 4: 2 spaces + 2 borders
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("║ ");
        for (int i = 0; i < padding; i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(option);
        for (int i = 0; i < padding; i++) {
            stringBuilder.append(" ");
        }
        if (stringBuilder.length() < lineLength - 1) {
            stringBuilder.append(" ");
        }
        stringBuilder.append("║");
        return stringBuilder.toString();
    }
}
