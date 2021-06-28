package np.edu.cite.design_pattern;

public class Main {

    public static void main(String[] args) {

        String inputPlatform = "Linux";

        PlatformFactory factory = new PlatformFactory();

        Platform platform = factory.getPlatform(inputPlatform);
        Button btn = platform.createButton();
        btn.render();

    }

}
