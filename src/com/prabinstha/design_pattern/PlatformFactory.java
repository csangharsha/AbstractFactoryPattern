package np.edu.cite.design_pattern;

public class PlatformFactory {

    public Platform getPlatform(String inputPlatform) {
        switch (inputPlatform) {
            case "Windows":
                return new WinPlatform();
            case "Linux":
                return new LinuxPlatform();
            default:
                throw new RuntimeException("Invalid Platform!!!");
        }
    }

}
