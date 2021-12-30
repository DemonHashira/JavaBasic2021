package tasknotepad;

public class Demo {
    public static void main(String[] args) {
        Page page1 = new Page();
        page1.heading = "Todays adventure";
        page1.addText("My dear diary, today I....");
        page1.review();

        SimpleNotepad notepad1 = new SimpleNotepad(15,"Expensive", "blue");
        notepad1.array[0] = page1;

        SecuredNotepad securedNotepad1 = new SecuredNotepad(5646);
        securedNotepad1.heading = "My first day as a programmer";
        securedNotepad1.array[0] = page1;
        securedNotepad1.addText("Im a programmer", 5646);
        securedNotepad1.review();
    }
}
