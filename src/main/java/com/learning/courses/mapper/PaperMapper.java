package com.learning.courses.mapper;

import com.learning.courses.dto.PaperDTO;
import com.learning.courses.model.Paper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface PaperMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "tutor", ignore = true)
    Paper toEntity(PaperDTO paperDTO);

    PaperDTO toDTO(Paper paper);
}