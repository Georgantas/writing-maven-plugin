# writing-maven-plugin
https://maven.apache.org/guides/plugin/guide-java-plugin-development.html

Afterwards, to use the plugin:
```xml
<build>
    <plugins>
        <plugin>
            <groupId>sample.plugin</groupId>
            <artifactId>hello-maven-plugin</artifactId>
            <version>1.0-SNAPSHOT</version>
            <configuration>
                <greeting>Welcome</greeting>
            </configuration>
        </plugin>
    </plugins>
</build>
```

To run the plugin do: `mvn groupId:artifactId:version:goal`, so `mvn sample.plugin:hello-maven-plugin:1.0-SNAPSHOT:sayhi`.

You can also attach it to particular phase of the build lifecycle:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>sample.plugin</groupId>
            <artifactId>hello-maven-plugin</artifactId>
            <version>1.0-SNAPSHOT</version>
            <executions>
                <execution>
                <phase>compile</phase>
                <goals>
                    <goal>sayhi</goal>
                </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```
