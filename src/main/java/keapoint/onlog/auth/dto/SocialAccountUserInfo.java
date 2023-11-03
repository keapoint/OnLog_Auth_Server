package keapoint.onlog.auth.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class SocialAccountUserInfo {
    private final String userName;
    private final String userEmail;
    private final String profileImgUrl;
}