package at.htl.microservices.number;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        info = @Info(
                title = "Number API",
                description = "Generates ISBN book numbers",
                version = "1.0",
                contact = @Contact(name = "Simon Knogler", url="https://github.com/sKnogler"
                )

        ),
        externalDocs = @ExternalDocumentation(url = "https://htl-leonding-example.github.io/udemy-microservices-goncalves/"
        ),
        tags = {
                @Tag(name = "api", description = "Public API"),
                @Tag(name = "numbers", description = "Interested in Nnumbers")
        }
)
public class NumberMicroservice extends Application {
}
