package week3.day2.assignments;

public class Elements {

	public static void main(String[] args) {

        Button btn = new Button();
        btn.click();
        btn.submit();

        System.out.println();

        TextField tf = new TextField();
        tf.setText("Hello");
        System.out.println("TextField contains: " + tf.getText());

        System.out.println();
        
        CheckBoxButton cb = new CheckBoxButton();
        cb.click();
        cb.clickCheckButton();
        cb.submit();

        System.out.println();

        RadioButton rb = new RadioButton();
        rb.click();
        rb.selectRadioButton();
        rb.submit();
    }
}
