package gradleTest

import com.github.javafaker.Faker
import java.util.*


class GradleDependency {
    val faker = Faker(Locale("pt-BR"))

    fun javaFakerName(): String {
        return faker.name().fullName()
    }

    fun fakerAdress(): String {

        return faker.address().fullAddress()
    }
}
