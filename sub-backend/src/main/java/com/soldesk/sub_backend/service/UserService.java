package com.soldesk.sub_backend.service;

import org.springframework.stereotype.Service;

import com.soldesk.sub_backend.dto.UserRequestDTO;
import com.soldesk.sub_backend.entity.User;
import com.soldesk.sub_backend.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    // 생성
    public void create(UserRequestDTO dto) {
        User user = User.builder()
                .name(dto.getName())
                .age(dto.getAge())
                .build();
        userRepository.save(user);
    }
    // 조회
    // 수정
    // 삭제
}
