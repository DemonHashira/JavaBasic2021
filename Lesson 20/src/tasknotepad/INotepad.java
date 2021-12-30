package tasknotepad;

public interface INotepad {

    void addText(String text, int password);

    void rewritingText(String text, int password);

    void removeText(int password);

    void review(int password);

    void searchWord(String word);

    void printAllPagesWithDigits();
}
