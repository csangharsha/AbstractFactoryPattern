package np.edu.cite.design_pattern;

public class LinuxPlatform implements Platform {

    public Button createButton() {
        return new LinuxButton();
    }

}
