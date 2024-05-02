package carbonneutral.academy.api.service.service;

import carbonneutral.academy.api.controller.auth.dto.request.PatchAdditionalInfoReq;
import carbonneutral.academy.api.controller.auth.dto.response.PatchAdditionalInfoRes;
import carbonneutral.academy.api.converter.auth.AuthConverter;
import carbonneutral.academy.api.converter.user.UserConverter;
import carbonneutral.academy.domain.point.repository.PointRepository;
import carbonneutral.academy.domain.user.User;
import carbonneutral.academy.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public PatchAdditionalInfoRes additionalInfo(User user, PatchAdditionalInfoReq request) {
        user.updateAdditionalInfo(request);
        User updateUser = userRepository.save(user);
        log.info("updateUser : {}", updateUser.getId());

        return AuthConverter.toPatchAdditionalInfoRes(updateUser);
    }
}
