package by.tms.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private static int incID = 1;
    private long id = incID++;
    private String login;
    private String password;
    private String name;

}
