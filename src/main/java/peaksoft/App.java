package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )   {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Cat cat = context.getBean("myAnimal",Cat.class);

        Person person = context.getBean("myPerson", Person.class);

        System.out.println(person.getName()+
                " "+" в возрасте " +  person.getAge()+
                " "+" любить кошку с пародой "+ cat.getBreed()+
                " "+ cat.getColor() );
        System.out.println("Мышыктын плюс жана минустары: ");
        cat.animalPlus();
        cat.animalMinus();

        context.close();

    }
}
