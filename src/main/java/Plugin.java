import com.google.auto.service.AutoService;
import com.researchworx.cresco.library.plugin.core.CPlugin;

@AutoService(CPlugin.class)
public class Plugin extends CPlugin {
    public void start() {
        logger.info("Hello World!");
        quit();
    }

    @Override
    public void cleanUp() {
        logger.info("Goodbye!");
    }
}
