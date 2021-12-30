package tasknotepad;

public class SimpleNotepad extends Page implements INotepad{

    int pages;
    String type;
    String color;
    Page[] array = new Page[20];

    SimpleNotepad() {}

    SimpleNotepad(int pages, String type, String color) {
        if (pages <= 20) {
            this.pages = pages;
        }
        this.type = type;
        this.color = color;
    }

    @Override
    public void addText(String text, int password) {
        this.text = text;
    }

    @Override
    public void rewritingText(String text, int password) {
        this.text = null;
        this.text = text;
    }

    @Override
    public void removeText(int password) {
        this.text = null;
    }

    @Override
    public void review(int password) {
        System.out.println();
        System.out.println(this.heading);
        System.out.println(this.text);
    }

    @Override
    public void searchWord(String word) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].text.contains(word)) {
                System.out.println("");
            }
        }
    }

    @Override
    public void printAllPagesWithDigits() {

    }
}
