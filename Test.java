import com.utils.devkasatkin.TextLoader;

public class Test {
    public static void main(String[] args) {
        TextLoader textLoader = new TextLoader();
        textLoader.getTextFromFile("Test.txt");
        System.out.println(textLoader.getText());
    }
}
