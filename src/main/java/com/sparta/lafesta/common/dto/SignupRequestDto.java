package com.sparta.lafesta.common.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequestDto {
    @NotBlank
    @Size(min = 4, max = 10, message = "최소 4글자에서 최대 10글자까지 입력 가능합니다.")
    @Pattern(regexp = "^[a-z0-9]*$", message = "알파벳 소문자와 숫자만 입력 가능합니다.")
    private String username;

    @NotBlank
    @Size(min = 8, max = 15, message = "최소 8글자에서 최대 15글자까지 입력 가능합니다.")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\d~!@#$%^&*()+|=]*$", message = "소문자, 대문자, 숫자, 특수문자 조합의 비밀번호만 입력 가능합니다.")
    private String password;

    @NotBlank
    @Email
    private String email;

    @NotBlank(message = "Nickname is required.")
    private String nickname;

    private boolean admin = false;
    private String adminToken = "";
}
