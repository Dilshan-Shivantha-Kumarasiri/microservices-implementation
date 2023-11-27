package lk.ijse.gdse.userservice.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {
    private int userId;
    private String userName;
    private String userEmail;
    private String userAddress;
}
