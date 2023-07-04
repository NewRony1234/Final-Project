package DataObject;

import com.github.javafaker.Faker;

public interface PasswordRecoveryData {
   Faker fakeMail = new Faker();
   String invalidEmail = fakeMail.bothify("????");
   String validEmail ="nikolozbedinashvili@gmail.com";

}
