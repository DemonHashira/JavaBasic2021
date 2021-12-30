package tasknotepad;

public class Page {
    String heading;
    StringBuilder text;

    void addText(StringBuilder text) {
        this.text.append(text);
    }

    void removeText() {
        this.text.delete(0,100);
    }

    void review() {
        System.out.println();
        System.out.println(this.heading);
        System.out.println(this.text);
    }

    void searchWord(String word) {

        if (this.text.) {
            System.out.println("The text contains the word: " + word);
        }
    }

    boolean containsDigits() {
        for (int i = 0; i < this.text.length(); i++) {
            if (this.text.charAt(i) >= '0' || this.text.charAt(i) <= '9') {
                return true;
            }
        }
        return false;
    }
}
