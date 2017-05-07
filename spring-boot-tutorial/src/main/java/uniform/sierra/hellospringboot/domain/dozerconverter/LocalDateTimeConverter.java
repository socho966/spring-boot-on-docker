package uniform.sierra.hellospringboot.domain.dozerconverter;

import java.time.LocalDateTime;

import org.dozer.DozerConverter;

public class LocalDateTimeConverter extends DozerConverter<LocalDateTime, LocalDateTime> {

    public LocalDateTimeConverter() {
        super(LocalDateTime.class, LocalDateTime.class);
    }

    @Override
    public LocalDateTime convertTo(LocalDateTime source, LocalDateTime destination) {
        return LocalDateTime.from(source);
    }

    @Override
    public LocalDateTime convertFrom(LocalDateTime source, LocalDateTime destination) {
        return LocalDateTime.from(source);
    }

}
