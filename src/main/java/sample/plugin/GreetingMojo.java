
package sample.plugin;

// The class org.apache.maven.plugin.AbstractMojo provides most
// of the infrastructure required to implement a mojo except for
// the execute method.
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Says "Hi" to the user.
 *
 */
@Mojo(name = "sayhi")
public class GreetingMojo extends AbstractMojo {
    /**
     * The greeting to display.
     */
    @Parameter(property = "sayhi.greeting", defaultValue = "Hello World!")
    private String greeting;

    public void execute() throws MojoExecutionException {
        // org.apache.maven.plugin.MojoExecutionException if an unexpected
        // problem occurs. Throwing this exception causes a "BUILD ERROR"
        // message to be displayed.
        getLog().info("Hello, world."); // retrieve the mojo logger

        // throw org.apache.maven.plugin.MojoFailureException if an
        // expected problem (such as a compilation failure) occurs.
        // Throwing this exception causes a "BUILD FAILURE" message to be displayed.
    }
}
