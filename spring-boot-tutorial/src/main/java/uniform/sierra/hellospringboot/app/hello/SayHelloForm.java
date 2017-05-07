package uniform.sierra.hellospringboot.app.hello;

import org.hibernate.validator.constraints.NotBlank;

public class SayHelloForm {
    @NotBlank
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
