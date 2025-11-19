package week3.day2.assignments;

public class TextField extends WebElement {
    private String text;

    @Override
    public void setText(String text) {
        this.text = text;
        System.out.println("TextField text set to: " + text);
    }

    public String getText() {
        return text;
    }
}
