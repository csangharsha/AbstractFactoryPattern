package np.edu.cite.design_pattern;

public class WinPlatform implements Platform {

    public Button createButton() {
        return new WinButton();
    }

}
