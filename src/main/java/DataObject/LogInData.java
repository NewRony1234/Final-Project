package DataObject;

import com.github.javafaker.Faker;

public interface LogInData {
    Faker faker = new Faker();

    String

          incorrectEmailData = faker.bothify("????###@gmail.com"),
          incorrectPasswordData = faker.bothify("??????##??"),
          validEmail ="nikolozbedinashvili@gmail.com",
          validPassword ="Aa123456",

           expectedResult ="ავტორიზაცია წარუმატებელია.";



}
