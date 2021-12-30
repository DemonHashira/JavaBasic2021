package tasknotepad;

public class SecuredNotepad extends SimpleNotepad implements INotepad{

    int password;
    Page[] array2 = new Page[20];

    SecuredNotepad() {}

    SecuredNotepad (int password) {
      this.password = password;
    }

    @Override
    public void addText(String text, int password) {
        if (password == this.password) {
            this.text = text;
        }
    }

    @Override
    public void rewritingText(String text, int password) {
        if (password == this.password) {
            this.text = null;
            this.text = text;
        }
    }

    @Override
    public void removeText(int password) {
        if (password == this.password) {
            this.text = null;
        }
    }

    @Override
    public void review(int password) {
        if (password == this.password) {
            System.out.println();
            System.out.println(this.heading);
            System.out.println(this.text);
        }
    }
}