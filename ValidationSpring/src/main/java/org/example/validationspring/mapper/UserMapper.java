package org.example.validationspring.mapper;

import org.example.validationspring.dto.request.UserCreationRequest;
import org.example.validationspring.dto.request.UserUpdateRequest;
import org.example.validationspring.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
