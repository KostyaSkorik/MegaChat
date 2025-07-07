package by.kostya.megachat.dto;

import lombok.Value;
import org.springframework.data.domain.Page;

import java.util.List;

@Value
public class PageResponse<T> {

    List<T> content;
    Metadata metadata;

    public static <T> PageResponse<T> of(Page<T> page){
        return new PageResponse<>(page.getContent(),new Metadata(page.getNumber(),page.getSize(),page.getTotalElements()));
    }

    @Value
    static class Metadata{
        int size;
        int page;
        long totalElement;
    }
}
