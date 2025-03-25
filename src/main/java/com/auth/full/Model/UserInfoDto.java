package com.auth.full.Model;

import com.auth.full.Entity.UserInfo;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@JsonNaming (PropertyNamingStrategy.SnakeCaseStrategy.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfoDto extends UserInfo
{

    private String firstName; // first_name

    private String lastName; //last_name

    private Long phoneNumber;

    private String email; // email


}
