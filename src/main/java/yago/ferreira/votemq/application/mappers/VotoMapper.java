package yago.ferreira.votemq.application.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import yago.ferreira.votemq.application.dto.VotoRequest;

@Mapper(componentModel = "spring")
public interface VotoMapper {
    VotoMapper INSTANCE = Mappers.getMapper(VotoMapper.class);

    VotoRequest toVotoRequest(Long candidatoId);
    Long toLong(VotoRequest votoRequest);
}
